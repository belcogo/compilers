// Generated from SyntacticAnalyser.g4 by ANTLR 4.13.2
import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SyntacticAnalyserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NEWLINE=5, RESERVED_WORD_MAIN=6, RESERVED_WORD_VOID_TYPE=7, 
		RESERVED_WORD_CLASS=8, RESERVED_WORD_RETURN=9, RESERVED_WORD_IF=10, RESERVED_WORD_ELSE=11, 
		RESERVED_WORD_WHILE=12, PARENTHESIS_OPEN=13, PARENTHESIS_CLOSE=14, CURLY_BRACES_OPEN=15, 
		CURLY_BRACES_CLOSE=16, COMMA=17, SEMICOLON=18, NUMBER=19, IDENTIFIER=20, 
		ATTRIBUITION_OPERATOR=21, LOGIC_OPERATOR=22, ARITMETIC_OPERATOR=23, RELATIONAL_OPERATOR=24;
	public static final int
		RULE_type = 0, RULE_method_type = 1, RULE_boolean_constants = 2, RULE_exp_two = 3, 
		RULE_exp_one = 4, RULE_attr_declaration = 5, RULE_arguments = 6, RULE_main_function = 7, 
		RULE_method_declaration = 8, RULE_while_command = 9, RULE_class = 10, 
		RULE_if = 11, RULE_else = 12, RULE_ifelse = 13, RULE_commands = 14, RULE_exp_three = 15, 
		RULE_aritmetic_op = 16, RULE_exp_four = 17, RULE_logic_op = 18, RULE_relational_op = 19, 
		RULE_prog = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"type", "method_type", "boolean_constants", "exp_two", "exp_one", "attr_declaration", 
			"arguments", "main_function", "method_declaration", "while_command", 
			"class", "if", "else", "ifelse", "commands", "exp_three", "aritmetic_op", 
			"exp_four", "logic_op", "relational_op", "prog"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'int'", "'True'", "'False'", null, "'main'", "'void'", 
			"'class'", "'return'", "'if'", "'else'", "'while'", "'('", "')'", "'{'", 
			"'}'", "','", "';'", null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NEWLINE", "RESERVED_WORD_MAIN", "RESERVED_WORD_VOID_TYPE", 
			"RESERVED_WORD_CLASS", "RESERVED_WORD_RETURN", "RESERVED_WORD_IF", "RESERVED_WORD_ELSE", 
			"RESERVED_WORD_WHILE", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE", "CURLY_BRACES_OPEN", 
			"CURLY_BRACES_CLOSE", "COMMA", "SEMICOLON", "NUMBER", "IDENTIFIER", "ATTRIBUITION_OPERATOR", 
			"LOGIC_OPERATOR", "ARITMETIC_OPERATOR", "RELATIONAL_OPERATOR"
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
			setState(42);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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
		public TerminalNode RESERVED_WORD_VOID_TYPE() { return getToken(SyntacticAnalyserParser.RESERVED_WORD_VOID_TYPE, 0); }
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
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				{
				setState(44);
				type();
				}
				break;
			case RESERVED_WORD_VOID_TYPE:
				{
				setState(45);
				match(RESERVED_WORD_VOID_TYPE);
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
	public static class Boolean_constantsContext extends ParserRuleContext {
		public Boolean_constantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_constants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterBoolean_constants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitBoolean_constants(this);
		}
	}

	public final Boolean_constantsContext boolean_constants() throws RecognitionException {
		Boolean_constantsContext _localctx = new Boolean_constantsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_boolean_constants);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
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
	public static class Exp_twoContext extends ParserRuleContext {
		public Aritmetic_opContext aritmetic_op() {
			return getRuleContext(Aritmetic_opContext.class,0);
		}
		public Logic_opContext logic_op() {
			return getRuleContext(Logic_opContext.class,0);
		}
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public Exp_threeContext exp_three() {
			return getRuleContext(Exp_threeContext.class,0);
		}
		public Exp_fourContext exp_four() {
			return getRuleContext(Exp_fourContext.class,0);
		}
		public Exp_twoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_two; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterExp_two(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitExp_two(this);
		}
	}

	public final Exp_twoContext exp_two() throws RecognitionException {
		Exp_twoContext _localctx = new Exp_twoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp_two);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				aritmetic_op();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				logic_op();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				relational_op();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				exp_three();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				exp_four();
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
	public static class Exp_oneContext extends ParserRuleContext {
		public TerminalNode ATTRIBUITION_OPERATOR() { return getToken(SyntacticAnalyserParser.ATTRIBUITION_OPERATOR, 0); }
		public Exp_twoContext exp_two() {
			return getRuleContext(Exp_twoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SyntacticAnalyserParser.SEMICOLON, 0); }
		public Exp_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterExp_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitExp_one(this);
		}
	}

	public final Exp_oneContext exp_one() throws RecognitionException {
		Exp_oneContext _localctx = new Exp_oneContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exp_one);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTRIBUITION_OPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(ATTRIBUITION_OPERATOR);
				setState(58);
				exp_two();
				setState(59);
				match(SEMICOLON);
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Attr_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SyntacticAnalyserParser.IDENTIFIER, 0); }
		public Exp_oneContext exp_one() {
			return getRuleContext(Exp_oneContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SyntacticAnalyserParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 10, RULE_attr_declaration);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				type();
				setState(65);
				match(IDENTIFIER);
				setState(66);
				exp_one();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				type();
				setState(69);
				match(IDENTIFIER);
				setState(70);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				type();
				setState(73);
				match(IDENTIFIER);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public Attr_declarationContext attr_declaration() {
			return getRuleContext(Attr_declarationContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SyntacticAnalyserParser.COMMA, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arguments);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				attr_declaration();
				setState(78);
				match(COMMA);
				setState(79);
				arguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				attr_declaration();
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
		public TerminalNode RESERVED_WORD_VOID_TYPE() { return getToken(SyntacticAnalyserParser.RESERVED_WORD_VOID_TYPE, 0); }
		public TerminalNode RESERVED_WORD_MAIN() { return getToken(SyntacticAnalyserParser.RESERVED_WORD_MAIN, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(SyntacticAnalyserParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(SyntacticAnalyserParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode CURLY_BRACES_OPEN() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_OPEN, 0); }
		public TerminalNode CURLY_BRACES_CLOSE() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_CLOSE, 0); }
		public List<Method_declarationContext> method_declaration() {
			return getRuleContexts(Method_declarationContext.class);
		}
		public Method_declarationContext method_declaration(int i) {
			return getRuleContext(Method_declarationContext.class,i);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public List<IfelseContext> ifelse() {
			return getRuleContexts(IfelseContext.class);
		}
		public IfelseContext ifelse(int i) {
			return getRuleContext(IfelseContext.class,i);
		}
		public List<While_commandContext> while_command() {
			return getRuleContexts(While_commandContext.class);
		}
		public While_commandContext while_command(int i) {
			return getRuleContext(While_commandContext.class,i);
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
		enterRule(_localctx, 14, RULE_main_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(RESERVED_WORD_VOID_TYPE);
			setState(85);
			match(RESERVED_WORD_MAIN);
			setState(86);
			match(PARENTHESIS_OPEN);
			setState(87);
			match(PARENTHESIS_CLOSE);
			setState(88);
			match(CURLY_BRACES_OPEN);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1054342L) != 0)) {
				{
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(89);
					method_declaration();
					}
					break;
				case 2:
					{
					setState(90);
					commands();
					}
					break;
				case 3:
					{
					setState(91);
					ifelse();
					}
					break;
				case 4:
					{
					setState(92);
					while_command();
					}
					break;
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
	public static class Method_declarationContext extends ParserRuleContext {
		public Method_typeContext method_type() {
			return getRuleContext(Method_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SyntacticAnalyserParser.IDENTIFIER, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(SyntacticAnalyserParser.PARENTHESIS_OPEN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
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
		public List<IfelseContext> ifelse() {
			return getRuleContexts(IfelseContext.class);
		}
		public IfelseContext ifelse(int i) {
			return getRuleContext(IfelseContext.class,i);
		}
		public List<While_commandContext> while_command() {
			return getRuleContexts(While_commandContext.class);
		}
		public While_commandContext while_command(int i) {
			return getRuleContext(While_commandContext.class,i);
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
		enterRule(_localctx, 16, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			method_type();
			setState(101);
			match(IDENTIFIER);
			setState(102);
			match(PARENTHESIS_OPEN);
			setState(103);
			arguments();
			setState(104);
			match(PARENTHESIS_CLOSE);
			setState(105);
			match(CURLY_BRACES_OPEN);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1054214L) != 0)) {
				{
				setState(109);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case RESERVED_WORD_RETURN:
				case IDENTIFIER:
					{
					setState(106);
					commands();
					}
					break;
				case RESERVED_WORD_IF:
					{
					setState(107);
					ifelse();
					}
					break;
				case RESERVED_WORD_WHILE:
					{
					setState(108);
					while_command();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
	public static class While_commandContext extends ParserRuleContext {
		public TerminalNode RESERVED_WORD_WHILE() { return getToken(SyntacticAnalyserParser.RESERVED_WORD_WHILE, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(SyntacticAnalyserParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(SyntacticAnalyserParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode CURLY_BRACES_OPEN() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_OPEN, 0); }
		public TerminalNode CURLY_BRACES_CLOSE() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_CLOSE, 0); }
		public Logic_opContext logic_op() {
			return getRuleContext(Logic_opContext.class,0);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public List<IfelseContext> ifelse() {
			return getRuleContexts(IfelseContext.class);
		}
		public IfelseContext ifelse(int i) {
			return getRuleContext(IfelseContext.class,i);
		}
		public List<While_commandContext> while_command() {
			return getRuleContexts(While_commandContext.class);
		}
		public While_commandContext while_command(int i) {
			return getRuleContext(While_commandContext.class,i);
		}
		public While_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterWhile_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitWhile_command(this);
		}
	}

	public final While_commandContext while_command() throws RecognitionException {
		While_commandContext _localctx = new While_commandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(RESERVED_WORD_WHILE);
			setState(117);
			match(PARENTHESIS_OPEN);
			{
			setState(118);
			logic_op();
			}
			setState(119);
			match(PARENTHESIS_CLOSE);
			setState(120);
			match(CURLY_BRACES_OPEN);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1054214L) != 0)) {
				{
				setState(124);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case RESERVED_WORD_RETURN:
				case IDENTIFIER:
					{
					setState(121);
					commands();
					}
					break;
				case RESERVED_WORD_IF:
					{
					setState(122);
					ifelse();
					}
					break;
				case RESERVED_WORD_WHILE:
					{
					setState(123);
					while_command();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
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
		public TerminalNode RESERVED_WORD_CLASS() { return getToken(SyntacticAnalyserParser.RESERVED_WORD_CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SyntacticAnalyserParser.IDENTIFIER, 0); }
		public TerminalNode CURLY_BRACES_OPEN() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_OPEN, 0); }
		public TerminalNode CURLY_BRACES_CLOSE() { return getToken(SyntacticAnalyserParser.CURLY_BRACES_CLOSE, 0); }
		public List<Attr_declarationContext> attr_declaration() {
			return getRuleContexts(Attr_declarationContext.class);
		}
		public Attr_declarationContext attr_declaration(int i) {
			return getRuleContext(Attr_declarationContext.class,i);
		}
		public List<Method_declarationContext> method_declaration() {
			return getRuleContexts(Method_declarationContext.class);
		}
		public Method_declarationContext method_declaration(int i) {
			return getRuleContext(Method_declarationContext.class,i);
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
		enterRule(_localctx, 20, RULE_class);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(RESERVED_WORD_CLASS);
				setState(132);
				match(IDENTIFIER);
				setState(133);
				match(CURLY_BRACES_OPEN);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134L) != 0)) {
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(134);
						attr_declaration();
						}
						break;
					case 2:
						{
						setState(135);
						method_declaration();
						}
						break;
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				match(CURLY_BRACES_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(RESERVED_WORD_CLASS);
				setState(143);
				match(IDENTIFIER);
				setState(144);
				match(CURLY_BRACES_OPEN);
				setState(145);
				match(CURLY_BRACES_CLOSE);
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode RESERVED_WORD_IF() { return getToken(SyntacticAnalyserParser.RESERVED_WORD_IF, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(SyntacticAnalyserParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(SyntacticAnalyserParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SyntacticAnalyserParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SyntacticAnalyserParser.IDENTIFIER, 0); }
		public Logic_opContext logic_op() {
			return getRuleContext(Logic_opContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public While_commandContext while_command() {
			return getRuleContext(While_commandContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitIf(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(RESERVED_WORD_IF);
			setState(149);
			match(PARENTHESIS_OPEN);
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(150);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(151);
				logic_op();
				}
				break;
			}
			setState(154);
			match(PARENTHESIS_CLOSE);
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case RESERVED_WORD_RETURN:
			case IDENTIFIER:
				{
				setState(155);
				commands();
				}
				break;
			case RESERVED_WORD_IF:
				{
				setState(156);
				ifelse();
				}
				break;
			case RESERVED_WORD_WHILE:
				{
				setState(157);
				while_command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(160);
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
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode RESERVED_WORD_ELSE() { return getToken(SyntacticAnalyserParser.RESERVED_WORD_ELSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SyntacticAnalyserParser.SEMICOLON, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public While_commandContext while_command() {
			return getRuleContext(While_commandContext.class,0);
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
		enterRule(_localctx, 24, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(RESERVED_WORD_ELSE);
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case RESERVED_WORD_RETURN:
			case IDENTIFIER:
				{
				setState(163);
				commands();
				}
				break;
			case RESERVED_WORD_IF:
				{
				setState(164);
				ifelse();
				}
				break;
			case RESERVED_WORD_WHILE:
				{
				setState(165);
				while_command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(168);
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
	public static class IfelseContext extends ParserRuleContext {
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
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
		enterRule(_localctx, 26, RULE_ifelse);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				if_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				if_();
				setState(172);
				else_();
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
	public static class CommandsContext extends ParserRuleContext {
		public Attr_declarationContext attr_declaration() {
			return getRuleContext(Attr_declarationContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode RESERVED_WORD_RETURN() { return getToken(SyntacticAnalyserParser.RESERVED_WORD_RETURN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SyntacticAnalyserParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(SyntacticAnalyserParser.SEMICOLON, 0); }
		public Exp_twoContext exp_two() {
			return getRuleContext(Exp_twoContext.class,0);
		}
		public TerminalNode PARENTHESIS_OPEN() { return getToken(SyntacticAnalyserParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(SyntacticAnalyserParser.PARENTHESIS_CLOSE, 0); }
		public List<Exp_threeContext> exp_three() {
			return getRuleContexts(Exp_threeContext.class);
		}
		public Exp_threeContext exp_three(int i) {
			return getRuleContext(Exp_threeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SyntacticAnalyserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SyntacticAnalyserParser.COMMA, i);
		}
		public TerminalNode ATTRIBUITION_OPERATOR() { return getToken(SyntacticAnalyserParser.ATTRIBUITION_OPERATOR, 0); }
		public Logic_opContext logic_op() {
			return getRuleContext(Logic_opContext.class,0);
		}
		public Aritmetic_opContext aritmetic_op() {
			return getRuleContext(Aritmetic_opContext.class,0);
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
		enterRule(_localctx, 28, RULE_commands);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				attr_declaration();
				setState(177);
				commands();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				attr_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(RESERVED_WORD_RETURN);
				setState(181);
				match(IDENTIFIER);
				setState(182);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(RESERVED_WORD_RETURN);
				setState(184);
				exp_two();
				setState(185);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				match(IDENTIFIER);
				setState(188);
				match(PARENTHESIS_OPEN);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUMBER || _la==IDENTIFIER) {
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(189);
						exp_three();
						setState(190);
						match(COMMA);
						}
						break;
					case 2:
						{
						setState(192);
						exp_three();
						}
						break;
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				match(PARENTHESIS_CLOSE);
				setState(199);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				match(IDENTIFIER);
				setState(201);
				match(ATTRIBUITION_OPERATOR);
				setState(204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(202);
					logic_op();
					}
					break;
				case 2:
					{
					setState(203);
					aritmetic_op();
					}
					break;
				}
				setState(206);
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
	public static class Exp_threeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SyntacticAnalyserParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(SyntacticAnalyserParser.NUMBER, 0); }
		public Exp_threeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_three; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterExp_three(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitExp_three(this);
		}
	}

	public final Exp_threeContext exp_three() throws RecognitionException {
		Exp_threeContext _localctx = new Exp_threeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exp_three);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==IDENTIFIER) ) {
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
	public static class Aritmetic_opContext extends ParserRuleContext {
		public List<Exp_threeContext> exp_three() {
			return getRuleContexts(Exp_threeContext.class);
		}
		public Exp_threeContext exp_three(int i) {
			return getRuleContext(Exp_threeContext.class,i);
		}
		public TerminalNode ARITMETIC_OPERATOR() { return getToken(SyntacticAnalyserParser.ARITMETIC_OPERATOR, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(SyntacticAnalyserParser.PARENTHESIS_OPEN, 0); }
		public Aritmetic_opContext aritmetic_op() {
			return getRuleContext(Aritmetic_opContext.class,0);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(SyntacticAnalyserParser.PARENTHESIS_CLOSE, 0); }
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
		enterRule(_localctx, 32, RULE_aritmetic_op);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				exp_three();
				setState(213);
				match(ARITMETIC_OPERATOR);
				setState(214);
				exp_three();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				exp_three();
				setState(217);
				match(ARITMETIC_OPERATOR);
				setState(218);
				match(PARENTHESIS_OPEN);
				setState(219);
				aritmetic_op();
				setState(220);
				match(PARENTHESIS_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				exp_three();
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
	public static class Exp_fourContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SyntacticAnalyserParser.IDENTIFIER, 0); }
		public Boolean_constantsContext boolean_constants() {
			return getRuleContext(Boolean_constantsContext.class,0);
		}
		public Exp_fourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_four; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterExp_four(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitExp_four(this);
		}
	}

	public final Exp_fourContext exp_four() throws RecognitionException {
		Exp_fourContext _localctx = new Exp_fourContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp_four);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(IDENTIFIER);
				}
				break;
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				boolean_constants();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logic_opContext extends ParserRuleContext {
		public List<Exp_fourContext> exp_four() {
			return getRuleContexts(Exp_fourContext.class);
		}
		public Exp_fourContext exp_four(int i) {
			return getRuleContext(Exp_fourContext.class,i);
		}
		public TerminalNode LOGIC_OPERATOR() { return getToken(SyntacticAnalyserParser.LOGIC_OPERATOR, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(SyntacticAnalyserParser.PARENTHESIS_OPEN, 0); }
		public Logic_opContext logic_op() {
			return getRuleContext(Logic_opContext.class,0);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(SyntacticAnalyserParser.PARENTHESIS_CLOSE, 0); }
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public Logic_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterLogic_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitLogic_op(this);
		}
	}

	public final Logic_opContext logic_op() throws RecognitionException {
		Logic_opContext _localctx = new Logic_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logic_op);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				exp_four();
				setState(230);
				match(LOGIC_OPERATOR);
				setState(231);
				exp_four();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				exp_four();
				setState(234);
				match(LOGIC_OPERATOR);
				setState(235);
				match(PARENTHESIS_OPEN);
				setState(236);
				logic_op();
				setState(237);
				match(PARENTHESIS_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				relational_op();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				exp_four();
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
	public static class Relational_opContext extends ParserRuleContext {
		public List<Exp_threeContext> exp_three() {
			return getRuleContexts(Exp_threeContext.class);
		}
		public Exp_threeContext exp_three(int i) {
			return getRuleContext(Exp_threeContext.class,i);
		}
		public TerminalNode RELATIONAL_OPERATOR() { return getToken(SyntacticAnalyserParser.RELATIONAL_OPERATOR, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(SyntacticAnalyserParser.PARENTHESIS_OPEN, 0); }
		public Relational_opContext relational_op() {
			return getRuleContext(Relational_opContext.class,0);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(SyntacticAnalyserParser.PARENTHESIS_CLOSE, 0); }
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).enterRelational_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntacticAnalyserListener ) ((SyntacticAnalyserListener)listener).exitRelational_op(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relational_op);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				exp_three();
				setState(244);
				match(RELATIONAL_OPERATOR);
				setState(245);
				exp_three();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				exp_three();
				setState(248);
				match(RELATIONAL_OPERATOR);
				setState(249);
				match(PARENTHESIS_OPEN);
				setState(250);
				relational_op();
				setState(251);
				match(PARENTHESIS_CLOSE);
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
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SyntacticAnalyserParser.EOF, 0); }
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESERVED_WORD_CLASS:
				{
				setState(255);
				class_();
				}
				break;
			case RESERVED_WORD_VOID_TYPE:
				{
				setState(256);
				main_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(259);
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
		"\u0004\u0001\u0018\u0106\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u00038\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004?\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005L\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006S\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007^\b\u0007\n\u0007\f\u0007a\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\bn\b\b\n\b\f\bq\t\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t}\b\t\n\t\f"+
		"\t\u0080\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u0089\b\n\n\n\f\n\u008c\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0003\n\u0093\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0099\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u009f\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00a7\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00af\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00c2\b\u000e\n\u000e\f\u000e\u00c5\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00cd"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d1\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00e0\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00e4\b"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00f2\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00fe\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0102"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(\u0000\u0003\u0001\u0000\u0001\u0002\u0001\u0000\u0003\u0004\u0001"+
		"\u0000\u0013\u0014\u011c\u0000*\u0001\u0000\u0000\u0000\u0002.\u0001\u0000"+
		"\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000"+
		"\b>\u0001\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000\fR\u0001\u0000"+
		"\u0000\u0000\u000eT\u0001\u0000\u0000\u0000\u0010d\u0001\u0000\u0000\u0000"+
		"\u0012t\u0001\u0000\u0000\u0000\u0014\u0092\u0001\u0000\u0000\u0000\u0016"+
		"\u0094\u0001\u0000\u0000\u0000\u0018\u00a2\u0001\u0000\u0000\u0000\u001a"+
		"\u00ae\u0001\u0000\u0000\u0000\u001c\u00d0\u0001\u0000\u0000\u0000\u001e"+
		"\u00d2\u0001\u0000\u0000\u0000 \u00df\u0001\u0000\u0000\u0000\"\u00e3"+
		"\u0001\u0000\u0000\u0000$\u00f1\u0001\u0000\u0000\u0000&\u00fd\u0001\u0000"+
		"\u0000\u0000(\u0101\u0001\u0000\u0000\u0000*+\u0007\u0000\u0000\u0000"+
		"+\u0001\u0001\u0000\u0000\u0000,/\u0003\u0000\u0000\u0000-/\u0005\u0007"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/\u0003"+
		"\u0001\u0000\u0000\u000001\u0007\u0001\u0000\u00001\u0005\u0001\u0000"+
		"\u0000\u000028\u0003 \u0010\u000038\u0003$\u0012\u000048\u0003&\u0013"+
		"\u000058\u0003\u001e\u000f\u000068\u0003\"\u0011\u000072\u0001\u0000\u0000"+
		"\u000073\u0001\u0000\u0000\u000074\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000076\u0001\u0000\u0000\u00008\u0007\u0001\u0000\u0000\u0000"+
		"9:\u0005\u0015\u0000\u0000:;\u0003\u0006\u0003\u0000;<\u0005\u0012\u0000"+
		"\u0000<?\u0001\u0000\u0000\u0000=?\u0005\u0012\u0000\u0000>9\u0001\u0000"+
		"\u0000\u0000>=\u0001\u0000\u0000\u0000?\t\u0001\u0000\u0000\u0000@A\u0003"+
		"\u0000\u0000\u0000AB\u0005\u0014\u0000\u0000BC\u0003\b\u0004\u0000CL\u0001"+
		"\u0000\u0000\u0000DE\u0003\u0000\u0000\u0000EF\u0005\u0014\u0000\u0000"+
		"FG\u0005\u0012\u0000\u0000GL\u0001\u0000\u0000\u0000HI\u0003\u0000\u0000"+
		"\u0000IJ\u0005\u0014\u0000\u0000JL\u0001\u0000\u0000\u0000K@\u0001\u0000"+
		"\u0000\u0000KD\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000\u0000L\u000b"+
		"\u0001\u0000\u0000\u0000MN\u0003\n\u0005\u0000NO\u0005\u0011\u0000\u0000"+
		"OP\u0003\f\u0006\u0000PS\u0001\u0000\u0000\u0000QS\u0003\n\u0005\u0000"+
		"RM\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S\r\u0001\u0000\u0000"+
		"\u0000TU\u0005\u0007\u0000\u0000UV\u0005\u0006\u0000\u0000VW\u0005\r\u0000"+
		"\u0000WX\u0005\u000e\u0000\u0000X_\u0005\u000f\u0000\u0000Y^\u0003\u0010"+
		"\b\u0000Z^\u0003\u001c\u000e\u0000[^\u0003\u001a\r\u0000\\^\u0003\u0012"+
		"\t\u0000]Y\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000bc\u0005\u0010\u0000\u0000c\u000f\u0001\u0000"+
		"\u0000\u0000de\u0003\u0002\u0001\u0000ef\u0005\u0014\u0000\u0000fg\u0005"+
		"\r\u0000\u0000gh\u0003\f\u0006\u0000hi\u0005\u000e\u0000\u0000io\u0005"+
		"\u000f\u0000\u0000jn\u0003\u001c\u000e\u0000kn\u0003\u001a\r\u0000ln\u0003"+
		"\u0012\t\u0000mj\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000rs\u0005\u0010\u0000\u0000s\u0011\u0001\u0000\u0000\u0000tu\u0005"+
		"\f\u0000\u0000uv\u0005\r\u0000\u0000vw\u0003$\u0012\u0000wx\u0005\u000e"+
		"\u0000\u0000x~\u0005\u000f\u0000\u0000y}\u0003\u001c\u000e\u0000z}\u0003"+
		"\u001a\r\u0000{}\u0003\u0012\t\u0000|y\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005\u0010\u0000\u0000\u0082\u0013\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005\b\u0000\u0000\u0084\u0085\u0005\u0014\u0000\u0000\u0085\u008a\u0005"+
		"\u000f\u0000\u0000\u0086\u0089\u0003\n\u0005\u0000\u0087\u0089\u0003\u0010"+
		"\b\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0093\u0005\u0010\u0000"+
		"\u0000\u008e\u008f\u0005\b\u0000\u0000\u008f\u0090\u0005\u0014\u0000\u0000"+
		"\u0090\u0091\u0005\u000f\u0000\u0000\u0091\u0093\u0005\u0010\u0000\u0000"+
		"\u0092\u0083\u0001\u0000\u0000\u0000\u0092\u008e\u0001\u0000\u0000\u0000"+
		"\u0093\u0015\u0001\u0000\u0000\u0000\u0094\u0095\u0005\n\u0000\u0000\u0095"+
		"\u0098\u0005\r\u0000\u0000\u0096\u0099\u0005\u0014\u0000\u0000\u0097\u0099"+
		"\u0003$\u0012\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009e\u0005"+
		"\u000e\u0000\u0000\u009b\u009f\u0003\u001c\u000e\u0000\u009c\u009f\u0003"+
		"\u001a\r\u0000\u009d\u009f\u0003\u0012\t\u0000\u009e\u009b\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0012"+
		"\u0000\u0000\u00a1\u0017\u0001\u0000\u0000\u0000\u00a2\u00a6\u0005\u000b"+
		"\u0000\u0000\u00a3\u00a7\u0003\u001c\u000e\u0000\u00a4\u00a7\u0003\u001a"+
		"\r\u0000\u00a5\u00a7\u0003\u0012\t\u0000\u00a6\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0012\u0000"+
		"\u0000\u00a9\u0019\u0001\u0000\u0000\u0000\u00aa\u00af\u0003\u0016\u000b"+
		"\u0000\u00ab\u00ac\u0003\u0016\u000b\u0000\u00ac\u00ad\u0003\u0018\f\u0000"+
		"\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ae\u00ab\u0001\u0000\u0000\u0000\u00af\u001b\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0003\n\u0005\u0000\u00b1\u00b2\u0003\u001c\u000e\u0000\u00b2"+
		"\u00d1\u0001\u0000\u0000\u0000\u00b3\u00d1\u0003\n\u0005\u0000\u00b4\u00b5"+
		"\u0005\t\u0000\u0000\u00b5\u00b6\u0005\u0014\u0000\u0000\u00b6\u00d1\u0005"+
		"\u0012\u0000\u0000\u00b7\u00b8\u0005\t\u0000\u0000\u00b8\u00b9\u0003\u0006"+
		"\u0003\u0000\u00b9\u00ba\u0005\u0012\u0000\u0000\u00ba\u00d1\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0005\u0014\u0000\u0000\u00bc\u00c3\u0005\r\u0000"+
		"\u0000\u00bd\u00be\u0003\u001e\u000f\u0000\u00be\u00bf\u0005\u0011\u0000"+
		"\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00c2\u0003\u001e\u000f"+
		"\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u000e\u0000"+
		"\u0000\u00c7\u00d1\u0005\u0012\u0000\u0000\u00c8\u00c9\u0005\u0014\u0000"+
		"\u0000\u00c9\u00cc\u0005\u0015\u0000\u0000\u00ca\u00cd\u0003$\u0012\u0000"+
		"\u00cb\u00cd\u0003 \u0010\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0005\u0012\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0"+
		"\u00b0\u0001\u0000\u0000\u0000\u00d0\u00b3\u0001\u0000\u0000\u0000\u00d0"+
		"\u00b4\u0001\u0000\u0000\u0000\u00d0\u00b7\u0001\u0000\u0000\u0000\u00d0"+
		"\u00bb\u0001\u0000\u0000\u0000\u00d0\u00c8\u0001\u0000\u0000\u0000\u00d1"+
		"\u001d\u0001\u0000\u0000\u0000\u00d2\u00d3\u0007\u0002\u0000\u0000\u00d3"+
		"\u001f\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003\u001e\u000f\u0000\u00d5"+
		"\u00d6\u0005\u0017\u0000\u0000\u00d6\u00d7\u0003\u001e\u000f\u0000\u00d7"+
		"\u00e0\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003\u001e\u000f\u0000\u00d9"+
		"\u00da\u0005\u0017\u0000\u0000\u00da\u00db\u0005\r\u0000\u0000\u00db\u00dc"+
		"\u0003 \u0010\u0000\u00dc\u00dd\u0005\u000e\u0000\u0000\u00dd\u00e0\u0001"+
		"\u0000\u0000\u0000\u00de\u00e0\u0003\u001e\u000f\u0000\u00df\u00d4\u0001"+
		"\u0000\u0000\u0000\u00df\u00d8\u0001\u0000\u0000\u0000\u00df\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0!\u0001\u0000\u0000\u0000\u00e1\u00e4\u0005\u0014"+
		"\u0000\u0000\u00e2\u00e4\u0003\u0004\u0002\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4#\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0003\"\u0011\u0000\u00e6\u00e7\u0005\u0016\u0000\u0000"+
		"\u00e7\u00e8\u0003\"\u0011\u0000\u00e8\u00f2\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0003\"\u0011\u0000\u00ea\u00eb\u0005\u0016\u0000\u0000\u00eb\u00ec"+
		"\u0005\r\u0000\u0000\u00ec\u00ed\u0003$\u0012\u0000\u00ed\u00ee\u0005"+
		"\u000e\u0000\u0000\u00ee\u00f2\u0001\u0000\u0000\u0000\u00ef\u00f2\u0003"+
		"&\u0013\u0000\u00f0\u00f2\u0003\"\u0011\u0000\u00f1\u00e5\u0001\u0000"+
		"\u0000\u0000\u00f1\u00e9\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2%\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0003\u001e\u000f\u0000\u00f4\u00f5\u0005\u0018\u0000"+
		"\u0000\u00f5\u00f6\u0003\u001e\u000f\u0000\u00f6\u00fe\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0003\u001e\u000f\u0000\u00f8\u00f9\u0005\u0018\u0000"+
		"\u0000\u00f9\u00fa\u0005\r\u0000\u0000\u00fa\u00fb\u0003&\u0013\u0000"+
		"\u00fb\u00fc\u0005\u000e\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fd\u00f3\u0001\u0000\u0000\u0000\u00fd\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fe\'\u0001\u0000\u0000\u0000\u00ff\u0102\u0003\u0014\n\u0000\u0100"+
		"\u0102\u0003\u000e\u0007\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0005\u0000\u0000\u0001\u0104)\u0001\u0000\u0000\u0000\u001b.7"+
		">KR]_mo|~\u0088\u008a\u0092\u0098\u009e\u00a6\u00ae\u00c1\u00c3\u00cc"+
		"\u00d0\u00df\u00e3\u00f1\u00fd\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}