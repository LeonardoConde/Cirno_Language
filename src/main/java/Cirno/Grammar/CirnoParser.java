// Generated from Cirno.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CirnoParser extends Parser {
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
	public static final int
		RULE_inicio = 0, RULE_declaracao = 1, RULE_atribuicao = 2, RULE_declaracaoComAtribuicao = 3, 
		RULE_declaracaoDeVariavel = 4, RULE_blocoDeComando = 5, RULE_comando = 6, 
		RULE_funcoes = 7, RULE_funcaoLer = 8, RULE_funcaoEscrever = 9, RULE_operacoes = 10, 
		RULE_operacaoMatematicaInteiros = 11, RULE_operadorLogicoBinario = 12, 
		RULE_operadorLogicoUnitario = 13, RULE_tipoPrimitivo = 14, RULE_operacaoAritmetica = 15, 
		RULE_operacaoAdicao = 16, RULE_operacaoMultiplicacao = 17, RULE_operacaoRelacao = 18, 
		RULE_operacaoIgualdade = 19, RULE_operacaoComparacao = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "declaracao", "atribuicao", "declaracaoComAtribuicao", "declaracaoDeVariavel", 
			"blocoDeComando", "comando", "funcoes", "funcaoLer", "funcaoEscrever", 
			"operacoes", "operacaoMatematicaInteiros", "operadorLogicoBinario", "operadorLogicoUnitario", 
			"tipoPrimitivo", "operacaoAritmetica", "operacaoAdicao", "operacaoMultiplicacao", 
			"operacaoRelacao", "operacaoIgualdade", "operacaoComparacao"
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

	@Override
	public String getGrammarFileName() { return "Cirno.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CirnoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(CirnoParser.PROCEDIMENTO, 0); }
		public TerminalNode VAZIO() { return getToken(CirnoParser.VAZIO, 0); }
		public TerminalNode PROCEDIMENTOPRINCIPAL() { return getToken(CirnoParser.PROCEDIMENTOPRINCIPAL, 0); }
		public TerminalNode INICIO_PARENTESES() { return getToken(CirnoParser.INICIO_PARENTESES, 0); }
		public TerminalNode FIM_PARENTESES() { return getToken(CirnoParser.FIM_PARENTESES, 0); }
		public TerminalNode INICIO_CHAVES() { return getToken(CirnoParser.INICIO_CHAVES, 0); }
		public BlocoDeComandoContext blocoDeComando() {
			return getRuleContext(BlocoDeComandoContext.class,0);
		}
		public TerminalNode FIM_CHAVES() { return getToken(CirnoParser.FIM_CHAVES, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(PROCEDIMENTO);
			setState(43);
			match(VAZIO);
			setState(44);
			match(PROCEDIMENTOPRINCIPAL);
			setState(45);
			match(INICIO_PARENTESES);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << INTEIRO_POSITIVO) | (1L << INTEIRO_NEGATIVO) | (1L << RACIONAL) | (1L << RACIONAL_POSITIVO) | (1L << RACIONAL_NEGATIVO) | (1L << CARACTERE) | (1L << TEXTO) | (1L << BOOLEANO))) != 0)) {
				{
				{
				setState(46);
				declaracao();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(FIM_PARENTESES);
			setState(53);
			match(INICIO_CHAVES);
			setState(54);
			blocoDeComando();
			setState(55);
			match(FIM_CHAVES);
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public TipoPrimitivoContext tipoPrimitivo() {
			return getRuleContext(TipoPrimitivoContext.class,0);
		}
		public TerminalNode SEPARADOR_DEFINICAO_VARIAVEL() { return getToken(CirnoParser.SEPARADOR_DEFINICAO_VARIAVEL, 0); }
		public TerminalNode ID() { return getToken(CirnoParser.ID, 0); }
		public TerminalNode FIM_LINHA() { return getToken(CirnoParser.FIM_LINHA, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			tipoPrimitivo();
			setState(58);
			match(SEPARADOR_DEFINICAO_VARIAVEL);
			setState(59);
			match(ID);
			setState(60);
			match(FIM_LINHA);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public Token identifier;
		public TerminalNode ATRIBUICAO() { return getToken(CirnoParser.ATRIBUICAO, 0); }
		public TerminalNode FIM_LINHA() { return getToken(CirnoParser.FIM_LINHA, 0); }
		public List<TerminalNode> ID() { return getTokens(CirnoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CirnoParser.ID, i);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			((AtribuicaoContext)_localctx).identifier = match(ID);
			setState(63);
			match(ATRIBUICAO);
			setState(64);
			((AtribuicaoContext)_localctx).identifier = match(ID);
			setState(65);
			match(FIM_LINHA);
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

	public static class DeclaracaoComAtribuicaoContext extends ParserRuleContext {
		public Token identifier;
		public TipoPrimitivoContext tipoPrimitivo() {
			return getRuleContext(TipoPrimitivoContext.class,0);
		}
		public TerminalNode SEPARADOR_DEFINICAO_VARIAVEL() { return getToken(CirnoParser.SEPARADOR_DEFINICAO_VARIAVEL, 0); }
		public List<TerminalNode> ID() { return getTokens(CirnoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CirnoParser.ID, i);
		}
		public TerminalNode ATRIBUICAO() { return getToken(CirnoParser.ATRIBUICAO, 0); }
		public TerminalNode FIM_LINHA() { return getToken(CirnoParser.FIM_LINHA, 0); }
		public DeclaracaoComAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoComAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterDeclaracaoComAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitDeclaracaoComAtribuicao(this);
		}
	}

	public final DeclaracaoComAtribuicaoContext declaracaoComAtribuicao() throws RecognitionException {
		DeclaracaoComAtribuicaoContext _localctx = new DeclaracaoComAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracaoComAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			tipoPrimitivo();
			setState(68);
			match(SEPARADOR_DEFINICAO_VARIAVEL);
			setState(69);
			match(ID);
			setState(70);
			match(ATRIBUICAO);
			setState(71);
			((DeclaracaoComAtribuicaoContext)_localctx).identifier = match(ID);
			setState(72);
			match(FIM_LINHA);
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

	public static class DeclaracaoDeVariavelContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<DeclaracaoComAtribuicaoContext> declaracaoComAtribuicao() {
			return getRuleContexts(DeclaracaoComAtribuicaoContext.class);
		}
		public DeclaracaoComAtribuicaoContext declaracaoComAtribuicao(int i) {
			return getRuleContext(DeclaracaoComAtribuicaoContext.class,i);
		}
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public DeclaracaoDeVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoDeVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterDeclaracaoDeVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitDeclaracaoDeVariavel(this);
		}
	}

	public final DeclaracaoDeVariavelContext declaracaoDeVariavel() throws RecognitionException {
		DeclaracaoDeVariavelContext _localctx = new DeclaracaoDeVariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracaoDeVariavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << INTEIRO_POSITIVO) | (1L << INTEIRO_NEGATIVO) | (1L << RACIONAL) | (1L << RACIONAL_POSITIVO) | (1L << RACIONAL_NEGATIVO) | (1L << CARACTERE) | (1L << TEXTO) | (1L << BOOLEANO) | (1L << ID))) != 0)) {
				{
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(74);
					declaracao();
					}
					break;
				case 2:
					{
					setState(75);
					declaracaoComAtribuicao();
					}
					break;
				case 3:
					{
					setState(76);
					atribuicao();
					}
					break;
				}
				}
				setState(81);
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

	public static class BlocoDeComandoContext extends ParserRuleContext {
		public DeclaracaoDeVariavelContext declaracaoDeVariavel() {
			return getRuleContext(DeclaracaoDeVariavelContext.class,0);
		}
		public OperacoesContext operacoes() {
			return getRuleContext(OperacoesContext.class,0);
		}
		public BlocoDeComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoDeComando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterBlocoDeComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitBlocoDeComando(this);
		}
	}

	public final BlocoDeComandoContext blocoDeComando() throws RecognitionException {
		BlocoDeComandoContext _localctx = new BlocoDeComandoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blocoDeComando);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				declaracaoDeVariavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				operacoes();
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

	public static class ComandoContext extends ParserRuleContext {
		public FuncoesContext funcoes() {
			return getRuleContext(FuncoesContext.class,0);
		}
		public TerminalNode FIM_LINHA() { return getToken(CirnoParser.FIM_LINHA, 0); }
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			funcoes();
			setState(88);
			match(FIM_LINHA);
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

	public static class FuncoesContext extends ParserRuleContext {
		public FuncaoLerContext funcaoLer() {
			return getRuleContext(FuncaoLerContext.class,0);
		}
		public FuncaoEscreverContext funcaoEscrever() {
			return getRuleContext(FuncaoEscreverContext.class,0);
		}
		public FuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitFuncoes(this);
		}
	}

	public final FuncoesContext funcoes() throws RecognitionException {
		FuncoesContext _localctx = new FuncoesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcoes);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				funcaoLer();
				}
				break;
			case IMPRIMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				funcaoEscrever();
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

	public static class FuncaoLerContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(CirnoParser.LEIA, 0); }
		public TerminalNode INICIO_PARENTESES() { return getToken(CirnoParser.INICIO_PARENTESES, 0); }
		public TipoPrimitivoContext tipoPrimitivo() {
			return getRuleContext(TipoPrimitivoContext.class,0);
		}
		public TerminalNode FIM_PARENTESES() { return getToken(CirnoParser.FIM_PARENTESES, 0); }
		public FuncaoLerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcaoLer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterFuncaoLer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitFuncaoLer(this);
		}
	}

	public final FuncaoLerContext funcaoLer() throws RecognitionException {
		FuncaoLerContext _localctx = new FuncaoLerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcaoLer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(LEIA);
			setState(95);
			match(INICIO_PARENTESES);
			setState(96);
			tipoPrimitivo();
			setState(97);
			match(FIM_PARENTESES);
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

	public static class FuncaoEscreverContext extends ParserRuleContext {
		public TerminalNode IMPRIMA() { return getToken(CirnoParser.IMPRIMA, 0); }
		public TerminalNode INICIO_PARENTESES() { return getToken(CirnoParser.INICIO_PARENTESES, 0); }
		public TerminalNode FIM_PARENTESES() { return getToken(CirnoParser.FIM_PARENTESES, 0); }
		public List<TipoPrimitivoContext> tipoPrimitivo() {
			return getRuleContexts(TipoPrimitivoContext.class);
		}
		public TipoPrimitivoContext tipoPrimitivo(int i) {
			return getRuleContext(TipoPrimitivoContext.class,i);
		}
		public FuncaoEscreverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcaoEscrever; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterFuncaoEscrever(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitFuncaoEscrever(this);
		}
	}

	public final FuncaoEscreverContext funcaoEscrever() throws RecognitionException {
		FuncaoEscreverContext _localctx = new FuncaoEscreverContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcaoEscrever);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(IMPRIMA);
			setState(100);
			match(INICIO_PARENTESES);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << INTEIRO_POSITIVO) | (1L << INTEIRO_NEGATIVO) | (1L << RACIONAL) | (1L << RACIONAL_POSITIVO) | (1L << RACIONAL_NEGATIVO) | (1L << CARACTERE) | (1L << TEXTO) | (1L << BOOLEANO))) != 0)) {
				{
				{
				setState(101);
				tipoPrimitivo();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(FIM_PARENTESES);
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

	public static class OperacoesContext extends ParserRuleContext {
		public OperacaoMatematicaInteirosContext operacaoMatematicaInteiros() {
			return getRuleContext(OperacaoMatematicaInteirosContext.class,0);
		}
		public OperacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterOperacoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitOperacoes(this);
		}
	}

	public final OperacoesContext operacoes() throws RecognitionException {
		OperacoesContext _localctx = new OperacoesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operacoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			operacaoMatematicaInteiros(0);
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

	public static class OperacaoMatematicaInteirosContext extends ParserRuleContext {
		public List<TerminalNode> INTEIRO() { return getTokens(CirnoParser.INTEIRO); }
		public TerminalNode INTEIRO(int i) {
			return getToken(CirnoParser.INTEIRO, i);
		}
		public OperacaoAritmeticaContext operacaoAritmetica() {
			return getRuleContext(OperacaoAritmeticaContext.class,0);
		}
		public OperacaoMatematicaInteirosContext operacaoMatematicaInteiros() {
			return getRuleContext(OperacaoMatematicaInteirosContext.class,0);
		}
		public OperacaoMatematicaInteirosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacaoMatematicaInteiros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterOperacaoMatematicaInteiros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitOperacaoMatematicaInteiros(this);
		}
	}

	public final OperacaoMatematicaInteirosContext operacaoMatematicaInteiros() throws RecognitionException {
		return operacaoMatematicaInteiros(0);
	}

	private OperacaoMatematicaInteirosContext operacaoMatematicaInteiros(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperacaoMatematicaInteirosContext _localctx = new OperacaoMatematicaInteirosContext(_ctx, _parentState);
		OperacaoMatematicaInteirosContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_operacaoMatematicaInteiros, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(112);
			match(INTEIRO);
			setState(113);
			operacaoAritmetica();
			setState(114);
			match(INTEIRO);
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperacaoMatematicaInteirosContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operacaoMatematicaInteiros);
					setState(116);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(117);
					operacaoAritmetica();
					setState(118);
					match(INTEIRO);
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperadorLogicoBinarioContext extends ParserRuleContext {
		public TerminalNode E() { return getToken(CirnoParser.E, 0); }
		public TerminalNode OU() { return getToken(CirnoParser.OU, 0); }
		public OperadorLogicoBinarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorLogicoBinario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterOperadorLogicoBinario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitOperadorLogicoBinario(this);
		}
	}

	public final OperadorLogicoBinarioContext operadorLogicoBinario() throws RecognitionException {
		OperadorLogicoBinarioContext _localctx = new OperadorLogicoBinarioContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operadorLogicoBinario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==E || _la==OU) ) {
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

	public static class OperadorLogicoUnitarioContext extends ParserRuleContext {
		public TerminalNode NAO() { return getToken(CirnoParser.NAO, 0); }
		public OperadorLogicoUnitarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorLogicoUnitario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterOperadorLogicoUnitario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitOperadorLogicoUnitario(this);
		}
	}

	public final OperadorLogicoUnitarioContext operadorLogicoUnitario() throws RecognitionException {
		OperadorLogicoUnitarioContext _localctx = new OperadorLogicoUnitarioContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operadorLogicoUnitario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(NAO);
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

	public static class TipoPrimitivoContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(CirnoParser.INTEIRO, 0); }
		public TerminalNode INTEIRO_POSITIVO() { return getToken(CirnoParser.INTEIRO_POSITIVO, 0); }
		public TerminalNode INTEIRO_NEGATIVO() { return getToken(CirnoParser.INTEIRO_NEGATIVO, 0); }
		public TerminalNode RACIONAL() { return getToken(CirnoParser.RACIONAL, 0); }
		public TerminalNode RACIONAL_POSITIVO() { return getToken(CirnoParser.RACIONAL_POSITIVO, 0); }
		public TerminalNode RACIONAL_NEGATIVO() { return getToken(CirnoParser.RACIONAL_NEGATIVO, 0); }
		public TerminalNode CARACTERE() { return getToken(CirnoParser.CARACTERE, 0); }
		public TerminalNode TEXTO() { return getToken(CirnoParser.TEXTO, 0); }
		public TerminalNode BOOLEANO() { return getToken(CirnoParser.BOOLEANO, 0); }
		public TipoPrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoPrimitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterTipoPrimitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitTipoPrimitivo(this);
		}
	}

	public final TipoPrimitivoContext tipoPrimitivo() throws RecognitionException {
		TipoPrimitivoContext _localctx = new TipoPrimitivoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipoPrimitivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << INTEIRO_POSITIVO) | (1L << INTEIRO_NEGATIVO) | (1L << RACIONAL) | (1L << RACIONAL_POSITIVO) | (1L << RACIONAL_NEGATIVO) | (1L << CARACTERE) | (1L << TEXTO) | (1L << BOOLEANO))) != 0)) ) {
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

	public static class OperacaoAritmeticaContext extends ParserRuleContext {
		public OperacaoAdicaoContext operacaoAdicao() {
			return getRuleContext(OperacaoAdicaoContext.class,0);
		}
		public OperacaoMultiplicacaoContext operacaoMultiplicacao() {
			return getRuleContext(OperacaoMultiplicacaoContext.class,0);
		}
		public OperacaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterOperacaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitOperacaoAritmetica(this);
		}
	}

	public final OperacaoAritmeticaContext operacaoAritmetica() throws RecognitionException {
		OperacaoAritmeticaContext _localctx = new OperacaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operacaoAritmetica);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOMA:
			case SUBTRACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				operacaoAdicao();
				}
				break;
			case MULTIPLICACAO:
			case DIVISAO:
			case MODULO:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				operacaoMultiplicacao();
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

	public static class OperacaoAdicaoContext extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(CirnoParser.SOMA, 0); }
		public TerminalNode SUBTRACAO() { return getToken(CirnoParser.SUBTRACAO, 0); }
		public OperacaoAdicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacaoAdicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterOperacaoAdicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitOperacaoAdicao(this);
		}
	}

	public final OperacaoAdicaoContext operacaoAdicao() throws RecognitionException {
		OperacaoAdicaoContext _localctx = new OperacaoAdicaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operacaoAdicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==SOMA || _la==SUBTRACAO) ) {
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

	public static class OperacaoMultiplicacaoContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(CirnoParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(CirnoParser.DIVISAO, 0); }
		public TerminalNode MODULO() { return getToken(CirnoParser.MODULO, 0); }
		public OperacaoMultiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacaoMultiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterOperacaoMultiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitOperacaoMultiplicacao(this);
		}
	}

	public final OperacaoMultiplicacaoContext operacaoMultiplicacao() throws RecognitionException {
		OperacaoMultiplicacaoContext _localctx = new OperacaoMultiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operacaoMultiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICACAO) | (1L << DIVISAO) | (1L << MODULO))) != 0)) ) {
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

	public static class OperacaoRelacaoContext extends ParserRuleContext {
		public OperacaoIgualdadeContext operacaoIgualdade() {
			return getRuleContext(OperacaoIgualdadeContext.class,0);
		}
		public OperacaoComparacaoContext operacaoComparacao() {
			return getRuleContext(OperacaoComparacaoContext.class,0);
		}
		public OperacaoRelacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacaoRelacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterOperacaoRelacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitOperacaoRelacao(this);
		}
	}

	public final OperacaoRelacaoContext operacaoRelacao() throws RecognitionException {
		OperacaoRelacaoContext _localctx = new OperacaoRelacaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operacaoRelacao);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
			case DIFERENTE:
			case MAIOR_IGUAL:
			case MENOR_IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				operacaoIgualdade();
				}
				break;
			case MAIOR:
			case MENOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				operacaoComparacao();
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

	public static class OperacaoIgualdadeContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(CirnoParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(CirnoParser.DIFERENTE, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(CirnoParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(CirnoParser.MENOR_IGUAL, 0); }
		public OperacaoIgualdadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacaoIgualdade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterOperacaoIgualdade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitOperacaoIgualdade(this);
		}
	}

	public final OperacaoIgualdadeContext operacaoIgualdade() throws RecognitionException {
		OperacaoIgualdadeContext _localctx = new OperacaoIgualdadeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operacaoIgualdade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIFERENTE) | (1L << MAIOR_IGUAL) | (1L << MENOR_IGUAL))) != 0)) ) {
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

	public static class OperacaoComparacaoContext extends ParserRuleContext {
		public TerminalNode MAIOR() { return getToken(CirnoParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(CirnoParser.MENOR, 0); }
		public OperacaoComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacaoComparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterOperacaoComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitOperacaoComparacao(this);
		}
	}

	public final OperacaoComparacaoContext operacaoComparacao() throws RecognitionException {
		OperacaoComparacaoContext _localctx = new OperacaoComparacaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operacaoComparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !(_la==MAIOR || _la==MENOR) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return operacaoMatematicaInteiros_sempred((OperacaoMatematicaInteirosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operacaoMatematicaInteiros_sempred(OperacaoMatematicaInteirosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u0096\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\7\2\62\n"+
		"\2\f\2\16\2\65\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6P\n\6\f\6\16\6S"+
		"\13\6\3\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\t\3\t\5\t_\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\7\13i\n\13\f\13\16\13l\13\13\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r{\n\r\f\r\16\r~\13\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\5\21\u0088\n\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\5\24\u0090\n\24\3\25\3\25\3\26\3\26\3\26\2\3\30\27\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*\2\b\3\2\34\35\3\2\6\16\3\2%&\3\2\')\4"+
		"\2\37 #$\3\2!\"\2\u008b\2,\3\2\2\2\4;\3\2\2\2\6@\3\2\2\2\bE\3\2\2\2\n"+
		"Q\3\2\2\2\fW\3\2\2\2\16Y\3\2\2\2\20^\3\2\2\2\22`\3\2\2\2\24e\3\2\2\2\26"+
		"o\3\2\2\2\30q\3\2\2\2\32\177\3\2\2\2\34\u0081\3\2\2\2\36\u0083\3\2\2\2"+
		" \u0087\3\2\2\2\"\u0089\3\2\2\2$\u008b\3\2\2\2&\u008f\3\2\2\2(\u0091\3"+
		"\2\2\2*\u0093\3\2\2\2,-\7\4\2\2-.\7\17\2\2./\7\5\2\2/\63\7-\2\2\60\62"+
		"\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66"+
		"\3\2\2\2\65\63\3\2\2\2\66\67\7.\2\2\678\7\61\2\289\5\f\7\29:\7\62\2\2"+
		":\3\3\2\2\2;<\5\36\20\2<=\7\64\2\2=>\7>\2\2>?\7,\2\2?\5\3\2\2\2@A\7>\2"+
		"\2AB\7\30\2\2BC\7>\2\2CD\7,\2\2D\7\3\2\2\2EF\5\36\20\2FG\7\64\2\2GH\7"+
		">\2\2HI\7\30\2\2IJ\7>\2\2JK\7,\2\2K\t\3\2\2\2LP\5\4\3\2MP\5\b\5\2NP\5"+
		"\6\4\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\13"+
		"\3\2\2\2SQ\3\2\2\2TX\5\n\6\2UX\7\3\2\2VX\5\26\f\2WT\3\2\2\2WU\3\2\2\2"+
		"WV\3\2\2\2X\r\3\2\2\2YZ\5\20\t\2Z[\7,\2\2[\17\3\2\2\2\\_\5\22\n\2]_\5"+
		"\24\13\2^\\\3\2\2\2^]\3\2\2\2_\21\3\2\2\2`a\7\32\2\2ab\7-\2\2bc\5\36\20"+
		"\2cd\7.\2\2d\23\3\2\2\2ef\7\33\2\2fj\7-\2\2gi\5\36\20\2hg\3\2\2\2il\3"+
		"\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7.\2\2n\25\3\2\2\2op"+
		"\5\30\r\2p\27\3\2\2\2qr\b\r\1\2rs\7\6\2\2st\5 \21\2tu\7\6\2\2u|\3\2\2"+
		"\2vw\f\4\2\2wx\5 \21\2xy\7\6\2\2y{\3\2\2\2zv\3\2\2\2{~\3\2\2\2|z\3\2\2"+
		"\2|}\3\2\2\2}\31\3\2\2\2~|\3\2\2\2\177\u0080\t\2\2\2\u0080\33\3\2\2\2"+
		"\u0081\u0082\7\36\2\2\u0082\35\3\2\2\2\u0083\u0084\t\3\2\2\u0084\37\3"+
		"\2\2\2\u0085\u0088\5\"\22\2\u0086\u0088\5$\23\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0086\3\2\2\2\u0088!\3\2\2\2\u0089\u008a\t\4\2\2\u008a#\3\2\2\2\u008b"+
		"\u008c\t\5\2\2\u008c%\3\2\2\2\u008d\u0090\5(\25\2\u008e\u0090\5*\26\2"+
		"\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\'\3\2\2\2\u0091\u0092\t"+
		"\6\2\2\u0092)\3\2\2\2\u0093\u0094\t\7\2\2\u0094+\3\2\2\2\13\63OQW^j|\u0087"+
		"\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}