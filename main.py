import sys
import antlr4
from gen.bccLexer import bccLexer
from antlr4.InputStream import InputStream


def process_tokens(tokens):
    for token in tokens:
        print(token.text, token.line, token.column)


def main(argv):
    input_stream = InputStream(sys.stdin.read())
    if len(argv) > 1:
        input_stream = antlr4.FileStream(argv[1])

    lexer = bccLexer(input_stream)
    stream = antlr4.CommonTokenStream(lexer)
    a = 1
    while not stream.fetchedEOF:
        stream.consume()

    process_tokens(stream.tokens)


if __name__ == '__main__':
    main(sys.argv)
