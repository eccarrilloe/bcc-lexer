// Generated from /mnt/c/Users/eccar/projects/university/talp/bcc-lexer/bcc.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bccParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_FUNCTION=1, FID=2, VAR=3, PRINT=4, TK_INPUT=5, TK_WHEN=6, TK_DO=7, 
		TK_IF=8, TK_ELSE=9, TK_UNLESS=10, TK_WHILE=11, TK_RETURN=12, TK_UNTIL=13, 
		TK_LOOP=14, TK_REPEAT=15, TK_FOR=16, TK_END=17, TK_NEXT=18, TK_BREAK=19, 
		TK_AND=20, TK_OR=21, TK_NOT=22, TK_MOD_ASIG=23, TK_MENOR_IGUAL=24, TK_MAYOR_IGUAL=25, 
		TK_SUM_ASIG=26, TK_RES_ASIG=27, TK_MUL_ASIG=28, TK_DIV_ASIG=29, TK_INCREMENTO=30, 
		TK_DECREMENTO=31, TK_IGUALDAD=32, TK_DIFERENTE=33, TK_ASIGNACION=34, TK_DOSPUNTOS=35, 
		TK_COMA=36, TK_PUNTOYCOMA=37, TK_PAR_IZQ=38, TK_PAR_DER=39, TK_COR_IZQ=40, 
		TK_COR_DER=41, TK_LLAVE_IZQ=42, TK_LLAVE_DER=43, TK_MENOR=44, TK_MAYOR=45, 
		TK_MAS=46, TK_MENOS=47, TK_MUL=48, TK_DIV=49, TK_MOD=50, DATATYPE=51, 
		TRUE=52, FALSE=53, ID=54, TK_NUM=55, COMMENT=56, WS=57;
	public static final int
		RULE_prog = 0, RULE_var_decl = 1, RULE_fn_decl_list = 2, RULE_stmt_block = 3, 
		RULE_stmt = 4, RULE_lexpr = 5, RULE_nexpr = 6, RULE_rexpr = 7, RULE_simple_expr = 8, 
		RULE_term = 9, RULE_factor = 10, RULE_main_prog = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "var_decl", "fn_decl_list", "stmt_block", "stmt", "lexpr", "nexpr", 
			"rexpr", "simple_expr", "term", "factor", "main_prog"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", null, "'var'", "'print'", "'input'", "'when'", "'do'", 
			"'if'", "'else'", "'unless'", "'while'", "'return'", "'until'", "'loop'", 
			"'repeat'", "'for'", "'end'", "'next'", "'break'", "'and'", "'or'", "'not'", 
			"'%='", "'<='", "'>='", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", 
			"'=='", "'!='", "':='", "':'", "','", "';'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", null, 
			"'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TK_FUNCTION", "FID", "VAR", "PRINT", "TK_INPUT", "TK_WHEN", "TK_DO", 
			"TK_IF", "TK_ELSE", "TK_UNLESS", "TK_WHILE", "TK_RETURN", "TK_UNTIL", 
			"TK_LOOP", "TK_REPEAT", "TK_FOR", "TK_END", "TK_NEXT", "TK_BREAK", "TK_AND", 
			"TK_OR", "TK_NOT", "TK_MOD_ASIG", "TK_MENOR_IGUAL", "TK_MAYOR_IGUAL", 
			"TK_SUM_ASIG", "TK_RES_ASIG", "TK_MUL_ASIG", "TK_DIV_ASIG", "TK_INCREMENTO", 
			"TK_DECREMENTO", "TK_IGUALDAD", "TK_DIFERENTE", "TK_ASIGNACION", "TK_DOSPUNTOS", 
			"TK_COMA", "TK_PUNTOYCOMA", "TK_PAR_IZQ", "TK_PAR_DER", "TK_COR_IZQ", 
			"TK_COR_DER", "TK_LLAVE_IZQ", "TK_LLAVE_DER", "TK_MENOR", "TK_MAYOR", 
			"TK_MAS", "TK_MENOS", "TK_MUL", "TK_DIV", "TK_MOD", "DATATYPE", "TRUE", 
			"FALSE", "ID", "TK_NUM", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "bcc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bccParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public Fn_decl_listContext fn_decl_list() {
			return getRuleContext(Fn_decl_listContext.class,0);
		}
		public Main_progContext main_prog() {
			return getRuleContext(Main_progContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			fn_decl_list();
			setState(25);
			main_prog();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(bccParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(bccParser.ID, i);
		}
		public List<TerminalNode> TK_DOSPUNTOS() { return getTokens(bccParser.TK_DOSPUNTOS); }
		public TerminalNode TK_DOSPUNTOS(int i) {
			return getToken(bccParser.TK_DOSPUNTOS, i);
		}
		public List<TerminalNode> DATATYPE() { return getTokens(bccParser.DATATYPE); }
		public TerminalNode DATATYPE(int i) {
			return getToken(bccParser.DATATYPE, i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(bccParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(bccParser.TK_COMA, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(ID);
			setState(28);
			match(TK_DOSPUNTOS);
			setState(29);
			match(DATATYPE);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(30);
				match(TK_COMA);
				setState(31);
				match(ID);
				setState(32);
				match(TK_DOSPUNTOS);
				setState(33);
				match(DATATYPE);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fn_decl_listContext extends ParserRuleContext {
		public List<TerminalNode> TK_FUNCTION() { return getTokens(bccParser.TK_FUNCTION); }
		public TerminalNode TK_FUNCTION(int i) {
			return getToken(bccParser.TK_FUNCTION, i);
		}
		public List<TerminalNode> FID() { return getTokens(bccParser.FID); }
		public TerminalNode FID(int i) {
			return getToken(bccParser.FID, i);
		}
		public List<TerminalNode> TK_DOSPUNTOS() { return getTokens(bccParser.TK_DOSPUNTOS); }
		public TerminalNode TK_DOSPUNTOS(int i) {
			return getToken(bccParser.TK_DOSPUNTOS, i);
		}
		public List<TerminalNode> DATATYPE() { return getTokens(bccParser.DATATYPE); }
		public TerminalNode DATATYPE(int i) {
			return getToken(bccParser.DATATYPE, i);
		}
		public List<TerminalNode> TK_PAR_IZQ() { return getTokens(bccParser.TK_PAR_IZQ); }
		public TerminalNode TK_PAR_IZQ(int i) {
			return getToken(bccParser.TK_PAR_IZQ, i);
		}
		public List<TerminalNode> TK_PAR_DER() { return getTokens(bccParser.TK_PAR_DER); }
		public TerminalNode TK_PAR_DER(int i) {
			return getToken(bccParser.TK_PAR_DER, i);
		}
		public List<Stmt_blockContext> stmt_block() {
			return getRuleContexts(Stmt_blockContext.class);
		}
		public Stmt_blockContext stmt_block(int i) {
			return getRuleContext(Stmt_blockContext.class,i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<TerminalNode> VAR() { return getTokens(bccParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(bccParser.VAR, i);
		}
		public List<TerminalNode> TK_PUNTOYCOMA() { return getTokens(bccParser.TK_PUNTOYCOMA); }
		public TerminalNode TK_PUNTOYCOMA(int i) {
			return getToken(bccParser.TK_PUNTOYCOMA, i);
		}
		public Fn_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_decl_list; }
	}

	public final Fn_decl_listContext fn_decl_list() throws RecognitionException {
		Fn_decl_listContext _localctx = new Fn_decl_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fn_decl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_FUNCTION) {
				{
				{
				setState(39);
				match(TK_FUNCTION);
				setState(40);
				match(FID);
				setState(41);
				match(TK_DOSPUNTOS);
				setState(42);
				match(DATATYPE);
				setState(43);
				match(TK_PAR_IZQ);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(44);
					var_decl();
					}
				}

				setState(47);
				match(TK_PAR_DER);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(48);
					match(VAR);
					setState(49);
					var_decl();
					setState(50);
					match(TK_PUNTOYCOMA);
					}
				}

				setState(54);
				stmt_block();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt_blockContext extends ParserRuleContext {
		public TerminalNode TK_LLAVE_IZQ() { return getToken(bccParser.TK_LLAVE_IZQ, 0); }
		public TerminalNode TK_LLAVE_DER() { return getToken(bccParser.TK_LLAVE_DER, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_block; }
	}

	public final Stmt_blockContext stmt_block() throws RecognitionException {
		Stmt_blockContext _localctx = new Stmt_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt_block);
		int _la;
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LLAVE_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(TK_LLAVE_IZQ);
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61);
					stmt();
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << TK_INPUT) | (1L << TK_WHEN) | (1L << TK_DO) | (1L << TK_IF) | (1L << TK_UNLESS) | (1L << TK_WHILE) | (1L << TK_RETURN) | (1L << TK_UNTIL) | (1L << TK_LOOP) | (1L << TK_REPEAT) | (1L << TK_FOR) | (1L << TK_NEXT) | (1L << TK_BREAK) | (1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << ID))) != 0) );
				setState(66);
				match(TK_LLAVE_DER);
				}
				break;
			case PRINT:
			case TK_INPUT:
			case TK_WHEN:
			case TK_DO:
			case TK_IF:
			case TK_UNLESS:
			case TK_WHILE:
			case TK_RETURN:
			case TK_UNTIL:
			case TK_LOOP:
			case TK_REPEAT:
			case TK_FOR:
			case TK_NEXT:
			case TK_BREAK:
			case TK_INCREMENTO:
			case TK_DECREMENTO:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(bccParser.PRINT, 0); }
		public List<LexprContext> lexpr() {
			return getRuleContexts(LexprContext.class);
		}
		public LexprContext lexpr(int i) {
			return getRuleContext(LexprContext.class,i);
		}
		public List<TerminalNode> TK_PUNTOYCOMA() { return getTokens(bccParser.TK_PUNTOYCOMA); }
		public TerminalNode TK_PUNTOYCOMA(int i) {
			return getToken(bccParser.TK_PUNTOYCOMA, i);
		}
		public TerminalNode TK_INPUT() { return getToken(bccParser.TK_INPUT, 0); }
		public TerminalNode ID() { return getToken(bccParser.ID, 0); }
		public TerminalNode TK_WHEN() { return getToken(bccParser.TK_WHEN, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(bccParser.TK_PAR_IZQ, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(bccParser.TK_PAR_DER, 0); }
		public TerminalNode TK_DO() { return getToken(bccParser.TK_DO, 0); }
		public List<Stmt_blockContext> stmt_block() {
			return getRuleContexts(Stmt_blockContext.class);
		}
		public Stmt_blockContext stmt_block(int i) {
			return getRuleContext(Stmt_blockContext.class,i);
		}
		public TerminalNode TK_IF() { return getToken(bccParser.TK_IF, 0); }
		public TerminalNode TK_ELSE() { return getToken(bccParser.TK_ELSE, 0); }
		public TerminalNode TK_UNLESS() { return getToken(bccParser.TK_UNLESS, 0); }
		public TerminalNode TK_WHILE() { return getToken(bccParser.TK_WHILE, 0); }
		public TerminalNode TK_RETURN() { return getToken(bccParser.TK_RETURN, 0); }
		public TerminalNode TK_UNTIL() { return getToken(bccParser.TK_UNTIL, 0); }
		public TerminalNode TK_LOOP() { return getToken(bccParser.TK_LOOP, 0); }
		public TerminalNode TK_REPEAT() { return getToken(bccParser.TK_REPEAT, 0); }
		public TerminalNode TK_NUM() { return getToken(bccParser.TK_NUM, 0); }
		public TerminalNode TK_DOSPUNTOS() { return getToken(bccParser.TK_DOSPUNTOS, 0); }
		public TerminalNode TK_FOR() { return getToken(bccParser.TK_FOR, 0); }
		public TerminalNode TK_NEXT() { return getToken(bccParser.TK_NEXT, 0); }
		public TerminalNode TK_BREAK() { return getToken(bccParser.TK_BREAK, 0); }
		public TerminalNode TK_ASIGNACION() { return getToken(bccParser.TK_ASIGNACION, 0); }
		public TerminalNode TK_SUM_ASIG() { return getToken(bccParser.TK_SUM_ASIG, 0); }
		public TerminalNode TK_RES_ASIG() { return getToken(bccParser.TK_RES_ASIG, 0); }
		public TerminalNode TK_MUL_ASIG() { return getToken(bccParser.TK_MUL_ASIG, 0); }
		public TerminalNode TK_DIV_ASIG() { return getToken(bccParser.TK_DIV_ASIG, 0); }
		public TerminalNode TK_MOD_ASIG() { return getToken(bccParser.TK_MOD_ASIG, 0); }
		public TerminalNode TK_INCREMENTO() { return getToken(bccParser.TK_INCREMENTO, 0); }
		public TerminalNode TK_DECREMENTO() { return getToken(bccParser.TK_DECREMENTO, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(PRINT);
				setState(72);
				lexpr();
				setState(73);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(TK_INPUT);
				setState(76);
				match(ID);
				setState(77);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(TK_WHEN);
				setState(79);
				match(TK_PAR_IZQ);
				setState(80);
				lexpr();
				setState(81);
				match(TK_PAR_DER);
				setState(82);
				match(TK_DO);
				setState(83);
				stmt_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(TK_IF);
				setState(86);
				match(TK_PAR_IZQ);
				setState(87);
				lexpr();
				setState(88);
				match(TK_PAR_DER);
				setState(89);
				match(TK_DO);
				setState(90);
				stmt_block();
				setState(91);
				match(TK_ELSE);
				setState(92);
				stmt_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(TK_UNLESS);
				setState(95);
				match(TK_PAR_IZQ);
				setState(96);
				lexpr();
				setState(97);
				match(TK_PAR_DER);
				setState(98);
				match(TK_DO);
				setState(99);
				stmt_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				match(TK_WHILE);
				setState(102);
				match(TK_PAR_IZQ);
				setState(103);
				lexpr();
				setState(104);
				match(TK_PAR_DER);
				setState(105);
				match(TK_DO);
				setState(106);
				stmt_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				match(TK_RETURN);
				setState(109);
				lexpr();
				setState(110);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(112);
				match(TK_UNTIL);
				setState(113);
				match(TK_PAR_IZQ);
				setState(114);
				lexpr();
				setState(115);
				match(TK_PAR_DER);
				setState(116);
				match(TK_DO);
				setState(117);
				stmt_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(119);
				match(TK_LOOP);
				setState(120);
				stmt_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(121);
				match(TK_DO);
				setState(122);
				stmt_block();
				setState(123);
				match(TK_WHILE);
				setState(124);
				match(TK_PAR_IZQ);
				setState(125);
				lexpr();
				setState(126);
				match(TK_PAR_DER);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(128);
				match(TK_DO);
				setState(129);
				stmt_block();
				setState(130);
				match(TK_UNTIL);
				setState(131);
				match(TK_PAR_IZQ);
				setState(132);
				lexpr();
				setState(133);
				match(TK_PAR_DER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(135);
				match(TK_REPEAT);
				setState(136);
				match(TK_NUM);
				setState(137);
				match(TK_DOSPUNTOS);
				setState(138);
				stmt_block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(139);
				match(TK_FOR);
				setState(140);
				match(TK_PAR_IZQ);
				setState(141);
				lexpr();
				setState(142);
				match(TK_PUNTOYCOMA);
				setState(143);
				lexpr();
				setState(144);
				match(TK_PUNTOYCOMA);
				setState(145);
				lexpr();
				setState(146);
				match(TK_PAR_DER);
				setState(147);
				match(TK_DO);
				setState(148);
				stmt_block();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(150);
				match(TK_NEXT);
				setState(151);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(152);
				match(TK_BREAK);
				setState(153);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(154);
				match(ID);
				setState(155);
				match(TK_ASIGNACION);
				setState(156);
				lexpr();
				setState(157);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(159);
				match(ID);
				setState(160);
				match(TK_SUM_ASIG);
				setState(161);
				lexpr();
				setState(162);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(164);
				match(ID);
				setState(165);
				match(TK_RES_ASIG);
				setState(166);
				lexpr();
				setState(167);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(169);
				match(ID);
				setState(170);
				match(TK_MUL_ASIG);
				setState(171);
				lexpr();
				setState(172);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(174);
				match(ID);
				setState(175);
				match(TK_DIV_ASIG);
				setState(176);
				lexpr();
				setState(177);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(179);
				match(ID);
				setState(180);
				match(TK_MOD_ASIG);
				setState(181);
				lexpr();
				setState(182);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(184);
				match(ID);
				setState(185);
				match(TK_INCREMENTO);
				setState(186);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(187);
				match(ID);
				setState(188);
				match(TK_DECREMENTO);
				setState(189);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(190);
				match(TK_DECREMENTO);
				setState(191);
				match(ID);
				setState(192);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(193);
				match(TK_INCREMENTO);
				setState(194);
				match(ID);
				setState(195);
				match(TK_PUNTOYCOMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexprContext extends ParserRuleContext {
		public List<NexprContext> nexpr() {
			return getRuleContexts(NexprContext.class);
		}
		public NexprContext nexpr(int i) {
			return getRuleContext(NexprContext.class,i);
		}
		public List<TerminalNode> TK_AND() { return getTokens(bccParser.TK_AND); }
		public TerminalNode TK_AND(int i) {
			return getToken(bccParser.TK_AND, i);
		}
		public List<TerminalNode> TK_OR() { return getTokens(bccParser.TK_OR); }
		public TerminalNode TK_OR(int i) {
			return getToken(bccParser.TK_OR, i);
		}
		public LexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr; }
	}

	public final LexprContext lexpr() throws RecognitionException {
		LexprContext _localctx = new LexprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			nexpr();
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_AND) {
					{
					{
					setState(199);
					match(TK_AND);
					setState(200);
					nexpr();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_OR) {
					{
					{
					setState(206);
					match(TK_OR);
					setState(207);
					nexpr();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NexprContext extends ParserRuleContext {
		public TerminalNode TK_NOT() { return getToken(bccParser.TK_NOT, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(bccParser.TK_PAR_IZQ, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(bccParser.TK_PAR_DER, 0); }
		public RexprContext rexpr() {
			return getRuleContext(RexprContext.class,0);
		}
		public NexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nexpr; }
	}

	public final NexprContext nexpr() throws RecognitionException {
		NexprContext _localctx = new NexprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nexpr);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(TK_NOT);
				setState(216);
				match(TK_PAR_IZQ);
				setState(217);
				lexpr();
				setState(218);
				match(TK_PAR_DER);
				}
				break;
			case FID:
			case TK_INCREMENTO:
			case TK_DECREMENTO:
			case TK_PAR_IZQ:
			case TRUE:
			case FALSE:
			case ID:
			case TK_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				rexpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RexprContext extends ParserRuleContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public TerminalNode TK_MENOR() { return getToken(bccParser.TK_MENOR, 0); }
		public TerminalNode TK_IGUALDAD() { return getToken(bccParser.TK_IGUALDAD, 0); }
		public TerminalNode TK_MENOR_IGUAL() { return getToken(bccParser.TK_MENOR_IGUAL, 0); }
		public TerminalNode TK_MAYOR() { return getToken(bccParser.TK_MAYOR, 0); }
		public TerminalNode TK_MAYOR_IGUAL() { return getToken(bccParser.TK_MAYOR_IGUAL, 0); }
		public TerminalNode TK_DIFERENTE() { return getToken(bccParser.TK_DIFERENTE, 0); }
		public RexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexpr; }
	}

	public final RexprContext rexpr() throws RecognitionException {
		RexprContext _localctx = new RexprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			simple_expr();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR_IGUAL) | (1L << TK_IGUALDAD) | (1L << TK_DIFERENTE) | (1L << TK_MENOR) | (1L << TK_MAYOR))) != 0)) {
				{
				setState(224);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR_IGUAL) | (1L << TK_IGUALDAD) | (1L << TK_DIFERENTE) | (1L << TK_MENOR) | (1L << TK_MAYOR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(225);
				simple_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> TK_MAS() { return getTokens(bccParser.TK_MAS); }
		public TerminalNode TK_MAS(int i) {
			return getToken(bccParser.TK_MAS, i);
		}
		public List<TerminalNode> TK_MENOS() { return getTokens(bccParser.TK_MENOS); }
		public TerminalNode TK_MENOS(int i) {
			return getToken(bccParser.TK_MENOS, i);
		}
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simple_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			term();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_MAS || _la==TK_MENOS) {
				{
				{
				setState(229);
				_la = _input.LA(1);
				if ( !(_la==TK_MAS || _la==TK_MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(230);
				term();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TK_MUL() { return getTokens(bccParser.TK_MUL); }
		public TerminalNode TK_MUL(int i) {
			return getToken(bccParser.TK_MUL, i);
		}
		public List<TerminalNode> TK_DIV() { return getTokens(bccParser.TK_DIV); }
		public TerminalNode TK_DIV(int i) {
			return getToken(bccParser.TK_DIV, i);
		}
		public List<TerminalNode> TK_MOD() { return getTokens(bccParser.TK_MOD); }
		public TerminalNode TK_MOD(int i) {
			return getToken(bccParser.TK_MOD, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			factor();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MUL) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) {
				{
				{
				setState(237);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MUL) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(238);
				factor();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode TK_NUM() { return getToken(bccParser.TK_NUM, 0); }
		public TerminalNode TRUE() { return getToken(bccParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(bccParser.FALSE, 0); }
		public TerminalNode ID() { return getToken(bccParser.ID, 0); }
		public TerminalNode TK_INCREMENTO() { return getToken(bccParser.TK_INCREMENTO, 0); }
		public TerminalNode TK_DECREMENTO() { return getToken(bccParser.TK_DECREMENTO, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(bccParser.TK_PAR_IZQ, 0); }
		public List<LexprContext> lexpr() {
			return getRuleContexts(LexprContext.class);
		}
		public LexprContext lexpr(int i) {
			return getRuleContext(LexprContext.class,i);
		}
		public TerminalNode TK_PAR_DER() { return getToken(bccParser.TK_PAR_DER, 0); }
		public TerminalNode FID() { return getToken(bccParser.FID, 0); }
		public List<TerminalNode> TK_COMA() { return getTokens(bccParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(bccParser.TK_COMA, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor);
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(TK_NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(TRUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(FALSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(ID);
				setState(248);
				_la = _input.LA(1);
				if ( !(_la==TK_INCREMENTO || _la==TK_DECREMENTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				_la = _input.LA(1);
				if ( !(_la==TK_INCREMENTO || _la==TK_DECREMENTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(250);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				match(TK_PAR_IZQ);
				setState(253);
				lexpr();
				setState(254);
				match(TK_PAR_DER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(256);
				match(FID);
				setState(257);
				match(TK_PAR_IZQ);
				{
				setState(258);
				lexpr();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(259);
					match(TK_COMA);
					setState(260);
					lexpr();
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(266);
				match(TK_PAR_DER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_progContext extends ParserRuleContext {
		public TerminalNode TK_END() { return getToken(bccParser.TK_END, 0); }
		public List<TerminalNode> VAR() { return getTokens(bccParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(bccParser.VAR, i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<TerminalNode> TK_PUNTOYCOMA() { return getTokens(bccParser.TK_PUNTOYCOMA); }
		public TerminalNode TK_PUNTOYCOMA(int i) {
			return getToken(bccParser.TK_PUNTOYCOMA, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Main_progContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_prog; }
	}

	public final Main_progContext main_prog() throws RecognitionException {
		Main_progContext _localctx = new Main_progContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_main_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(270);
				match(VAR);
				setState(271);
				var_decl();
				setState(272);
				match(TK_PUNTOYCOMA);
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << TK_INPUT) | (1L << TK_WHEN) | (1L << TK_DO) | (1L << TK_IF) | (1L << TK_UNLESS) | (1L << TK_WHILE) | (1L << TK_RETURN) | (1L << TK_UNTIL) | (1L << TK_LOOP) | (1L << TK_REPEAT) | (1L << TK_FOR) | (1L << TK_NEXT) | (1L << TK_BREAK) | (1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << ID))) != 0)) {
				{
				{
				setState(279);
				stmt();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(TK_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3%\n\3\f"+
		"\3\16\3(\13\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\67\n\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\5\3\5\6\5A\n\5\r\5\16\5B\3\5\3"+
		"\5\3\5\5\5H\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c7\n\6\3\7\3\7\3\7\7\7\u00cc\n\7\f\7"+
		"\16\7\u00cf\13\7\3\7\3\7\7\7\u00d3\n\7\f\7\16\7\u00d6\13\7\5\7\u00d8\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e0\n\b\3\t\3\t\3\t\5\t\u00e5\n\t\3\n"+
		"\3\n\3\n\7\n\u00ea\n\n\f\n\16\n\u00ed\13\n\3\13\3\13\3\13\7\13\u00f2\n"+
		"\13\f\13\16\13\u00f5\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0108\n\f\f\f\16\f\u010b\13\f\3\f\3\f\5\f"+
		"\u010f\n\f\3\r\3\r\3\r\3\r\7\r\u0115\n\r\f\r\16\r\u0118\13\r\3\r\7\r\u011b"+
		"\n\r\f\r\16\r\u011e\13\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\2\6\5\2\32\33\"#./\3\2\60\61\3\2\62\64\3\2 !\2\u0144\2\32\3\2\2\2"+
		"\4\35\3\2\2\2\6;\3\2\2\2\bG\3\2\2\2\n\u00c6\3\2\2\2\f\u00c8\3\2\2\2\16"+
		"\u00df\3\2\2\2\20\u00e1\3\2\2\2\22\u00e6\3\2\2\2\24\u00ee\3\2\2\2\26\u010e"+
		"\3\2\2\2\30\u0116\3\2\2\2\32\33\5\6\4\2\33\34\5\30\r\2\34\3\3\2\2\2\35"+
		"\36\78\2\2\36\37\7%\2\2\37&\7\65\2\2 !\7&\2\2!\"\78\2\2\"#\7%\2\2#%\7"+
		"\65\2\2$ \3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\5\3\2\2\2(&\3\2\2\2"+
		")*\7\3\2\2*+\7\4\2\2+,\7%\2\2,-\7\65\2\2-/\7(\2\2.\60\5\4\3\2/.\3\2\2"+
		"\2/\60\3\2\2\2\60\61\3\2\2\2\61\66\7)\2\2\62\63\7\5\2\2\63\64\5\4\3\2"+
		"\64\65\7\'\2\2\65\67\3\2\2\2\66\62\3\2\2\2\66\67\3\2\2\2\678\3\2\2\28"+
		":\5\b\5\29)\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=;\3\2\2\2"+
		">@\7,\2\2?A\5\n\6\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2"+
		"DE\7-\2\2EH\3\2\2\2FH\5\n\6\2G>\3\2\2\2GF\3\2\2\2H\t\3\2\2\2IJ\7\6\2\2"+
		"JK\5\f\7\2KL\7\'\2\2L\u00c7\3\2\2\2MN\7\7\2\2NO\78\2\2O\u00c7\7\'\2\2"+
		"PQ\7\b\2\2QR\7(\2\2RS\5\f\7\2ST\7)\2\2TU\7\t\2\2UV\5\b\5\2V\u00c7\3\2"+
		"\2\2WX\7\n\2\2XY\7(\2\2YZ\5\f\7\2Z[\7)\2\2[\\\7\t\2\2\\]\5\b\5\2]^\7\13"+
		"\2\2^_\5\b\5\2_\u00c7\3\2\2\2`a\7\f\2\2ab\7(\2\2bc\5\f\7\2cd\7)\2\2de"+
		"\7\t\2\2ef\5\b\5\2f\u00c7\3\2\2\2gh\7\r\2\2hi\7(\2\2ij\5\f\7\2jk\7)\2"+
		"\2kl\7\t\2\2lm\5\b\5\2m\u00c7\3\2\2\2no\7\16\2\2op\5\f\7\2pq\7\'\2\2q"+
		"\u00c7\3\2\2\2rs\7\17\2\2st\7(\2\2tu\5\f\7\2uv\7)\2\2vw\7\t\2\2wx\5\b"+
		"\5\2x\u00c7\3\2\2\2yz\7\20\2\2z\u00c7\5\b\5\2{|\7\t\2\2|}\5\b\5\2}~\7"+
		"\r\2\2~\177\7(\2\2\177\u0080\5\f\7\2\u0080\u0081\7)\2\2\u0081\u00c7\3"+
		"\2\2\2\u0082\u0083\7\t\2\2\u0083\u0084\5\b\5\2\u0084\u0085\7\17\2\2\u0085"+
		"\u0086\7(\2\2\u0086\u0087\5\f\7\2\u0087\u0088\7)\2\2\u0088\u00c7\3\2\2"+
		"\2\u0089\u008a\7\21\2\2\u008a\u008b\79\2\2\u008b\u008c\7%\2\2\u008c\u00c7"+
		"\5\b\5\2\u008d\u008e\7\22\2\2\u008e\u008f\7(\2\2\u008f\u0090\5\f\7\2\u0090"+
		"\u0091\7\'\2\2\u0091\u0092\5\f\7\2\u0092\u0093\7\'\2\2\u0093\u0094\5\f"+
		"\7\2\u0094\u0095\7)\2\2\u0095\u0096\7\t\2\2\u0096\u0097\5\b\5\2\u0097"+
		"\u00c7\3\2\2\2\u0098\u0099\7\24\2\2\u0099\u00c7\7\'\2\2\u009a\u009b\7"+
		"\25\2\2\u009b\u00c7\7\'\2\2\u009c\u009d\78\2\2\u009d\u009e\7$\2\2\u009e"+
		"\u009f\5\f\7\2\u009f\u00a0\7\'\2\2\u00a0\u00c7\3\2\2\2\u00a1\u00a2\78"+
		"\2\2\u00a2\u00a3\7\34\2\2\u00a3\u00a4\5\f\7\2\u00a4\u00a5\7\'\2\2\u00a5"+
		"\u00c7\3\2\2\2\u00a6\u00a7\78\2\2\u00a7\u00a8\7\35\2\2\u00a8\u00a9\5\f"+
		"\7\2\u00a9\u00aa\7\'\2\2\u00aa\u00c7\3\2\2\2\u00ab\u00ac\78\2\2\u00ac"+
		"\u00ad\7\36\2\2\u00ad\u00ae\5\f\7\2\u00ae\u00af\7\'\2\2\u00af\u00c7\3"+
		"\2\2\2\u00b0\u00b1\78\2\2\u00b1\u00b2\7\37\2\2\u00b2\u00b3\5\f\7\2\u00b3"+
		"\u00b4\7\'\2\2\u00b4\u00c7\3\2\2\2\u00b5\u00b6\78\2\2\u00b6\u00b7\7\31"+
		"\2\2\u00b7\u00b8\5\f\7\2\u00b8\u00b9\7\'\2\2\u00b9\u00c7\3\2\2\2\u00ba"+
		"\u00bb\78\2\2\u00bb\u00bc\7 \2\2\u00bc\u00c7\7\'\2\2\u00bd\u00be\78\2"+
		"\2\u00be\u00bf\7!\2\2\u00bf\u00c7\7\'\2\2\u00c0\u00c1\7!\2\2\u00c1\u00c2"+
		"\78\2\2\u00c2\u00c7\7\'\2\2\u00c3\u00c4\7 \2\2\u00c4\u00c5\78\2\2\u00c5"+
		"\u00c7\7\'\2\2\u00c6I\3\2\2\2\u00c6M\3\2\2\2\u00c6P\3\2\2\2\u00c6W\3\2"+
		"\2\2\u00c6`\3\2\2\2\u00c6g\3\2\2\2\u00c6n\3\2\2\2\u00c6r\3\2\2\2\u00c6"+
		"y\3\2\2\2\u00c6{\3\2\2\2\u00c6\u0082\3\2\2\2\u00c6\u0089\3\2\2\2\u00c6"+
		"\u008d\3\2\2\2\u00c6\u0098\3\2\2\2\u00c6\u009a\3\2\2\2\u00c6\u009c\3\2"+
		"\2\2\u00c6\u00a1\3\2\2\2\u00c6\u00a6\3\2\2\2\u00c6\u00ab\3\2\2\2\u00c6"+
		"\u00b0\3\2\2\2\u00c6\u00b5\3\2\2\2\u00c6\u00ba\3\2\2\2\u00c6\u00bd\3\2"+
		"\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\13\3\2\2\2\u00c8\u00d7"+
		"\5\16\b\2\u00c9\u00ca\7\26\2\2\u00ca\u00cc\5\16\b\2\u00cb\u00c9\3\2\2"+
		"\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d8"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\27\2\2\u00d1\u00d3\5\16\b\2"+
		"\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00cd\3\2\2\2\u00d7"+
		"\u00d4\3\2\2\2\u00d8\r\3\2\2\2\u00d9\u00da\7\30\2\2\u00da\u00db\7(\2\2"+
		"\u00db\u00dc\5\f\7\2\u00dc\u00dd\7)\2\2\u00dd\u00e0\3\2\2\2\u00de\u00e0"+
		"\5\20\t\2\u00df\u00d9\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\17\3\2\2\2\u00e1"+
		"\u00e4\5\22\n\2\u00e2\u00e3\t\2\2\2\u00e3\u00e5\5\22\n\2\u00e4\u00e2\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\21\3\2\2\2\u00e6\u00eb\5\24\13\2\u00e7"+
		"\u00e8\t\3\2\2\u00e8\u00ea\5\24\13\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\23\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00f3\5\26\f\2\u00ef\u00f0\t\4\2\2\u00f0\u00f2\5"+
		"\26\f\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\25\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u010f\79\2\2"+
		"\u00f7\u010f\7\66\2\2\u00f8\u010f\7\67\2\2\u00f9\u00fa\78\2\2\u00fa\u010f"+
		"\t\5\2\2\u00fb\u00fc\t\5\2\2\u00fc\u010f\78\2\2\u00fd\u010f\78\2\2\u00fe"+
		"\u00ff\7(\2\2\u00ff\u0100\5\f\7\2\u0100\u0101\7)\2\2\u0101\u010f\3\2\2"+
		"\2\u0102\u0103\7\4\2\2\u0103\u0104\7(\2\2\u0104\u0109\5\f\7\2\u0105\u0106"+
		"\7&\2\2\u0106\u0108\5\f\7\2\u0107\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u010d\7)\2\2\u010d\u010f\3\2\2\2\u010e\u00f6\3\2\2\2\u010e"+
		"\u00f7\3\2\2\2\u010e\u00f8\3\2\2\2\u010e\u00f9\3\2\2\2\u010e\u00fb\3\2"+
		"\2\2\u010e\u00fd\3\2\2\2\u010e\u00fe\3\2\2\2\u010e\u0102\3\2\2\2\u010f"+
		"\27\3\2\2\2\u0110\u0111\7\5\2\2\u0111\u0112\5\4\3\2\u0112\u0113\7\'\2"+
		"\2\u0113\u0115\3\2\2\2\u0114\u0110\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011c\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011b\5\n\6\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0120\7\23\2\2\u0120\31\3\2\2\2\24&/\66;BG\u00c6\u00cd\u00d4\u00d7\u00df"+
		"\u00e4\u00eb\u00f3\u0109\u010e\u0116\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}