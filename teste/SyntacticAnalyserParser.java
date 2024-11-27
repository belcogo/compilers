// Generated from SyntacticAnalyser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SyntacticAnalyserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, VOID=2, CLASS=3, RETURN=4, IF=5, ELSE=6, WHILE=7, PARENTHESIS_OPEN=8, 
		PARENTHESIS_CLOSE=9, CURLY_BRACES_OPEN=10, CURLY_BRACES_CLOSE=11, COMMA=12, 
		SEMICOLON=13, BOOL=14, INT=15, AND=16, OR=17, NOT=18, PLUS=19, MULTIPLY=20, 
		ATTRIBUITION_OPERATOR=21, LESS_TAN=22, GREATER_THAN=23, EQUALS=24, NUMBER=25, 
		TRUE=26, FALSE=27, IDENTIFIER=28, NEWLINE=29;
	public static final int
		RULE_type = 0, RULE_method_type = 1, RULE_term = 2, RULE_b_term = 3, RULE_boolean_op = 4, 
		RULE_a_term = 5, RULE_aritmetic_op = 6, RULE_expression = 7, RULE_method_call = 8, 
		RULE_else = 9, RULE_ifelse = 10, RULE_while = 11, RULE_param = 12, RULE_method_declaration = 13, 
		RULE_attr_declaration = 14, RULE_attribuition_op = 15, RULE_commands = 16, 
		RULE_main_function = 17, RULE_class = 18, RULE_prog = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"type", "method_type", "term", "b_term", "boolean_op", "a_term", "aritmetic_op", 
			"expression", "method_call", "else", "ifelse", "while", "param", "method_declaration", 
			"attr_declaration", "attribuition_op", "commands", "main_function", "class", 
			"prog"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'void'", "'class'", "'return'", "'if'", "'else'", "'while'", 
			"'('", "')'", "'{'", "'}'", "','", "';'", "'bool'", "'int'", "'and'", 
			"'or'", "'not'", "'+'", "'*'", "'='", "'<'", "'>'", "'=='", null, "'True'", 
			"'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "VOID", "CLASS", "RETURN", "IF", "ELSE", "WHILE", "PARENTHESIS_OPEN", 
			"PARENTHESIS_CLOSE", "CURLY_BRACES_OPEN", "CURLY_BRACES_CLOSE", "COMMA", 
			"SEMICOLON", "BOOL", "INT", "AND", "OR", "NOT", "PLUS", "MULTIPLY", "ATTRIBUITION_OPERATOR", 
			"LESS_TAN", "GREATER_THAN", "EQUALS", "NUMBER", "TRUE", "FALSE", "IDENTIFIER", 
			"NEWLINE"
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
	public String getGrammarFileName() { return "SyntacticAnalyser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SyntacticAnalyserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(SyntacticAnalyserParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(SyntacticAnalyserParser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==BOOL || _la==INT) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SyntacticAnalyserParser.VOID, 0); }
		public Method_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterMethod_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitMethod_type(this);
		}
	}

	public final Method_typeContext method_type() throws RecognitionException {
		Method_typeContext _localctx = new Method_typeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_method_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
				{
				setState(42);
				type();
				}
				break;
			case VOID:
				{
				setState(43);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SyntacticAnalyserParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SyntacticAnalyserParser.FALSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SyntacticAnalyserParser.IDENTIFIER, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(SyntacticAnalyserParser.PARENTHESIS_OPEN, 0); }
		public Boolean_opContext boolean_op() {
			return getRuleContext(Boolean_opContext.class,0);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(SyntacticAnalyserParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode NOT() { return getToken(SyntacticAnalyserParser.NOT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				match(PARENTHESIS_OPEN);
				setState(50);
				boolean_op();
				setState(51);
				match(PARENTHESIS_CLOSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				match(NOT);
				setState(54);
				term();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				method_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class B_termContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SyntacticAnalyserParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SyntacticAnalyserParser.AND, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(SyntacticAnalyserParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(SyntacticAnalyserParser.EQUALS, i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(SyntacticAnalyserParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(SyntacticAnalyserParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_TAN() { return getTokens(SyntacticAnalyserParser.LESS_TAN); }
		public TerminalNode LESS_TAN(int i) {
			return getToken(SyntacticAnalyserParser.LESS_TAN, i);
		}
		public B_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterB_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitB_term(this);
		}
	}

	public final B_termContext b_term() throws RecognitionException {
		B_termContext _localctx = new B_termContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_b_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			term();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29425664L) != 0)) {
				{
				{
				setState(59);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29425664L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(60);
				term();
				}
				}
				setState(65);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_opContext extends ParserRuleContext {
		public List<B_termContext> b_term() {
			return getRuleContexts(B_termContext.class);
		}
		public B_termContext b_term(int i) {
			return getRuleContext(B_termContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SyntacticAnalyserParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SyntacticAnalyserParser.OR, i);
		}
		public Boolean_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterBoolean_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitBoolean_op(this);
		}
	}

	public final Boolean_opContext boolean_op() throws RecognitionException {
		Boolean_opContext _localctx = new Boolean_opContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_boolean_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			b_term();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				{
				setState(67);
				match(OR);
				}
				setState(68);
				b_term();
				}
				}
				setState(73);
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

	@SuppressWarnings("CheckReturnValue")
	public static class A_termContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SyntacticAnalyserParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(SyntacticAnalyserParser.NUMBER, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public A_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterA_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitA_term(this);
		}
	}

	public final A_termContext a_term() throws RecognitionException {
		A_termContext _localctx = new A_termContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_a_term);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				method_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Aritmetic_opContext extends ParserRuleContext {
		public List<A_termContext> a_term() {
			return getRuleContexts(A_termContext.class);
		}
		public A_termContext a_term(int i) {
			return getRuleContext(A_termContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SyntacticAnalyserParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SyntacticAnalyserParser.PLUS, i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(SyntacticAnalyserParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(SyntacticAnalyserParser.MULTIPLY, i);
		}
		public Aritmetic_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetic_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterAritmetic_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitAritmetic_op(this);
		}
	}

	public final Aritmetic_opContext aritmetic_op() throws RecognitionException {
		Aritmetic_opContext _localctx = new Aritmetic_opContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_aritmetic_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			a_term();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MULTIPLY) {
				{
				{
				setState(80);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MULTIPLY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(81);
				a_term();
				}
				}
				setState(86);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Aritmetic_opContext aritmetic_op() {
			return getRuleContext(Aritmetic_opContext.class,0);
		}
		public Boolean_opContext boolean_op() {
			return getRuleContext(Boolean_opContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				aritmetic_op();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				boolean_op();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				method_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_callContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SyntacticAnalyserParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SyntacticAnalyserParser.IDENTIFIER, i);
		}
		public TerminalNode PARENTHESIS_OPEN() { return getToken(SyntacticAnalyserParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(SyntacticAnalyserParser.PARENTHESIS_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SyntacticAnalyserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SyntacticAnalyserParser.COMMA, i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(IDENTIFIER);
			setState(93);
			match(PARENTHESIS_OPEN);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(94);
				match(IDENTIFIER);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(95);
					match(COMMA);
					setState(96);
					match(IDENTIFIER);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(104);
			match(PARENTHESIS_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SyntacticAnalyserParser.ELSE, 0); }
		public TerminalNode CURLY_BRACES_OPEN() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_OPEN, 0); }
		public TerminalNode CURLY_BRACES_CLOSE() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_CLOSE, 0); }
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitElse(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ELSE);
			setState(107);
			match(CURLY_BRACES_OPEN);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268484788L) != 0)) {
				{
				{
				setState(108);
				commands();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(CURLY_BRACES_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfelseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SyntacticAnalyserParser.IF, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(SyntacticAnalyserParser.PARENTHESIS_OPEN, 0); }
		public Boolean_opContext boolean_op() {
			return getRuleContext(Boolean_opContext.class,0);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(SyntacticAnalyserParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode CURLY_BRACES_OPEN() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_OPEN, 0); }
		public TerminalNode CURLY_BRACES_CLOSE() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_CLOSE, 0); }
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitIfelse(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(IF);
			setState(117);
			match(PARENTHESIS_OPEN);
			setState(118);
			boolean_op();
			setState(119);
			match(PARENTHESIS_CLOSE);
			setState(120);
			match(CURLY_BRACES_OPEN);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268484788L) != 0)) {
				{
				{
				setState(121);
				commands();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(CURLY_BRACES_CLOSE);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(128);
				else_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SyntacticAnalyserParser.WHILE, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(SyntacticAnalyserParser.PARENTHESIS_OPEN, 0); }
		public Boolean_opContext boolean_op() {
			return getRuleContext(Boolean_opContext.class,0);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(SyntacticAnalyserParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode CURLY_BRACES_OPEN() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_OPEN, 0); }
		public TerminalNode CURLY_BRACES_CLOSE() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_CLOSE, 0); }
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitWhile(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(WHILE);
			setState(132);
			match(PARENTHESIS_OPEN);
			setState(133);
			boolean_op();
			setState(134);
			match(PARENTHESIS_CLOSE);
			setState(135);
			match(CURLY_BRACES_OPEN);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268484788L) != 0)) {
				{
				{
				setState(136);
				commands();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(CURLY_BRACES_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SyntacticAnalyserParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SyntacticAnalyserParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SyntacticAnalyserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SyntacticAnalyserParser.COMMA, i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			type();
			setState(145);
			match(IDENTIFIER);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(146);
					match(COMMA);
					setState(147);
					match(IDENTIFIER);
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Method_declarationContext extends ParserRuleContext {
		public Method_typeContext method_type() {
			return getRuleContext(Method_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SyntacticAnalyserParser.IDENTIFIER, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(SyntacticAnalyserParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(SyntacticAnalyserParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode CURLY_BRACES_OPEN() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_OPEN, 0); }
		public TerminalNode CURLY_BRACES_CLOSE() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_CLOSE, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SyntacticAnalyserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SyntacticAnalyserParser.COMMA, i);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitMethod_declaration(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			method_type();
			setState(154);
			match(IDENTIFIER);
			setState(155);
			match(PARENTHESIS_OPEN);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL || _la==INT) {
				{
				setState(156);
				param();
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(157);
					match(COMMA);
					setState(158);
					param();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(166);
			match(PARENTHESIS_CLOSE);
			setState(167);
			match(CURLY_BRACES_OPEN);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268484788L) != 0)) {
				{
				{
				setState(168);
				commands();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(CURLY_BRACES_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Attr_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SyntacticAnalyserParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(SyntacticAnalyserParser.SEMICOLON, 0); }
		public TerminalNode ATTRIBUITION_OPERATOR() { return getToken(SyntacticAnalyserParser.ATTRIBUITION_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Attr_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterAttr_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitAttr_declaration(this);
		}
	}

	public final Attr_declarationContext attr_declaration() throws RecognitionException {
		Attr_declarationContext _localctx = new Attr_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attr_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			type();
			setState(177);
			match(IDENTIFIER);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUITION_OPERATOR) {
				{
				setState(178);
				match(ATTRIBUITION_OPERATOR);
				setState(179);
				expression();
				}
			}

			setState(182);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Attribuition_opContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SyntacticAnalyserParser.IDENTIFIER, 0); }
		public TerminalNode ATTRIBUITION_OPERATOR() { return getToken(SyntacticAnalyserParser.ATTRIBUITION_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SyntacticAnalyserParser.SEMICOLON, 0); }
		public Attribuition_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribuition_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterAttribuition_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitAttribuition_op(this);
		}
	}

	public final Attribuition_opContext attribuition_op() throws RecognitionException {
		Attribuition_opContext _localctx = new Attribuition_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attribuition_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(IDENTIFIER);
			setState(185);
			match(ATTRIBUITION_OPERATOR);
			setState(186);
			expression();
			setState(187);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandsContext extends ParserRuleContext {
		public Attribuition_opContext attribuition_op() {
			return getRuleContext(Attribuition_opContext.class,0);
		}
		public Attr_declarationContext attr_declaration() {
			return getRuleContext(Attr_declarationContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SyntacticAnalyserParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(SyntacticAnalyserParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitCommands(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_commands);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				attribuition_op();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				attr_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				method_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				while_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				ifelse();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				method_call();
				setState(195);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(197);
				match(RETURN);
				setState(198);
				expression();
				setState(199);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Main_functionContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(SyntacticAnalyserParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(SyntacticAnalyserParser.MAIN, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(SyntacticAnalyserParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(SyntacticAnalyserParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode CURLY_BRACES_OPEN() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_OPEN, 0); }
		public TerminalNode CURLY_BRACES_CLOSE() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_CLOSE, 0); }
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterMain_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitMain_function(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_main_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(VOID);
			setState(204);
			match(MAIN);
			setState(205);
			match(PARENTHESIS_OPEN);
			setState(206);
			match(PARENTHESIS_CLOSE);
			setState(207);
			match(CURLY_BRACES_OPEN);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268484788L) != 0)) {
				{
				{
				setState(208);
				commands();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(CURLY_BRACES_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(SyntacticAnalyserParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SyntacticAnalyserParser.IDENTIFIER, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(SyntacticAnalyserParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(SyntacticAnalyserParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode CURLY_BRACES_OPEN() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_OPEN, 0); }
		public TerminalNode CURLY_BRACES_CLOSE() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_CLOSE, 0); }
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitClass(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(CLASS);
			setState(217);
			match(IDENTIFIER);
			setState(218);
			match(PARENTHESIS_OPEN);
			setState(219);
			match(PARENTHESIS_CLOSE);
			setState(220);
			match(CURLY_BRACES_OPEN);
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(221);
				main_function();
				}
				break;
			}
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268484788L) != 0)) {
				{
				{
				setState(224);
				commands();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(CURLY_BRACES_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SyntacticAnalyserParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			class_();
			setState(233);
			match(EOF);
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
		"\u0004\u0001\u001d\u00ec\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0003\u0001-\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u00029\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003>\b\u0003\n\u0003\f\u0003A\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004F\b\u0004\n\u0004\f\u0004I\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005N\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006S\b\u0006\n\u0006\f\u0006V\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007[\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\bb\b\b\n\b\f\be\t\b\u0003\bg\b\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0005\tn\b\t\n\t\f\tq\t\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n{\b\n\n\n\f\n~\t\n\u0001\n\u0001"+
		"\n\u0003\n\u0082\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u008a\b\u000b\n\u000b\f\u000b\u008d\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0095"+
		"\b\f\n\f\f\f\u0098\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0005\r\u00a0\b\r\n\r\f\r\u00a3\t\r\u0003\r\u00a5\b\r\u0001\r\u0001\r"+
		"\u0001\r\u0005\r\u00aa\b\r\n\r\f\r\u00ad\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b5\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00ca\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u00d2\b\u0011\n\u0011\f\u0011\u00d5"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00df\b\u0012\u0001\u0012\u0005"+
		"\u0012\u00e2\b\u0012\n\u0012\f\u0012\u00e5\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&\u0000\u0003\u0001\u0000\u000e\u000f\u0002\u0000\u0010\u0010"+
		"\u0016\u0018\u0001\u0000\u0013\u0014\u00f8\u0000(\u0001\u0000\u0000\u0000"+
		"\u0002,\u0001\u0000\u0000\u0000\u00048\u0001\u0000\u0000\u0000\u0006:"+
		"\u0001\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000"+
		"\u0000\fO\u0001\u0000\u0000\u0000\u000eZ\u0001\u0000\u0000\u0000\u0010"+
		"\\\u0001\u0000\u0000\u0000\u0012j\u0001\u0000\u0000\u0000\u0014t\u0001"+
		"\u0000\u0000\u0000\u0016\u0083\u0001\u0000\u0000\u0000\u0018\u0090\u0001"+
		"\u0000\u0000\u0000\u001a\u0099\u0001\u0000\u0000\u0000\u001c\u00b0\u0001"+
		"\u0000\u0000\u0000\u001e\u00b8\u0001\u0000\u0000\u0000 \u00c9\u0001\u0000"+
		"\u0000\u0000\"\u00cb\u0001\u0000\u0000\u0000$\u00d8\u0001\u0000\u0000"+
		"\u0000&\u00e8\u0001\u0000\u0000\u0000()\u0007\u0000\u0000\u0000)\u0001"+
		"\u0001\u0000\u0000\u0000*-\u0003\u0000\u0000\u0000+-\u0005\u0002\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-\u0003\u0001"+
		"\u0000\u0000\u0000.9\u0005\u001a\u0000\u0000/9\u0005\u001b\u0000\u0000"+
		"09\u0005\u001c\u0000\u000012\u0005\b\u0000\u000023\u0003\b\u0004\u0000"+
		"34\u0005\t\u0000\u000049\u0001\u0000\u0000\u000056\u0005\u0012\u0000\u0000"+
		"69\u0003\u0004\u0002\u000079\u0003\u0010\b\u00008.\u0001\u0000\u0000\u0000"+
		"8/\u0001\u0000\u0000\u000080\u0001\u0000\u0000\u000081\u0001\u0000\u0000"+
		"\u000085\u0001\u0000\u0000\u000087\u0001\u0000\u0000\u00009\u0005\u0001"+
		"\u0000\u0000\u0000:?\u0003\u0004\u0002\u0000;<\u0007\u0001\u0000\u0000"+
		"<>\u0003\u0004\u0002\u0000=;\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0007\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BG\u0003\u0006\u0003\u0000"+
		"CD\u0005\u0011\u0000\u0000DF\u0003\u0006\u0003\u0000EC\u0001\u0000\u0000"+
		"\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000H\t\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JN\u0005"+
		"\u001c\u0000\u0000KN\u0005\u0019\u0000\u0000LN\u0003\u0010\b\u0000MJ\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000"+
		"N\u000b\u0001\u0000\u0000\u0000OT\u0003\n\u0005\u0000PQ\u0007\u0002\u0000"+
		"\u0000QS\u0003\n\u0005\u0000RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\r\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000W[\u0003\f\u0006\u0000X[\u0003\b"+
		"\u0004\u0000Y[\u0003\u0010\b\u0000ZW\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000ZY\u0001\u0000\u0000\u0000[\u000f\u0001\u0000\u0000\u0000"+
		"\\]\u0005\u001c\u0000\u0000]f\u0005\b\u0000\u0000^c\u0005\u001c\u0000"+
		"\u0000_`\u0005\f\u0000\u0000`b\u0005\u001c\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000f^\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hi\u0005\t\u0000\u0000i\u0011\u0001\u0000\u0000\u0000jk\u0005\u0006\u0000"+
		"\u0000ko\u0005\n\u0000\u0000ln\u0003 \u0010\u0000ml\u0001\u0000\u0000"+
		"\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0005"+
		"\u000b\u0000\u0000s\u0013\u0001\u0000\u0000\u0000tu\u0005\u0005\u0000"+
		"\u0000uv\u0005\b\u0000\u0000vw\u0003\b\u0004\u0000wx\u0005\t\u0000\u0000"+
		"x|\u0005\n\u0000\u0000y{\u0003 \u0010\u0000zy\u0001\u0000\u0000\u0000"+
		"{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f"+
		"\u0081\u0005\u000b\u0000\u0000\u0080\u0082\u0003\u0012\t\u0000\u0081\u0080"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0015"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0007\u0000\u0000\u0084\u0085"+
		"\u0005\b\u0000\u0000\u0085\u0086\u0003\b\u0004\u0000\u0086\u0087\u0005"+
		"\t\u0000\u0000\u0087\u008b\u0005\n\u0000\u0000\u0088\u008a\u0003 \u0010"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005\u000b\u0000\u0000\u008f\u0017\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0003\u0000\u0000\u0000\u0091\u0096\u0005\u001c\u0000"+
		"\u0000\u0092\u0093\u0005\f\u0000\u0000\u0093\u0095\u0005\u001c\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0019\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0003\u0002\u0001\u0000\u009a\u009b\u0005\u001c\u0000\u0000"+
		"\u009b\u00a4\u0005\b\u0000\u0000\u009c\u00a1\u0003\u0018\f\u0000\u009d"+
		"\u009e\u0005\f\u0000\u0000\u009e\u00a0\u0003\u0018\f\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u009c"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\t\u0000\u0000\u00a7\u00ab\u0005"+
		"\n\u0000\u0000\u00a8\u00aa\u0003 \u0010\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u000b"+
		"\u0000\u0000\u00af\u001b\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003\u0000"+
		"\u0000\u0000\u00b1\u00b4\u0005\u001c\u0000\u0000\u00b2\u00b3\u0005\u0015"+
		"\u0000\u0000\u00b3\u00b5\u0003\u000e\u0007\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005\r\u0000\u0000\u00b7\u001d\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0005\u001c\u0000\u0000\u00b9\u00ba\u0005\u0015\u0000"+
		"\u0000\u00ba\u00bb\u0003\u000e\u0007\u0000\u00bb\u00bc\u0005\r\u0000\u0000"+
		"\u00bc\u001f\u0001\u0000\u0000\u0000\u00bd\u00ca\u0003\u001e\u000f\u0000"+
		"\u00be\u00ca\u0003\u001c\u000e\u0000\u00bf\u00ca\u0003\u001a\r\u0000\u00c0"+
		"\u00ca\u0003\u0016\u000b\u0000\u00c1\u00ca\u0003\u0014\n\u0000\u00c2\u00c3"+
		"\u0003\u0010\b\u0000\u00c3\u00c4\u0005\r\u0000\u0000\u00c4\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005\u0004\u0000\u0000\u00c6\u00c7\u0003"+
		"\u000e\u0007\u0000\u00c7\u00c8\u0005\r\u0000\u0000\u00c8\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c9\u00bd\u0001\u0000\u0000\u0000\u00c9\u00be\u0001\u0000"+
		"\u0000\u0000\u00c9\u00bf\u0001\u0000\u0000\u0000\u00c9\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c1\u0001\u0000\u0000\u0000\u00c9\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c5\u0001\u0000\u0000\u0000\u00ca!\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0005\u0002\u0000\u0000\u00cc\u00cd\u0005\u0001\u0000"+
		"\u0000\u00cd\u00ce\u0005\b\u0000\u0000\u00ce\u00cf\u0005\t\u0000\u0000"+
		"\u00cf\u00d3\u0005\n\u0000\u0000\u00d0\u00d2\u0003 \u0010\u0000\u00d1"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0005\u000b\u0000\u0000\u00d7#\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0005\u0003\u0000\u0000\u00d9\u00da\u0005\u001c\u0000\u0000\u00da\u00db"+
		"\u0005\b\u0000\u0000\u00db\u00dc\u0005\t\u0000\u0000\u00dc\u00de\u0005"+
		"\n\u0000\u0000\u00dd\u00df\u0003\"\u0011\u0000\u00de\u00dd\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e2\u0003 \u0010\u0000\u00e1\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u000b\u0000"+
		"\u0000\u00e7%\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003$\u0012\u0000\u00e9"+
		"\u00ea\u0005\u0000\u0000\u0001\u00ea\'\u0001\u0000\u0000\u0000\u0016,"+
		"8?GMTZcfo|\u0081\u008b\u0096\u00a1\u00a4\u00ab\u00b4\u00c9\u00d3\u00de"+
		"\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}