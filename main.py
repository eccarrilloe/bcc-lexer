import sys
import antlr4
from gen.bccLexer import bccLexer
from antlr4.InputStream import InputStream


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

    def syntaxError(self, *args):
        print(">>> Error léxico(línea:{},posición:{})".format(args[2], args[3] + 1))
        exit(0)


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
    grammar_error_handler = GrammarErrorHandler()
    lexer.removeErrorListeners()
    lexer.addErrorListener(grammar_error_handler)

    token = lexer.nextToken()
    is_eof = token.text == "<EOF>"

    terminals = list(map(lambda x: x.lower(), lexer.symbolicNames))
    while not is_eof:
        process_token(token, terminals)
        token = lexer.nextToken()

        is_eof = token.text == "<EOF>"


if __name__ == "__main__":
    main(sys.argv)
