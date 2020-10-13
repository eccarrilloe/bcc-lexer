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
		TK_AND=20, TK_OR=21, TK_NOT=22, NUM=23, BOOL=24, TRUE=25, FALSE=26, TK_MOD_ASIG=27, 
		TK_MENOR_IGUAL=28, TK_MAYOR_IGUAL=29, TK_SUM_ASIG=30, TK_RES_ASIG=31, 
		TK_MUL_ASIG=32, TK_DIV_ASIG=33, TK_INCREMENTO=34, TK_DECREMENTO=35, TK_IGUALDAD=36, 
		TK_DIFERENTE=37, TK_ASIGNACION=38, TK_DOSPUNTOS=39, TK_COMA=40, TK_PUNTOYCOMA=41, 
		TK_PAR_IZQ=42, TK_PAR_DER=43, TK_COR_IZQ=44, TK_COR_DER=45, TK_LLAVE_IZQ=46, 
		TK_LLAVE_DER=47, TK_MENOR=48, TK_MAYOR=49, TK_MAS=50, TK_MENOS=51, TK_MUL=52, 
		TK_DIV=53, TK_MOD=54, ID=55, TK_NUM=56, COMMENT=57, WS=58;
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
			"TK_OR", "TK_NOT", "NUM", "BOOL", "TRUE", "FALSE", "TK_MOD_ASIG", "TK_MENOR_IGUAL", 
			"TK_MAYOR_IGUAL", "TK_SUM_ASIG", "TK_RES_ASIG", "TK_MUL_ASIG", "TK_DIV_ASIG", 
			"TK_INCREMENTO", "TK_DECREMENTO", "TK_IGUALDAD", "TK_DIFERENTE", "TK_ASIGNACION", 
			"TK_DOSPUNTOS", "TK_COMA", "TK_PUNTOYCOMA", "TK_PAR_IZQ", "TK_PAR_DER", 
			"TK_COR_IZQ", "TK_COR_DER", "TK_LLAVE_IZQ", "TK_LLAVE_DER", "TK_MENOR", 
			"TK_MAYOR", "TK_MAS", "TK_MENOS", "TK_MUL", "TK_DIV", "TK_MOD", "ID", 
			"TK_NUM", "COMMENT", "WS"
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
			"TK_MAYOR", "TK_MAS", "TK_MENOS", "TK_MUL", "TK_DIV", "TK_MOD", "ID", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0158\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\78\u0142\n8\f8\168\u0145\138\39\69\u0148\n"+
		"9\r9\169\u0149\3:\3:\7:\u014e\n:\f:\16:\u0151\13:\3:\3:\3;\3;\3;\3;\2"+
		"\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2\f\f\16\17\5\2\13"+
		"\f\17\17\"\"\2\u015a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w"+
		"\3\2\2\2\5\u0080\3\2\2\2\7\u0083\3\2\2\2\t\u0087\3\2\2\2\13\u008d\3\2"+
		"\2\2\r\u0093\3\2\2\2\17\u0098\3\2\2\2\21\u009b\3\2\2\2\23\u009e\3\2\2"+
		"\2\25\u00a3\3\2\2\2\27\u00aa\3\2\2\2\31\u00b0\3\2\2\2\33\u00b7\3\2\2\2"+
		"\35\u00bd\3\2\2\2\37\u00c2\3\2\2\2!\u00c9\3\2\2\2#\u00cd\3\2\2\2%\u00d1"+
		"\3\2\2\2\'\u00d6\3\2\2\2)\u00dc\3\2\2\2+\u00e0\3\2\2\2-\u00e3\3\2\2\2"+
		"/\u00e7\3\2\2\2\61\u00eb\3\2\2\2\63\u00f0\3\2\2\2\65\u00f5\3\2\2\2\67"+
		"\u00fb\3\2\2\29\u00fe\3\2\2\2;\u0101\3\2\2\2=\u0104\3\2\2\2?\u0107\3\2"+
		"\2\2A\u010a\3\2\2\2C\u010d\3\2\2\2E\u0110\3\2\2\2G\u0113\3\2\2\2I\u0116"+
		"\3\2\2\2K\u0119\3\2\2\2M\u011c\3\2\2\2O\u011f\3\2\2\2Q\u0121\3\2\2\2S"+
		"\u0123\3\2\2\2U\u0125\3\2\2\2W\u0127\3\2\2\2Y\u0129\3\2\2\2[\u012b\3\2"+
		"\2\2]\u012d\3\2\2\2_\u012f\3\2\2\2a\u0131\3\2\2\2c\u0133\3\2\2\2e\u0135"+
		"\3\2\2\2g\u0137\3\2\2\2i\u0139\3\2\2\2k\u013b\3\2\2\2m\u013d\3\2\2\2o"+
		"\u013f\3\2\2\2q\u0147\3\2\2\2s\u014b\3\2\2\2u\u0154\3\2\2\2wx\7h\2\2x"+
		"y\7w\2\2yz\7p\2\2z{\7e\2\2{|\7v\2\2|}\7k\2\2}~\7q\2\2~\177\7p\2\2\177"+
		"\4\3\2\2\2\u0080\u0081\7B\2\2\u0081\u0082\5o8\2\u0082\6\3\2\2\2\u0083"+
		"\u0084\7x\2\2\u0084\u0085\7c\2\2\u0085\u0086\7t\2\2\u0086\b\3\2\2\2\u0087"+
		"\u0088\7r\2\2\u0088\u0089\7t\2\2\u0089\u008a\7k\2\2\u008a\u008b\7p\2\2"+
		"\u008b\u008c\7v\2\2\u008c\n\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p"+
		"\2\2\u008f\u0090\7r\2\2\u0090\u0091\7w\2\2\u0091\u0092\7v\2\2\u0092\f"+
		"\3\2\2\2\u0093\u0094\7y\2\2\u0094\u0095\7j\2\2\u0095\u0096\7g\2\2\u0096"+
		"\u0097\7p\2\2\u0097\16\3\2\2\2\u0098\u0099\7f\2\2\u0099\u009a\7q\2\2\u009a"+
		"\20\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d\7h\2\2\u009d\22\3\2\2\2\u009e"+
		"\u009f\7g\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7g\2\2"+
		"\u00a2\24\3\2\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7"+
		"n\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7u\2\2\u00a9\26"+
		"\3\2\2\2\u00aa\u00ab\7y\2\2\u00ab\u00ac\7j\2\2\u00ac\u00ad\7k\2\2\u00ad"+
		"\u00ae\7n\2\2\u00ae\u00af\7g\2\2\u00af\30\3\2\2\2\u00b0\u00b1\7t\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7t\2\2"+
		"\u00b5\u00b6\7p\2\2\u00b6\32\3\2\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7"+
		"p\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7n\2\2\u00bc\34"+
		"\3\2\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7q\2\2\u00c0"+
		"\u00c1\7r\2\2\u00c1\36\3\2\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		"\u00c5\7r\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7v\2\2"+
		"\u00c8 \3\2\2\2\u00c9\u00ca\7h\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7t\2"+
		"\2\u00cc\"\3\2\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7"+
		"f\2\2\u00d0$\3\2\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4"+
		"\7z\2\2\u00d4\u00d5\7v\2\2\u00d5&\3\2\2\2\u00d6\u00d7\7d\2\2\u00d7\u00d8"+
		"\7t\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7m\2\2\u00db"+
		"(\3\2\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7f\2\2\u00df"+
		"*\3\2\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7t\2\2\u00e2,\3\2\2\2\u00e3\u00e4"+
		"\7p\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7v\2\2\u00e6.\3\2\2\2\u00e7\u00e8"+
		"\7p\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7o\2\2\u00ea\60\3\2\2\2\u00eb\u00ec"+
		"\7d\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7n\2\2\u00ef"+
		"\62\3\2\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7w\2\2\u00f3"+
		"\u00f4\7g\2\2\u00f4\64\3\2\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7\7c\2\2\u00f7"+
		"\u00f8\7n\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7g\2\2\u00fa\66\3\2\2\2\u00fb"+
		"\u00fc\7\'\2\2\u00fc\u00fd\7?\2\2\u00fd8\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff"+
		"\u0100\7?\2\2\u0100:\3\2\2\2\u0101\u0102\7@\2\2\u0102\u0103\7?\2\2\u0103"+
		"<\3\2\2\2\u0104\u0105\7-\2\2\u0105\u0106\7?\2\2\u0106>\3\2\2\2\u0107\u0108"+
		"\7/\2\2\u0108\u0109\7?\2\2\u0109@\3\2\2\2\u010a\u010b\7,\2\2\u010b\u010c"+
		"\7?\2\2\u010cB\3\2\2\2\u010d\u010e\7\61\2\2\u010e\u010f\7?\2\2\u010fD"+
		"\3\2\2\2\u0110\u0111\7-\2\2\u0111\u0112\7-\2\2\u0112F\3\2\2\2\u0113\u0114"+
		"\7/\2\2\u0114\u0115\7/\2\2\u0115H\3\2\2\2\u0116\u0117\7?\2\2\u0117\u0118"+
		"\7?\2\2\u0118J\3\2\2\2\u0119\u011a\7#\2\2\u011a\u011b\7?\2\2\u011bL\3"+
		"\2\2\2\u011c\u011d\7<\2\2\u011d\u011e\7?\2\2\u011eN\3\2\2\2\u011f\u0120"+
		"\7<\2\2\u0120P\3\2\2\2\u0121\u0122\7.\2\2\u0122R\3\2\2\2\u0123\u0124\7"+
		"=\2\2\u0124T\3\2\2\2\u0125\u0126\7*\2\2\u0126V\3\2\2\2\u0127\u0128\7+"+
		"\2\2\u0128X\3\2\2\2\u0129\u012a\7]\2\2\u012aZ\3\2\2\2\u012b\u012c\7_\2"+
		"\2\u012c\\\3\2\2\2\u012d\u012e\7}\2\2\u012e^\3\2\2\2\u012f\u0130\7\177"+
		"\2\2\u0130`\3\2\2\2\u0131\u0132\7>\2\2\u0132b\3\2\2\2\u0133\u0134\7@\2"+
		"\2\u0134d\3\2\2\2\u0135\u0136\7-\2\2\u0136f\3\2\2\2\u0137\u0138\7/\2\2"+
		"\u0138h\3\2\2\2\u0139\u013a\7,\2\2\u013aj\3\2\2\2\u013b\u013c\7\61\2\2"+
		"\u013cl\3\2\2\2\u013d\u013e\7\'\2\2\u013en\3\2\2\2\u013f\u0143\t\2\2\2"+
		"\u0140\u0142\t\3\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144p\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0148\t\4\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014ar\3\2\2\2\u014b\u014f\7%\2\2\u014c\u014e"+
		"\n\5\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\b:"+
		"\2\2\u0153t\3\2\2\2\u0154\u0155\t\6\2\2\u0155\u0156\3\2\2\2\u0156\u0157"+
		"\b;\2\2\u0157v\3\2\2\2\6\2\u0143\u0149\u014f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}