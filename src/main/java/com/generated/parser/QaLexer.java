// Generated from Qa.g4 by ANTLR 4.8

    package com.generated.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, DD=85, MM=86, YYYY=87, WORD=88, 
		INT=89, WS=90;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
			"T__65", "T__66", "T__67", "T__68", "T__69", "T__70", "T__71", "T__72", 
			"T__73", "T__74", "T__75", "T__76", "T__77", "T__78", "T__79", "T__80", 
			"T__81", "T__82", "T__83", "DD", "MM", "YYYY", "WORD", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'?_.'", "'what'", "'_WP'", "'how'", "'_WRB'", "'who'", "'when'", 
			"'where'", "',_,'", "'and_CC'", "'_NN'", "'_PRP'", "'_NNS'", "'_NNP'", 
			"'_NNPS'", "'quantity'", "'amount'", "'total'", "'_JJ'", "'numbre'", 
			"'volume'", "'ration'", "'percentage'", "'degree'", "'for'", "'_IN'", 
			"'during'", "'in'", "'at'", "'since'", "'while'", "'according'", "'_VBG'", 
			"'time'", "'year'", "'mounth'", "'day'", "'season'", "'hour'", "'minute'", 
			"'seconde'", "'city'", "'/'", "'_CD'", "'-'", "'equal'", "'more'", "'_RBR'", 
			"'then'", "'_RB'", "'less'", "'_JJR'", "'with'", "'this'", "'_DT'", "'between'", 
			"'of'", "'_WDT'", "'_WP$'", "'_RBS'", "'a'", "'the'", "'jan'", "'feb'", 
			"'mar'", "'_FW'", "'apr'", "'may'", "'_MD'", "'jun'", "'jul'", "'aug'", 
			"'sep'", "'oct'", "'nov'", "'dec'", "'_JJS'", "'_POS'", "'_EX'", "'_VBN'", 
			"'_VB'", "'_VBD'", "'_VBP'", "'_VBZ'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "DD", "MM", "YYYY", "WORD", "INT", "WS"
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


	public QaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Qa.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\\\u0288\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3,\3,\3-\3-\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39\39\39\39\39\3:\3"+
		":\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3?\3?\3?\3?\3"+
		"@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3"+
		"E\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3"+
		"K\3K\3L\3L\3L\3L\3M\3M\3M\3M\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\3"+
		"P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3U\3U\3U\3"+
		"U\3U\3V\3V\3V\3V\5V\u0262\nV\3W\3W\3W\3W\5W\u0268\nW\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\3X\3X\3X\3X\5X\u0276\nX\3Y\6Y\u0279\nY\rY\16Y\u027a\3Z\6Z\u027e"+
		"\nZ\rZ\16Z\u027f\3[\6[\u0283\n[\r[\16[\u0284\3[\3[\2\2\\\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5"+
		"T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\3\2\r\3\2\62"+
		"\64\3\2\63;\3\2\65\65\3\2\62\63\3\2\62\62\3\2\63\63\3\2;;\3\2\62;\3\2"+
		"\64\64\4\2C\\c|\5\2\13\f\17\17\"\"\2\u028e\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5"+
		"\3\2\2\2\3\u00b7\3\2\2\2\5\u00bb\3\2\2\2\7\u00c0\3\2\2\2\t\u00c4\3\2\2"+
		"\2\13\u00c8\3\2\2\2\r\u00cd\3\2\2\2\17\u00d1\3\2\2\2\21\u00d6\3\2\2\2"+
		"\23\u00dc\3\2\2\2\25\u00e0\3\2\2\2\27\u00e7\3\2\2\2\31\u00eb\3\2\2\2\33"+
		"\u00f0\3\2\2\2\35\u00f5\3\2\2\2\37\u00fa\3\2\2\2!\u0100\3\2\2\2#\u0109"+
		"\3\2\2\2%\u0110\3\2\2\2\'\u0116\3\2\2\2)\u011a\3\2\2\2+\u0121\3\2\2\2"+
		"-\u0128\3\2\2\2/\u012f\3\2\2\2\61\u013a\3\2\2\2\63\u0141\3\2\2\2\65\u0145"+
		"\3\2\2\2\67\u0149\3\2\2\29\u0150\3\2\2\2;\u0153\3\2\2\2=\u0156\3\2\2\2"+
		"?\u015c\3\2\2\2A\u0162\3\2\2\2C\u016c\3\2\2\2E\u0171\3\2\2\2G\u0176\3"+
		"\2\2\2I\u017b\3\2\2\2K\u0182\3\2\2\2M\u0186\3\2\2\2O\u018d\3\2\2\2Q\u0192"+
		"\3\2\2\2S\u0199\3\2\2\2U\u01a1\3\2\2\2W\u01a6\3\2\2\2Y\u01a8\3\2\2\2["+
		"\u01ac\3\2\2\2]\u01ae\3\2\2\2_\u01b4\3\2\2\2a\u01b9\3\2\2\2c\u01be\3\2"+
		"\2\2e\u01c3\3\2\2\2g\u01c7\3\2\2\2i\u01cc\3\2\2\2k\u01d1\3\2\2\2m\u01d6"+
		"\3\2\2\2o\u01db\3\2\2\2q\u01df\3\2\2\2s\u01e7\3\2\2\2u\u01ea\3\2\2\2w"+
		"\u01ef\3\2\2\2y\u01f4\3\2\2\2{\u01f9\3\2\2\2}\u01fb\3\2\2\2\177\u01ff"+
		"\3\2\2\2\u0081\u0203\3\2\2\2\u0083\u0207\3\2\2\2\u0085\u020b\3\2\2\2\u0087"+
		"\u020f\3\2\2\2\u0089\u0213\3\2\2\2\u008b\u0217\3\2\2\2\u008d\u021b\3\2"+
		"\2\2\u008f\u021f\3\2\2\2\u0091\u0223\3\2\2\2\u0093\u0227\3\2\2\2\u0095"+
		"\u022b\3\2\2\2\u0097\u022f\3\2\2\2\u0099\u0233\3\2\2\2\u009b\u0237\3\2"+
		"\2\2\u009d\u023c\3\2\2\2\u009f\u0241\3\2\2\2\u00a1\u0245\3\2\2\2\u00a3"+
		"\u024a\3\2\2\2\u00a5\u024e\3\2\2\2\u00a7\u0253\3\2\2\2\u00a9\u0258\3\2"+
		"\2\2\u00ab\u0261\3\2\2\2\u00ad\u0267\3\2\2\2\u00af\u0275\3\2\2\2\u00b1"+
		"\u0278\3\2\2\2\u00b3\u027d\3\2\2\2\u00b5\u0282\3\2\2\2\u00b7\u00b8\7A"+
		"\2\2\u00b8\u00b9\7a\2\2\u00b9\u00ba\7\60\2\2\u00ba\4\3\2\2\2\u00bb\u00bc"+
		"\7y\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7v\2\2\u00bf"+
		"\6\3\2\2\2\u00c0\u00c1\7a\2\2\u00c1\u00c2\7Y\2\2\u00c2\u00c3\7R\2\2\u00c3"+
		"\b\3\2\2\2\u00c4\u00c5\7j\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7y\2\2\u00c7"+
		"\n\3\2\2\2\u00c8\u00c9\7a\2\2\u00c9\u00ca\7Y\2\2\u00ca\u00cb\7T\2\2\u00cb"+
		"\u00cc\7D\2\2\u00cc\f\3\2\2\2\u00cd\u00ce\7y\2\2\u00ce\u00cf\7j\2\2\u00cf"+
		"\u00d0\7q\2\2\u00d0\16\3\2\2\2\u00d1\u00d2\7y\2\2\u00d2\u00d3\7j\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\u00d5\7p\2\2\u00d5\20\3\2\2\2\u00d6\u00d7\7y\2\2\u00d7"+
		"\u00d8\7j\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7g\2\2"+
		"\u00db\22\3\2\2\2\u00dc\u00dd\7.\2\2\u00dd\u00de\7a\2\2\u00de\u00df\7"+
		".\2\2\u00df\24\3\2\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3"+
		"\7f\2\2\u00e3\u00e4\7a\2\2\u00e4\u00e5\7E\2\2\u00e5\u00e6\7E\2\2\u00e6"+
		"\26\3\2\2\2\u00e7\u00e8\7a\2\2\u00e8\u00e9\7P\2\2\u00e9\u00ea\7P\2\2\u00ea"+
		"\30\3\2\2\2\u00eb\u00ec\7a\2\2\u00ec\u00ed\7R\2\2\u00ed\u00ee\7T\2\2\u00ee"+
		"\u00ef\7R\2\2\u00ef\32\3\2\2\2\u00f0\u00f1\7a\2\2\u00f1\u00f2\7P\2\2\u00f2"+
		"\u00f3\7P\2\2\u00f3\u00f4\7U\2\2\u00f4\34\3\2\2\2\u00f5\u00f6\7a\2\2\u00f6"+
		"\u00f7\7P\2\2\u00f7\u00f8\7P\2\2\u00f8\u00f9\7R\2\2\u00f9\36\3\2\2\2\u00fa"+
		"\u00fb\7a\2\2\u00fb\u00fc\7P\2\2\u00fc\u00fd\7P\2\2\u00fd\u00fe\7R\2\2"+
		"\u00fe\u00ff\7U\2\2\u00ff \3\2\2\2\u0100\u0101\7s\2\2\u0101\u0102\7w\2"+
		"\2\u0102\u0103\7c\2\2\u0103\u0104\7p\2\2\u0104\u0105\7v\2\2\u0105\u0106"+
		"\7k\2\2\u0106\u0107\7v\2\2\u0107\u0108\7{\2\2\u0108\"\3\2\2\2\u0109\u010a"+
		"\7c\2\2\u010a\u010b\7o\2\2\u010b\u010c\7q\2\2\u010c\u010d\7w\2\2\u010d"+
		"\u010e\7p\2\2\u010e\u010f\7v\2\2\u010f$\3\2\2\2\u0110\u0111\7v\2\2\u0111"+
		"\u0112\7q\2\2\u0112\u0113\7v\2\2\u0113\u0114\7c\2\2\u0114\u0115\7n\2\2"+
		"\u0115&\3\2\2\2\u0116\u0117\7a\2\2\u0117\u0118\7L\2\2\u0118\u0119\7L\2"+
		"\2\u0119(\3\2\2\2\u011a\u011b\7p\2\2\u011b\u011c\7w\2\2\u011c\u011d\7"+
		"o\2\2\u011d\u011e\7d\2\2\u011e\u011f\7t\2\2\u011f\u0120\7g\2\2\u0120*"+
		"\3\2\2\2\u0121\u0122\7x\2\2\u0122\u0123\7q\2\2\u0123\u0124\7n\2\2\u0124"+
		"\u0125\7w\2\2\u0125\u0126\7o\2\2\u0126\u0127\7g\2\2\u0127,\3\2\2\2\u0128"+
		"\u0129\7t\2\2\u0129\u012a\7c\2\2\u012a\u012b\7v\2\2\u012b\u012c\7k\2\2"+
		"\u012c\u012d\7q\2\2\u012d\u012e\7p\2\2\u012e.\3\2\2\2\u012f\u0130\7r\2"+
		"\2\u0130\u0131\7g\2\2\u0131\u0132\7t\2\2\u0132\u0133\7e\2\2\u0133\u0134"+
		"\7g\2\2\u0134\u0135\7p\2\2\u0135\u0136\7v\2\2\u0136\u0137\7c\2\2\u0137"+
		"\u0138\7i\2\2\u0138\u0139\7g\2\2\u0139\60\3\2\2\2\u013a\u013b\7f\2\2\u013b"+
		"\u013c\7g\2\2\u013c\u013d\7i\2\2\u013d\u013e\7t\2\2\u013e\u013f\7g\2\2"+
		"\u013f\u0140\7g\2\2\u0140\62\3\2\2\2\u0141\u0142\7h\2\2\u0142\u0143\7"+
		"q\2\2\u0143\u0144\7t\2\2\u0144\64\3\2\2\2\u0145\u0146\7a\2\2\u0146\u0147"+
		"\7K\2\2\u0147\u0148\7P\2\2\u0148\66\3\2\2\2\u0149\u014a\7f\2\2\u014a\u014b"+
		"\7w\2\2\u014b\u014c\7t\2\2\u014c\u014d\7k\2\2\u014d\u014e\7p\2\2\u014e"+
		"\u014f\7i\2\2\u014f8\3\2\2\2\u0150\u0151\7k\2\2\u0151\u0152\7p\2\2\u0152"+
		":\3\2\2\2\u0153\u0154\7c\2\2\u0154\u0155\7v\2\2\u0155<\3\2\2\2\u0156\u0157"+
		"\7u\2\2\u0157\u0158\7k\2\2\u0158\u0159\7p\2\2\u0159\u015a\7e\2\2\u015a"+
		"\u015b\7g\2\2\u015b>\3\2\2\2\u015c\u015d\7y\2\2\u015d\u015e\7j\2\2\u015e"+
		"\u015f\7k\2\2\u015f\u0160\7n\2\2\u0160\u0161\7g\2\2\u0161@\3\2\2\2\u0162"+
		"\u0163\7c\2\2\u0163\u0164\7e\2\2\u0164\u0165\7e\2\2\u0165\u0166\7q\2\2"+
		"\u0166\u0167\7t\2\2\u0167\u0168\7f\2\2\u0168\u0169\7k\2\2\u0169\u016a"+
		"\7p\2\2\u016a\u016b\7i\2\2\u016bB\3\2\2\2\u016c\u016d\7a\2\2\u016d\u016e"+
		"\7X\2\2\u016e\u016f\7D\2\2\u016f\u0170\7I\2\2\u0170D\3\2\2\2\u0171\u0172"+
		"\7v\2\2\u0172\u0173\7k\2\2\u0173\u0174\7o\2\2\u0174\u0175\7g\2\2\u0175"+
		"F\3\2\2\2\u0176\u0177\7{\2\2\u0177\u0178\7g\2\2\u0178\u0179\7c\2\2\u0179"+
		"\u017a\7t\2\2\u017aH\3\2\2\2\u017b\u017c\7o\2\2\u017c\u017d\7q\2\2\u017d"+
		"\u017e\7w\2\2\u017e\u017f\7p\2\2\u017f\u0180\7v\2\2\u0180\u0181\7j\2\2"+
		"\u0181J\3\2\2\2\u0182\u0183\7f\2\2\u0183\u0184\7c\2\2\u0184\u0185\7{\2"+
		"\2\u0185L\3\2\2\2\u0186\u0187\7u\2\2\u0187\u0188\7g\2\2\u0188\u0189\7"+
		"c\2\2\u0189\u018a\7u\2\2\u018a\u018b\7q\2\2\u018b\u018c\7p\2\2\u018cN"+
		"\3\2\2\2\u018d\u018e\7j\2\2\u018e\u018f\7q\2\2\u018f\u0190\7w\2\2\u0190"+
		"\u0191\7t\2\2\u0191P\3\2\2\2\u0192\u0193\7o\2\2\u0193\u0194\7k\2\2\u0194"+
		"\u0195\7p\2\2\u0195\u0196\7w\2\2\u0196\u0197\7v\2\2\u0197\u0198\7g\2\2"+
		"\u0198R\3\2\2\2\u0199\u019a\7u\2\2\u019a\u019b\7g\2\2\u019b\u019c\7e\2"+
		"\2\u019c\u019d\7q\2\2\u019d\u019e\7p\2\2\u019e\u019f\7f\2\2\u019f\u01a0"+
		"\7g\2\2\u01a0T\3\2\2\2\u01a1\u01a2\7e\2\2\u01a2\u01a3\7k\2\2\u01a3\u01a4"+
		"\7v\2\2\u01a4\u01a5\7{\2\2\u01a5V\3\2\2\2\u01a6\u01a7\7\61\2\2\u01a7X"+
		"\3\2\2\2\u01a8\u01a9\7a\2\2\u01a9\u01aa\7E\2\2\u01aa\u01ab\7F\2\2\u01ab"+
		"Z\3\2\2\2\u01ac\u01ad\7/\2\2\u01ad\\\3\2\2\2\u01ae\u01af\7g\2\2\u01af"+
		"\u01b0\7s\2\2\u01b0\u01b1\7w\2\2\u01b1\u01b2\7c\2\2\u01b2\u01b3\7n\2\2"+
		"\u01b3^\3\2\2\2\u01b4\u01b5\7o\2\2\u01b5\u01b6\7q\2\2\u01b6\u01b7\7t\2"+
		"\2\u01b7\u01b8\7g\2\2\u01b8`\3\2\2\2\u01b9\u01ba\7a\2\2\u01ba\u01bb\7"+
		"T\2\2\u01bb\u01bc\7D\2\2\u01bc\u01bd\7T\2\2\u01bdb\3\2\2\2\u01be\u01bf"+
		"\7v\2\2\u01bf\u01c0\7j\2\2\u01c0\u01c1\7g\2\2\u01c1\u01c2\7p\2\2\u01c2"+
		"d\3\2\2\2\u01c3\u01c4\7a\2\2\u01c4\u01c5\7T\2\2\u01c5\u01c6\7D\2\2\u01c6"+
		"f\3\2\2\2\u01c7\u01c8\7n\2\2\u01c8\u01c9\7g\2\2\u01c9\u01ca\7u\2\2\u01ca"+
		"\u01cb\7u\2\2\u01cbh\3\2\2\2\u01cc\u01cd\7a\2\2\u01cd\u01ce\7L\2\2\u01ce"+
		"\u01cf\7L\2\2\u01cf\u01d0\7T\2\2\u01d0j\3\2\2\2\u01d1\u01d2\7y\2\2\u01d2"+
		"\u01d3\7k\2\2\u01d3\u01d4\7v\2\2\u01d4\u01d5\7j\2\2\u01d5l\3\2\2\2\u01d6"+
		"\u01d7\7v\2\2\u01d7\u01d8\7j\2\2\u01d8\u01d9\7k\2\2\u01d9\u01da\7u\2\2"+
		"\u01dan\3\2\2\2\u01db\u01dc\7a\2\2\u01dc\u01dd\7F\2\2\u01dd\u01de\7V\2"+
		"\2\u01dep\3\2\2\2\u01df\u01e0\7d\2\2\u01e0\u01e1\7g\2\2\u01e1\u01e2\7"+
		"v\2\2\u01e2\u01e3\7y\2\2\u01e3\u01e4\7g\2\2\u01e4\u01e5\7g\2\2\u01e5\u01e6"+
		"\7p\2\2\u01e6r\3\2\2\2\u01e7\u01e8\7q\2\2\u01e8\u01e9\7h\2\2\u01e9t\3"+
		"\2\2\2\u01ea\u01eb\7a\2\2\u01eb\u01ec\7Y\2\2\u01ec\u01ed\7F\2\2\u01ed"+
		"\u01ee\7V\2\2\u01eev\3\2\2\2\u01ef\u01f0\7a\2\2\u01f0\u01f1\7Y\2\2\u01f1"+
		"\u01f2\7R\2\2\u01f2\u01f3\7&\2\2\u01f3x\3\2\2\2\u01f4\u01f5\7a\2\2\u01f5"+
		"\u01f6\7T\2\2\u01f6\u01f7\7D\2\2\u01f7\u01f8\7U\2\2\u01f8z\3\2\2\2\u01f9"+
		"\u01fa\7c\2\2\u01fa|\3\2\2\2\u01fb\u01fc\7v\2\2\u01fc\u01fd\7j\2\2\u01fd"+
		"\u01fe\7g\2\2\u01fe~\3\2\2\2\u01ff\u0200\7l\2\2\u0200\u0201\7c\2\2\u0201"+
		"\u0202\7p\2\2\u0202\u0080\3\2\2\2\u0203\u0204\7h\2\2\u0204\u0205\7g\2"+
		"\2\u0205\u0206\7d\2\2\u0206\u0082\3\2\2\2\u0207\u0208\7o\2\2\u0208\u0209"+
		"\7c\2\2\u0209\u020a\7t\2\2\u020a\u0084\3\2\2\2\u020b\u020c\7a\2\2\u020c"+
		"\u020d\7H\2\2\u020d\u020e\7Y\2\2\u020e\u0086\3\2\2\2\u020f\u0210\7c\2"+
		"\2\u0210\u0211\7r\2\2\u0211\u0212\7t\2\2\u0212\u0088\3\2\2\2\u0213\u0214"+
		"\7o\2\2\u0214\u0215\7c\2\2\u0215\u0216\7{\2\2\u0216\u008a\3\2\2\2\u0217"+
		"\u0218\7a\2\2\u0218\u0219\7O\2\2\u0219\u021a\7F\2\2\u021a\u008c\3\2\2"+
		"\2\u021b\u021c\7l\2\2\u021c\u021d\7w\2\2\u021d\u021e\7p\2\2\u021e\u008e"+
		"\3\2\2\2\u021f\u0220\7l\2\2\u0220\u0221\7w\2\2\u0221\u0222\7n\2\2\u0222"+
		"\u0090\3\2\2\2\u0223\u0224\7c\2\2\u0224\u0225\7w\2\2\u0225\u0226\7i\2"+
		"\2\u0226\u0092\3\2\2\2\u0227\u0228\7u\2\2\u0228\u0229\7g\2\2\u0229\u022a"+
		"\7r\2\2\u022a\u0094\3\2\2\2\u022b\u022c\7q\2\2\u022c\u022d\7e\2\2\u022d"+
		"\u022e\7v\2\2\u022e\u0096\3\2\2\2\u022f\u0230\7p\2\2\u0230\u0231\7q\2"+
		"\2\u0231\u0232\7x\2\2\u0232\u0098\3\2\2\2\u0233\u0234\7f\2\2\u0234\u0235"+
		"\7g\2\2\u0235\u0236\7e\2\2\u0236\u009a\3\2\2\2\u0237\u0238\7a\2\2\u0238"+
		"\u0239\7L\2\2\u0239\u023a\7L\2\2\u023a\u023b\7U\2\2\u023b\u009c\3\2\2"+
		"\2\u023c\u023d\7a\2\2\u023d\u023e\7R\2\2\u023e\u023f\7Q\2\2\u023f\u0240"+
		"\7U\2\2\u0240\u009e\3\2\2\2\u0241\u0242\7a\2\2\u0242\u0243\7G\2\2\u0243"+
		"\u0244\7Z\2\2\u0244\u00a0\3\2\2\2\u0245\u0246\7a\2\2\u0246\u0247\7X\2"+
		"\2\u0247\u0248\7D\2\2\u0248\u0249\7P\2\2\u0249\u00a2\3\2\2\2\u024a\u024b"+
		"\7a\2\2\u024b\u024c\7X\2\2\u024c\u024d\7D\2\2\u024d\u00a4\3\2\2\2\u024e"+
		"\u024f\7a\2\2\u024f\u0250\7X\2\2\u0250\u0251\7D\2\2\u0251\u0252\7F\2\2"+
		"\u0252\u00a6\3\2\2\2\u0253\u0254\7a\2\2\u0254\u0255\7X\2\2\u0255\u0256"+
		"\7D\2\2\u0256\u0257\7R\2\2\u0257\u00a8\3\2\2\2\u0258\u0259\7a\2\2\u0259"+
		"\u025a\7X\2\2\u025a\u025b\7D\2\2\u025b\u025c\7\\\2\2\u025c\u00aa\3\2\2"+
		"\2\u025d\u025e\t\2\2\2\u025e\u0262\t\3\2\2\u025f\u0260\t\4\2\2\u0260\u0262"+
		"\t\5\2\2\u0261\u025d\3\2\2\2\u0261\u025f\3\2\2\2\u0262\u00ac\3\2\2\2\u0263"+
		"\u0264\t\6\2\2\u0264\u0268\t\3\2\2\u0265\u0266\t\7\2\2\u0266\u0268\t\2"+
		"\2\2\u0267\u0263\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u00ae\3\2\2\2\u0269"+
		"\u026a\t\7\2\2\u026a\u026b\t\b\2\2\u026b\u026c\t\b\2\2\u026c\u0276\t\t"+
		"\2\2\u026d\u026e\t\n\2\2\u026e\u026f\t\6\2\2\u026f\u0270\t\5\2\2\u0270"+
		"\u0276\t\t\2\2\u0271\u0272\t\n\2\2\u0272\u0273\t\6\2\2\u0273\u0274\t\n"+
		"\2\2\u0274\u0276\t\6\2\2\u0275\u0269\3\2\2\2\u0275\u026d\3\2\2\2\u0275"+
		"\u0271\3\2\2\2\u0276\u00b0\3\2\2\2\u0277\u0279\t\13\2\2\u0278\u0277\3"+
		"\2\2\2\u0279\u027a\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u00b2\3\2\2\2\u027c\u027e\t\t\2\2\u027d\u027c\3\2\2\2\u027e\u027f\3\2"+
		"\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u00b4\3\2\2\2\u0281"+
		"\u0283\t\f\2\2\u0282\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0282\3\2"+
		"\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\b[\2\2\u0287"+
		"\u00b6\3\2\2\2\t\2\u0261\u0267\u0275\u027a\u027f\u0284\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}