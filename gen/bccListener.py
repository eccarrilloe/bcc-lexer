# Generated from /home/joan/PycharmProjects/bcc-lexer/bcc.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .bccParser import bccParser
else:
    from bccParser import bccParser

# This class defines a complete listener for a parse tree produced by bccParser.
class bccListener(ParseTreeListener):

    # Enter a parse tree produced by bccParser#prog.
    def enterProg(self, ctx:bccParser.ProgContext):
        pass

    # Exit a parse tree produced by bccParser#prog.
    def exitProg(self, ctx:bccParser.ProgContext):
        pass


    # Enter a parse tree produced by bccParser#var_decl.
    def enterVar_decl(self, ctx:bccParser.Var_declContext):
        pass

    # Exit a parse tree produced by bccParser#var_decl.
    def exitVar_decl(self, ctx:bccParser.Var_declContext):
        pass


    # Enter a parse tree produced by bccParser#fn_decl_list.
    def enterFn_decl_list(self, ctx:bccParser.Fn_decl_listContext):
        pass

    # Exit a parse tree produced by bccParser#fn_decl_list.
    def exitFn_decl_list(self, ctx:bccParser.Fn_decl_listContext):
        pass


    # Enter a parse tree produced by bccParser#stmt_block.
    def enterStmt_block(self, ctx:bccParser.Stmt_blockContext):
        pass

    # Exit a parse tree produced by bccParser#stmt_block.
    def exitStmt_block(self, ctx:bccParser.Stmt_blockContext):
        pass


    # Enter a parse tree produced by bccParser#stmt.
    def enterStmt(self, ctx:bccParser.StmtContext):
        pass

    # Exit a parse tree produced by bccParser#stmt.
    def exitStmt(self, ctx:bccParser.StmtContext):
        pass


    # Enter a parse tree produced by bccParser#lexpr.
    def enterLexpr(self, ctx:bccParser.LexprContext):
        pass

    # Exit a parse tree produced by bccParser#lexpr.
    def exitLexpr(self, ctx:bccParser.LexprContext):
        pass


    # Enter a parse tree produced by bccParser#nexpr.
    def enterNexpr(self, ctx:bccParser.NexprContext):
        pass

    # Exit a parse tree produced by bccParser#nexpr.
    def exitNexpr(self, ctx:bccParser.NexprContext):
        pass


    # Enter a parse tree produced by bccParser#rexpr.
    def enterRexpr(self, ctx:bccParser.RexprContext):
        pass

    # Exit a parse tree produced by bccParser#rexpr.
    def exitRexpr(self, ctx:bccParser.RexprContext):
        pass


    # Enter a parse tree produced by bccParser#simple_expr.
    def enterSimple_expr(self, ctx:bccParser.Simple_exprContext):
        pass

    # Exit a parse tree produced by bccParser#simple_expr.
    def exitSimple_expr(self, ctx:bccParser.Simple_exprContext):
        pass


    # Enter a parse tree produced by bccParser#term.
    def enterTerm(self, ctx:bccParser.TermContext):
        pass

    # Exit a parse tree produced by bccParser#term.
    def exitTerm(self, ctx:bccParser.TermContext):
        pass


    # Enter a parse tree produced by bccParser#factor.
    def enterFactor(self, ctx:bccParser.FactorContext):
        pass

    # Exit a parse tree produced by bccParser#factor.
    def exitFactor(self, ctx:bccParser.FactorContext):
        pass


    # Enter a parse tree produced by bccParser#main_prog.
    def enterMain_prog(self, ctx:bccParser.Main_progContext):
        pass

    # Exit a parse tree produced by bccParser#main_prog.
    def exitMain_prog(self, ctx:bccParser.Main_progContext):
        pass



del bccParser