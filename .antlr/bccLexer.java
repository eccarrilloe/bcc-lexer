// Generated from /mnt/c/Users/eccar/projects/university/talp/bcc-lexer/bcc.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bccLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TK_FUNCTION", "FID", "VAR", "PRINT", "TK_INPUT", "TK_WHEN", "TK_DO", 
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


	public bccLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "bcc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0156\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\5\64\u0131\n\64\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\67\3\67\7\67\u0140\n\67\f\67\16\67\u0143\13"+
		"\67\38\68\u0146\n8\r8\168\u0147\39\39\79\u014c\n9\f9\169\u014f\139\39"+
		"\39\3:\3:\3:\3:\2\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2\f"+
		"\f\16\17\5\2\13\f\17\17\"\"\2\u0159\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\3u\3\2\2\2\5~\3\2\2\2\7\u0081\3\2\2\2\t\u0085\3\2\2\2\13\u008b\3\2\2"+
		"\2\r\u0091\3\2\2\2\17\u0096\3\2\2\2\21\u0099\3\2\2\2\23\u009c\3\2\2\2"+
		"\25\u00a1\3\2\2\2\27\u00a8\3\2\2\2\31\u00ae\3\2\2\2\33\u00b5\3\2\2\2\35"+
		"\u00bb\3\2\2\2\37\u00c0\3\2\2\2!\u00c7\3\2\2\2#\u00cb\3\2\2\2%\u00cf\3"+
		"\2\2\2\'\u00d4\3\2\2\2)\u00da\3\2\2\2+\u00de\3\2\2\2-\u00e1\3\2\2\2/\u00e5"+
		"\3\2\2\2\61\u00e8\3\2\2\2\63\u00eb\3\2\2\2\65\u00ee\3\2\2\2\67\u00f1\3"+
		"\2\2\29\u00f4\3\2\2\2;\u00f7\3\2\2\2=\u00fa\3\2\2\2?\u00fd\3\2\2\2A\u0100"+
		"\3\2\2\2C\u0103\3\2\2\2E\u0106\3\2\2\2G\u0109\3\2\2\2I\u010b\3\2\2\2K"+
		"\u010d\3\2\2\2M\u010f\3\2\2\2O\u0111\3\2\2\2Q\u0113\3\2\2\2S\u0115\3\2"+
		"\2\2U\u0117\3\2\2\2W\u0119\3\2\2\2Y\u011b\3\2\2\2[\u011d\3\2\2\2]\u011f"+
		"\3\2\2\2_\u0121\3\2\2\2a\u0123\3\2\2\2c\u0125\3\2\2\2e\u0127\3\2\2\2g"+
		"\u0130\3\2\2\2i\u0132\3\2\2\2k\u0137\3\2\2\2m\u013d\3\2\2\2o\u0145\3\2"+
		"\2\2q\u0149\3\2\2\2s\u0152\3\2\2\2uv\7h\2\2vw\7w\2\2wx\7p\2\2xy\7e\2\2"+
		"yz\7v\2\2z{\7k\2\2{|\7q\2\2|}\7p\2\2}\4\3\2\2\2~\177\7B\2\2\177\u0080"+
		"\5m\67\2\u0080\6\3\2\2\2\u0081\u0082\7x\2\2\u0082\u0083\7c\2\2\u0083\u0084"+
		"\7t\2\2\u0084\b\3\2\2\2\u0085\u0086\7r\2\2\u0086\u0087\7t\2\2\u0087\u0088"+
		"\7k\2\2\u0088\u0089\7p\2\2\u0089\u008a\7v\2\2\u008a\n\3\2\2\2\u008b\u008c"+
		"\7k\2\2\u008c\u008d\7p\2\2\u008d\u008e\7r\2\2\u008e\u008f\7w\2\2\u008f"+
		"\u0090\7v\2\2\u0090\f\3\2\2\2\u0091\u0092\7y\2\2\u0092\u0093\7j\2\2\u0093"+
		"\u0094\7g\2\2\u0094\u0095\7p\2\2\u0095\16\3\2\2\2\u0096\u0097\7f\2\2\u0097"+
		"\u0098\7q\2\2\u0098\20\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b\7h\2\2\u009b"+
		"\22\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7n\2\2\u009e\u009f\7u\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\24\3\2\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7p\2\2\u00a3"+
		"\u00a4\7n\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7u\2\2"+
		"\u00a7\26\3\2\2\2\u00a8\u00a9\7y\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7"+
		"k\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7g\2\2\u00ad\30\3\2\2\2\u00ae\u00af"+
		"\7t\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7w\2\2\u00b2"+
		"\u00b3\7t\2\2\u00b3\u00b4\7p\2\2\u00b4\32\3\2\2\2\u00b5\u00b6\7w\2\2\u00b6"+
		"\u00b7\7p\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7n\2\2"+
		"\u00ba\34\3\2\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7"+
		"q\2\2\u00be\u00bf\7r\2\2\u00bf\36\3\2\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7c\2\2\u00c5"+
		"\u00c6\7v\2\2\u00c6 \3\2\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9\7q\2\2\u00c9"+
		"\u00ca\7t\2\2\u00ca\"\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7p\2\2\u00cd"+
		"\u00ce\7f\2\2\u00ce$\3\2\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7g\2\2\u00d1"+
		"\u00d2\7z\2\2\u00d2\u00d3\7v\2\2\u00d3&\3\2\2\2\u00d4\u00d5\7d\2\2\u00d5"+
		"\u00d6\7t\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7m\2\2"+
		"\u00d9(\3\2\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7f\2"+
		"\2\u00dd*\3\2\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0,\3\2\2\2"+
		"\u00e1\u00e2\7p\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7v\2\2\u00e4.\3\2\2"+
		"\2\u00e5\u00e6\7\'\2\2\u00e6\u00e7\7?\2\2\u00e7\60\3\2\2\2\u00e8\u00e9"+
		"\7>\2\2\u00e9\u00ea\7?\2\2\u00ea\62\3\2\2\2\u00eb\u00ec\7@\2\2\u00ec\u00ed"+
		"\7?\2\2\u00ed\64\3\2\2\2\u00ee\u00ef\7-\2\2\u00ef\u00f0\7?\2\2\u00f0\66"+
		"\3\2\2\2\u00f1\u00f2\7/\2\2\u00f2\u00f3\7?\2\2\u00f38\3\2\2\2\u00f4\u00f5"+
		"\7,\2\2\u00f5\u00f6\7?\2\2\u00f6:\3\2\2\2\u00f7\u00f8\7\61\2\2\u00f8\u00f9"+
		"\7?\2\2\u00f9<\3\2\2\2\u00fa\u00fb\7-\2\2\u00fb\u00fc\7-\2\2\u00fc>\3"+
		"\2\2\2\u00fd\u00fe\7/\2\2\u00fe\u00ff\7/\2\2\u00ff@\3\2\2\2\u0100\u0101"+
		"\7?\2\2\u0101\u0102\7?\2\2\u0102B\3\2\2\2\u0103\u0104\7#\2\2\u0104\u0105"+
		"\7?\2\2\u0105D\3\2\2\2\u0106\u0107\7<\2\2\u0107\u0108\7?\2\2\u0108F\3"+
		"\2\2\2\u0109\u010a\7<\2\2\u010aH\3\2\2\2\u010b\u010c\7.\2\2\u010cJ\3\2"+
		"\2\2\u010d\u010e\7=\2\2\u010eL\3\2\2\2\u010f\u0110\7*\2\2\u0110N\3\2\2"+
		"\2\u0111\u0112\7+\2\2\u0112P\3\2\2\2\u0113\u0114\7]\2\2\u0114R\3\2\2\2"+
		"\u0115\u0116\7_\2\2\u0116T\3\2\2\2\u0117\u0118\7}\2\2\u0118V\3\2\2\2\u0119"+
		"\u011a\7\177\2\2\u011aX\3\2\2\2\u011b\u011c\7>\2\2\u011cZ\3\2\2\2\u011d"+
		"\u011e\7@\2\2\u011e\\\3\2\2\2\u011f\u0120\7-\2\2\u0120^\3\2\2\2\u0121"+
		"\u0122\7/\2\2\u0122`\3\2\2\2\u0123\u0124\7,\2\2\u0124b\3\2\2\2\u0125\u0126"+
		"\7\61\2\2\u0126d\3\2\2\2\u0127\u0128\7\'\2\2\u0128f\3\2\2\2\u0129\u012a"+
		"\7p\2\2\u012a\u012b\7w\2\2\u012b\u0131\7o\2\2\u012c\u012d\7d\2\2\u012d"+
		"\u012e\7q\2\2\u012e\u012f\7q\2\2\u012f\u0131\7n\2\2\u0130\u0129\3\2\2"+
		"\2\u0130\u012c\3\2\2\2\u0131h\3\2\2\2\u0132\u0133\7v\2\2\u0133\u0134\7"+
		"t\2\2\u0134\u0135\7w\2\2\u0135\u0136\7g\2\2\u0136j\3\2\2\2\u0137\u0138"+
		"\7h\2\2\u0138\u0139\7c\2\2\u0139\u013a\7n\2\2\u013a\u013b\7u\2\2\u013b"+
		"\u013c\7g\2\2\u013cl\3\2\2\2\u013d\u0141\t\2\2\2\u013e\u0140\t\3\2\2\u013f"+
		"\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142n\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0146\t\4\2\2\u0145\u0144"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"p\3\2\2\2\u0149\u014d\7%\2\2\u014a\u014c\n\5\2\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u0150\u0151\b9\2\2\u0151r\3\2\2\2\u0152\u0153"+
		"\t\6\2\2\u0153\u0154\3\2\2\2\u0154\u0155\b:\2\2\u0155t\3\2\2\2\7\2\u0130"+
		"\u0141\u0147\u014d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}