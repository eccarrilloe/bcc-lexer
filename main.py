import sys
import antlr4
from gen.bccLexer import bccLexer
from antlr4.InputStream import InputStream


def process_tokens(tokens, terminals):
    for token in tokens:
        token_name = terminals[token.type-1]
        if token_name == "id" or token_name == "tk_num" or token_name == "fid":
            print('<{},{},{},{}>'.format(token_name, token.text, token.line, token.column + 1))
        elif token_name != "comment":
            print('<{},{},{}>'.format(token_name, token.line, token.column + 1))


def main(argv):
    input_stream = None
    if len(argv) > 1:
        input_stream = antlr4.FileStream(argv[1])
    else:
        input_stream = InputStream(sys.stdin.read())

    lexer = bccLexer(input_stream)
    stream = antlr4.CommonTokenStream(lexer)

    terminals = list(map(lambda x: x.lower(), bccLexer.ruleNames))

    while not stream.fetchedEOF:
        stream.consume()

    process_tokens(stream.tokens, terminals)


if __name__ == '__main__':
    main(sys.argv)
