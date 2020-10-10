# Generated from /home/joan/PycharmProjects/bcc-lexer/bcc.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .bccParser import bccParser
else:
    from bccParser import bccParser

# This class defines a complete generic visitor for a parse tree produced by bccParser.

class bccVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by bccParser#prog.
    def visitProg(self, ctx:bccParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bccParser#var_decl.
    def visitVar_decl(self, ctx:bccParser.Var_declContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bccParser#fn_decl_list.
    def visitFn_decl_list(self, ctx:bccParser.Fn_decl_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bccParser#stmt_block.
    def visitStmt_block(self, ctx:bccParser.Stmt_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bccParser#stmt.
    def visitStmt(self, ctx:bccParser.StmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bccParser#lexpr.
    def visitLexpr(self, ctx:bccParser.LexprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bccParser#nexpr.
    def visitNexpr(self, ctx:bccParser.NexprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bccParser#rexpr.
    def visitRexpr(self, ctx:bccParser.RexprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bccParser#simple_expr.
    def visitSimple_expr(self, ctx:bccParser.Simple_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bccParser#term.
    def visitTerm(self, ctx:bccParser.TermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bccParser#factor.
    def visitFactor(self, ctx:bccParser.FactorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by bccParser#main_prog.
    def visitMain_prog(self, ctx:bccParser.Main_progContext):
        return self.visitChildren(ctx)



del bccParser