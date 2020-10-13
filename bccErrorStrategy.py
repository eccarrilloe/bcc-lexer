from antlr4.error.ErrorStrategy import DefaultErrorStrategy


class BCCErrorStrategy(DefaultErrorStrategy):
    def __init__(self):
        super().__init__()

    def reportSyntaxError(self, token, recognizer):
        token_name = self.getTokenErrorDisplay(token)
        expecting = self.getExpectedTokens(recognizer)
        expected_token = {}

        if expecting.intervals is not None and not expecting.intervals:
            return token

    def reportUnwantedToken(self, recognizer):
        if not self.inErrorRecoveryMode(recognizer):
            self.beginErrorCondition(recognizer)
            token = recognizer.getCurrentToken()
            message = self.reportSyntaxError(token, recognizer)
            recognizer.notifyErrorListeners(token, message, None)

    def reportInputMismatch(self, recognizer, e):
        message = self.reportSyntaxError(e.getOffendingToken(), recognizer)
        recognizer.notifyErrorListeners(e.getOffendingToken(), message, e)

    def reportMissingToken(self, recognizer):
        if not self.inErrorRecoveryMode(recognizer):
            self.beginErrorCondition(recognizer)
            token = recognizer.getCurrentToken()
            message = self.reportSyntaxError(token, recognizer)
            recognizer.notifyErrorListeners(token, message, None)

    def reportNoViableAlternative(self, recognizer, e):
        message = self.reportSyntaxError(e.getOffendingToken(), recognizer)
        recognizer.notifyErrorListeners(e.getOffendingToken(), message, recognizer)