// Generated from Cirno.g4 by ANTLR 4.9.2
package Cirno.Grammar;
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
		DEFINICAO_BOOLEANO=60, ID=61, WS=62, NICIO_PARENTESES=63;
	public static final int
		RULE_inicio = 0, RULE_declaracao = 1, RULE_atribuicao = 2, RULE_declaracaoComAtribuicao = 3, 
		RULE_declaracaoDeVariavel = 4, RULE_blocoDeComando = 5, RULE_comando = 6, 
		RULE_funcoes = 7, RULE_funcaoLer = 8, RULE_funcaoEscrever = 9, RULE_parametro = 10, 
		RULE_operacoes = 11, RULE_parametroOperacao = 12, RULE_declaracoes = 13, 
		RULE_condicional = 14, RULE_declaracaoSe = 15, RULE_inicioSe = 16, RULE_seEntao = 17, 
		RULE_declaracaoPara = 18, RULE_condicionalPara = 19, RULE_condicionalInicioPara = 20, 
		RULE_condicionalIncrementoPara = 21, RULE_atribuicaoFor = 22, RULE_incrementoFor = 23, 
		RULE_declaracaoRepitaEnquanto = 24, RULE_declaracaoEnquantoExecute = 25, 
		RULE_declaracaoQuandoFor = 26, RULE_inicioQuandoFor = 27, RULE_forFor = 28, 
		RULE_tipoPrimitivo = 29, RULE_operacaoAritmetica = 30, RULE_operacaoAdicao = 31, 
		RULE_operacaoMultiplicacao = 32, RULE_operacaoRelacao = 33, RULE_operacaoIgualdade = 34, 
		RULE_operacaoComparacao = 35, RULE_operadorLogicoBinario = 36, RULE_operadorLogicoUnitario = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "declaracao", "atribuicao", "declaracaoComAtribuicao", "declaracaoDeVariavel", 
			"blocoDeComando", "comando", "funcoes", "funcaoLer", "funcaoEscrever", 
			"parametro", "operacoes", "parametroOperacao", "declaracoes", "condicional", 
			"declaracaoSe", "inicioSe", "seEntao", "declaracaoPara", "condicionalPara", 
			"condicionalInicioPara", "condicionalIncrementoPara", "atribuicaoFor", 
			"incrementoFor", "declaracaoRepitaEnquanto", "declaracaoEnquantoExecute", 
			"declaracaoQuandoFor", "inicioQuandoFor", "forFor", "tipoPrimitivo", 
			"operacaoAritmetica", "operacaoAdicao", "operacaoMultiplicacao", "operacaoRelacao", 
			"operacaoIgualdade", "operacaoComparacao", "operadorLogicoBinario", "operadorLogicoUnitario"
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
			"WS", "NICIO_PARENTESES"
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
		public TerminalNode FIM_CHAVES() { return getToken(CirnoParser.FIM_CHAVES, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public BlocoDeComandoContext blocoDeComando() {
			return getRuleContext(BlocoDeComandoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(PROCEDIMENTO);
			setState(77);
			match(VAZIO);
			setState(78);
			match(PROCEDIMENTOPRINCIPAL);
			setState(79);
			match(INICIO_PARENTESES);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << INTEIRO_POSITIVO) | (1L << INTEIRO_NEGATIVO) | (1L << RACIONAL) | (1L << RACIONAL_POSITIVO) | (1L << RACIONAL_NEGATIVO) | (1L << CARACTERE) | (1L << TEXTO) | (1L << BOOLEANO))) != 0)) {
				{
				{
				setState(80);
				declaracao();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(FIM_PARENTESES);
			setState(87);
			match(INICIO_CHAVES);
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(88);
				blocoDeComando();
				}
				break;
			}
			setState(91);
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
		public Token identifier;
		public TipoPrimitivoContext tipoPrimitivo() {
			return getRuleContext(TipoPrimitivoContext.class,0);
		}
		public TerminalNode SEPARADOR_DEFINICAO_VARIAVEL() { return getToken(CirnoParser.SEPARADOR_DEFINICAO_VARIAVEL, 0); }
		public TerminalNode FIM_LINHA() { return getToken(CirnoParser.FIM_LINHA, 0); }
		public TerminalNode ID() { return getToken(CirnoParser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			tipoPrimitivo();
			setState(94);
			match(SEPARADOR_DEFINICAO_VARIAVEL);
			setState(95);
			((DeclaracaoContext)_localctx).identifier = match(ID);
			setState(96);
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
		public OperacoesContext operacoes() {
			return getRuleContext(OperacoesContext.class,0);
		}
		public TerminalNode VALOR() { return getToken(CirnoParser.VALOR, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((AtribuicaoContext)_localctx).identifier = match(ID);
			setState(99);
			match(ATRIBUICAO);
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(100);
				operacoes();
				}
				break;
			case 2:
				{
				setState(101);
				((AtribuicaoContext)_localctx).identifier = match(ID);
				}
				break;
			case 3:
				{
				setState(102);
				match(VALOR);
				}
				break;
			}
			setState(105);
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
		public OperacoesContext operacoes() {
			return getRuleContext(OperacoesContext.class,0);
		}
		public TerminalNode VALOR() { return getToken(CirnoParser.VALOR, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitDeclaracaoComAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoComAtribuicaoContext declaracaoComAtribuicao() throws RecognitionException {
		DeclaracaoComAtribuicaoContext _localctx = new DeclaracaoComAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracaoComAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			tipoPrimitivo();
			setState(108);
			match(SEPARADOR_DEFINICAO_VARIAVEL);
			setState(109);
			match(ID);
			setState(110);
			match(ATRIBUICAO);
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(111);
				operacoes();
				}
				break;
			case 2:
				{
				setState(112);
				((DeclaracaoComAtribuicaoContext)_localctx).identifier = match(ID);
				}
				break;
			case 3:
				{
				setState(113);
				match(VALOR);
				}
				break;
			}
			setState(116);
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
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public DeclaracaoComAtribuicaoContext declaracaoComAtribuicao() {
			return getRuleContext(DeclaracaoComAtribuicaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitDeclaracaoDeVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoDeVariavelContext declaracaoDeVariavel() throws RecognitionException {
		DeclaracaoDeVariavelContext _localctx = new DeclaracaoDeVariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracaoDeVariavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(118);
				declaracao();
				}
				break;
			case 2:
				{
				setState(119);
				declaracaoComAtribuicao();
				}
				break;
			case 3:
				{
				setState(120);
				atribuicao();
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

	public static class BlocoDeComandoContext extends ParserRuleContext {
		public List<DeclaracaoDeVariavelContext> declaracaoDeVariavel() {
			return getRuleContexts(DeclaracaoDeVariavelContext.class);
		}
		public DeclaracaoDeVariavelContext declaracaoDeVariavel(int i) {
			return getRuleContext(DeclaracaoDeVariavelContext.class,i);
		}
		public List<OperacoesContext> operacoes() {
			return getRuleContexts(OperacoesContext.class);
		}
		public OperacoesContext operacoes(int i) {
			return getRuleContext(OperacoesContext.class,i);
		}
		public List<TerminalNode> FIM_LINHA() { return getTokens(CirnoParser.FIM_LINHA); }
		public TerminalNode FIM_LINHA(int i) {
			return getToken(CirnoParser.FIM_LINHA, i);
		}
		public List<DeclaracoesContext> declaracoes() {
			return getRuleContexts(DeclaracoesContext.class);
		}
		public DeclaracoesContext declaracoes(int i) {
			return getRuleContext(DeclaracoesContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitBlocoDeComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoDeComandoContext blocoDeComando() throws RecognitionException {
		BlocoDeComandoContext _localctx = new BlocoDeComandoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blocoDeComando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << INTEIRO_POSITIVO) | (1L << INTEIRO_NEGATIVO) | (1L << RACIONAL) | (1L << RACIONAL_POSITIVO) | (1L << RACIONAL_NEGATIVO) | (1L << CARACTERE) | (1L << TEXTO) | (1L << BOOLEANO) | (1L << SE) | (1L << QUANDO) | (1L << PARA) | (1L << ENQUANTO) | (1L << REPITA) | (1L << LEIA) | (1L << IMPRIMA) | (1L << VALOR) | (1L << ID))) != 0)) {
				{
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(123);
					declaracaoDeVariavel();
					}
					break;
				case 2:
					{
					setState(124);
					operacoes();
					setState(125);
					match(FIM_LINHA);
					}
					break;
				case 3:
					{
					setState(127);
					declaracoes();
					}
					break;
				case 4:
					{
					setState(128);
					comando();
					}
					break;
				}
				}
				setState(133);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			funcoes();
			setState(135);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitFuncoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncoesContext funcoes() throws RecognitionException {
		FuncoesContext _localctx = new FuncoesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcoes);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				funcaoLer();
				}
				break;
			case IMPRIMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
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
		public TerminalNode VALOR() { return getToken(CirnoParser.VALOR, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitFuncaoLer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoLerContext funcaoLer() throws RecognitionException {
		FuncaoLerContext _localctx = new FuncaoLerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcaoLer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(LEIA);
			setState(142);
			match(INICIO_PARENTESES);
			setState(143);
			match(VALOR);
			setState(144);
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
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public TerminalNode FIM_PARENTESES() { return getToken(CirnoParser.FIM_PARENTESES, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitFuncaoEscrever(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoEscreverContext funcaoEscrever() throws RecognitionException {
		FuncaoEscreverContext _localctx = new FuncaoEscreverContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcaoEscrever);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(IMPRIMA);
			setState(147);
			match(INICIO_PARENTESES);
			setState(148);
			parametro();
			setState(149);
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

	public static class ParametroContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CirnoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CirnoParser.ID, i);
		}
		public List<TerminalNode> VALOR() { return getTokens(CirnoParser.VALOR); }
		public TerminalNode VALOR(int i) {
			return getToken(CirnoParser.VALOR, i);
		}
		public List<OperacoesContext> operacoes() {
			return getRuleContexts(OperacoesContext.class);
		}
		public OperacoesContext operacoes(int i) {
			return getRuleContext(OperacoesContext.class,i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VALOR || _la==ID) {
				{
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(151);
					match(ID);
					}
					break;
				case 2:
					{
					setState(152);
					match(VALOR);
					}
					break;
				case 3:
					{
					setState(153);
					operacoes();
					}
					break;
				}
				}
				setState(158);
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

	public static class OperacoesContext extends ParserRuleContext {
		public List<ParametroOperacaoContext> parametroOperacao() {
			return getRuleContexts(ParametroOperacaoContext.class);
		}
		public ParametroOperacaoContext parametroOperacao(int i) {
			return getRuleContext(ParametroOperacaoContext.class,i);
		}
		public OperacaoAritmeticaContext operacaoAritmetica() {
			return getRuleContext(OperacaoAritmeticaContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitOperacoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacoesContext operacoes() throws RecognitionException {
		OperacoesContext _localctx = new OperacoesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operacoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			parametroOperacao();
			setState(160);
			operacaoAritmetica();
			setState(161);
			parametroOperacao();
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

	public static class ParametroOperacaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CirnoParser.ID, 0); }
		public TerminalNode VALOR() { return getToken(CirnoParser.VALOR, 0); }
		public ParametroOperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroOperacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterParametroOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitParametroOperacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitParametroOperacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroOperacaoContext parametroOperacao() throws RecognitionException {
		ParametroOperacaoContext _localctx = new ParametroOperacaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parametroOperacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==VALOR || _la==ID) ) {
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public DeclaracaoSeContext declaracaoSe() {
			return getRuleContext(DeclaracaoSeContext.class,0);
		}
		public DeclaracaoParaContext declaracaoPara() {
			return getRuleContext(DeclaracaoParaContext.class,0);
		}
		public DeclaracaoRepitaEnquantoContext declaracaoRepitaEnquanto() {
			return getRuleContext(DeclaracaoRepitaEnquantoContext.class,0);
		}
		public DeclaracaoEnquantoExecuteContext declaracaoEnquantoExecute() {
			return getRuleContext(DeclaracaoEnquantoExecuteContext.class,0);
		}
		public DeclaracaoQuandoForContext declaracaoQuandoFor() {
			return getRuleContext(DeclaracaoQuandoForContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracoes);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				declaracaoSe();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				declaracaoPara();
				}
				break;
			case REPITA:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				declaracaoRepitaEnquanto();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				declaracaoEnquantoExecute();
				}
				break;
			case QUANDO:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				declaracaoQuandoFor();
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

	public static class CondicionalContext extends ParserRuleContext {
		public OperacaoRelacaoContext operacaoRelacao() {
			return getRuleContext(OperacaoRelacaoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CirnoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CirnoParser.ID, i);
		}
		public List<TerminalNode> VALOR() { return getTokens(CirnoParser.VALOR); }
		public TerminalNode VALOR(int i) {
			return getToken(CirnoParser.VALOR, i);
		}
		public List<OperadorLogicoUnitarioContext> operadorLogicoUnitario() {
			return getRuleContexts(OperadorLogicoUnitarioContext.class);
		}
		public OperadorLogicoUnitarioContext operadorLogicoUnitario(int i) {
			return getRuleContext(OperadorLogicoUnitarioContext.class,i);
		}
		public OperadorLogicoBinarioContext operadorLogicoBinario() {
			return getRuleContext(OperadorLogicoBinarioContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAO) {
				{
				setState(172);
				operadorLogicoUnitario();
				}
			}

			setState(175);
			_la = _input.LA(1);
			if ( !(_la==VALOR || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(176);
			operacaoRelacao();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAO) {
				{
				setState(177);
				operadorLogicoUnitario();
				}
			}

			setState(180);
			_la = _input.LA(1);
			if ( !(_la==VALOR || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==E || _la==OU) {
				{
				setState(181);
				operadorLogicoBinario();
				setState(182);
				condicional();
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

	public static class DeclaracaoSeContext extends ParserRuleContext {
		public InicioSeContext inicioSe() {
			return getRuleContext(InicioSeContext.class,0);
		}
		public SeEntaoContext seEntao() {
			return getRuleContext(SeEntaoContext.class,0);
		}
		public DeclaracaoSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterDeclaracaoSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitDeclaracaoSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitDeclaracaoSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoSeContext declaracaoSe() throws RecognitionException {
		DeclaracaoSeContext _localctx = new DeclaracaoSeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaracaoSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			inicioSe();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONTUDO) {
				{
				setState(187);
				seEntao();
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

	public static class InicioSeContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(CirnoParser.SE, 0); }
		public TerminalNode INICIO_PARENTESES() { return getToken(CirnoParser.INICIO_PARENTESES, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public TerminalNode FIM_PARENTESES() { return getToken(CirnoParser.FIM_PARENTESES, 0); }
		public TerminalNode INICIO_CHAVES() { return getToken(CirnoParser.INICIO_CHAVES, 0); }
		public TerminalNode FIM_CHAVES() { return getToken(CirnoParser.FIM_CHAVES, 0); }
		public BlocoDeComandoContext blocoDeComando() {
			return getRuleContext(BlocoDeComandoContext.class,0);
		}
		public InicioSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicioSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterInicioSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitInicioSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitInicioSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioSeContext inicioSe() throws RecognitionException {
		InicioSeContext _localctx = new InicioSeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inicioSe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(SE);
			setState(191);
			match(INICIO_PARENTESES);
			setState(192);
			condicional();
			setState(193);
			match(FIM_PARENTESES);
			setState(194);
			match(INICIO_CHAVES);
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(195);
				blocoDeComando();
				}
				break;
			}
			setState(198);
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

	public static class SeEntaoContext extends ParserRuleContext {
		public TerminalNode CONTUDO() { return getToken(CirnoParser.CONTUDO, 0); }
		public TerminalNode INICIO_CHAVES() { return getToken(CirnoParser.INICIO_CHAVES, 0); }
		public TerminalNode FIM_CHAVES() { return getToken(CirnoParser.FIM_CHAVES, 0); }
		public BlocoDeComandoContext blocoDeComando() {
			return getRuleContext(BlocoDeComandoContext.class,0);
		}
		public SeEntaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seEntao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterSeEntao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitSeEntao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitSeEntao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeEntaoContext seEntao() throws RecognitionException {
		SeEntaoContext _localctx = new SeEntaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_seEntao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(CONTUDO);
			setState(201);
			match(INICIO_CHAVES);
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(202);
				blocoDeComando();
				}
				break;
			}
			setState(205);
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

	public static class DeclaracaoParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(CirnoParser.PARA, 0); }
		public CondicionalParaContext condicionalPara() {
			return getRuleContext(CondicionalParaContext.class,0);
		}
		public TerminalNode INICIO_CHAVES() { return getToken(CirnoParser.INICIO_CHAVES, 0); }
		public TerminalNode FIM_CHAVES() { return getToken(CirnoParser.FIM_CHAVES, 0); }
		public BlocoDeComandoContext blocoDeComando() {
			return getRuleContext(BlocoDeComandoContext.class,0);
		}
		public DeclaracaoParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterDeclaracaoPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitDeclaracaoPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitDeclaracaoPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoParaContext declaracaoPara() throws RecognitionException {
		DeclaracaoParaContext _localctx = new DeclaracaoParaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracaoPara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(PARA);
			setState(208);
			condicionalPara();
			setState(209);
			match(INICIO_CHAVES);
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(210);
				blocoDeComando();
				}
				break;
			}
			setState(213);
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

	public static class CondicionalParaContext extends ParserRuleContext {
		public TerminalNode INICIO_PARENTESES() { return getToken(CirnoParser.INICIO_PARENTESES, 0); }
		public CondicionalInicioParaContext condicionalInicioPara() {
			return getRuleContext(CondicionalInicioParaContext.class,0);
		}
		public List<TerminalNode> SEPARADOR_PARAMETRO() { return getTokens(CirnoParser.SEPARADOR_PARAMETRO); }
		public TerminalNode SEPARADOR_PARAMETRO(int i) {
			return getToken(CirnoParser.SEPARADOR_PARAMETRO, i);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CondicionalIncrementoParaContext condicionalIncrementoPara() {
			return getRuleContext(CondicionalIncrementoParaContext.class,0);
		}
		public TerminalNode FIM_PARENTESES() { return getToken(CirnoParser.FIM_PARENTESES, 0); }
		public CondicionalParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterCondicionalPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitCondicionalPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitCondicionalPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalParaContext condicionalPara() throws RecognitionException {
		CondicionalParaContext _localctx = new CondicionalParaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condicionalPara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(INICIO_PARENTESES);
			setState(216);
			condicionalInicioPara();
			setState(217);
			match(SEPARADOR_PARAMETRO);
			setState(218);
			condicional();
			setState(219);
			match(SEPARADOR_PARAMETRO);
			setState(220);
			condicionalIncrementoPara();
			setState(221);
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

	public static class CondicionalInicioParaContext extends ParserRuleContext {
		public TipoPrimitivoContext tipoPrimitivo() {
			return getRuleContext(TipoPrimitivoContext.class,0);
		}
		public TerminalNode SEPARADOR_DEFINICAO_VARIAVEL() { return getToken(CirnoParser.SEPARADOR_DEFINICAO_VARIAVEL, 0); }
		public AtribuicaoForContext atribuicaoFor() {
			return getRuleContext(AtribuicaoForContext.class,0);
		}
		public TerminalNode ID() { return getToken(CirnoParser.ID, 0); }
		public CondicionalInicioParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalInicioPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterCondicionalInicioPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitCondicionalInicioPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitCondicionalInicioPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalInicioParaContext condicionalInicioPara() throws RecognitionException {
		CondicionalInicioParaContext _localctx = new CondicionalInicioParaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condicionalInicioPara);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				tipoPrimitivo();
				setState(224);
				match(SEPARADOR_DEFINICAO_VARIAVEL);
				setState(225);
				atribuicaoFor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				atribuicaoFor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(ID);
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

	public static class CondicionalIncrementoParaContext extends ParserRuleContext {
		public IncrementoForContext incrementoFor() {
			return getRuleContext(IncrementoForContext.class,0);
		}
		public CondicionalIncrementoParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalIncrementoPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterCondicionalIncrementoPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitCondicionalIncrementoPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitCondicionalIncrementoPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalIncrementoParaContext condicionalIncrementoPara() throws RecognitionException {
		CondicionalIncrementoParaContext _localctx = new CondicionalIncrementoParaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condicionalIncrementoPara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			incrementoFor();
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

	public static class AtribuicaoForContext extends ParserRuleContext {
		public Token identifier;
		public List<TerminalNode> ID() { return getTokens(CirnoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CirnoParser.ID, i);
		}
		public TipoPrimitivoContext tipoPrimitivo() {
			return getRuleContext(TipoPrimitivoContext.class,0);
		}
		public TerminalNode SEPARADOR_DEFINICAO_VARIAVEL() { return getToken(CirnoParser.SEPARADOR_DEFINICAO_VARIAVEL, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(CirnoParser.ATRIBUICAO, 0); }
		public TerminalNode VALOR() { return getToken(CirnoParser.VALOR, 0); }
		public OperacoesContext operacoes() {
			return getRuleContext(OperacoesContext.class,0);
		}
		public AtribuicaoForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterAtribuicaoFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitAtribuicaoFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitAtribuicaoFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoForContext atribuicaoFor() throws RecognitionException {
		AtribuicaoForContext _localctx = new AtribuicaoForContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atribuicaoFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEIRO) | (1L << INTEIRO_POSITIVO) | (1L << INTEIRO_NEGATIVO) | (1L << RACIONAL) | (1L << RACIONAL_POSITIVO) | (1L << RACIONAL_NEGATIVO) | (1L << CARACTERE) | (1L << TEXTO) | (1L << BOOLEANO))) != 0)) {
				{
				setState(233);
				tipoPrimitivo();
				setState(234);
				match(SEPARADOR_DEFINICAO_VARIAVEL);
				}
			}

			setState(238);
			match(ID);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATRIBUICAO) {
				{
				setState(239);
				match(ATRIBUICAO);
				setState(243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(240);
					((AtribuicaoForContext)_localctx).identifier = match(ID);
					}
					break;
				case 2:
					{
					setState(241);
					match(VALOR);
					}
					break;
				case 3:
					{
					setState(242);
					operacoes();
					}
					break;
				}
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

	public static class IncrementoForContext extends ParserRuleContext {
		public Token identifier;
		public TerminalNode ATRIBUICAO() { return getToken(CirnoParser.ATRIBUICAO, 0); }
		public OperacoesContext operacoes() {
			return getRuleContext(OperacoesContext.class,0);
		}
		public TerminalNode ID() { return getToken(CirnoParser.ID, 0); }
		public IncrementoForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementoFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterIncrementoFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitIncrementoFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitIncrementoFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementoForContext incrementoFor() throws RecognitionException {
		IncrementoForContext _localctx = new IncrementoForContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_incrementoFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			((IncrementoForContext)_localctx).identifier = match(ID);
			setState(248);
			match(ATRIBUICAO);
			setState(249);
			operacoes();
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

	public static class DeclaracaoRepitaEnquantoContext extends ParserRuleContext {
		public TerminalNode REPITA() { return getToken(CirnoParser.REPITA, 0); }
		public TerminalNode INICIO_CHAVES() { return getToken(CirnoParser.INICIO_CHAVES, 0); }
		public TerminalNode FIM_CHAVES() { return getToken(CirnoParser.FIM_CHAVES, 0); }
		public TerminalNode ENQUANTO() { return getToken(CirnoParser.ENQUANTO, 0); }
		public TerminalNode INICIO_PARENTESES() { return getToken(CirnoParser.INICIO_PARENTESES, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public TerminalNode FIM_PARENTESES() { return getToken(CirnoParser.FIM_PARENTESES, 0); }
		public BlocoDeComandoContext blocoDeComando() {
			return getRuleContext(BlocoDeComandoContext.class,0);
		}
		public DeclaracaoRepitaEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoRepitaEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterDeclaracaoRepitaEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitDeclaracaoRepitaEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitDeclaracaoRepitaEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoRepitaEnquantoContext declaracaoRepitaEnquanto() throws RecognitionException {
		DeclaracaoRepitaEnquantoContext _localctx = new DeclaracaoRepitaEnquantoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declaracaoRepitaEnquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(REPITA);
			setState(252);
			match(INICIO_CHAVES);
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(253);
				blocoDeComando();
				}
				break;
			}
			setState(256);
			match(FIM_CHAVES);
			setState(257);
			match(ENQUANTO);
			setState(258);
			match(INICIO_PARENTESES);
			setState(259);
			condicional();
			setState(260);
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

	public static class DeclaracaoEnquantoExecuteContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(CirnoParser.ENQUANTO, 0); }
		public TerminalNode INICIO_PARENTESES() { return getToken(CirnoParser.INICIO_PARENTESES, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public TerminalNode FIM_PARENTESES() { return getToken(CirnoParser.FIM_PARENTESES, 0); }
		public TerminalNode EXECUTE() { return getToken(CirnoParser.EXECUTE, 0); }
		public TerminalNode INICIO_CHAVES() { return getToken(CirnoParser.INICIO_CHAVES, 0); }
		public TerminalNode FIM_CHAVES() { return getToken(CirnoParser.FIM_CHAVES, 0); }
		public BlocoDeComandoContext blocoDeComando() {
			return getRuleContext(BlocoDeComandoContext.class,0);
		}
		public DeclaracaoEnquantoExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoEnquantoExecute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterDeclaracaoEnquantoExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitDeclaracaoEnquantoExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitDeclaracaoEnquantoExecute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoEnquantoExecuteContext declaracaoEnquantoExecute() throws RecognitionException {
		DeclaracaoEnquantoExecuteContext _localctx = new DeclaracaoEnquantoExecuteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declaracaoEnquantoExecute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ENQUANTO);
			setState(263);
			match(INICIO_PARENTESES);
			setState(264);
			condicional();
			setState(265);
			match(FIM_PARENTESES);
			setState(266);
			match(EXECUTE);
			setState(267);
			match(INICIO_CHAVES);
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(268);
				blocoDeComando();
				}
				break;
			}
			setState(271);
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

	public static class DeclaracaoQuandoForContext extends ParserRuleContext {
		public InicioQuandoForContext inicioQuandoFor() {
			return getRuleContext(InicioQuandoForContext.class,0);
		}
		public TerminalNode FINALIZE() { return getToken(CirnoParser.FINALIZE, 0); }
		public TerminalNode FIM_LINHA() { return getToken(CirnoParser.FIM_LINHA, 0); }
		public List<ForForContext> forFor() {
			return getRuleContexts(ForForContext.class);
		}
		public ForForContext forFor(int i) {
			return getRuleContext(ForForContext.class,i);
		}
		public DeclaracaoQuandoForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoQuandoFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterDeclaracaoQuandoFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitDeclaracaoQuandoFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitDeclaracaoQuandoFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoQuandoForContext declaracaoQuandoFor() throws RecognitionException {
		DeclaracaoQuandoForContext _localctx = new DeclaracaoQuandoForContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declaracaoQuandoFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			inicioQuandoFor();
			setState(275); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(274);
				forFor();
				}
				}
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FOR );
			setState(279);
			match(FINALIZE);
			setState(280);
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

	public static class InicioQuandoForContext extends ParserRuleContext {
		public TerminalNode QUANDO() { return getToken(CirnoParser.QUANDO, 0); }
		public TerminalNode INICIO_PARENTESES() { return getToken(CirnoParser.INICIO_PARENTESES, 0); }
		public TerminalNode ID() { return getToken(CirnoParser.ID, 0); }
		public TerminalNode FIM_PARENTESES() { return getToken(CirnoParser.FIM_PARENTESES, 0); }
		public TerminalNode SEPARADOR_DEFINICAO_VARIAVEL() { return getToken(CirnoParser.SEPARADOR_DEFINICAO_VARIAVEL, 0); }
		public InicioQuandoForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicioQuandoFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterInicioQuandoFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitInicioQuandoFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitInicioQuandoFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioQuandoForContext inicioQuandoFor() throws RecognitionException {
		InicioQuandoForContext _localctx = new InicioQuandoForContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_inicioQuandoFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(QUANDO);
			setState(283);
			match(INICIO_PARENTESES);
			setState(284);
			match(ID);
			setState(285);
			match(FIM_PARENTESES);
			setState(286);
			match(SEPARADOR_DEFINICAO_VARIAVEL);
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

	public static class ForForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CirnoParser.FOR, 0); }
		public TerminalNode NICIO_PARENTESES() { return getToken(CirnoParser.NICIO_PARENTESES, 0); }
		public TerminalNode ID() { return getToken(CirnoParser.ID, 0); }
		public TerminalNode FIM_PARENTESES() { return getToken(CirnoParser.FIM_PARENTESES, 0); }
		public TerminalNode INICIO_CHAVES() { return getToken(CirnoParser.INICIO_CHAVES, 0); }
		public TerminalNode FIM_CHAVES() { return getToken(CirnoParser.FIM_CHAVES, 0); }
		public BlocoDeComandoContext blocoDeComando() {
			return getRuleContext(BlocoDeComandoContext.class,0);
		}
		public ForForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).enterForFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CirnoListener ) ((CirnoListener)listener).exitForFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitForFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForForContext forFor() throws RecognitionException {
		ForForContext _localctx = new ForForContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(FOR);
			setState(289);
			match(NICIO_PARENTESES);
			setState(290);
			match(ID);
			setState(291);
			match(FIM_PARENTESES);
			setState(292);
			match(INICIO_CHAVES);
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(293);
				blocoDeComando();
				}
				break;
			}
			setState(296);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitTipoPrimitivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoPrimitivoContext tipoPrimitivo() throws RecognitionException {
		TipoPrimitivoContext _localctx = new TipoPrimitivoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tipoPrimitivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
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
		public OperacaoMultiplicacaoContext operacaoMultiplicacao() {
			return getRuleContext(OperacaoMultiplicacaoContext.class,0);
		}
		public OperacaoAdicaoContext operacaoAdicao() {
			return getRuleContext(OperacaoAdicaoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitOperacaoAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacaoAritmeticaContext operacaoAritmetica() throws RecognitionException {
		OperacaoAritmeticaContext _localctx = new OperacaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operacaoAritmetica);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLICACAO:
			case DIVISAO:
			case MODULO:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				operacaoMultiplicacao();
				}
				break;
			case SOMA:
			case SUBTRACAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				operacaoAdicao();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitOperacaoAdicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacaoAdicaoContext operacaoAdicao() throws RecognitionException {
		OperacaoAdicaoContext _localctx = new OperacaoAdicaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operacaoAdicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitOperacaoMultiplicacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacaoMultiplicacaoContext operacaoMultiplicacao() throws RecognitionException {
		OperacaoMultiplicacaoContext _localctx = new OperacaoMultiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operacaoMultiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitOperacaoRelacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacaoRelacaoContext operacaoRelacao() throws RecognitionException {
		OperacaoRelacaoContext _localctx = new OperacaoRelacaoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_operacaoRelacao);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
			case DIFERENTE:
			case MAIOR_IGUAL:
			case MENOR_IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				operacaoIgualdade();
				}
				break;
			case MAIOR:
			case MENOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitOperacaoIgualdade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacaoIgualdadeContext operacaoIgualdade() throws RecognitionException {
		OperacaoIgualdadeContext _localctx = new OperacaoIgualdadeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_operacaoIgualdade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitOperacaoComparacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacaoComparacaoContext operacaoComparacao() throws RecognitionException {
		OperacaoComparacaoContext _localctx = new OperacaoComparacaoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operacaoComparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitOperadorLogicoBinario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorLogicoBinarioContext operadorLogicoBinario() throws RecognitionException {
		OperadorLogicoBinarioContext _localctx = new OperadorLogicoBinarioContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_operadorLogicoBinario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CirnoVisitor ) return ((CirnoVisitor<? extends T>)visitor).visitOperadorLogicoUnitario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorLogicoUnitarioContext operadorLogicoUnitario() throws RecognitionException {
		OperadorLogicoUnitarioContext _localctx = new OperadorLogicoUnitarioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_operadorLogicoUnitario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u0143\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\7\2T\n"+
		"\2\f\2\16\2W\13\2\3\2\3\2\3\2\5\2\\\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\5\4j\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5u\n"+
		"\5\3\5\3\5\3\6\3\6\3\6\5\6|\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0084\n\7"+
		"\f\7\16\7\u0087\13\7\3\b\3\b\3\b\3\t\3\t\5\t\u008e\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u009d\n\f\f\f\16\f\u00a0"+
		"\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00ad\n"+
		"\17\3\20\5\20\u00b0\n\20\3\20\3\20\3\20\5\20\u00b5\n\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00bb\n\20\3\21\3\21\5\21\u00bf\n\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u00c7\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u00ce\n\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\5\24\u00d6\n\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00e8\n\26\3\27"+
		"\3\27\3\30\3\30\3\30\5\30\u00ef\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f6"+
		"\n\30\5\30\u00f8\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u0101\n"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u0110\n\33\3\33\3\33\3\34\3\34\6\34\u0116\n\34\r\34\16\34\u0117\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\5\36\u0129\n\36\3\36\3\36\3\37\3\37\3 \3 \5 \u0131\n \3!\3!\3\"\3"+
		"\"\3#\3#\5#\u0139\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\2\2(\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\t\4\2\65\65"+
		"??\3\2\5\r\3\2%&\3\2\')\4\2\37 #$\3\2!\"\3\2\34\35\2\u0143\2N\3\2\2\2"+
		"\4_\3\2\2\2\6d\3\2\2\2\bm\3\2\2\2\n{\3\2\2\2\f\u0085\3\2\2\2\16\u0088"+
		"\3\2\2\2\20\u008d\3\2\2\2\22\u008f\3\2\2\2\24\u0094\3\2\2\2\26\u009e\3"+
		"\2\2\2\30\u00a1\3\2\2\2\32\u00a5\3\2\2\2\34\u00ac\3\2\2\2\36\u00af\3\2"+
		"\2\2 \u00bc\3\2\2\2\"\u00c0\3\2\2\2$\u00ca\3\2\2\2&\u00d1\3\2\2\2(\u00d9"+
		"\3\2\2\2*\u00e7\3\2\2\2,\u00e9\3\2\2\2.\u00ee\3\2\2\2\60\u00f9\3\2\2\2"+
		"\62\u00fd\3\2\2\2\64\u0108\3\2\2\2\66\u0113\3\2\2\28\u011c\3\2\2\2:\u0122"+
		"\3\2\2\2<\u012c\3\2\2\2>\u0130\3\2\2\2@\u0132\3\2\2\2B\u0134\3\2\2\2D"+
		"\u0138\3\2\2\2F\u013a\3\2\2\2H\u013c\3\2\2\2J\u013e\3\2\2\2L\u0140\3\2"+
		"\2\2NO\7\3\2\2OP\7\16\2\2PQ\7\4\2\2QU\7-\2\2RT\5\4\3\2SR\3\2\2\2TW\3\2"+
		"\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7.\2\2Y[\7\61\2\2Z\\\5"+
		"\f\7\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\62\2\2^\3\3\2\2\2_`\5<\37\2"+
		"`a\7\64\2\2ab\7?\2\2bc\7,\2\2c\5\3\2\2\2de\7?\2\2ei\7\30\2\2fj\5\30\r"+
		"\2gj\7?\2\2hj\7\65\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2jk\3\2\2\2kl\7,\2"+
		"\2l\7\3\2\2\2mn\5<\37\2no\7\64\2\2op\7?\2\2pt\7\30\2\2qu\5\30\r\2ru\7"+
		"?\2\2su\7\65\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2uv\3\2\2\2vw\7,\2\2w\t\3"+
		"\2\2\2x|\5\4\3\2y|\5\b\5\2z|\5\6\4\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\13"+
		"\3\2\2\2}\u0084\5\n\6\2~\177\5\30\r\2\177\u0080\7,\2\2\u0080\u0084\3\2"+
		"\2\2\u0081\u0084\5\34\17\2\u0082\u0084\5\16\b\2\u0083}\3\2\2\2\u0083~"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\r\3\2\2\2\u0087\u0085\3\2\2\2"+
		"\u0088\u0089\5\20\t\2\u0089\u008a\7,\2\2\u008a\17\3\2\2\2\u008b\u008e"+
		"\5\22\n\2\u008c\u008e\5\24\13\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2"+
		"\2\u008e\21\3\2\2\2\u008f\u0090\7\32\2\2\u0090\u0091\7-\2\2\u0091\u0092"+
		"\7\65\2\2\u0092\u0093\7.\2\2\u0093\23\3\2\2\2\u0094\u0095\7\33\2\2\u0095"+
		"\u0096\7-\2\2\u0096\u0097\5\26\f\2\u0097\u0098\7.\2\2\u0098\25\3\2\2\2"+
		"\u0099\u009d\7?\2\2\u009a\u009d\7\65\2\2\u009b\u009d\5\30\r\2\u009c\u0099"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\27\3\2\2\2\u00a0\u009e\3\2\2"+
		"\2\u00a1\u00a2\5\32\16\2\u00a2\u00a3\5> \2\u00a3\u00a4\5\32\16\2\u00a4"+
		"\31\3\2\2\2\u00a5\u00a6\t\2\2\2\u00a6\33\3\2\2\2\u00a7\u00ad\5 \21\2\u00a8"+
		"\u00ad\5&\24\2\u00a9\u00ad\5\62\32\2\u00aa\u00ad\5\64\33\2\u00ab\u00ad"+
		"\5\66\34\2\u00ac\u00a7\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00a9\3\2\2\2"+
		"\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\35\3\2\2\2\u00ae\u00b0"+
		"\5L\'\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\t\2\2\2\u00b2\u00b4\5D#\2\u00b3\u00b5\5L\'\2\u00b4\u00b3\3\2\2"+
		"\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00ba\t\2\2\2\u00b7\u00b8"+
		"\5J&\2\u00b8\u00b9\5\36\20\2\u00b9\u00bb\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\37\3\2\2\2\u00bc\u00be\5\"\22\2\u00bd\u00bf\5$\23"+
		"\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf!\3\2\2\2\u00c0\u00c1"+
		"\7\17\2\2\u00c1\u00c2\7-\2\2\u00c2\u00c3\5\36\20\2\u00c3\u00c4\7.\2\2"+
		"\u00c4\u00c6\7\61\2\2\u00c5\u00c7\5\f\7\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\62\2\2\u00c9#\3\2\2\2\u00ca"+
		"\u00cb\7\20\2\2\u00cb\u00cd\7\61\2\2\u00cc\u00ce\5\f\7\2\u00cd\u00cc\3"+
		"\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\62\2\2\u00d0"+
		"%\3\2\2\2\u00d1\u00d2\7\24\2\2\u00d2\u00d3\5(\25\2\u00d3\u00d5\7\61\2"+
		"\2\u00d4\u00d6\5\f\7\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d8\7\62\2\2\u00d8\'\3\2\2\2\u00d9\u00da\7-\2\2\u00da"+
		"\u00db\5*\26\2\u00db\u00dc\7\63\2\2\u00dc\u00dd\5\36\20\2\u00dd\u00de"+
		"\7\63\2\2\u00de\u00df\5,\27\2\u00df\u00e0\7.\2\2\u00e0)\3\2\2\2\u00e1"+
		"\u00e2\5<\37\2\u00e2\u00e3\7\64\2\2\u00e3\u00e4\5.\30\2\u00e4\u00e8\3"+
		"\2\2\2\u00e5\u00e8\5.\30\2\u00e6\u00e8\7?\2\2\u00e7\u00e1\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8+\3\2\2\2\u00e9\u00ea\5\60\31"+
		"\2\u00ea-\3\2\2\2\u00eb\u00ec\5<\37\2\u00ec\u00ed\7\64\2\2\u00ed\u00ef"+
		"\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f7\7?\2\2\u00f1\u00f5\7\30\2\2\u00f2\u00f6\7?\2\2\u00f3\u00f6\7\65"+
		"\2\2\u00f4\u00f6\5\30\r\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8/\3\2\2\2\u00f9\u00fa\7?\2\2\u00fa\u00fb\7\30\2\2\u00fb\u00fc"+
		"\5\30\r\2\u00fc\61\3\2\2\2\u00fd\u00fe\7\27\2\2\u00fe\u0100\7\61\2\2\u00ff"+
		"\u0101\5\f\7\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0103\7\62\2\2\u0103\u0104\7\25\2\2\u0104\u0105\7-\2\2\u0105"+
		"\u0106\5\36\20\2\u0106\u0107\7.\2\2\u0107\63\3\2\2\2\u0108\u0109\7\25"+
		"\2\2\u0109\u010a\7-\2\2\u010a\u010b\5\36\20\2\u010b\u010c\7.\2\2\u010c"+
		"\u010d\7\26\2\2\u010d\u010f\7\61\2\2\u010e\u0110\5\f\7\2\u010f\u010e\3"+
		"\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7\62\2\2\u0112"+
		"\65\3\2\2\2\u0113\u0115\58\35\2\u0114\u0116\5:\36\2\u0115\u0114\3\2\2"+
		"\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u011a\7\22\2\2\u011a\u011b\7,\2\2\u011b\67\3\2\2\2\u011c"+
		"\u011d\7\21\2\2\u011d\u011e\7-\2\2\u011e\u011f\7?\2\2\u011f\u0120\7.\2"+
		"\2\u0120\u0121\7\64\2\2\u01219\3\2\2\2\u0122\u0123\7\23\2\2\u0123\u0124"+
		"\7A\2\2\u0124\u0125\7?\2\2\u0125\u0126\7.\2\2\u0126\u0128\7\61\2\2\u0127"+
		"\u0129\5\f\7\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012b\7\62\2\2\u012b;\3\2\2\2\u012c\u012d\t\3\2\2\u012d=\3"+
		"\2\2\2\u012e\u0131\5B\"\2\u012f\u0131\5@!\2\u0130\u012e\3\2\2\2\u0130"+
		"\u012f\3\2\2\2\u0131?\3\2\2\2\u0132\u0133\t\4\2\2\u0133A\3\2\2\2\u0134"+
		"\u0135\t\5\2\2\u0135C\3\2\2\2\u0136\u0139\5F$\2\u0137\u0139\5H%\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139E\3\2\2\2\u013a\u013b\t\6\2\2"+
		"\u013bG\3\2\2\2\u013c\u013d\t\7\2\2\u013dI\3\2\2\2\u013e\u013f\t\b\2\2"+
		"\u013fK\3\2\2\2\u0140\u0141\7\36\2\2\u0141M\3\2\2\2\36U[it{\u0083\u0085"+
		"\u008d\u009c\u009e\u00ac\u00af\u00b4\u00ba\u00be\u00c6\u00cd\u00d5\u00e7"+
		"\u00ee\u00f5\u00f7\u0100\u010f\u0117\u0128\u0130\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}