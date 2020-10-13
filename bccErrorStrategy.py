from antlr4.error.ErrorStrategy import DefaultErrorStrategy


class BCCErrorStrategy(DefaultErrorStrategy):
    def __init__(self):
        super().__init__()

    def reportSyntaxError(self, token, recognizer):
        token_name = self.getTokenErrorDisplay(token)
        expecting = self.getExpectedTokens(recognizer)
        expected_literals = []

        if expecting.intervals is not None and len(expecting.intervals) > 0:
            for item in expecting.intervals:
                for token_number in item:
                    token_name = recognizer.symbolicNames[token_number]
                    token_literal = expecting.elementName(
                        recognizer.literalNames, recognizer.symbolicNames, token_number
                    )
                    expected_literals.append(token_literal)

        expected_literals.sort()

        message = (
            "<{},{}> Error sintactico: se encontro: '{}'; se esperaba: {}.".format(
                token.line,
                token.column + 1,
                token.text,
                ",".join(expected_literals),
            )
        )

        return message

    def reportUnwantedToken(self, recognizer):
        if not self.inErrorRecoveryMode(recognizer):
            self.beginErrorCondition(recognizer)
            token = recognizer.getCurrentToken()
            message = self.reportSyntaxError(token, recognizer)
            recognizer.notifyErrorListeners(message, token, None)

    def reportInputMismatch(self, recognizer, e):
        message = self.reportSyntaxError(e.offendingToken, recognizer)
        recognizer.notifyErrorListeners(message, e.offendingToken, e)

    def reportMissingToken(self, recognizer):
        if not self.inErrorRecoveryMode(recognizer):
            self.beginErrorCondition(recognizer)
            token = recognizer.getCurrentToken()
            message = self.reportSyntaxError(token, recognizer)
            recognizer.notifyErrorListeners(message, token, None)

    def reportNoViableAlternative(self, recognizer, e):
        message = self.reportSyntaxError(e.offendingToken, recognizer)
        recognizer.notifyErrorListeners(message, e.offendingToken, recognizer)