import sys
import antlr4
from gen.bccLexer import bccLexer
from antlr4.InputStream import InputStream
from gen.bccParser import bccParser
from bccErrorStrategy import BCCErrorStrategy
from grammar_error_handler import GrammarErrorHandler


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
    parser.addErrorListener(s_error)
    parser._errHandler = BCCErrorStrategy()

    parser.prog()


if __name__ == "__main__":
    main(sys.argv)
