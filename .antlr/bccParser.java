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
		TK_AND=20, TK_OR=21, TK_NOT=22, NUM=23, BOOL=24, TRUE=25, FALSE=26, TK_MOD_ASIG=27, 
		TK_MENOR_IGUAL=28, TK_MAYOR_IGUAL=29, TK_SUM_ASIG=30, TK_RES_ASIG=31, 
		TK_MUL_ASIG=32, TK_DIV_ASIG=33, TK_INCREMENTO=34, TK_DECREMENTO=35, TK_IGUALDAD=36, 
		TK_DIFERENTE=37, TK_ASIGNACION=38, TK_DOSPUNTOS=39, TK_COMA=40, TK_PUNTOYCOMA=41, 
		TK_PAR_IZQ=42, TK_PAR_DER=43, TK_COR_IZQ=44, TK_COR_DER=45, TK_LLAVE_IZQ=46, 
		TK_LLAVE_DER=47, TK_MENOR=48, TK_MAYOR=49, TK_MAS=50, TK_MENOS=51, TK_MUL=52, 
		TK_DIV=53, TK_MOD=54, IDENTIFICADOR=55, TK_NUM=56, COMMENT=57, WS=58;
	public static final int
		RULE_prog = 0, RULE_var_decl = 1, RULE_fn_decl_list = 2, RULE_stmt_block = 3, 
		RULE_stmt = 4, RULE_lexpr = 5, RULE_nexpr = 6, RULE_rexpr = 7, RULE_simple_expr = 8, 
		RULE_term = 9, RULE_factor = 10, RULE_datatype = 11, RULE_main_prog = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "var_decl", "fn_decl_list", "stmt_block", "stmt", "lexpr", "nexpr", 
			"rexpr", "simple_expr", "term", "factor", "datatype", "main_prog"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", null, "'var'", "'print'", "'input'", "'when'", "'do'", 
			"'if'", "'else'", "'unless'", "'while'", "'return'", "'until'", "'loop'", 
			"'repeat'", "'for'", "'end'", "'next'", "'break'", "'and'", "'or'", "'not'", 
			"'num'", "'bool'", "'true'", "'false'", "'%='", "'<='", "'>='", "'+='", 
			"'-='", "'*='", "'/='", "'++'", "'--'", "'=='", "'!='", "':='", "':'", 
			"','", "';'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", 
			"'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TK_FUNCTION", "FID", "VAR", "PRINT", "TK_INPUT", "TK_WHEN", "TK_DO", 
			"TK_IF", "TK_ELSE", "TK_UNLESS", "TK_WHILE", "TK_RETURN", "TK_UNTIL", 
			"TK_LOOP", "TK_REPEAT", "TK_FOR", "TK_END", "TK_NEXT", "TK_BREAK", "TK_AND", 
			"TK_OR", "TK_NOT", "NUM", "BOOL", "TRUE", "FALSE", "TK_MOD_ASIG", "TK_MENOR_IGUAL", 
			"TK_MAYOR_IGUAL", "TK_SUM_ASIG", "TK_RES_ASIG", "TK_MUL_ASIG", "TK_DIV_ASIG", 
			"TK_INCREMENTO", "TK_DECREMENTO", "TK_IGUALDAD", "TK_DIFERENTE", "TK_ASIGNACION", 
			"TK_DOSPUNTOS", "TK_COMA", "TK_PUNTOYCOMA", "TK_PAR_IZQ", "TK_PAR_DER", 
			"TK_COR_IZQ", "TK_COR_DER", "TK_LLAVE_IZQ", "TK_LLAVE_DER", "TK_MENOR", 
			"TK_MAYOR", "TK_MAS", "TK_MENOS", "TK_MUL", "TK_DIV", "TK_MOD", "IDENTIFICADOR", 
			"TK_NUM", "COMMENT", "WS"
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
			setState(26);
			fn_decl_list();
			setState(27);
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
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(bccParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(bccParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> TK_DOSPUNTOS() { return getTokens(bccParser.TK_DOSPUNTOS); }
		public TerminalNode TK_DOSPUNTOS(int i) {
			return getToken(bccParser.TK_DOSPUNTOS, i);
		}
		public List<DatatypeContext> datatype() {
			return getRuleContexts(DatatypeContext.class);
		}
		public DatatypeContext datatype(int i) {
			return getRuleContext(DatatypeContext.class,i);
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
			setState(29);
			match(IDENTIFICADOR);
			setState(30);
			match(TK_DOSPUNTOS);
			setState(31);
			datatype();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(32);
				match(TK_COMA);
				setState(33);
				match(IDENTIFICADOR);
				setState(34);
				match(TK_DOSPUNTOS);
				setState(35);
				datatype();
				}
				}
				setState(40);
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
		public List<DatatypeContext> datatype() {
			return getRuleContexts(DatatypeContext.class);
		}
		public DatatypeContext datatype(int i) {
			return getRuleContext(DatatypeContext.class,i);
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
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_FUNCTION) {
				{
				{
				setState(41);
				match(TK_FUNCTION);
				setState(42);
				match(FID);
				setState(43);
				match(TK_DOSPUNTOS);
				setState(44);
				datatype();
				setState(45);
				match(TK_PAR_IZQ);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFICADOR) {
					{
					setState(46);
					var_decl();
					}
				}

				setState(49);
				match(TK_PAR_DER);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(50);
					match(VAR);
					setState(51);
					var_decl();
					setState(52);
					match(TK_PUNTOYCOMA);
					}
				}

				setState(56);
				stmt_block();
				}
				}
				setState(62);
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
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LLAVE_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(TK_LLAVE_IZQ);
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(64);
					stmt();
					}
					}
					setState(67); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << TK_INPUT) | (1L << TK_WHEN) | (1L << TK_DO) | (1L << TK_IF) | (1L << TK_UNLESS) | (1L << TK_WHILE) | (1L << TK_RETURN) | (1L << TK_UNTIL) | (1L << TK_LOOP) | (1L << TK_REPEAT) | (1L << TK_FOR) | (1L << TK_NEXT) | (1L << TK_BREAK) | (1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << IDENTIFICADOR))) != 0) );
				setState(69);
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
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
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
		public TerminalNode IDENTIFICADOR() { return getToken(bccParser.IDENTIFICADOR, 0); }
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
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(PRINT);
				setState(75);
				lexpr();
				setState(76);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(TK_INPUT);
				setState(79);
				match(IDENTIFICADOR);
				setState(80);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(TK_WHEN);
				setState(82);
				match(TK_PAR_IZQ);
				setState(83);
				lexpr();
				setState(84);
				match(TK_PAR_DER);
				setState(85);
				match(TK_DO);
				setState(86);
				stmt_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(TK_IF);
				setState(89);
				match(TK_PAR_IZQ);
				setState(90);
				lexpr();
				setState(91);
				match(TK_PAR_DER);
				setState(92);
				match(TK_DO);
				setState(93);
				stmt_block();
				setState(94);
				match(TK_ELSE);
				setState(95);
				stmt_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				match(TK_UNLESS);
				setState(98);
				match(TK_PAR_IZQ);
				setState(99);
				lexpr();
				setState(100);
				match(TK_PAR_DER);
				setState(101);
				match(TK_DO);
				setState(102);
				stmt_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				match(TK_WHILE);
				setState(105);
				match(TK_PAR_IZQ);
				setState(106);
				lexpr();
				setState(107);
				match(TK_PAR_DER);
				setState(108);
				match(TK_DO);
				setState(109);
				stmt_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				match(TK_RETURN);
				setState(112);
				lexpr();
				setState(113);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(115);
				match(TK_UNTIL);
				setState(116);
				match(TK_PAR_IZQ);
				setState(117);
				lexpr();
				setState(118);
				match(TK_PAR_DER);
				setState(119);
				match(TK_DO);
				setState(120);
				stmt_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(122);
				match(TK_LOOP);
				setState(123);
				stmt_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(124);
				match(TK_DO);
				setState(125);
				stmt_block();
				setState(126);
				match(TK_WHILE);
				setState(127);
				match(TK_PAR_IZQ);
				setState(128);
				lexpr();
				setState(129);
				match(TK_PAR_DER);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(131);
				match(TK_DO);
				setState(132);
				stmt_block();
				setState(133);
				match(TK_UNTIL);
				setState(134);
				match(TK_PAR_IZQ);
				setState(135);
				lexpr();
				setState(136);
				match(TK_PAR_DER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(138);
				match(TK_REPEAT);
				setState(139);
				match(TK_NUM);
				setState(140);
				match(TK_DOSPUNTOS);
				setState(141);
				stmt_block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(142);
				match(TK_FOR);
				setState(143);
				match(TK_PAR_IZQ);
				setState(144);
				lexpr();
				setState(145);
				match(TK_PUNTOYCOMA);
				setState(146);
				lexpr();
				setState(147);
				match(TK_PUNTOYCOMA);
				setState(148);
				lexpr();
				setState(149);
				match(TK_PAR_DER);
				setState(150);
				match(TK_DO);
				setState(151);
				stmt_block();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(153);
				match(TK_NEXT);
				setState(154);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(155);
				match(TK_BREAK);
				setState(156);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(157);
				match(IDENTIFICADOR);
				setState(158);
				match(TK_ASIGNACION);
				setState(159);
				lexpr();
				setState(160);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(162);
				match(IDENTIFICADOR);
				setState(163);
				match(TK_SUM_ASIG);
				setState(164);
				lexpr();
				setState(165);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(167);
				match(IDENTIFICADOR);
				setState(168);
				match(TK_RES_ASIG);
				setState(169);
				lexpr();
				setState(170);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(172);
				match(IDENTIFICADOR);
				setState(173);
				match(TK_MUL_ASIG);
				setState(174);
				lexpr();
				setState(175);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(177);
				match(IDENTIFICADOR);
				setState(178);
				match(TK_DIV_ASIG);
				setState(179);
				lexpr();
				setState(180);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(182);
				match(IDENTIFICADOR);
				setState(183);
				match(TK_MOD_ASIG);
				setState(184);
				lexpr();
				setState(185);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(187);
				match(IDENTIFICADOR);
				setState(188);
				match(TK_INCREMENTO);
				setState(189);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(190);
				match(IDENTIFICADOR);
				setState(191);
				match(TK_DECREMENTO);
				setState(192);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(193);
				match(TK_DECREMENTO);
				setState(194);
				match(IDENTIFICADOR);
				setState(195);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(196);
				match(TK_INCREMENTO);
				setState(197);
				match(IDENTIFICADOR);
				setState(198);
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
			setState(201);
			nexpr();
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_AND) {
					{
					{
					setState(202);
					match(TK_AND);
					setState(203);
					nexpr();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_OR) {
					{
					{
					setState(209);
					match(TK_OR);
					setState(210);
					nexpr();
					}
					}
					setState(215);
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
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(TK_NOT);
				setState(219);
				match(TK_PAR_IZQ);
				setState(220);
				lexpr();
				setState(221);
				match(TK_PAR_DER);
				}
				break;
			case FID:
			case TRUE:
			case FALSE:
			case TK_INCREMENTO:
			case TK_DECREMENTO:
			case TK_PAR_IZQ:
			case IDENTIFICADOR:
			case TK_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
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
			setState(226);
			simple_expr();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR_IGUAL) | (1L << TK_IGUALDAD) | (1L << TK_DIFERENTE) | (1L << TK_MENOR) | (1L << TK_MAYOR))) != 0)) {
				{
				setState(227);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR_IGUAL) | (1L << TK_MAYOR_IGUAL) | (1L << TK_IGUALDAD) | (1L << TK_DIFERENTE) | (1L << TK_MENOR) | (1L << TK_MAYOR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(228);
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
			setState(231);
			term();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_MAS || _la==TK_MENOS) {
				{
				{
				setState(232);
				_la = _input.LA(1);
				if ( !(_la==TK_MAS || _la==TK_MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				term();
				}
				}
				setState(238);
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
			setState(239);
			factor();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MUL) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) {
				{
				{
				setState(240);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MUL) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(241);
				factor();
				}
				}
				setState(246);
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
		public TerminalNode IDENTIFICADOR() { return getToken(bccParser.IDENTIFICADOR, 0); }
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
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(TK_NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(TRUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(FALSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				match(IDENTIFICADOR);
				setState(251);
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
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==TK_INCREMENTO || _la==TK_DECREMENTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(253);
				match(IDENTIFICADOR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				match(IDENTIFICADOR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(255);
				match(TK_PAR_IZQ);
				setState(256);
				lexpr();
				setState(257);
				match(TK_PAR_DER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(259);
				match(FID);
				setState(260);
				match(TK_PAR_IZQ);
				{
				setState(261);
				lexpr();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(262);
					match(TK_COMA);
					setState(263);
					lexpr();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(269);
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(bccParser.BOOL, 0); }
		public TerminalNode NUM() { return getToken(bccParser.NUM, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 24, RULE_main_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(275);
				match(VAR);
				setState(276);
				var_decl();
				setState(277);
				match(TK_PUNTOYCOMA);
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << TK_INPUT) | (1L << TK_WHEN) | (1L << TK_DO) | (1L << TK_IF) | (1L << TK_UNLESS) | (1L << TK_WHILE) | (1L << TK_RETURN) | (1L << TK_UNTIL) | (1L << TK_LOOP) | (1L << TK_REPEAT) | (1L << TK_FOR) | (1L << TK_NEXT) | (1L << TK_BREAK) | (1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << IDENTIFICADOR))) != 0)) {
				{
				{
				setState(284);
				stmt();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0127\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\7\3\'\n\3\f\3\16\3*\13\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\49\n\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\5\3\5\6\5D\n\5\r"+
		"\5\16\5E\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ca\n\6\3\7\3\7\3\7\7\7"+
		"\u00cf\n\7\f\7\16\7\u00d2\13\7\3\7\3\7\7\7\u00d6\n\7\f\7\16\7\u00d9\13"+
		"\7\5\7\u00db\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e3\n\b\3\t\3\t\3\t\5\t"+
		"\u00e8\n\t\3\n\3\n\3\n\7\n\u00ed\n\n\f\n\16\n\u00f0\13\n\3\13\3\13\3\13"+
		"\7\13\u00f5\n\13\f\13\16\13\u00f8\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u010b\n\f\f\f\16\f\u010e\13"+
		"\f\3\f\3\f\5\f\u0112\n\f\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u011a\n\16\f"+
		"\16\16\16\u011d\13\16\3\16\7\16\u0120\n\16\f\16\16\16\u0123\13\16\3\16"+
		"\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\7\5\2\36\37&\'\62"+
		"\63\3\2\64\65\3\2\668\3\2$%\3\2\31\32\2\u0148\2\34\3\2\2\2\4\37\3\2\2"+
		"\2\6>\3\2\2\2\bJ\3\2\2\2\n\u00c9\3\2\2\2\f\u00cb\3\2\2\2\16\u00e2\3\2"+
		"\2\2\20\u00e4\3\2\2\2\22\u00e9\3\2\2\2\24\u00f1\3\2\2\2\26\u0111\3\2\2"+
		"\2\30\u0113\3\2\2\2\32\u011b\3\2\2\2\34\35\5\6\4\2\35\36\5\32\16\2\36"+
		"\3\3\2\2\2\37 \79\2\2 !\7)\2\2!(\5\30\r\2\"#\7*\2\2#$\79\2\2$%\7)\2\2"+
		"%\'\5\30\r\2&\"\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\5\3\2\2\2*(\3"+
		"\2\2\2+,\7\3\2\2,-\7\4\2\2-.\7)\2\2./\5\30\r\2/\61\7,\2\2\60\62\5\4\3"+
		"\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\638\7-\2\2\64\65\7\5\2\2"+
		"\65\66\5\4\3\2\66\67\7+\2\2\679\3\2\2\28\64\3\2\2\289\3\2\2\29:\3\2\2"+
		"\2:;\5\b\5\2;=\3\2\2\2<+\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\7\3\2"+
		"\2\2@>\3\2\2\2AC\7\60\2\2BD\5\n\6\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3"+
		"\2\2\2FG\3\2\2\2GH\7\61\2\2HK\3\2\2\2IK\5\n\6\2JA\3\2\2\2JI\3\2\2\2K\t"+
		"\3\2\2\2LM\7\6\2\2MN\5\f\7\2NO\7+\2\2O\u00ca\3\2\2\2PQ\7\7\2\2QR\79\2"+
		"\2R\u00ca\7+\2\2ST\7\b\2\2TU\7,\2\2UV\5\f\7\2VW\7-\2\2WX\7\t\2\2XY\5\b"+
		"\5\2Y\u00ca\3\2\2\2Z[\7\n\2\2[\\\7,\2\2\\]\5\f\7\2]^\7-\2\2^_\7\t\2\2"+
		"_`\5\b\5\2`a\7\13\2\2ab\5\b\5\2b\u00ca\3\2\2\2cd\7\f\2\2de\7,\2\2ef\5"+
		"\f\7\2fg\7-\2\2gh\7\t\2\2hi\5\b\5\2i\u00ca\3\2\2\2jk\7\r\2\2kl\7,\2\2"+
		"lm\5\f\7\2mn\7-\2\2no\7\t\2\2op\5\b\5\2p\u00ca\3\2\2\2qr\7\16\2\2rs\5"+
		"\f\7\2st\7+\2\2t\u00ca\3\2\2\2uv\7\17\2\2vw\7,\2\2wx\5\f\7\2xy\7-\2\2"+
		"yz\7\t\2\2z{\5\b\5\2{\u00ca\3\2\2\2|}\7\20\2\2}\u00ca\5\b\5\2~\177\7\t"+
		"\2\2\177\u0080\5\b\5\2\u0080\u0081\7\r\2\2\u0081\u0082\7,\2\2\u0082\u0083"+
		"\5\f\7\2\u0083\u0084\7-\2\2\u0084\u00ca\3\2\2\2\u0085\u0086\7\t\2\2\u0086"+
		"\u0087\5\b\5\2\u0087\u0088\7\17\2\2\u0088\u0089\7,\2\2\u0089\u008a\5\f"+
		"\7\2\u008a\u008b\7-\2\2\u008b\u00ca\3\2\2\2\u008c\u008d\7\21\2\2\u008d"+
		"\u008e\7:\2\2\u008e\u008f\7)\2\2\u008f\u00ca\5\b\5\2\u0090\u0091\7\22"+
		"\2\2\u0091\u0092\7,\2\2\u0092\u0093\5\f\7\2\u0093\u0094\7+\2\2\u0094\u0095"+
		"\5\f\7\2\u0095\u0096\7+\2\2\u0096\u0097\5\f\7\2\u0097\u0098\7-\2\2\u0098"+
		"\u0099\7\t\2\2\u0099\u009a\5\b\5\2\u009a\u00ca\3\2\2\2\u009b\u009c\7\24"+
		"\2\2\u009c\u00ca\7+\2\2\u009d\u009e\7\25\2\2\u009e\u00ca\7+\2\2\u009f"+
		"\u00a0\79\2\2\u00a0\u00a1\7(\2\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3\7+\2"+
		"\2\u00a3\u00ca\3\2\2\2\u00a4\u00a5\79\2\2\u00a5\u00a6\7 \2\2\u00a6\u00a7"+
		"\5\f\7\2\u00a7\u00a8\7+\2\2\u00a8\u00ca\3\2\2\2\u00a9\u00aa\79\2\2\u00aa"+
		"\u00ab\7!\2\2\u00ab\u00ac\5\f\7\2\u00ac\u00ad\7+\2\2\u00ad\u00ca\3\2\2"+
		"\2\u00ae\u00af\79\2\2\u00af\u00b0\7\"\2\2\u00b0\u00b1\5\f\7\2\u00b1\u00b2"+
		"\7+\2\2\u00b2\u00ca\3\2\2\2\u00b3\u00b4\79\2\2\u00b4\u00b5\7#\2\2\u00b5"+
		"\u00b6\5\f\7\2\u00b6\u00b7\7+\2\2\u00b7\u00ca\3\2\2\2\u00b8\u00b9\79\2"+
		"\2\u00b9\u00ba\7\35\2\2\u00ba\u00bb\5\f\7\2\u00bb\u00bc\7+\2\2\u00bc\u00ca"+
		"\3\2\2\2\u00bd\u00be\79\2\2\u00be\u00bf\7$\2\2\u00bf\u00ca\7+\2\2\u00c0"+
		"\u00c1\79\2\2\u00c1\u00c2\7%\2\2\u00c2\u00ca\7+\2\2\u00c3\u00c4\7%\2\2"+
		"\u00c4\u00c5\79\2\2\u00c5\u00ca\7+\2\2\u00c6\u00c7\7$\2\2\u00c7\u00c8"+
		"\79\2\2\u00c8\u00ca\7+\2\2\u00c9L\3\2\2\2\u00c9P\3\2\2\2\u00c9S\3\2\2"+
		"\2\u00c9Z\3\2\2\2\u00c9c\3\2\2\2\u00c9j\3\2\2\2\u00c9q\3\2\2\2\u00c9u"+
		"\3\2\2\2\u00c9|\3\2\2\2\u00c9~\3\2\2\2\u00c9\u0085\3\2\2\2\u00c9\u008c"+
		"\3\2\2\2\u00c9\u0090\3\2\2\2\u00c9\u009b\3\2\2\2\u00c9\u009d\3\2\2\2\u00c9"+
		"\u009f\3\2\2\2\u00c9\u00a4\3\2\2\2\u00c9\u00a9\3\2\2\2\u00c9\u00ae\3\2"+
		"\2\2\u00c9\u00b3\3\2\2\2\u00c9\u00b8\3\2\2\2\u00c9\u00bd\3\2\2\2\u00c9"+
		"\u00c0\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\13\3\2\2"+
		"\2\u00cb\u00da\5\16\b\2\u00cc\u00cd\7\26\2\2\u00cd\u00cf\5\16\b\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00db\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\27\2\2\u00d4"+
		"\u00d6\5\16\b\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00d0\3\2\2\2\u00da\u00d7\3\2\2\2\u00db\r\3\2\2\2\u00dc\u00dd\7\30\2"+
		"\2\u00dd\u00de\7,\2\2\u00de\u00df\5\f\7\2\u00df\u00e0\7-\2\2\u00e0\u00e3"+
		"\3\2\2\2\u00e1\u00e3\5\20\t\2\u00e2\u00dc\3\2\2\2\u00e2\u00e1\3\2\2\2"+
		"\u00e3\17\3\2\2\2\u00e4\u00e7\5\22\n\2\u00e5\u00e6\t\2\2\2\u00e6\u00e8"+
		"\5\22\n\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\21\3\2\2\2\u00e9"+
		"\u00ee\5\24\13\2\u00ea\u00eb\t\3\2\2\u00eb\u00ed\5\24\13\2\u00ec\u00ea"+
		"\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\23\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f6\5\26\f\2\u00f2\u00f3\t\4\2"+
		"\2\u00f3\u00f5\5\26\f\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\25\3\2\2\2\u00f8\u00f6\3\2\2"+
		"\2\u00f9\u0112\7:\2\2\u00fa\u0112\7\33\2\2\u00fb\u0112\7\34\2\2\u00fc"+
		"\u00fd\79\2\2\u00fd\u0112\t\5\2\2\u00fe\u00ff\t\5\2\2\u00ff\u0112\79\2"+
		"\2\u0100\u0112\79\2\2\u0101\u0102\7,\2\2\u0102\u0103\5\f\7\2\u0103\u0104"+
		"\7-\2\2\u0104\u0112\3\2\2\2\u0105\u0106\7\4\2\2\u0106\u0107\7,\2\2\u0107"+
		"\u010c\5\f\7\2\u0108\u0109\7*\2\2\u0109\u010b\5\f\7\2\u010a\u0108\3\2"+
		"\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7-\2\2\u0110\u0112\3\2"+
		"\2\2\u0111\u00f9\3\2\2\2\u0111\u00fa\3\2\2\2\u0111\u00fb\3\2\2\2\u0111"+
		"\u00fc\3\2\2\2\u0111\u00fe\3\2\2\2\u0111\u0100\3\2\2\2\u0111\u0101\3\2"+
		"\2\2\u0111\u0105\3\2\2\2\u0112\27\3\2\2\2\u0113\u0114\t\6\2\2\u0114\31"+
		"\3\2\2\2\u0115\u0116\7\5\2\2\u0116\u0117\5\4\3\2\u0117\u0118\7+\2\2\u0118"+
		"\u011a\3\2\2\2\u0119\u0115\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\u0121\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u0120\5\n\6\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0125\7\23\2\2\u0125\33\3\2\2\2\24(\618>EJ\u00c9\u00d0\u00d7\u00da\u00e2"+
		"\u00e7\u00ee\u00f6\u010c\u0111\u011b\u0121";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}