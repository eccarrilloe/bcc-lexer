import sys
import antlr4
from gen.bccLexer import bccLexer
from antlr4.InputStream import InputStream
from gen.bccParser import bccParser
from bccErrorStrategy import BCCErrorStrategy


class GrammarErrorHandler:
    def __init__(self):
        super().__init__()

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):

        expected_tokens = list(
            map(
                lambda x: x.start,
                recognizer.atn.getExpectedTokens(
                    recognizer.state, recognizer._ctx
                ).intervals,
            )
        )
        print(
            "<{},{}> Error sintactico: se encontro: '{}'; se esperaba: '{}'.".format(
                line, column + 1, offendingSymbol.text, "Test"
            )
        )
        exit(0)

    def reportAttemptingFullContext(
        self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs
    ):
        pass

    def reportAmbiguity(
        self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs
    ):
        pass


def main(argv):
    input_stream = None
    if len(argv) > 1:
        with open(argv[1]) as f:
            data = f.read()
            data = data.replace(r"\t", "  ")
            input_stream = InputStream(data)
    else:
        input_stream = InputStream(sys.stdin.read())

    lexer = bccLexer(input_stream)
    s_error = GrammarErrorHandler()
    token_stream = antlr4.CommonTokenStream(lexer)
    parser = bccParser(token_stream)

    parser.removeErrorListeners()
    parser._errHandler = BCCErrorStrategy()

    parser.prog()


if __name__ == "__main__":
    main(sys.argv)
