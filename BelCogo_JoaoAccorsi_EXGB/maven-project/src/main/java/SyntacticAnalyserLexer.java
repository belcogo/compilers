// Generated from SyntacticAnalyser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SyntacticAnalyserLexer extends Lexer {
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
	public static String[] channelNames = {
			"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
			"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
				"MAIN", "VOID", "CLASS", "RETURN", "IF", "ELSE", "WHILE", "PARENTHESIS_OPEN",
				"PARENTHESIS_CLOSE", "CURLY_BRACES_OPEN", "CURLY_BRACES_CLOSE", "COMMA",
				"SEMICOLON", "BOOL", "INT", "AND", "OR", "NOT", "PLUS", "MULTIPLY", "ATTRIBUITION_OPERATOR",
				"LESS_TAN", "GREATER_THAN", "EQUALS", "NUMBER", "TRUE", "FALSE", "IDENTIFIER",
				"NEWLINE"
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


	public SyntacticAnalyserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SyntacticAnalyser.g4"; }

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
			"\u0004\u0000\u001d\u00ab\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
					"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
					"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
					"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
					"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
					"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
					"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
					"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
					"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
					"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
					"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
					"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
					"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
					"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
					"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
					"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
					"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
					"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
					"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
					"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
					"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
					"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0004\u0018\u008f"+
					"\b\u0018\u000b\u0018\f\u0018\u0090\u0001\u0019\u0001\u0019\u0001\u0019"+
					"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
					"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u00a0\b\u001b"+
					"\n\u001b\f\u001b\u00a3\t\u001b\u0001\u001c\u0004\u001c\u00a6\b\u001c\u000b"+
					"\u001c\f\u001c\u00a7\u0001\u001c\u0001\u001c\u0000\u0000\u001d\u0001\u0001"+
					"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
					"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
					"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
					"1\u00193\u001a5\u001b7\u001c9\u001d\u0001\u0000\u0004\u0001\u000009\u0003"+
					"\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u00ad\u0000\u0001"+
					"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
					"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
					"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
					"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
					"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
					"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
					"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
					"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
					"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
					"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
					"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
					"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
					"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
					"\u0000\u0000\u0000\u0001;\u0001\u0000\u0000\u0000\u0003@\u0001\u0000\u0000"+
					"\u0000\u0005E\u0001\u0000\u0000\u0000\u0007K\u0001\u0000\u0000\u0000\t"+
					"R\u0001\u0000\u0000\u0000\u000bU\u0001\u0000\u0000\u0000\rZ\u0001\u0000"+
					"\u0000\u0000\u000f`\u0001\u0000\u0000\u0000\u0011b\u0001\u0000\u0000\u0000"+
					"\u0013d\u0001\u0000\u0000\u0000\u0015f\u0001\u0000\u0000\u0000\u0017h"+
					"\u0001\u0000\u0000\u0000\u0019j\u0001\u0000\u0000\u0000\u001bl\u0001\u0000"+
					"\u0000\u0000\u001dq\u0001\u0000\u0000\u0000\u001fu\u0001\u0000\u0000\u0000"+
					"!y\u0001\u0000\u0000\u0000#|\u0001\u0000\u0000\u0000%\u0080\u0001\u0000"+
					"\u0000\u0000\'\u0082\u0001\u0000\u0000\u0000)\u0084\u0001\u0000\u0000"+
					"\u0000+\u0086\u0001\u0000\u0000\u0000-\u0088\u0001\u0000\u0000\u0000/"+
					"\u008a\u0001\u0000\u0000\u00001\u008e\u0001\u0000\u0000\u00003\u0092\u0001"+
					"\u0000\u0000\u00005\u0097\u0001\u0000\u0000\u00007\u009d\u0001\u0000\u0000"+
					"\u00009\u00a5\u0001\u0000\u0000\u0000;<\u0005m\u0000\u0000<=\u0005a\u0000"+
					"\u0000=>\u0005i\u0000\u0000>?\u0005n\u0000\u0000?\u0002\u0001\u0000\u0000"+
					"\u0000@A\u0005v\u0000\u0000AB\u0005o\u0000\u0000BC\u0005i\u0000\u0000"+
					"CD\u0005d\u0000\u0000D\u0004\u0001\u0000\u0000\u0000EF\u0005c\u0000\u0000"+
					"FG\u0005l\u0000\u0000GH\u0005a\u0000\u0000HI\u0005s\u0000\u0000IJ\u0005"+
					"s\u0000\u0000J\u0006\u0001\u0000\u0000\u0000KL\u0005r\u0000\u0000LM\u0005"+
					"e\u0000\u0000MN\u0005t\u0000\u0000NO\u0005u\u0000\u0000OP\u0005r\u0000"+
					"\u0000PQ\u0005n\u0000\u0000Q\b\u0001\u0000\u0000\u0000RS\u0005i\u0000"+
					"\u0000ST\u0005f\u0000\u0000T\n\u0001\u0000\u0000\u0000UV\u0005e\u0000"+
					"\u0000VW\u0005l\u0000\u0000WX\u0005s\u0000\u0000XY\u0005e\u0000\u0000"+
					"Y\f\u0001\u0000\u0000\u0000Z[\u0005w\u0000\u0000[\\\u0005h\u0000\u0000"+
					"\\]\u0005i\u0000\u0000]^\u0005l\u0000\u0000^_\u0005e\u0000\u0000_\u000e"+
					"\u0001\u0000\u0000\u0000`a\u0005(\u0000\u0000a\u0010\u0001\u0000\u0000"+
					"\u0000bc\u0005)\u0000\u0000c\u0012\u0001\u0000\u0000\u0000de\u0005{\u0000"+
					"\u0000e\u0014\u0001\u0000\u0000\u0000fg\u0005}\u0000\u0000g\u0016\u0001"+
					"\u0000\u0000\u0000hi\u0005,\u0000\u0000i\u0018\u0001\u0000\u0000\u0000"+
					"jk\u0005;\u0000\u0000k\u001a\u0001\u0000\u0000\u0000lm\u0005b\u0000\u0000"+
					"mn\u0005o\u0000\u0000no\u0005o\u0000\u0000op\u0005l\u0000\u0000p\u001c"+
					"\u0001\u0000\u0000\u0000qr\u0005i\u0000\u0000rs\u0005n\u0000\u0000st\u0005"+
					"t\u0000\u0000t\u001e\u0001\u0000\u0000\u0000uv\u0005a\u0000\u0000vw\u0005"+
					"n\u0000\u0000wx\u0005d\u0000\u0000x \u0001\u0000\u0000\u0000yz\u0005o"+
					"\u0000\u0000z{\u0005r\u0000\u0000{\"\u0001\u0000\u0000\u0000|}\u0005n"+
					"\u0000\u0000}~\u0005o\u0000\u0000~\u007f\u0005t\u0000\u0000\u007f$\u0001"+
					"\u0000\u0000\u0000\u0080\u0081\u0005+\u0000\u0000\u0081&\u0001\u0000\u0000"+
					"\u0000\u0082\u0083\u0005*\u0000\u0000\u0083(\u0001\u0000\u0000\u0000\u0084"+
					"\u0085\u0005=\u0000\u0000\u0085*\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
					"<\u0000\u0000\u0087,\u0001\u0000\u0000\u0000\u0088\u0089\u0005>\u0000"+
					"\u0000\u0089.\u0001\u0000\u0000\u0000\u008a\u008b\u0005=\u0000\u0000\u008b"+
					"\u008c\u0005=\u0000\u0000\u008c0\u0001\u0000\u0000\u0000\u008d\u008f\u0007"+
					"\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
					"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
					"\u0000\u0000\u0000\u00912\u0001\u0000\u0000\u0000\u0092\u0093\u0005T\u0000"+
					"\u0000\u0093\u0094\u0005r\u0000\u0000\u0094\u0095\u0005u\u0000\u0000\u0095"+
					"\u0096\u0005e\u0000\u0000\u00964\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
					"F\u0000\u0000\u0098\u0099\u0005a\u0000\u0000\u0099\u009a\u0005l\u0000"+
					"\u0000\u009a\u009b\u0005s\u0000\u0000\u009b\u009c\u0005e\u0000\u0000\u009c"+
					"6\u0001\u0000\u0000\u0000\u009d\u00a1\u0007\u0001\u0000\u0000\u009e\u00a0"+
					"\u0007\u0002\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3"+
					"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2"+
					"\u0001\u0000\u0000\u0000\u00a28\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001"+
					"\u0000\u0000\u0000\u00a4\u00a6\u0007\u0003\u0000\u0000\u00a5\u00a4\u0001"+
					"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
					"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
					"\u0000\u0000\u0000\u00a9\u00aa\u0006\u001c\u0000\u0000\u00aa:\u0001\u0000"+
					"\u0000\u0000\u0004\u0000\u0090\u00a1\u00a7\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}