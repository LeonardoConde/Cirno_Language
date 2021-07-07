// Generated from Cirno.g4 by ANTLR 4.9.2
package Cirno.Grammar;
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
		PROCEDIMENTO=1, PROCEDIMENTOPRINCIPAL=2, INTEIRO=3, INTEIRO_POSITIVO=4, 
		INTEIRO_NEGATIVO=5, RACIONAL=6, RACIONAL_POSITIVO=7, RACIONAL_NEGATIVO=8, 
		CARACTERE=9, TEXTO=10, BOOLEANO=11, VAZIO=12, SE=13, CONTUDO=14, QUANDO=15, 
		FINALIZE=16, FOR=17, PARA=18, ENQUANTO=19, EXECUTE=20, REPITA=21, ATRIBUICAO=22, 
		RETORNO=23, LEIA=24, IMPRIMA=25, E=26, OU=27, NAO=28, IGUAL=29, DIFERENTE=30, 
		MAIOR=31, MENOR=32, MAIOR_IGUAL=33, MENOR_IGUAL=34, SOMA=35, SUBTRACAO=36, 
		MULTIPLICACAO=37, DIVISAO=38, MODULO=39, INCREMENTO=40, DECREMENTO=41, 
		FIM_LINHA=42, INICIO_PARENTESES=43, FIM_PARENTESES=44, INICIO_COLCHETE=45, 
		FIM_COLCHETE=46, INICIO_CHAVES=47, FIM_CHAVES=48, SEPARADOR_PARAMETRO=49, 
		SEPARADOR_DEFINICAO_VARIAVEL=50, VALOR=51, DEFINICAO_INTEIRO=52, DEFINICAO_INTEIRO_POSITIVO=53, 
		DEFINICAO_INTEIRO_NEGATIVO=54, DEFINICAO_RACIONAL=55, DEFINICAO_RACIONAL_POSITIVO=56, 
		DEFINICAO_RACIONAL_NEGATIVO=57, DEFINICAO_CARACTERE=58, DEFINICAO_TEXTO=59, 
		DEFINICAO_BOOLEANO=60, ID=61, WS=62;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROCEDIMENTO", "PROCEDIMENTOPRINCIPAL", "INTEIRO", "INTEIRO_POSITIVO", 
			"INTEIRO_NEGATIVO", "RACIONAL", "RACIONAL_POSITIVO", "RACIONAL_NEGATIVO", 
			"CARACTERE", "TEXTO", "BOOLEANO", "VAZIO", "SE", "CONTUDO", "QUANDO", 
			"FINALIZE", "FOR", "PARA", "ENQUANTO", "EXECUTE", "REPITA", "ATRIBUICAO", 
			"RETORNO", "LEIA", "IMPRIMA", "E", "OU", "NAO", "IGUAL", "DIFERENTE", 
			"MAIOR", "MENOR", "MAIOR_IGUAL", "MENOR_IGUAL", "SOMA", "SUBTRACAO", 
			"MULTIPLICACAO", "DIVISAO", "MODULO", "INCREMENTO", "DECREMENTO", "FIM_LINHA", 
			"INICIO_PARENTESES", "FIM_PARENTESES", "INICIO_COLCHETE", "FIM_COLCHETE", 
			"INICIO_CHAVES", "FIM_CHAVES", "SEPARADOR_PARAMETRO", "SEPARADOR_DEFINICAO_VARIAVEL", 
			"VALOR", "DEFINICAO_INTEIRO", "DEFINICAO_INTEIRO_POSITIVO", "DEFINICAO_INTEIRO_NEGATIVO", 
			"DEFINICAO_RACIONAL", "DEFINICAO_RACIONAL_POSITIVO", "DEFINICAO_RACIONAL_NEGATIVO", 
			"DEFINICAO_CARACTERE", "DEFINICAO_TEXTO", "DEFINICAO_BOOLEANO", "SINAL", 
			"POSITIVO", "NEGATIVO", "VERDADEIRO", "FALSO", "ZERO", "NAO_ZERO", "NUMERO", 
			"LETRA", "CARACTER", "ESCAPE", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "'inicio'", "'inteiro'", "'inteiro+'", "'inteiro-'", 
			"'racional'", "'racional+'", "'racional-'", "'caractere'", "'texto'", 
			"'booleano'", "'vazio'", "'se'", "'contudo'", "'quando'", "'finalize'", 
			"'for'", "'para'", "'enquanto'", "'execute'", "'repita'", "':='", "'retorno'", 
			"'leia'", "'imprima'", "'&&'", "'OR'", "'!'", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", 
			"';'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROCEDIMENTO", "PROCEDIMENTOPRINCIPAL", "INTEIRO", "INTEIRO_POSITIVO", 
			"INTEIRO_NEGATIVO", "RACIONAL", "RACIONAL_POSITIVO", "RACIONAL_NEGATIVO", 
			"CARACTERE", "TEXTO", "BOOLEANO", "VAZIO", "SE", "CONTUDO", "QUANDO", 
			"FINALIZE", "FOR", "PARA", "ENQUANTO", "EXECUTE", "REPITA", "ATRIBUICAO", 
			"RETORNO", "LEIA", "IMPRIMA", "E", "OU", "NAO", "IGUAL", "DIFERENTE", 
			"MAIOR", "MENOR", "MAIOR_IGUAL", "MENOR_IGUAL", "SOMA", "SUBTRACAO", 
			"MULTIPLICACAO", "DIVISAO", "MODULO", "INCREMENTO", "DECREMENTO", "FIM_LINHA", 
			"INICIO_PARENTESES", "FIM_PARENTESES", "INICIO_COLCHETE", "FIM_COLCHETE", 
			"INICIO_CHAVES", "FIM_CHAVES", "SEPARADOR_PARAMETRO", "SEPARADOR_DEFINICAO_VARIAVEL", 
			"VALOR", "DEFINICAO_INTEIRO", "DEFINICAO_INTEIRO_POSITIVO", "DEFINICAO_INTEIRO_NEGATIVO", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u02c0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*"+
		"\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0190\n\64"+
		"\3\65\6\65\u0193\n\65\r\65\16\65\u0194\3\65\5\65\u0198\n\65\3\65\6\65"+
		"\u019b\n\65\r\65\16\65\u019c\5\65\u019f\n\65\3\66\6\66\u01a2\n\66\r\66"+
		"\16\66\u01a3\3\66\5\66\u01a7\n\66\3\66\6\66\u01aa\n\66\r\66\16\66\u01ab"+
		"\5\66\u01ae\n\66\3\67\6\67\u01b1\n\67\r\67\16\67\u01b2\3\67\3\67\7\67"+
		"\u01b7\n\67\f\67\16\67\u01ba\13\67\3\67\3\67\7\67\u01be\n\67\f\67\16\67"+
		"\u01c1\13\67\5\67\u01c3\n\67\38\68\u01c6\n8\r8\168\u01c7\38\38\68\u01cc"+
		"\n8\r8\168\u01cd\38\58\u01d1\n8\38\78\u01d4\n8\f8\168\u01d7\138\38\38"+
		"\78\u01db\n8\f8\168\u01de\138\38\38\68\u01e2\n8\r8\168\u01e3\38\58\u01e7"+
		"\n8\38\68\u01ea\n8\r8\168\u01eb\38\38\78\u01f0\n8\f8\168\u01f3\138\38"+
		"\38\78\u01f7\n8\f8\168\u01fa\138\58\u01fc\n8\39\69\u01ff\n9\r9\169\u0200"+
		"\39\39\69\u0205\n9\r9\169\u0206\39\59\u020a\n9\39\79\u020d\n9\f9\169\u0210"+
		"\139\39\39\79\u0214\n9\f9\169\u0217\139\39\39\69\u021b\n9\r9\169\u021c"+
		"\39\59\u0220\n9\39\69\u0223\n9\r9\169\u0224\39\39\79\u0229\n9\f9\169\u022c"+
		"\139\39\39\79\u0230\n9\f9\169\u0233\139\59\u0235\n9\3:\3:\3:\6:\u023a"+
		"\n:\r:\16:\u023b\3:\3:\7:\u0240\n:\f:\16:\u0243\13:\3:\3:\7:\u0247\n:"+
		"\f:\16:\u024a\13:\3:\3:\6:\u024e\n:\r:\16:\u024f\3:\3:\6:\u0254\n:\r:"+
		"\16:\u0255\3:\3:\7:\u025a\n:\f:\16:\u025d\13:\3:\3:\7:\u0261\n:\f:\16"+
		":\u0264\13:\5:\u0266\n:\3;\3;\3;\3;\3<\3<\7<\u026e\n<\f<\16<\u0271\13"+
		"<\3<\3<\3=\3=\5=\u0277\n=\3>\3>\5>\u027b\n>\3?\3?\3@\3@\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3D\3D\3E\3E\5E\u0298\nE\3"+
		"F\3F\3G\3G\5G\u029e\nG\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\5H\u02b0\nH\3I\3I\3I\7I\u02b5\nI\fI\16I\u02b8\13I\3J\6J\u02bb\nJ\rJ"+
		"\16J\u02bc\3J\3J\3\u026f\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{\2}\2\177\2\u0081\2\u0083\2\u0085"+
		"\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091?\u0093@\3\2\6\3\2\63"+
		";\5\2C\\aac|\6\2\f\f\17\17))^^\5\2\13\f\17\17\"\"\2\u02f9\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\3\u0095\3\2\2\2\5\u009a\3\2\2\2\7\u00a1\3\2\2\2\t\u00a9"+
		"\3\2\2\2\13\u00b2\3\2\2\2\r\u00bb\3\2\2\2\17\u00c4\3\2\2\2\21\u00ce\3"+
		"\2\2\2\23\u00d8\3\2\2\2\25\u00e2\3\2\2\2\27\u00e8\3\2\2\2\31\u00f1\3\2"+
		"\2\2\33\u00f7\3\2\2\2\35\u00fa\3\2\2\2\37\u0102\3\2\2\2!\u0109\3\2\2\2"+
		"#\u0112\3\2\2\2%\u0116\3\2\2\2\'\u011b\3\2\2\2)\u0124\3\2\2\2+\u012c\3"+
		"\2\2\2-\u0133\3\2\2\2/\u0136\3\2\2\2\61\u013e\3\2\2\2\63\u0143\3\2\2\2"+
		"\65\u014b\3\2\2\2\67\u014e\3\2\2\29\u0151\3\2\2\2;\u0153\3\2\2\2=\u0156"+
		"\3\2\2\2?\u0159\3\2\2\2A\u015b\3\2\2\2C\u015d\3\2\2\2E\u0160\3\2\2\2G"+
		"\u0163\3\2\2\2I\u0165\3\2\2\2K\u0167\3\2\2\2M\u0169\3\2\2\2O\u016b\3\2"+
		"\2\2Q\u016d\3\2\2\2S\u0170\3\2\2\2U\u0173\3\2\2\2W\u0175\3\2\2\2Y\u0177"+
		"\3\2\2\2[\u0179\3\2\2\2]\u017b\3\2\2\2_\u017d\3\2\2\2a\u017f\3\2\2\2c"+
		"\u0181\3\2\2\2e\u0183\3\2\2\2g\u018f\3\2\2\2i\u019e\3\2\2\2k\u01ad\3\2"+
		"\2\2m\u01c2\3\2\2\2o\u01fb\3\2\2\2q\u0234\3\2\2\2s\u0265\3\2\2\2u\u0267"+
		"\3\2\2\2w\u026b\3\2\2\2y\u0276\3\2\2\2{\u027a\3\2\2\2}\u027c\3\2\2\2\177"+
		"\u027e\3\2\2\2\u0081\u0280\3\2\2\2\u0083\u028b\3\2\2\2\u0085\u0291\3\2"+
		"\2\2\u0087\u0293\3\2\2\2\u0089\u0297\3\2\2\2\u008b\u0299\3\2\2\2\u008d"+
		"\u029d\3\2\2\2\u008f\u02af\3\2\2\2\u0091\u02b1\3\2\2\2\u0093\u02ba\3\2"+
		"\2\2\u0095\u0096\7h\2\2\u0096\u0097\7w\2\2\u0097\u0098\7p\2\2\u0098\u0099"+
		"\7e\2\2\u0099\4\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c\u009d"+
		"\7k\2\2\u009d\u009e\7e\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7q\2\2\u00a0"+
		"\6\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7v\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7q\2\2"+
		"\u00a8\b\3\2\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7v"+
		"\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7t\2\2\u00af\u00b0"+
		"\7q\2\2\u00b0\u00b1\7-\2\2\u00b1\n\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4"+
		"\7p\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7k\2\2\u00b7"+
		"\u00b8\7t\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7/\2\2\u00ba\f\3\2\2\2\u00bb"+
		"\u00bc\7t\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7k\2\2"+
		"\u00bf\u00c0\7q\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3"+
		"\7n\2\2\u00c3\16\3\2\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7"+
		"\7e\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7p\2\2\u00ca"+
		"\u00cb\7c\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7-\2\2\u00cd\20\3\2\2\2\u00ce"+
		"\u00cf\7t\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7e\2\2\u00d1\u00d2\7k\2\2"+
		"\u00d2\u00d3\7q\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6"+
		"\7n\2\2\u00d6\u00d7\7/\2\2\u00d7\22\3\2\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da"+
		"\7c\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7e\2\2\u00dd"+
		"\u00de\7v\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7g\2\2"+
		"\u00e1\24\3\2\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7"+
		"z\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7q\2\2\u00e7\26\3\2\2\2\u00e8\u00e9"+
		"\7d\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7n\2\2\u00ec"+
		"\u00ed\7g\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7q\2\2"+
		"\u00f0\30\3\2\2\2\u00f1\u00f2\7x\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7"+
		"|\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7q\2\2\u00f6\32\3\2\2\2\u00f7\u00f8"+
		"\7u\2\2\u00f8\u00f9\7g\2\2\u00f9\34\3\2\2\2\u00fa\u00fb\7e\2\2\u00fb\u00fc"+
		"\7q\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7w\2\2\u00ff"+
		"\u0100\7f\2\2\u0100\u0101\7q\2\2\u0101\36\3\2\2\2\u0102\u0103\7s\2\2\u0103"+
		"\u0104\7w\2\2\u0104\u0105\7c\2\2\u0105\u0106\7p\2\2\u0106\u0107\7f\2\2"+
		"\u0107\u0108\7q\2\2\u0108 \3\2\2\2\u0109\u010a\7h\2\2\u010a\u010b\7k\2"+
		"\2\u010b\u010c\7p\2\2\u010c\u010d\7c\2\2\u010d\u010e\7n\2\2\u010e\u010f"+
		"\7k\2\2\u010f\u0110\7|\2\2\u0110\u0111\7g\2\2\u0111\"\3\2\2\2\u0112\u0113"+
		"\7h\2\2\u0113\u0114\7q\2\2\u0114\u0115\7t\2\2\u0115$\3\2\2\2\u0116\u0117"+
		"\7r\2\2\u0117\u0118\7c\2\2\u0118\u0119\7t\2\2\u0119\u011a\7c\2\2\u011a"+
		"&\3\2\2\2\u011b\u011c\7g\2\2\u011c\u011d\7p\2\2\u011d\u011e\7s\2\2\u011e"+
		"\u011f\7w\2\2\u011f\u0120\7c\2\2\u0120\u0121\7p\2\2\u0121\u0122\7v\2\2"+
		"\u0122\u0123\7q\2\2\u0123(\3\2\2\2\u0124\u0125\7g\2\2\u0125\u0126\7z\2"+
		"\2\u0126\u0127\7g\2\2\u0127\u0128\7e\2\2\u0128\u0129\7w\2\2\u0129\u012a"+
		"\7v\2\2\u012a\u012b\7g\2\2\u012b*\3\2\2\2\u012c\u012d\7t\2\2\u012d\u012e"+
		"\7g\2\2\u012e\u012f\7r\2\2\u012f\u0130\7k\2\2\u0130\u0131\7v\2\2\u0131"+
		"\u0132\7c\2\2\u0132,\3\2\2\2\u0133\u0134\7<\2\2\u0134\u0135\7?\2\2\u0135"+
		".\3\2\2\2\u0136\u0137\7t\2\2\u0137\u0138\7g\2\2\u0138\u0139\7v\2\2\u0139"+
		"\u013a\7q\2\2\u013a\u013b\7t\2\2\u013b\u013c\7p\2\2\u013c\u013d\7q\2\2"+
		"\u013d\60\3\2\2\2\u013e\u013f\7n\2\2\u013f\u0140\7g\2\2\u0140\u0141\7"+
		"k\2\2\u0141\u0142\7c\2\2\u0142\62\3\2\2\2\u0143\u0144\7k\2\2\u0144\u0145"+
		"\7o\2\2\u0145\u0146\7r\2\2\u0146\u0147\7t\2\2\u0147\u0148\7k\2\2\u0148"+
		"\u0149\7o\2\2\u0149\u014a\7c\2\2\u014a\64\3\2\2\2\u014b\u014c\7(\2\2\u014c"+
		"\u014d\7(\2\2\u014d\66\3\2\2\2\u014e\u014f\7Q\2\2\u014f\u0150\7T\2\2\u0150"+
		"8\3\2\2\2\u0151\u0152\7#\2\2\u0152:\3\2\2\2\u0153\u0154\7?\2\2\u0154\u0155"+
		"\7?\2\2\u0155<\3\2\2\2\u0156\u0157\7#\2\2\u0157\u0158\7?\2\2\u0158>\3"+
		"\2\2\2\u0159\u015a\7@\2\2\u015a@\3\2\2\2\u015b\u015c\7>\2\2\u015cB\3\2"+
		"\2\2\u015d\u015e\7@\2\2\u015e\u015f\7?\2\2\u015fD\3\2\2\2\u0160\u0161"+
		"\7>\2\2\u0161\u0162\7?\2\2\u0162F\3\2\2\2\u0163\u0164\7-\2\2\u0164H\3"+
		"\2\2\2\u0165\u0166\7/\2\2\u0166J\3\2\2\2\u0167\u0168\7,\2\2\u0168L\3\2"+
		"\2\2\u0169\u016a\7\61\2\2\u016aN\3\2\2\2\u016b\u016c\7\'\2\2\u016cP\3"+
		"\2\2\2\u016d\u016e\7-\2\2\u016e\u016f\7-\2\2\u016fR\3\2\2\2\u0170\u0171"+
		"\7/\2\2\u0171\u0172\7/\2\2\u0172T\3\2\2\2\u0173\u0174\7=\2\2\u0174V\3"+
		"\2\2\2\u0175\u0176\7*\2\2\u0176X\3\2\2\2\u0177\u0178\7+\2\2\u0178Z\3\2"+
		"\2\2\u0179\u017a\7]\2\2\u017a\\\3\2\2\2\u017b\u017c\7_\2\2\u017c^\3\2"+
		"\2\2\u017d\u017e\7}\2\2\u017e`\3\2\2\2\u017f\u0180\7\177\2\2\u0180b\3"+
		"\2\2\2\u0181\u0182\7.\2\2\u0182d\3\2\2\2\u0183\u0184\7<\2\2\u0184f\3\2"+
		"\2\2\u0185\u0190\3\2\2\2\u0186\u0190\5i\65\2\u0187\u0190\5k\66\2\u0188"+
		"\u0190\5m\67\2\u0189\u0190\5o8\2\u018a\u0190\5q9\2\u018b\u0190\5s:\2\u018c"+
		"\u0190\5u;\2\u018d\u0190\5w<\2\u018e\u0190\5y=\2\u018f\u0185\3\2\2\2\u018f"+
		"\u0186\3\2\2\2\u018f\u0187\3\2\2\2\u018f\u0188\3\2\2\2\u018f\u0189\3\2"+
		"\2\2\u018f\u018a\3\2\2\2\u018f\u018b\3\2\2\2\u018f\u018c\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190h\3\2\2\2\u0191\u0193\5\u0085"+
		"C\2\u0192\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u019f\3\2\2\2\u0196\u0198\5{>\2\u0197\u0196\3\2\2"+
		"\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u019b\5\u0089E\2\u019a"+
		"\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019d\u019f\3\2\2\2\u019e\u0192\3\2\2\2\u019e\u0197\3\2\2\2\u019f"+
		"j\3\2\2\2\u01a0\u01a2\5\u0085C\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2"+
		"\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01ae\3\2\2\2\u01a5\u01a7"+
		"\5}?\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u01aa\5\u0089E\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01a9"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01a1\3\2\2\2\u01ad"+
		"\u01a6\3\2\2\2\u01ael\3\2\2\2\u01af\u01b1\5\u0085C\2\u01b0\u01af\3\2\2"+
		"\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01c3"+
		"\3\2\2\2\u01b4\u01b8\5\177@\2\u01b5\u01b7\5\u0085C\2\u01b6\u01b5\3\2\2"+
		"\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb"+
		"\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bf\5\u0087D\2\u01bc\u01be\5\u0089"+
		"E\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01b0\3\2"+
		"\2\2\u01c2\u01b4\3\2\2\2\u01c3n\3\2\2\2\u01c4\u01c6\5\u0085C\2\u01c5\u01c4"+
		"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01cb\7\60\2\2\u01ca\u01cc\5\u0085C\2\u01cb\u01ca"+
		"\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01fc\3\2\2\2\u01cf\u01d1\5{>\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2"+
		"\2\u01d1\u01d5\3\2\2\2\u01d2\u01d4\5\u0085C\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01dc\5\u0087D\2\u01d9\u01db\5\u0089E\2"+
		"\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd"+
		"\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e1\7\60\2\2"+
		"\u01e0\u01e2\5\u0089E\2\u01e1\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01fc\3\2\2\2\u01e5\u01e7\5{"+
		">\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8"+
		"\u01ea\5\u0085C\2\u01e9\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01e9"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f1\7\60\2\2"+
		"\u01ee\u01f0\5\u0087D\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2"+
		"\2\2\u01f4\u01f8\5\u0089E\2\u01f5\u01f7\5\u0087D\2\u01f6\u01f5\3\2\2\2"+
		"\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fc"+
		"\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01c5\3\2\2\2\u01fb\u01d0\3\2\2\2\u01fb"+
		"\u01e6\3\2\2\2\u01fcp\3\2\2\2\u01fd\u01ff\5\u0085C\2\u01fe\u01fd\3\2\2"+
		"\2\u01ff\u0200\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202"+
		"\3\2\2\2\u0202\u0204\7\60\2\2\u0203\u0205\5\u0085C\2\u0204\u0203\3\2\2"+
		"\2\u0205\u0206\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0235"+
		"\3\2\2\2\u0208\u020a\5}?\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020e\3\2\2\2\u020b\u020d\5\u0085C\2\u020c\u020b\3\2\2\2\u020d\u0210"+
		"\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210"+
		"\u020e\3\2\2\2\u0211\u0215\5\u0087D\2\u0212\u0214\5\u0089E\2\u0213\u0212"+
		"\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216"+
		"\u0218\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u021a\7\60\2\2\u0219\u021b\5"+
		"\u0089E\2\u021a\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021a\3\2\2\2"+
		"\u021c\u021d\3\2\2\2\u021d\u0235\3\2\2\2\u021e\u0220\5}?\2\u021f\u021e"+
		"\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\3\2\2\2\u0221\u0223\5\u0085C"+
		"\2\u0222\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u022a\7\60\2\2\u0227\u0229\5\u0087"+
		"D\2\u0228\u0227\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u0231\5\u0089"+
		"E\2\u022e\u0230\5\u0087D\2\u022f\u022e\3\2\2\2\u0230\u0233\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2"+
		"\2\2\u0234\u01fe\3\2\2\2\u0234\u0209\3\2\2\2\u0234\u021f\3\2\2\2\u0235"+
		"r\3\2\2\2\u0236\u0237\5\u0085C\2\u0237\u0239\7\60\2\2\u0238\u023a\5\u0085"+
		"C\2\u0239\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u0239\3\2\2\2\u023b"+
		"\u023c\3\2\2\2\u023c\u0266\3\2\2\2\u023d\u0241\5\177@\2\u023e\u0240\5"+
		"\u0085C\2\u023f\u023e\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2\2\2"+
		"\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0248"+
		"\5\u0087D\2\u0245\u0247\5\u0089E\2\u0246\u0245\3\2\2\2\u0247\u024a\3\2"+
		"\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024b\u024d\7\60\2\2\u024c\u024e\5\u0089E\2\u024d\u024c"+
		"\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0266\3\2\2\2\u0251\u0253\5\177@\2\u0252\u0254\5\u0085C\2\u0253\u0252"+
		"\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0257\3\2\2\2\u0257\u025b\7\60\2\2\u0258\u025a\5\u0087D\2\u0259\u0258"+
		"\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u025e\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0262\5\u0089E\2\u025f\u0261"+
		"\5\u0087D\2\u0260\u025f\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2"+
		"\2\u0262\u0263\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0236"+
		"\3\2\2\2\u0265\u023d\3\2\2\2\u0265\u0251\3\2\2\2\u0266t\3\2\2\2\u0267"+
		"\u0268\7)\2\2\u0268\u0269\5\u008dG\2\u0269\u026a\7)\2\2\u026av\3\2\2\2"+
		"\u026b\u026f\7$\2\2\u026c\u026e\5\u008dG\2\u026d\u026c\3\2\2\2\u026e\u0271"+
		"\3\2\2\2\u026f\u0270\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0272\3\2\2\2\u0271"+
		"\u026f\3\2\2\2\u0272\u0273\7$\2\2\u0273x\3\2\2\2\u0274\u0277\5\u0081A"+
		"\2\u0275\u0277\5\u0083B\2\u0276\u0274\3\2\2\2\u0276\u0275\3\2\2\2\u0277"+
		"z\3\2\2\2\u0278\u027b\5}?\2\u0279\u027b\5\177@\2\u027a\u0278\3\2\2\2\u027a"+
		"\u0279\3\2\2\2\u027b|\3\2\2\2\u027c\u027d\7-\2\2\u027d~\3\2\2\2\u027e"+
		"\u027f\7/\2\2\u027f\u0080\3\2\2\2\u0280\u0281\7x\2\2\u0281\u0282\7g\2"+
		"\2\u0282\u0283\7t\2\2\u0283\u0284\7f\2\2\u0284\u0285\7c\2\2\u0285\u0286"+
		"\7f\2\2\u0286\u0287\7g\2\2\u0287\u0288\7k\2\2\u0288\u0289\7t\2\2\u0289"+
		"\u028a\7q\2\2\u028a\u0082\3\2\2\2\u028b\u028c\7h\2\2\u028c\u028d\7c\2"+
		"\2\u028d\u028e\7n\2\2\u028e\u028f\7u\2\2\u028f\u0290\7q\2\2\u0290\u0084"+
		"\3\2\2\2\u0291\u0292\7\62\2\2\u0292\u0086\3\2\2\2\u0293\u0294\t\2\2\2"+
		"\u0294\u0088\3\2\2\2\u0295\u0298\5\u0085C\2\u0296\u0298\5\u0087D\2\u0297"+
		"\u0295\3\2\2\2\u0297\u0296\3\2\2\2\u0298\u008a\3\2\2\2\u0299\u029a\t\3"+
		"\2\2\u029a\u008c\3\2\2\2\u029b\u029e\n\4\2\2\u029c\u029e\5\u008fH\2\u029d"+
		"\u029b\3\2\2\2\u029d\u029c\3\2\2\2\u029e\u008e\3\2\2\2\u029f\u02a0\7^"+
		"\2\2\u02a0\u02b0\7d\2\2\u02a1\u02a2\7^\2\2\u02a2\u02b0\7v\2\2\u02a3\u02a4"+
		"\7^\2\2\u02a4\u02b0\7p\2\2\u02a5\u02a6\7^\2\2\u02a6\u02b0\7h\2\2\u02a7"+
		"\u02a8\7^\2\2\u02a8\u02b0\7t\2\2\u02a9\u02aa\7^\2\2\u02aa\u02b0\7$\2\2"+
		"\u02ab\u02ac\7^\2\2\u02ac\u02b0\7)\2\2\u02ad\u02ae\7^\2\2\u02ae\u02b0"+
		"\7^\2\2\u02af\u029f\3\2\2\2\u02af\u02a1\3\2\2\2\u02af\u02a3\3\2\2\2\u02af"+
		"\u02a5\3\2\2\2\u02af\u02a7\3\2\2\2\u02af\u02a9\3\2\2\2\u02af\u02ab\3\2"+
		"\2\2\u02af\u02ad\3\2\2\2\u02b0\u0090\3\2\2\2\u02b1\u02b6\5\u008bF\2\u02b2"+
		"\u02b5\5\u008bF\2\u02b3\u02b5\5\u0089E\2\u02b4\u02b2\3\2\2\2\u02b4\u02b3"+
		"\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"\u0092\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9\u02bb\t\5\2\2\u02ba\u02b9\3\2"+
		"\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"\u02be\3\2\2\2\u02be\u02bf\bJ\2\2\u02bf\u0094\3\2\2\2\67\2\u018f\u0194"+
		"\u0197\u019c\u019e\u01a3\u01a6\u01ab\u01ad\u01b2\u01b8\u01bf\u01c2\u01c7"+
		"\u01cd\u01d0\u01d5\u01dc\u01e3\u01e6\u01eb\u01f1\u01f8\u01fb\u0200\u0206"+
		"\u0209\u020e\u0215\u021c\u021f\u0224\u022a\u0231\u0234\u023b\u0241\u0248"+
		"\u024f\u0255\u025b\u0262\u0265\u026f\u0276\u027a\u0297\u029d\u02af\u02b4"+
		"\u02b6\u02bc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}