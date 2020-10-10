import sys
import antlr4
from gen.bccLexer import bccLexer
from antlr4.InputStream import InputStream
from gen.bccParser import bccParser


def process_token(token, terminals):
    token_name = terminals[token.type]
    if token_name == "id" or token_name == "tk_num" or token_name == "fid":
        print(
            "<{},{},{},{}>".format(token_name, token.text, token.line, token.column + 1)
        )
    elif token_name == "TRUE" or token_name == "FALSE":
        print("<{},{},{}>".format("bool", token.line, token.column + 1))
    elif token_name != "comment":
        print("<{},{},{}>".format(token_name, token.line, token.column + 1))


class GrammarErrorHandler:
    def __init__(self):
        super().__init__()

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print(">>> Error léxico(línea:{},posición:{})".format(line, column + 1))
        #print("<{},{}> Error sintactico: se encontro: '{}'; se esperaba: '{}'.".format(line, column, offendingSymbol.text))
        exit(0)

    def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
        pass

    def reportAmbiguity(self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs):
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
    #parser.removeErrorListeners()
    parser.addErrorListener(s_error)
    parser.prog()


if __name__ == "__main__":
    main(sys.argv)
