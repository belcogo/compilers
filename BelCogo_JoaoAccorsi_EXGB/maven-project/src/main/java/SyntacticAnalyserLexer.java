// Generated from SyntacticAnalyser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SyntacticAnalyserLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "NEWLINE", "RESERVED_WORD_MAIN", "RESERVED_WORD_VOID_TYPE", 
			"RESERVED_WORD_CLASS", "RESERVED_WORD_RETURN", "RESERVED_WORD_IF", "RESERVED_WORD_ELSE", 
			"RESERVED_WORD_WHILE", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE", "CURLY_BRACES_OPEN", 
			"CURLY_BRACES_CLOSE", "COMMA", "SEMICOLON", "NUMBER", "IDENTIFIER", "ATTRIBUITION_OPERATOR", 
			"LOGIC_OPERATOR", "ARITMETIC_OPERATOR", "RELATIONAL_OPERATOR"
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
		"\u0004\u0000\u0018\u009c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004G\b\u0004\u000b\u0004"+
		"\f\u0004H\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012\u007f"+
		"\b\u0012\u000b\u0012\f\u0012\u0080\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u0085\b\u0013\n\u0013\f\u0013\u0088\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0094\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u009b\b\u0017\u0000\u0000\u0018"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u0018\u0001\u0000\u0005\u0003\u0000\t\n\r\r  \u0001\u000009\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0002\u0000<<>>\u00a1\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0001"+
		"1\u0001\u0000\u0000\u0000\u00036\u0001\u0000\u0000\u0000\u0005:\u0001"+
		"\u0000\u0000\u0000\u0007?\u0001\u0000\u0000\u0000\tF\u0001\u0000\u0000"+
		"\u0000\u000bL\u0001\u0000\u0000\u0000\rQ\u0001\u0000\u0000\u0000\u000f"+
		"V\u0001\u0000\u0000\u0000\u0011\\\u0001\u0000\u0000\u0000\u0013c\u0001"+
		"\u0000\u0000\u0000\u0015f\u0001\u0000\u0000\u0000\u0017k\u0001\u0000\u0000"+
		"\u0000\u0019q\u0001\u0000\u0000\u0000\u001bs\u0001\u0000\u0000\u0000\u001d"+
		"u\u0001\u0000\u0000\u0000\u001fw\u0001\u0000\u0000\u0000!y\u0001\u0000"+
		"\u0000\u0000#{\u0001\u0000\u0000\u0000%~\u0001\u0000\u0000\u0000\'\u0082"+
		"\u0001\u0000\u0000\u0000)\u0089\u0001\u0000\u0000\u0000+\u0093\u0001\u0000"+
		"\u0000\u0000-\u0095\u0001\u0000\u0000\u0000/\u009a\u0001\u0000\u0000\u0000"+
		"12\u0005b\u0000\u000023\u0005o\u0000\u000034\u0005o\u0000\u000045\u0005"+
		"l\u0000\u00005\u0002\u0001\u0000\u0000\u000067\u0005i\u0000\u000078\u0005"+
		"n\u0000\u000089\u0005t\u0000\u00009\u0004\u0001\u0000\u0000\u0000:;\u0005"+
		"T\u0000\u0000;<\u0005r\u0000\u0000<=\u0005u\u0000\u0000=>\u0005e\u0000"+
		"\u0000>\u0006\u0001\u0000\u0000\u0000?@\u0005F\u0000\u0000@A\u0005a\u0000"+
		"\u0000AB\u0005l\u0000\u0000BC\u0005s\u0000\u0000CD\u0005e\u0000\u0000"+
		"D\b\u0001\u0000\u0000\u0000EG\u0007\u0000\u0000\u0000FE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0006\u0004\u0000\u0000K\n\u0001"+
		"\u0000\u0000\u0000LM\u0005m\u0000\u0000MN\u0005a\u0000\u0000NO\u0005i"+
		"\u0000\u0000OP\u0005n\u0000\u0000P\f\u0001\u0000\u0000\u0000QR\u0005v"+
		"\u0000\u0000RS\u0005o\u0000\u0000ST\u0005i\u0000\u0000TU\u0005d\u0000"+
		"\u0000U\u000e\u0001\u0000\u0000\u0000VW\u0005c\u0000\u0000WX\u0005l\u0000"+
		"\u0000XY\u0005a\u0000\u0000YZ\u0005s\u0000\u0000Z[\u0005s\u0000\u0000"+
		"[\u0010\u0001\u0000\u0000\u0000\\]\u0005r\u0000\u0000]^\u0005e\u0000\u0000"+
		"^_\u0005t\u0000\u0000_`\u0005u\u0000\u0000`a\u0005r\u0000\u0000ab\u0005"+
		"n\u0000\u0000b\u0012\u0001\u0000\u0000\u0000cd\u0005i\u0000\u0000de\u0005"+
		"f\u0000\u0000e\u0014\u0001\u0000\u0000\u0000fg\u0005e\u0000\u0000gh\u0005"+
		"l\u0000\u0000hi\u0005s\u0000\u0000ij\u0005e\u0000\u0000j\u0016\u0001\u0000"+
		"\u0000\u0000kl\u0005w\u0000\u0000lm\u0005h\u0000\u0000mn\u0005i\u0000"+
		"\u0000no\u0005l\u0000\u0000op\u0005e\u0000\u0000p\u0018\u0001\u0000\u0000"+
		"\u0000qr\u0005(\u0000\u0000r\u001a\u0001\u0000\u0000\u0000st\u0005)\u0000"+
		"\u0000t\u001c\u0001\u0000\u0000\u0000uv\u0005{\u0000\u0000v\u001e\u0001"+
		"\u0000\u0000\u0000wx\u0005}\u0000\u0000x \u0001\u0000\u0000\u0000yz\u0005"+
		",\u0000\u0000z\"\u0001\u0000\u0000\u0000{|\u0005;\u0000\u0000|$\u0001"+
		"\u0000\u0000\u0000}\u007f\u0007\u0001\u0000\u0000~}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081&\u0001\u0000\u0000\u0000\u0082"+
		"\u0086\u0007\u0002\u0000\u0000\u0083\u0085\u0007\u0003\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"(\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005=\u0000\u0000\u008a*\u0001\u0000\u0000\u0000\u008b\u008c\u0005n"+
		"\u0000\u0000\u008c\u008d\u0005o\u0000\u0000\u008d\u0094\u0005t\u0000\u0000"+
		"\u008e\u008f\u0005a\u0000\u0000\u008f\u0090\u0005n\u0000\u0000\u0090\u0094"+
		"\u0005d\u0000\u0000\u0091\u0092\u0005o\u0000\u0000\u0092\u0094\u0005r"+
		"\u0000\u0000\u0093\u008b\u0001\u0000\u0000\u0000\u0093\u008e\u0001\u0000"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094,\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0002*+\u0000\u0096.\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005=\u0000\u0000\u0098\u009b\u0005=\u0000\u0000\u0099\u009b\u0007"+
		"\u0004\u0000\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009a\u0099\u0001"+
		"\u0000\u0000\u0000\u009b0\u0001\u0000\u0000\u0000\u0006\u0000H\u0080\u0086"+
		"\u0093\u009a\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}