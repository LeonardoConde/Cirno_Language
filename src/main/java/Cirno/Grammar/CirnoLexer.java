// Generated from Cirno.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CirnoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PROCEDIMENTO=2, PROCEDIMENTOPRINCIPAL=3, INTEIRO=4, INTEIRO_POSITIVO=5, 
		INTEIRO_NEGATIVO=6, RACIONAL=7, RACIONAL_POSITIVO=8, RACIONAL_NEGATIVO=9, 
		CARACTERE=10, TEXTO=11, BOOLEANO=12, VAZIO=13, SE=14, CONTUDO=15, QUANDO=16, 
		FINALIZE=17, PARA=18, ENQUANTO=19, EXECUTE=20, REPITA=21, ATRIBUICAO=22, 
		RETORNO=23, LEIA=24, IMPRIMA=25, E=26, OU=27, NAO=28, IGUAL=29, DIFERENTE=30, 
		MAIOR=31, MENOR=32, MAIOR_IGUAL=33, MENOR_IGUAL=34, SOMA=35, SUBTRACAO=36, 
		MULTIPLICACAO=37, DIVISAO=38, MODULO=39, INCREMENTO=40, DECREMENTO=41, 
		FIM_LINHA=42, INICIO_PARENTESES=43, FIM_PARENTESES=44, INICIO_COLCHETE=45, 
		FIM_COLCHETE=46, INICIO_CHAVES=47, FIM_CHAVES=48, SEPARADOR_PARAMETRO=49, 
		SEPARADOR_DEFINICAO_VARIAVEL=50, DEFINICAO_INTEIRO=51, DEFINICAO_INTEIRO_POSITIVO=52, 
		DEFINICAO_INTEIRO_NEGATIVO=53, DEFINICAO_RACIONAL=54, DEFINICAO_RACIONAL_POSITIVO=55, 
		DEFINICAO_RACIONAL_NEGATIVO=56, DEFINICAO_CARACTERE=57, DEFINICAO_TEXTO=58, 
		DEFINICAO_BOOLEANO=59, ID=60, WS=61;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PROCEDIMENTO", "PROCEDIMENTOPRINCIPAL", "INTEIRO", "INTEIRO_POSITIVO", 
			"INTEIRO_NEGATIVO", "RACIONAL", "RACIONAL_POSITIVO", "RACIONAL_NEGATIVO", 
			"CARACTERE", "TEXTO", "BOOLEANO", "VAZIO", "SE", "CONTUDO", "QUANDO", 
			"FINALIZE", "PARA", "ENQUANTO", "EXECUTE", "REPITA", "ATRIBUICAO", "RETORNO", 
			"LEIA", "IMPRIMA", "E", "OU", "NAO", "IGUAL", "DIFERENTE", "MAIOR", "MENOR", 
			"MAIOR_IGUAL", "MENOR_IGUAL", "SOMA", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO", 
			"MODULO", "INCREMENTO", "DECREMENTO", "FIM_LINHA", "INICIO_PARENTESES", 
			"FIM_PARENTESES", "INICIO_COLCHETE", "FIM_COLCHETE", "INICIO_CHAVES", 
			"FIM_CHAVES", "SEPARADOR_PARAMETRO", "SEPARADOR_DEFINICAO_VARIAVEL", 
			"DEFINICAO_INTEIRO", "DEFINICAO_INTEIRO_POSITIVO", "DEFINICAO_INTEIRO_NEGATIVO", 
			"DEFINICAO_RACIONAL", "DEFINICAO_RACIONAL_POSITIVO", "DEFINICAO_RACIONAL_NEGATIVO", 
			"DEFINICAO_CARACTERE", "DEFINICAO_TEXTO", "DEFINICAO_BOOLEANO", "SINAL", 
			"POSITIVO", "NEGATIVO", "VERDADEIRO", "FALSO", "ZERO", "NAO_ZERO", "NUMERO", 
			"LETRA", "CARACTER", "ESCAPE", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'comando'", "'func'", "'inicio'", "'inteiro'", "'inteiro+'", "'inteiro-'", 
			"'racional'", "'racional+'", "'racional-'", "'caractere'", "'texto'", 
			"'booleano'", "'vazio'", "'se'", "'contudo'", "'quando'", "'finalize'", 
			"'para'", "'enquanto'", "'execute'", "'repita'", "':='", "'retorno'", 
			"'leia'", "'imprima'", "'&&'", "'OR'", "'!'", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", 
			"';'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PROCEDIMENTO", "PROCEDIMENTOPRINCIPAL", "INTEIRO", "INTEIRO_POSITIVO", 
			"INTEIRO_NEGATIVO", "RACIONAL", "RACIONAL_POSITIVO", "RACIONAL_NEGATIVO", 
			"CARACTERE", "TEXTO", "BOOLEANO", "VAZIO", "SE", "CONTUDO", "QUANDO", 
			"FINALIZE", "PARA", "ENQUANTO", "EXECUTE", "REPITA", "ATRIBUICAO", "RETORNO", 
			"LEIA", "IMPRIMA", "E", "OU", "NAO", "IGUAL", "DIFERENTE", "MAIOR", "MENOR", 
			"MAIOR_IGUAL", "MENOR_IGUAL", "SOMA", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO", 
			"MODULO", "INCREMENTO", "DECREMENTO", "FIM_LINHA", "INICIO_PARENTESES", 
			"FIM_PARENTESES", "INICIO_COLCHETE", "FIM_COLCHETE", "INICIO_CHAVES", 
			"FIM_CHAVES", "SEPARADOR_PARAMETRO", "SEPARADOR_DEFINICAO_VARIAVEL", 
			"DEFINICAO_INTEIRO", "DEFINICAO_INTEIRO_POSITIVO", "DEFINICAO_INTEIRO_NEGATIVO", 
			"DEFINICAO_RACIONAL", "DEFINICAO_RACIONAL_POSITIVO", "DEFINICAO_RACIONAL_NEGATIVO", 
			"DEFINICAO_CARACTERE", "DEFINICAO_TEXTO", "DEFINICAO_BOOLEANO", "ID", 
			"WS"
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


	public CirnoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cirno.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u02cc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\6\64\u0189\n\64\r\64\16\64\u018a\3\64\5\64\u018e"+
		"\n\64\3\64\7\64\u0191\n\64\f\64\16\64\u0194\13\64\3\64\3\64\7\64\u0198"+
		"\n\64\f\64\16\64\u019b\13\64\5\64\u019d\n\64\3\65\6\65\u01a0\n\65\r\65"+
		"\16\65\u01a1\3\65\5\65\u01a5\n\65\3\65\7\65\u01a8\n\65\f\65\16\65\u01ab"+
		"\13\65\3\65\3\65\7\65\u01af\n\65\f\65\16\65\u01b2\13\65\5\65\u01b4\n\65"+
		"\3\66\6\66\u01b7\n\66\r\66\16\66\u01b8\3\66\5\66\u01bc\n\66\3\66\7\66"+
		"\u01bf\n\66\f\66\16\66\u01c2\13\66\3\66\3\66\7\66\u01c6\n\66\f\66\16\66"+
		"\u01c9\13\66\5\66\u01cb\n\66\3\67\6\67\u01ce\n\67\r\67\16\67\u01cf\3\67"+
		"\3\67\6\67\u01d4\n\67\r\67\16\67\u01d5\3\67\5\67\u01d9\n\67\3\67\7\67"+
		"\u01dc\n\67\f\67\16\67\u01df\13\67\3\67\3\67\7\67\u01e3\n\67\f\67\16\67"+
		"\u01e6\13\67\3\67\3\67\6\67\u01ea\n\67\r\67\16\67\u01eb\3\67\5\67\u01ef"+
		"\n\67\3\67\6\67\u01f2\n\67\r\67\16\67\u01f3\3\67\3\67\7\67\u01f8\n\67"+
		"\f\67\16\67\u01fb\13\67\3\67\3\67\7\67\u01ff\n\67\f\67\16\67\u0202\13"+
		"\67\5\67\u0204\n\67\38\68\u0207\n8\r8\168\u0208\38\38\68\u020d\n8\r8\16"+
		"8\u020e\38\58\u0212\n8\38\78\u0215\n8\f8\168\u0218\138\38\38\78\u021c"+
		"\n8\f8\168\u021f\138\38\38\68\u0223\n8\r8\168\u0224\38\58\u0228\n8\38"+
		"\68\u022b\n8\r8\168\u022c\38\38\78\u0231\n8\f8\168\u0234\138\38\38\78"+
		"\u0238\n8\f8\168\u023b\138\58\u023d\n8\39\39\39\69\u0242\n9\r9\169\u0243"+
		"\39\59\u0247\n9\39\79\u024a\n9\f9\169\u024d\139\39\39\79\u0251\n9\f9\16"+
		"9\u0254\139\39\39\69\u0258\n9\r9\169\u0259\39\59\u025d\n9\39\69\u0260"+
		"\n9\r9\169\u0261\39\39\79\u0266\n9\f9\169\u0269\139\39\39\79\u026d\n9"+
		"\f9\169\u0270\139\59\u0272\n9\3:\3:\3:\3:\3;\3;\7;\u027a\n;\f;\16;\u027d"+
		"\13;\3;\3;\3<\3<\5<\u0283\n<\3=\3=\5=\u0287\n=\3>\3>\3?\3?\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3C\3C\3D\3D\5D\u02a4\n"+
		"D\3E\3E\3F\3F\5F\u02aa\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\5G\u02bc\nG\3H\3H\3H\7H\u02c1\nH\fH\16H\u02c4\13H\3I\6I\u02c7\nI"+
		"\rI\16I\u02c8\3I\3I\3\u027b\2J\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y\2{\2}\2\177\2\u0081\2\u0083\2\u0085"+
		"\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f>\u0091?\3\2\6\3\2\63;\5\2C\\"+
		"aac|\6\2\f\f\17\17))^^\5\2\13\f\17\17\"\"\2\u0301\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3"+
		"\u0093\3\2\2\2\5\u009b\3\2\2\2\7\u00a0\3\2\2\2\t\u00a7\3\2\2\2\13\u00af"+
		"\3\2\2\2\r\u00b8\3\2\2\2\17\u00c1\3\2\2\2\21\u00ca\3\2\2\2\23\u00d4\3"+
		"\2\2\2\25\u00de\3\2\2\2\27\u00e8\3\2\2\2\31\u00ee\3\2\2\2\33\u00f7\3\2"+
		"\2\2\35\u00fd\3\2\2\2\37\u0100\3\2\2\2!\u0108\3\2\2\2#\u010f\3\2\2\2%"+
		"\u0118\3\2\2\2\'\u011d\3\2\2\2)\u0126\3\2\2\2+\u012e\3\2\2\2-\u0135\3"+
		"\2\2\2/\u0138\3\2\2\2\61\u0140\3\2\2\2\63\u0145\3\2\2\2\65\u014d\3\2\2"+
		"\2\67\u0150\3\2\2\29\u0153\3\2\2\2;\u0155\3\2\2\2=\u0158\3\2\2\2?\u015b"+
		"\3\2\2\2A\u015d\3\2\2\2C\u015f\3\2\2\2E\u0162\3\2\2\2G\u0165\3\2\2\2I"+
		"\u0167\3\2\2\2K\u0169\3\2\2\2M\u016b\3\2\2\2O\u016d\3\2\2\2Q\u016f\3\2"+
		"\2\2S\u0172\3\2\2\2U\u0175\3\2\2\2W\u0177\3\2\2\2Y\u0179\3\2\2\2[\u017b"+
		"\3\2\2\2]\u017d\3\2\2\2_\u017f\3\2\2\2a\u0181\3\2\2\2c\u0183\3\2\2\2e"+
		"\u0185\3\2\2\2g\u019c\3\2\2\2i\u01b3\3\2\2\2k\u01ca\3\2\2\2m\u0203\3\2"+
		"\2\2o\u023c\3\2\2\2q\u0271\3\2\2\2s\u0273\3\2\2\2u\u0277\3\2\2\2w\u0282"+
		"\3\2\2\2y\u0286\3\2\2\2{\u0288\3\2\2\2}\u028a\3\2\2\2\177\u028c\3\2\2"+
		"\2\u0081\u0297\3\2\2\2\u0083\u029d\3\2\2\2\u0085\u029f\3\2\2\2\u0087\u02a3"+
		"\3\2\2\2\u0089\u02a5\3\2\2\2\u008b\u02a9\3\2\2\2\u008d\u02bb\3\2\2\2\u008f"+
		"\u02bd\3\2\2\2\u0091\u02c6\3\2\2\2\u0093\u0094\7e\2\2\u0094\u0095\7q\2"+
		"\2\u0095\u0096\7o\2\2\u0096\u0097\7c\2\2\u0097\u0098\7p\2\2\u0098\u0099"+
		"\7f\2\2\u0099\u009a\7q\2\2\u009a\4\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d"+
		"\7w\2\2\u009d\u009e\7p\2\2\u009e\u009f\7e\2\2\u009f\6\3\2\2\2\u00a0\u00a1"+
		"\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7e\2\2\u00a4"+
		"\u00a5\7k\2\2\u00a5\u00a6\7q\2\2\u00a6\b\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"\u00a9\7p\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7k\2\2"+
		"\u00ac\u00ad\7t\2\2\u00ad\u00ae\7q\2\2\u00ae\n\3\2\2\2\u00af\u00b0\7k"+
		"\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4"+
		"\7k\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7-\2\2\u00b7"+
		"\f\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7v\2\2\u00bb"+
		"\u00bc\7g\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7q\2\2"+
		"\u00bf\u00c0\7/\2\2\u00c0\16\3\2\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7"+
		"c\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7"+
		"\7p\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7n\2\2\u00c9\20\3\2\2\2\u00ca\u00cb"+
		"\7t\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7e\2\2\u00cd\u00ce\7k\2\2\u00ce"+
		"\u00cf\7q\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7n\2\2"+
		"\u00d2\u00d3\7-\2\2\u00d3\22\3\2\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7"+
		"c\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da"+
		"\7p\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7/\2\2\u00dd"+
		"\24\3\2\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7t\2\2\u00e1"+
		"\u00e2\7c\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7g\2\2"+
		"\u00e5\u00e6\7t\2\2\u00e6\u00e7\7g\2\2\u00e7\26\3\2\2\2\u00e8\u00e9\7"+
		"v\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7z\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed"+
		"\7q\2\2\u00ed\30\3\2\2\2\u00ee\u00ef\7d\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1"+
		"\7q\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7c\2\2\u00f4"+
		"\u00f5\7p\2\2\u00f5\u00f6\7q\2\2\u00f6\32\3\2\2\2\u00f7\u00f8\7x\2\2\u00f8"+
		"\u00f9\7c\2\2\u00f9\u00fa\7|\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7q\2\2"+
		"\u00fc\34\3\2\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7g\2\2\u00ff\36\3\2\2"+
		"\2\u0100\u0101\7e\2\2\u0101\u0102\7q\2\2\u0102\u0103\7p\2\2\u0103\u0104"+
		"\7v\2\2\u0104\u0105\7w\2\2\u0105\u0106\7f\2\2\u0106\u0107\7q\2\2\u0107"+
		" \3\2\2\2\u0108\u0109\7s\2\2\u0109\u010a\7w\2\2\u010a\u010b\7c\2\2\u010b"+
		"\u010c\7p\2\2\u010c\u010d\7f\2\2\u010d\u010e\7q\2\2\u010e\"\3\2\2\2\u010f"+
		"\u0110\7h\2\2\u0110\u0111\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113\7c\2\2"+
		"\u0113\u0114\7n\2\2\u0114\u0115\7k\2\2\u0115\u0116\7|\2\2\u0116\u0117"+
		"\7g\2\2\u0117$\3\2\2\2\u0118\u0119\7r\2\2\u0119\u011a\7c\2\2\u011a\u011b"+
		"\7t\2\2\u011b\u011c\7c\2\2\u011c&\3\2\2\2\u011d\u011e\7g\2\2\u011e\u011f"+
		"\7p\2\2\u011f\u0120\7s\2\2\u0120\u0121\7w\2\2\u0121\u0122\7c\2\2\u0122"+
		"\u0123\7p\2\2\u0123\u0124\7v\2\2\u0124\u0125\7q\2\2\u0125(\3\2\2\2\u0126"+
		"\u0127\7g\2\2\u0127\u0128\7z\2\2\u0128\u0129\7g\2\2\u0129\u012a\7e\2\2"+
		"\u012a\u012b\7w\2\2\u012b\u012c\7v\2\2\u012c\u012d\7g\2\2\u012d*\3\2\2"+
		"\2\u012e\u012f\7t\2\2\u012f\u0130\7g\2\2\u0130\u0131\7r\2\2\u0131\u0132"+
		"\7k\2\2\u0132\u0133\7v\2\2\u0133\u0134\7c\2\2\u0134,\3\2\2\2\u0135\u0136"+
		"\7<\2\2\u0136\u0137\7?\2\2\u0137.\3\2\2\2\u0138\u0139\7t\2\2\u0139\u013a"+
		"\7g\2\2\u013a\u013b\7v\2\2\u013b\u013c\7q\2\2\u013c\u013d\7t\2\2\u013d"+
		"\u013e\7p\2\2\u013e\u013f\7q\2\2\u013f\60\3\2\2\2\u0140\u0141\7n\2\2\u0141"+
		"\u0142\7g\2\2\u0142\u0143\7k\2\2\u0143\u0144\7c\2\2\u0144\62\3\2\2\2\u0145"+
		"\u0146\7k\2\2\u0146\u0147\7o\2\2\u0147\u0148\7r\2\2\u0148\u0149\7t\2\2"+
		"\u0149\u014a\7k\2\2\u014a\u014b\7o\2\2\u014b\u014c\7c\2\2\u014c\64\3\2"+
		"\2\2\u014d\u014e\7(\2\2\u014e\u014f\7(\2\2\u014f\66\3\2\2\2\u0150\u0151"+
		"\7Q\2\2\u0151\u0152\7T\2\2\u01528\3\2\2\2\u0153\u0154\7#\2\2\u0154:\3"+
		"\2\2\2\u0155\u0156\7?\2\2\u0156\u0157\7?\2\2\u0157<\3\2\2\2\u0158\u0159"+
		"\7#\2\2\u0159\u015a\7?\2\2\u015a>\3\2\2\2\u015b\u015c\7@\2\2\u015c@\3"+
		"\2\2\2\u015d\u015e\7>\2\2\u015eB\3\2\2\2\u015f\u0160\7@\2\2\u0160\u0161"+
		"\7?\2\2\u0161D\3\2\2\2\u0162\u0163\7>\2\2\u0163\u0164\7?\2\2\u0164F\3"+
		"\2\2\2\u0165\u0166\7-\2\2\u0166H\3\2\2\2\u0167\u0168\7/\2\2\u0168J\3\2"+
		"\2\2\u0169\u016a\7,\2\2\u016aL\3\2\2\2\u016b\u016c\7\61\2\2\u016cN\3\2"+
		"\2\2\u016d\u016e\7\'\2\2\u016eP\3\2\2\2\u016f\u0170\7-\2\2\u0170\u0171"+
		"\7-\2\2\u0171R\3\2\2\2\u0172\u0173\7/\2\2\u0173\u0174\7/\2\2\u0174T\3"+
		"\2\2\2\u0175\u0176\7=\2\2\u0176V\3\2\2\2\u0177\u0178\7*\2\2\u0178X\3\2"+
		"\2\2\u0179\u017a\7+\2\2\u017aZ\3\2\2\2\u017b\u017c\7]\2\2\u017c\\\3\2"+
		"\2\2\u017d\u017e\7_\2\2\u017e^\3\2\2\2\u017f\u0180\7}\2\2\u0180`\3\2\2"+
		"\2\u0181\u0182\7\177\2\2\u0182b\3\2\2\2\u0183\u0184\7.\2\2\u0184d\3\2"+
		"\2\2\u0185\u0186\7<\2\2\u0186f\3\2\2\2\u0187\u0189\5\u0083B\2\u0188\u0187"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u019d\3\2\2\2\u018c\u018e\5y=\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2"+
		"\2\u018e\u0192\3\2\2\2\u018f\u0191\5\u0083B\2\u0190\u018f\3\2\2\2\u0191"+
		"\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0195\u0199\5\u0085C\2\u0196\u0198\5\u0087D\2"+
		"\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u0188\3\2\2\2\u019c"+
		"\u018d\3\2\2\2\u019dh\3\2\2\2\u019e\u01a0\5\u0083B\2\u019f\u019e\3\2\2"+
		"\2\u01a0\u01a1\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01b4"+
		"\3\2\2\2\u01a3\u01a5\5{>\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a9\3\2\2\2\u01a6\u01a8\5\u0083B\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab"+
		"\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ac\u01b0\5\u0085C\2\u01ad\u01af\5\u0087D\2\u01ae\u01ad"+
		"\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u019f\3\2\2\2\u01b3\u01a4\3\2"+
		"\2\2\u01b4j\3\2\2\2\u01b5\u01b7\5\u0083B\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01cb\3\2\2\2\u01ba"+
		"\u01bc\5}?\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c0\3\2\2"+
		"\2\u01bd\u01bf\5\u0083B\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2"+
		"\2\2\u01c3\u01c7\5\u0085C\2\u01c4\u01c6\5\u0087D\2\u01c5\u01c4\3\2\2\2"+
		"\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cb"+
		"\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01b6\3\2\2\2\u01ca\u01bb\3\2\2\2\u01cb"+
		"l\3\2\2\2\u01cc\u01ce\5\u0083B\2\u01cd\u01cc\3\2\2\2\u01ce\u01cf\3\2\2"+
		"\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3"+
		"\7\60\2\2\u01d2\u01d4\5\u0083B\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5\3\2\2"+
		"\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u0204\3\2\2\2\u01d7\u01d9"+
		"\5y=\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01dd\3\2\2\2\u01da"+
		"\u01dc\5\u0083B\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0"+
		"\u01e4\5\u0085C\2\u01e1\u01e3\5\u0087D\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6"+
		"\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e7\u01e9\7\60\2\2\u01e8\u01ea\5\u0087D\2\u01e9\u01e8"+
		"\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u0204\3\2\2\2\u01ed\u01ef\5y=\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2"+
		"\2\u01ef\u01f1\3\2\2\2\u01f0\u01f2\5\u0083B\2\u01f1\u01f0\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01f9\7\60\2\2\u01f6\u01f8\5\u0085C\2\u01f7\u01f6\3\2\2\2\u01f8"+
		"\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2"+
		"\2\2\u01fb\u01f9\3\2\2\2\u01fc\u0200\5\u0087D\2\u01fd\u01ff\5\u0085C\2"+
		"\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201"+
		"\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u01cd\3\2\2\2\u0203"+
		"\u01d8\3\2\2\2\u0203\u01ee\3\2\2\2\u0204n\3\2\2\2\u0205\u0207\5\u0083"+
		"B\2\u0206\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0206\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\7\60\2\2\u020b\u020d\5"+
		"\u0083B\2\u020c\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020c\3\2\2\2"+
		"\u020e\u020f\3\2\2\2\u020f\u023d\3\2\2\2\u0210\u0212\5{>\2\u0211\u0210"+
		"\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0216\3\2\2\2\u0213\u0215\5\u0083B"+
		"\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217"+
		"\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021d\5\u0085C"+
		"\2\u021a\u021c\5\u0087D\2\u021b\u021a\3\2\2\2\u021c\u021f\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u021d\3\2"+
		"\2\2\u0220\u0222\7\60\2\2\u0221\u0223\5\u0087D\2\u0222\u0221\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u023d\3\2"+
		"\2\2\u0226\u0228\5{>\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a"+
		"\3\2\2\2\u0229\u022b\5\u0083B\2\u022a\u0229\3\2\2\2\u022b\u022c\3\2\2"+
		"\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0232"+
		"\7\60\2\2\u022f\u0231\5\u0085C\2\u0230\u022f\3\2\2\2\u0231\u0234\3\2\2"+
		"\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0232"+
		"\3\2\2\2\u0235\u0239\5\u0087D\2\u0236\u0238\5\u0085C\2\u0237\u0236\3\2"+
		"\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u0206\3\2\2\2\u023c\u0211\3\2"+
		"\2\2\u023c\u0227\3\2\2\2\u023dp\3\2\2\2\u023e\u023f\5\u0083B\2\u023f\u0241"+
		"\7\60\2\2\u0240\u0242\5\u0083B\2\u0241\u0240\3\2\2\2\u0242\u0243\3\2\2"+
		"\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0272\3\2\2\2\u0245\u0247"+
		"\5}?\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u024b\3\2\2\2\u0248"+
		"\u024a\5\u0083B\2\u0249\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249"+
		"\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e"+
		"\u0252\5\u0085C\2\u024f\u0251\5\u0087D\2\u0250\u024f\3\2\2\2\u0251\u0254"+
		"\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0255\u0257\7\60\2\2\u0256\u0258\5\u0087D\2\u0257\u0256"+
		"\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u0272\3\2\2\2\u025b\u025d\5}?\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2"+
		"\2\u025d\u025f\3\2\2\2\u025e\u0260\5\u0083B\2\u025f\u025e\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\3\2"+
		"\2\2\u0263\u0267\7\60\2\2\u0264\u0266\5\u0085C\2\u0265\u0264\3\2\2\2\u0266"+
		"\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\3\2"+
		"\2\2\u0269\u0267\3\2\2\2\u026a\u026e\5\u0087D\2\u026b\u026d\5\u0085C\2"+
		"\u026c\u026b\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f"+
		"\3\2\2\2\u026f\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u023e\3\2\2\2\u0271"+
		"\u0246\3\2\2\2\u0271\u025c\3\2\2\2\u0272r\3\2\2\2\u0273\u0274\7)\2\2\u0274"+
		"\u0275\5\u008bF\2\u0275\u0276\7)\2\2\u0276t\3\2\2\2\u0277\u027b\7$\2\2"+
		"\u0278\u027a\5\u008bF\2\u0279\u0278\3\2\2\2\u027a\u027d\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027b\3\2"+
		"\2\2\u027e\u027f\7$\2\2\u027fv\3\2\2\2\u0280\u0283\5\177@\2\u0281\u0283"+
		"\5\u0081A\2\u0282\u0280\3\2\2\2\u0282\u0281\3\2\2\2\u0283x\3\2\2\2\u0284"+
		"\u0287\5{>\2\u0285\u0287\5}?\2\u0286\u0284\3\2\2\2\u0286\u0285\3\2\2\2"+
		"\u0287z\3\2\2\2\u0288\u0289\7-\2\2\u0289|\3\2\2\2\u028a\u028b\7/\2\2\u028b"+
		"~\3\2\2\2\u028c\u028d\7x\2\2\u028d\u028e\7g\2\2\u028e\u028f\7t\2\2\u028f"+
		"\u0290\7f\2\2\u0290\u0291\7c\2\2\u0291\u0292\7f\2\2\u0292\u0293\7g\2\2"+
		"\u0293\u0294\7k\2\2\u0294\u0295\7t\2\2\u0295\u0296\7q\2\2\u0296\u0080"+
		"\3\2\2\2\u0297\u0298\7h\2\2\u0298\u0299\7c\2\2\u0299\u029a\7n\2\2\u029a"+
		"\u029b\7u\2\2\u029b\u029c\7q\2\2\u029c\u0082\3\2\2\2\u029d\u029e\7\62"+
		"\2\2\u029e\u0084\3\2\2\2\u029f\u02a0\t\2\2\2\u02a0\u0086\3\2\2\2\u02a1"+
		"\u02a4\5\u0083B\2\u02a2\u02a4\5\u0085C\2\u02a3\u02a1\3\2\2\2\u02a3\u02a2"+
		"\3\2\2\2\u02a4\u0088\3\2\2\2\u02a5\u02a6\t\3\2\2\u02a6\u008a\3\2\2\2\u02a7"+
		"\u02aa\n\4\2\2\u02a8\u02aa\5\u008dG\2\u02a9\u02a7\3\2\2\2\u02a9\u02a8"+
		"\3\2\2\2\u02aa\u008c\3\2\2\2\u02ab\u02ac\7^\2\2\u02ac\u02bc\7d\2\2\u02ad"+
		"\u02ae\7^\2\2\u02ae\u02bc\7v\2\2\u02af\u02b0\7^\2\2\u02b0\u02bc\7p\2\2"+
		"\u02b1\u02b2\7^\2\2\u02b2\u02bc\7h\2\2\u02b3\u02b4\7^\2\2\u02b4\u02bc"+
		"\7t\2\2\u02b5\u02b6\7^\2\2\u02b6\u02bc\7$\2\2\u02b7\u02b8\7^\2\2\u02b8"+
		"\u02bc\7)\2\2\u02b9\u02ba\7^\2\2\u02ba\u02bc\7^\2\2\u02bb\u02ab\3\2\2"+
		"\2\u02bb\u02ad\3\2\2\2\u02bb\u02af\3\2\2\2\u02bb\u02b1\3\2\2\2\u02bb\u02b3"+
		"\3\2\2\2\u02bb\u02b5\3\2\2\2\u02bb\u02b7\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc"+
		"\u008e\3\2\2\2\u02bd\u02c2\5\u0089E\2\u02be\u02c1\5\u0089E\2\u02bf\u02c1"+
		"\5\u0087D\2\u02c0\u02be\3\2\2\2\u02c0\u02bf\3\2\2\2\u02c1\u02c4\3\2\2"+
		"\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u0090\3\2\2\2\u02c4\u02c2"+
		"\3\2\2\2\u02c5\u02c7\t\5\2\2\u02c6\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8"+
		"\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\bI"+
		"\2\2\u02cb\u0092\3\2\2\2;\2\u018a\u018d\u0192\u0199\u019c\u01a1\u01a4"+
		"\u01a9\u01b0\u01b3\u01b8\u01bb\u01c0\u01c7\u01ca\u01cf\u01d5\u01d8\u01dd"+
		"\u01e4\u01eb\u01ee\u01f3\u01f9\u0200\u0203\u0208\u020e\u0211\u0216\u021d"+
		"\u0224\u0227\u022c\u0232\u0239\u023c\u0243\u0246\u024b\u0252\u0259\u025c"+
		"\u0261\u0267\u026e\u0271\u027b\u0282\u0286\u02a3\u02a9\u02bb\u02c0\u02c2"+
		"\u02c8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}