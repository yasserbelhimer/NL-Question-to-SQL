// Generated from Qa.g4 by ANTLR 4.8
package com.generated.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QaParser extends Parser {
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
	public static final int
		RULE_qa = 0, RULE_whquestion = 1, RULE_filter = 2, RULE_ng = 3, RULE_ng1 = 4, 
		RULE_nominal_term = 5, RULE_noun = 6, RULE_measure_indicator = 7, RULE_dimention_marker = 8, 
		RULE_temporal_dimention = 9, RULE_temporal_lexion = 10, RULE_date = 11, 
		RULE_filter_operator = 12, RULE_prepeposition = 13, RULE_wh_determiner = 14, 
		RULE_adverb = 15, RULE_dt = 16, RULE_mmm = 17, RULE_adjective = 18, RULE_past_participle = 19, 
		RULE_string = 20, RULE_verb = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"qa", "whquestion", "filter", "ng", "ng1", "nominal_term", "noun", "measure_indicator", 
			"dimention_marker", "temporal_dimention", "temporal_lexion", "date", 
			"filter_operator", "prepeposition", "wh_determiner", "adverb", "dt", 
			"mmm", "adjective", "past_participle", "string", "verb"
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
			"'seconde'", "'cety'", "'/'", "'_CD'", "'-'", "'equal'", "'more'", "'_RBR'", 
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

	@Override
	public String getGrammarFileName() { return "Qa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QaContext extends ParserRuleContext {
		public WhquestionContext whquestion() {
			return getRuleContext(WhquestionContext.class,0);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<NgContext> ng() {
			return getRuleContexts(NgContext.class);
		}
		public NgContext ng(int i) {
			return getRuleContext(NgContext.class,i);
		}
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public QaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterQa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitQa(this);
		}
	}

	public final QaContext qa() throws RecognitionException {
		QaContext _localctx = new QaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_qa);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			whquestion();
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(45);
				string();
				}
				break;
			}
			setState(49); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(48);
					ng();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(51); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(53);
				string();
				}
				break;
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__45) | (1L << T__46) | (1L << T__48) | (1L << T__50) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__56) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (DD - 64)) | (1L << (MM - 64)) | (1L << (YYYY - 64)) | (1L << (WORD - 64)))) != 0)) {
				{
				{
				setState(56);
				filter();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(T__0);
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

	public static class WhquestionContext extends ParserRuleContext {
		public WhquestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whquestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterWhquestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitWhquestion(this);
		}
	}

	public final WhquestionContext whquestion() throws RecognitionException {
		WhquestionContext _localctx = new WhquestionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_whquestion);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(T__1);
				setState(65);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__3);
				setState(67);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(T__5);
				setState(69);
				match(T__2);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(T__6);
				setState(71);
				match(T__4);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				match(T__7);
				setState(73);
				match(T__4);
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

	public static class FilterContext extends ParserRuleContext {
		public Dimention_markerContext dimention_marker() {
			return getRuleContext(Dimention_markerContext.class,0);
		}
		public NgContext ng() {
			return getRuleContext(NgContext.class,0);
		}
		public Temporal_dimentionContext temporal_dimention() {
			return getRuleContext(Temporal_dimentionContext.class,0);
		}
		public Filter_operatorContext filter_operator() {
			return getRuleContext(Filter_operatorContext.class,0);
		}
		public AdverbContext adverb() {
			return getRuleContext(AdverbContext.class,0);
		}
		public DtContext dt() {
			return getRuleContext(DtContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitFilter(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_filter);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				dimention_marker();
				setState(77);
				ng();
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(78);
					temporal_dimention();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) {
					{
					setState(81);
					dimention_marker();
					}
				}

				setState(84);
				temporal_dimention();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				filter_operator();
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__60) | (1L << T__61))) != 0)) {
						{
						setState(86);
						dt();
						}
					}

					setState(89);
					adverb();
					}
					break;
				}
				setState(92);
				ng();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				filter_operator();
				setState(95);
				temporal_dimention();
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

	public static class NgContext extends ParserRuleContext {
		public List<Ng1Context> ng1() {
			return getRuleContexts(Ng1Context.class);
		}
		public Ng1Context ng1(int i) {
			return getRuleContext(Ng1Context.class,i);
		}
		public List<DtContext> dt() {
			return getRuleContexts(DtContext.class);
		}
		public DtContext dt(int i) {
			return getRuleContext(DtContext.class,i);
		}
		public PrepepositionContext prepeposition() {
			return getRuleContext(PrepepositionContext.class,0);
		}
		public NgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterNg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitNg(this);
		}
	}

	public final NgContext ng() throws RecognitionException {
		NgContext _localctx = new NgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ng);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__60) | (1L << T__61))) != 0)) {
					{
					setState(99);
					dt();
					}
				}

				setState(102);
				ng1();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(103);
						match(T__8);
						setState(105);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__60) | (1L << T__61))) != 0)) {
							{
							setState(104);
							dt();
							}
						}

						setState(107);
						ng1();
						}
						}
						setState(110); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__8 );
					setState(112);
					match(T__9);
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__60) | (1L << T__61))) != 0)) {
						{
						setState(113);
						dt();
						}
					}

					setState(116);
					ng1();
					}
				}

				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(120);
					prepeposition();
					setState(121);
					dt();
					setState(122);
					ng1();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__60) | (1L << T__61))) != 0)) {
					{
					setState(126);
					dt();
					}
				}

				setState(129);
				ng1();
				setState(130);
				match(T__9);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__60) | (1L << T__61))) != 0)) {
					{
					setState(131);
					dt();
					}
				}

				setState(134);
				ng1();
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

	public static class Ng1Context extends ParserRuleContext {
		public List<Nominal_termContext> nominal_term() {
			return getRuleContexts(Nominal_termContext.class);
		}
		public Nominal_termContext nominal_term(int i) {
			return getRuleContext(Nominal_termContext.class,i);
		}
		public List<AdjectiveContext> adjective() {
			return getRuleContexts(AdjectiveContext.class);
		}
		public AdjectiveContext adjective(int i) {
			return getRuleContext(AdjectiveContext.class,i);
		}
		public List<Past_participleContext> past_participle() {
			return getRuleContexts(Past_participleContext.class);
		}
		public Past_participleContext past_participle(int i) {
			return getRuleContext(Past_participleContext.class,i);
		}
		public List<Wh_determinerContext> wh_determiner() {
			return getRuleContexts(Wh_determinerContext.class);
		}
		public Wh_determinerContext wh_determiner(int i) {
			return getRuleContext(Wh_determinerContext.class,i);
		}
		public List<AdverbContext> adverb() {
			return getRuleContexts(AdverbContext.class);
		}
		public AdverbContext adverb(int i) {
			return getRuleContext(AdverbContext.class,i);
		}
		public List<DtContext> dt() {
			return getRuleContexts(DtContext.class);
		}
		public DtContext dt(int i) {
			return getRuleContext(DtContext.class,i);
		}
		public Ng1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterNg1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitNg1(this);
		}
	}

	public final Ng1Context ng1() throws RecognitionException {
		Ng1Context _localctx = new Ng1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_ng1);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			nominal_term();
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(139);
						nominal_term();
						}
						break;
					case 2:
						{
						setState(140);
						adjective();
						}
						break;
					case 3:
						{
						setState(141);
						past_participle();
						}
						break;
					case 4:
						{
						setState(142);
						wh_determiner();
						}
						break;
					case 5:
						{
						setState(144);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__60) | (1L << T__61))) != 0)) {
							{
							setState(143);
							dt();
							}
						}

						setState(146);
						adverb();
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Nominal_termContext extends ParserRuleContext {
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public Measure_indicatorContext measure_indicator() {
			return getRuleContext(Measure_indicatorContext.class,0);
		}
		public Temporal_lexionContext temporal_lexion() {
			return getRuleContext(Temporal_lexionContext.class,0);
		}
		public AdjectiveContext adjective() {
			return getRuleContext(AdjectiveContext.class,0);
		}
		public Nominal_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nominal_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterNominal_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitNominal_term(this);
		}
	}

	public final Nominal_termContext nominal_term() throws RecognitionException {
		Nominal_termContext _localctx = new Nominal_termContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nominal_term);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				noun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				measure_indicator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				temporal_lexion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				adjective();
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

	public static class NounContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(QaParser.WORD, 0); }
		public NounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterNoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitNoun(this);
		}
	}

	public final NounContext noun() throws RecognitionException {
		NounContext _localctx = new NounContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_noun);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(WORD);
				setState(159);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(WORD);
				setState(161);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(WORD);
				setState(163);
				match(T__12);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(WORD);
				setState(165);
				match(T__13);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(WORD);
				setState(167);
				match(T__14);
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

	public static class Measure_indicatorContext extends ParserRuleContext {
		public Measure_indicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure_indicator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterMeasure_indicator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitMeasure_indicator(this);
		}
	}

	public final Measure_indicatorContext measure_indicator() throws RecognitionException {
		Measure_indicatorContext _localctx = new Measure_indicatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_measure_indicator);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__15);
				setState(171);
				match(T__10);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(T__16);
				setState(173);
				match(T__10);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(T__17);
				setState(175);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(T__19);
				setState(177);
				match(T__18);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				match(T__20);
				setState(179);
				match(T__10);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				match(T__21);
				setState(181);
				match(T__10);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				match(T__22);
				setState(183);
				match(T__10);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 8);
				{
				setState(184);
				match(T__23);
				setState(185);
				match(T__10);
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

	public static class Dimention_markerContext extends ParserRuleContext {
		public Dimention_markerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimention_marker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterDimention_marker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitDimention_marker(this);
		}
	}

	public final Dimention_markerContext dimention_marker() throws RecognitionException {
		Dimention_markerContext _localctx = new Dimention_markerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dimention_marker);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(T__24);
				setState(189);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(T__26);
				setState(191);
				match(T__25);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(T__27);
				setState(193);
				match(T__25);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(T__28);
				setState(195);
				match(T__25);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(T__29);
				setState(197);
				match(T__25);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				match(T__30);
				setState(199);
				match(T__25);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				match(T__6);
				setState(201);
				match(T__4);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 8);
				{
				setState(202);
				match(T__31);
				setState(203);
				match(T__32);
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

	public static class Temporal_dimentionContext extends ParserRuleContext {
		public NgContext ng() {
			return getRuleContext(NgContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public Past_participleContext past_participle() {
			return getRuleContext(Past_participleContext.class,0);
		}
		public Temporal_dimentionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporal_dimention; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterTemporal_dimention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitTemporal_dimention(this);
		}
	}

	public final Temporal_dimentionContext temporal_dimention() throws RecognitionException {
		Temporal_dimentionContext _localctx = new Temporal_dimentionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_temporal_dimention);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				ng();
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(207);
					date();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				date();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				past_participle();
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

	public static class Temporal_lexionContext extends ParserRuleContext {
		public Temporal_lexionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporal_lexion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterTemporal_lexion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitTemporal_lexion(this);
		}
	}

	public final Temporal_lexionContext temporal_lexion() throws RecognitionException {
		Temporal_lexionContext _localctx = new Temporal_lexionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_temporal_lexion);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(T__33);
				setState(215);
				match(T__10);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(T__34);
				setState(217);
				match(T__10);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(T__35);
				setState(219);
				match(T__18);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				match(T__36);
				setState(221);
				match(T__10);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				match(T__37);
				setState(223);
				match(T__10);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				match(T__38);
				setState(225);
				match(T__10);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 7);
				{
				setState(226);
				match(T__39);
				setState(227);
				match(T__10);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 8);
				{
				setState(228);
				match(T__40);
				setState(229);
				match(T__10);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 9);
				{
				setState(230);
				match(T__41);
				setState(231);
				match(T__10);
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

	public static class DateContext extends ParserRuleContext {
		public TerminalNode DD() { return getToken(QaParser.DD, 0); }
		public TerminalNode MM() { return getToken(QaParser.MM, 0); }
		public TerminalNode YYYY() { return getToken(QaParser.YYYY, 0); }
		public MmmContext mmm() {
			return getRuleContext(MmmContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_date);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(DD);
				setState(235);
				match(T__42);
				setState(236);
				match(MM);
				setState(237);
				match(T__42);
				setState(238);
				match(YYYY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(MM);
				setState(240);
				match(T__42);
				setState(241);
				match(YYYY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(DD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(MM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				match(YYYY);
				setState(245);
				match(T__43);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				match(DD);
				setState(247);
				match(T__44);
				setState(248);
				mmm();
				setState(249);
				match(T__44);
				setState(250);
				match(YYYY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				mmm();
				setState(253);
				match(T__44);
				setState(254);
				match(YYYY);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(256);
				match(MM);
				setState(257);
				match(T__42);
				setState(258);
				match(DD);
				setState(259);
				match(T__42);
				setState(260);
				match(YYYY);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(261);
				mmm();
				setState(262);
				match(DD);
				setState(263);
				match(T__8);
				setState(264);
				match(YYYY);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(266);
				mmm();
				setState(267);
				match(T__8);
				setState(268);
				match(YYYY);
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

	public static class Filter_operatorContext extends ParserRuleContext {
		public Filter_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterFilter_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitFilter_operator(this);
		}
	}

	public final Filter_operatorContext filter_operator() throws RecognitionException {
		Filter_operatorContext _localctx = new Filter_operatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_filter_operator);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(T__45);
				setState(273);
				match(T__18);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(T__46);
				setState(275);
				match(T__47);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(T__48);
				setState(277);
				match(T__49);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				match(T__50);
				setState(279);
				match(T__51);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				match(T__48);
				setState(281);
				match(T__49);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				match(T__52);
				setState(283);
				match(T__25);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				match(T__53);
				setState(285);
				match(T__54);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(286);
				match(T__55);
				setState(287);
				match(T__25);
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

	public static class PrepepositionContext extends ParserRuleContext {
		public PrepepositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepeposition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterPrepeposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitPrepeposition(this);
		}
	}

	public final PrepepositionContext prepeposition() throws RecognitionException {
		PrepepositionContext _localctx = new PrepepositionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prepeposition);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__56:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(T__56);
				setState(291);
				match(T__25);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(T__28);
				setState(293);
				match(T__25);
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

	public static class Wh_determinerContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(QaParser.WORD, 0); }
		public List<VerbContext> verb() {
			return getRuleContexts(VerbContext.class);
		}
		public VerbContext verb(int i) {
			return getRuleContext(VerbContext.class,i);
		}
		public List<Past_participleContext> past_participle() {
			return getRuleContexts(Past_participleContext.class);
		}
		public Past_participleContext past_participle(int i) {
			return getRuleContext(Past_participleContext.class,i);
		}
		public Wh_determinerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wh_determiner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterWh_determiner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitWh_determiner(this);
		}
	}

	public final Wh_determinerContext wh_determiner() throws RecognitionException {
		Wh_determinerContext _localctx = new Wh_determinerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_wh_determiner);
		try {
			int _alt;
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(WORD);
				setState(297);
				match(T__57);
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(300);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(298);
							verb();
							}
							break;
						case 2:
							{
							setState(299);
							past_participle();
							}
							break;
						}
						} 
					}
					setState(304);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(WORD);
				setState(306);
				match(T__58);
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

	public static class AdverbContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(QaParser.WORD, 0); }
		public AdverbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adverb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterAdverb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitAdverb(this);
		}
	}

	public final AdverbContext adverb() throws RecognitionException {
		AdverbContext _localctx = new AdverbContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_adverb);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(WORD);
				setState(310);
				match(T__49);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(WORD);
				setState(312);
				match(T__47);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(WORD);
				setState(314);
				match(T__59);
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

	public static class DtContext extends ParserRuleContext {
		public DtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterDt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitDt(this);
		}
	}

	public final DtContext dt() throws RecognitionException {
		DtContext _localctx = new DtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dt);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(T__60);
				setState(318);
				match(T__54);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(T__56);
				setState(320);
				match(T__25);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(T__56);
				setState(322);
				match(T__25);
				setState(323);
				match(T__61);
				setState(324);
				match(T__54);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				match(T__61);
				setState(326);
				match(T__54);
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

	public static class MmmContext extends ParserRuleContext {
		public MmmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterMmm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitMmm(this);
		}
	}

	public final MmmContext mmm() throws RecognitionException {
		MmmContext _localctx = new MmmContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mmm);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__62:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(T__62);
				setState(330);
				match(T__10);
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(T__63);
				setState(332);
				match(T__10);
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				match(T__64);
				setState(334);
				match(T__65);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				match(T__66);
				setState(336);
				match(T__65);
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				match(T__67);
				setState(338);
				match(T__68);
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 6);
				{
				setState(339);
				match(T__69);
				setState(340);
				match(T__10);
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 7);
				{
				setState(341);
				match(T__70);
				setState(342);
				match(T__10);
				}
				break;
			case T__71:
				enterOuterAlt(_localctx, 8);
				{
				setState(343);
				match(T__71);
				setState(344);
				match(T__10);
				}
				break;
			case T__72:
				enterOuterAlt(_localctx, 9);
				{
				setState(345);
				match(T__72);
				setState(346);
				match(T__10);
				}
				break;
			case T__73:
				enterOuterAlt(_localctx, 10);
				{
				setState(347);
				match(T__73);
				setState(348);
				match(T__10);
				}
				break;
			case T__74:
				enterOuterAlt(_localctx, 11);
				{
				setState(349);
				match(T__74);
				setState(350);
				match(T__10);
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 12);
				{
				setState(351);
				match(T__75);
				setState(352);
				match(T__10);
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

	public static class AdjectiveContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(QaParser.WORD, 0); }
		public AdjectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterAdjective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitAdjective(this);
		}
	}

	public final AdjectiveContext adjective() throws RecognitionException {
		AdjectiveContext _localctx = new AdjectiveContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_adjective);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(WORD);
				setState(356);
				match(T__18);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(WORD);
				setState(358);
				match(T__51);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				match(WORD);
				setState(360);
				match(T__76);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				match(WORD);
				setState(362);
				match(T__43);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				match(WORD);
				setState(364);
				match(T__77);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(365);
				match(WORD);
				setState(366);
				match(T__78);
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

	public static class Past_participleContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(QaParser.WORD, 0); }
		public Past_participleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_past_participle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterPast_participle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitPast_participle(this);
		}
	}

	public final Past_participleContext past_participle() throws RecognitionException {
		Past_participleContext _localctx = new Past_participleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_past_participle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(WORD);
			setState(370);
			match(T__79);
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

	public static class StringContext extends ParserRuleContext {
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public AdjectiveContext adjective() {
			return getRuleContext(AdjectiveContext.class,0);
		}
		public DtContext dt() {
			return getRuleContext(DtContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_string);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				noun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				verb();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				adjective();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
				dt();
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

	public static class VerbContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(QaParser.WORD, 0); }
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitVerb(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_verb);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(WORD);
				setState(379);
				match(T__80);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				match(WORD);
				setState(381);
				match(T__81);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				match(WORD);
				setState(383);
				match(T__32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				match(WORD);
				setState(385);
				match(T__82);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				match(WORD);
				setState(387);
				match(T__83);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\\\u0189\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\5\2\61\n\2"+
		"\3\2\6\2\64\n\2\r\2\16\2\65\3\2\5\29\n\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\4\5"+
		"\4R\n\4\3\4\5\4U\n\4\3\4\3\4\3\4\5\4Z\n\4\3\4\5\4]\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4d\n\4\3\5\5\5g\n\5\3\5\3\5\3\5\5\5l\n\5\3\5\6\5o\n\5\r\5\16\5"+
		"p\3\5\3\5\5\5u\n\5\3\5\3\5\5\5y\n\5\3\5\3\5\3\5\3\5\5\5\177\n\5\3\5\5"+
		"\5\u0082\n\5\3\5\3\5\3\5\5\5\u0087\n\5\3\5\3\5\5\5\u008b\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0093\n\6\3\6\7\6\u0096\n\6\f\6\16\6\u0099\13\6\3\7"+
		"\3\7\3\7\3\7\5\7\u009f\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u00ab\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00bd\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00cf\n\n\3\13\3\13\5\13\u00d3\n\13\3\13\3\13\5\13\u00d7"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00eb\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0111\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0123\n\16\3\17"+
		"\3\17\3\17\3\17\5\17\u0129\n\17\3\20\3\20\3\20\3\20\7\20\u012f\n\20\f"+
		"\20\16\20\u0132\13\20\3\20\3\20\5\20\u0136\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u013e\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u014a\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0164\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0172\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u017b\n"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0187\n\27"+
		"\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\2\u01e0"+
		"\2.\3\2\2\2\4L\3\2\2\2\6c\3\2\2\2\b\u008a\3\2\2\2\n\u008c\3\2\2\2\f\u009e"+
		"\3\2\2\2\16\u00aa\3\2\2\2\20\u00bc\3\2\2\2\22\u00ce\3\2\2\2\24\u00d6\3"+
		"\2\2\2\26\u00ea\3\2\2\2\30\u0110\3\2\2\2\32\u0122\3\2\2\2\34\u0128\3\2"+
		"\2\2\36\u0135\3\2\2\2 \u013d\3\2\2\2\"\u0149\3\2\2\2$\u0163\3\2\2\2&\u0171"+
		"\3\2\2\2(\u0173\3\2\2\2*\u017a\3\2\2\2,\u0186\3\2\2\2.\60\5\4\3\2/\61"+
		"\5*\26\2\60/\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\64\5\b\5\2\63\62\3"+
		"\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\679\5*\26"+
		"\28\67\3\2\2\289\3\2\2\29=\3\2\2\2:<\5\6\4\2;:\3\2\2\2<?\3\2\2\2=;\3\2"+
		"\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\3\2\2A\3\3\2\2\2BC\7\4\2\2CM\7"+
		"\5\2\2DE\7\6\2\2EM\7\7\2\2FG\7\b\2\2GM\7\5\2\2HI\7\t\2\2IM\7\7\2\2JK\7"+
		"\n\2\2KM\7\7\2\2LB\3\2\2\2LD\3\2\2\2LF\3\2\2\2LH\3\2\2\2LJ\3\2\2\2M\5"+
		"\3\2\2\2NO\5\22\n\2OQ\5\b\5\2PR\5\24\13\2QP\3\2\2\2QR\3\2\2\2Rd\3\2\2"+
		"\2SU\5\22\n\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2Vd\5\24\13\2W\\\5\32\16\2X"+
		"Z\5\"\22\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[]\5 \21\2\\Y\3\2\2\2\\]\3\2\2"+
		"\2]^\3\2\2\2^_\5\b\5\2_d\3\2\2\2`a\5\32\16\2ab\5\24\13\2bd\3\2\2\2cN\3"+
		"\2\2\2cT\3\2\2\2cW\3\2\2\2c`\3\2\2\2d\7\3\2\2\2eg\5\"\22\2fe\3\2\2\2f"+
		"g\3\2\2\2gh\3\2\2\2hx\5\n\6\2ik\7\13\2\2jl\5\"\22\2kj\3\2\2\2kl\3\2\2"+
		"\2lm\3\2\2\2mo\5\n\6\2ni\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2"+
		"\2rt\7\f\2\2su\5\"\22\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\5\n\6\2wy\3\2"+
		"\2\2xn\3\2\2\2xy\3\2\2\2y~\3\2\2\2z{\5\34\17\2{|\5\"\22\2|}\5\n\6\2}\177"+
		"\3\2\2\2~z\3\2\2\2~\177\3\2\2\2\177\u008b\3\2\2\2\u0080\u0082\5\"\22\2"+
		"\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\5\n\6\2\u0084\u0086\7\f\2\2\u0085\u0087\5\"\22\2\u0086\u0085\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\5\n\6\2\u0089\u008b"+
		"\3\2\2\2\u008af\3\2\2\2\u008a\u0081\3\2\2\2\u008b\t\3\2\2\2\u008c\u0097"+
		"\5\f\7\2\u008d\u0096\5\f\7\2\u008e\u0096\5&\24\2\u008f\u0096\5(\25\2\u0090"+
		"\u0096\5\36\20\2\u0091\u0093\5\"\22\2\u0092\u0091\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\5 \21\2\u0095\u008d\3\2\2\2\u0095"+
		"\u008e\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0090\3\2\2\2\u0095\u0092\3\2"+
		"\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\13\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009f\5\16\b\2\u009b\u009f\5\20"+
		"\t\2\u009c\u009f\5\26\f\2\u009d\u009f\5&\24\2\u009e\u009a\3\2\2\2\u009e"+
		"\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\r\3\2\2\2"+
		"\u00a0\u00a1\7Z\2\2\u00a1\u00ab\7\r\2\2\u00a2\u00a3\7Z\2\2\u00a3\u00ab"+
		"\7\16\2\2\u00a4\u00a5\7Z\2\2\u00a5\u00ab\7\17\2\2\u00a6\u00a7\7Z\2\2\u00a7"+
		"\u00ab\7\20\2\2\u00a8\u00a9\7Z\2\2\u00a9\u00ab\7\21\2\2\u00aa\u00a0\3"+
		"\2\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\17\3\2\2\2\u00ac\u00ad\7\22\2\2\u00ad\u00bd\7\r\2"+
		"\2\u00ae\u00af\7\23\2\2\u00af\u00bd\7\r\2\2\u00b0\u00b1\7\24\2\2\u00b1"+
		"\u00bd\7\25\2\2\u00b2\u00b3\7\26\2\2\u00b3\u00bd\7\25\2\2\u00b4\u00b5"+
		"\7\27\2\2\u00b5\u00bd\7\r\2\2\u00b6\u00b7\7\30\2\2\u00b7\u00bd\7\r\2\2"+
		"\u00b8\u00b9\7\31\2\2\u00b9\u00bd\7\r\2\2\u00ba\u00bb\7\32\2\2\u00bb\u00bd"+
		"\7\r\2\2\u00bc\u00ac\3\2\2\2\u00bc\u00ae\3\2\2\2\u00bc\u00b0\3\2\2\2\u00bc"+
		"\u00b2\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b8\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bd\21\3\2\2\2\u00be\u00bf\7\33\2\2\u00bf\u00cf"+
		"\7\34\2\2\u00c0\u00c1\7\35\2\2\u00c1\u00cf\7\34\2\2\u00c2\u00c3\7\36\2"+
		"\2\u00c3\u00cf\7\34\2\2\u00c4\u00c5\7\37\2\2\u00c5\u00cf\7\34\2\2\u00c6"+
		"\u00c7\7 \2\2\u00c7\u00cf\7\34\2\2\u00c8\u00c9\7!\2\2\u00c9\u00cf\7\34"+
		"\2\2\u00ca\u00cb\7\t\2\2\u00cb\u00cf\7\7\2\2\u00cc\u00cd\7\"\2\2\u00cd"+
		"\u00cf\7#\2\2\u00ce\u00be\3\2\2\2\u00ce\u00c0\3\2\2\2\u00ce\u00c2\3\2"+
		"\2\2\u00ce\u00c4\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce"+
		"\u00ca\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\23\3\2\2\2\u00d0\u00d2\5\b\5"+
		"\2\u00d1\u00d3\5\30\r\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d7\3\2\2\2\u00d4\u00d7\5\30\r\2\u00d5\u00d7\5(\25\2\u00d6\u00d0\3"+
		"\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\25\3\2\2\2\u00d8"+
		"\u00d9\7$\2\2\u00d9\u00eb\7\r\2\2\u00da\u00db\7%\2\2\u00db\u00eb\7\r\2"+
		"\2\u00dc\u00dd\7&\2\2\u00dd\u00eb\7\25\2\2\u00de\u00df\7\'\2\2\u00df\u00eb"+
		"\7\r\2\2\u00e0\u00e1\7(\2\2\u00e1\u00eb\7\r\2\2\u00e2\u00e3\7)\2\2\u00e3"+
		"\u00eb\7\r\2\2\u00e4\u00e5\7*\2\2\u00e5\u00eb\7\r\2\2\u00e6\u00e7\7+\2"+
		"\2\u00e7\u00eb\7\r\2\2\u00e8\u00e9\7,\2\2\u00e9\u00eb\7\r\2\2\u00ea\u00d8"+
		"\3\2\2\2\u00ea\u00da\3\2\2\2\u00ea\u00dc\3\2\2\2\u00ea\u00de\3\2\2\2\u00ea"+
		"\u00e0\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e6\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00eb\27\3\2\2\2\u00ec\u00ed\7W\2\2\u00ed\u00ee"+
		"\7-\2\2\u00ee\u00ef\7X\2\2\u00ef\u00f0\7-\2\2\u00f0\u0111\7Y\2\2\u00f1"+
		"\u00f2\7X\2\2\u00f2\u00f3\7-\2\2\u00f3\u0111\7Y\2\2\u00f4\u0111\7W\2\2"+
		"\u00f5\u0111\7X\2\2\u00f6\u00f7\7Y\2\2\u00f7\u0111\7.\2\2\u00f8\u00f9"+
		"\7W\2\2\u00f9\u00fa\7/\2\2\u00fa\u00fb\5$\23\2\u00fb\u00fc\7/\2\2\u00fc"+
		"\u00fd\7Y\2\2\u00fd\u0111\3\2\2\2\u00fe\u00ff\5$\23\2\u00ff\u0100\7/\2"+
		"\2\u0100\u0101\7Y\2\2\u0101\u0111\3\2\2\2\u0102\u0103\7X\2\2\u0103\u0104"+
		"\7-\2\2\u0104\u0105\7W\2\2\u0105\u0106\7-\2\2\u0106\u0111\7Y\2\2\u0107"+
		"\u0108\5$\23\2\u0108\u0109\7W\2\2\u0109\u010a\7\13\2\2\u010a\u010b\7Y"+
		"\2\2\u010b\u0111\3\2\2\2\u010c\u010d\5$\23\2\u010d\u010e\7\13\2\2\u010e"+
		"\u010f\7Y\2\2\u010f\u0111\3\2\2\2\u0110\u00ec\3\2\2\2\u0110\u00f1\3\2"+
		"\2\2\u0110\u00f4\3\2\2\2\u0110\u00f5\3\2\2\2\u0110\u00f6\3\2\2\2\u0110"+
		"\u00f8\3\2\2\2\u0110\u00fe\3\2\2\2\u0110\u0102\3\2\2\2\u0110\u0107\3\2"+
		"\2\2\u0110\u010c\3\2\2\2\u0111\31\3\2\2\2\u0112\u0113\7\60\2\2\u0113\u0123"+
		"\7\25\2\2\u0114\u0115\7\61\2\2\u0115\u0123\7\62\2\2\u0116\u0117\7\63\2"+
		"\2\u0117\u0123\7\64\2\2\u0118\u0119\7\65\2\2\u0119\u0123\7\66\2\2\u011a"+
		"\u011b\7\63\2\2\u011b\u0123\7\64\2\2\u011c\u011d\7\67\2\2\u011d\u0123"+
		"\7\34\2\2\u011e\u011f\78\2\2\u011f\u0123\79\2\2\u0120\u0121\7:\2\2\u0121"+
		"\u0123\7\34\2\2\u0122\u0112\3\2\2\2\u0122\u0114\3\2\2\2\u0122\u0116\3"+
		"\2\2\2\u0122\u0118\3\2\2\2\u0122\u011a\3\2\2\2\u0122\u011c\3\2\2\2\u0122"+
		"\u011e\3\2\2\2\u0122\u0120\3\2\2\2\u0123\33\3\2\2\2\u0124\u0125\7;\2\2"+
		"\u0125\u0129\7\34\2\2\u0126\u0127\7\37\2\2\u0127\u0129\7\34\2\2\u0128"+
		"\u0124\3\2\2\2\u0128\u0126\3\2\2\2\u0129\35\3\2\2\2\u012a\u012b\7Z\2\2"+
		"\u012b\u0130\7<\2\2\u012c\u012f\5,\27\2\u012d\u012f\5(\25\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0136\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7Z"+
		"\2\2\u0134\u0136\7=\2\2\u0135\u012a\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\37\3\2\2\2\u0137\u0138\7Z\2\2\u0138\u013e\7\64\2\2\u0139\u013a\7Z\2\2"+
		"\u013a\u013e\7\62\2\2\u013b\u013c\7Z\2\2\u013c\u013e\7>\2\2\u013d\u0137"+
		"\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013b\3\2\2\2\u013e!\3\2\2\2\u013f"+
		"\u0140\7?\2\2\u0140\u014a\79\2\2\u0141\u0142\7;\2\2\u0142\u014a\7\34\2"+
		"\2\u0143\u0144\7;\2\2\u0144\u0145\7\34\2\2\u0145\u0146\7@\2\2\u0146\u014a"+
		"\79\2\2\u0147\u0148\7@\2\2\u0148\u014a\79\2\2\u0149\u013f\3\2\2\2\u0149"+
		"\u0141\3\2\2\2\u0149\u0143\3\2\2\2\u0149\u0147\3\2\2\2\u014a#\3\2\2\2"+
		"\u014b\u014c\7A\2\2\u014c\u0164\7\r\2\2\u014d\u014e\7B\2\2\u014e\u0164"+
		"\7\r\2\2\u014f\u0150\7C\2\2\u0150\u0164\7D\2\2\u0151\u0152\7E\2\2\u0152"+
		"\u0164\7D\2\2\u0153\u0154\7F\2\2\u0154\u0164\7G\2\2\u0155\u0156\7H\2\2"+
		"\u0156\u0164\7\r\2\2\u0157\u0158\7I\2\2\u0158\u0164\7\r\2\2\u0159\u015a"+
		"\7J\2\2\u015a\u0164\7\r\2\2\u015b\u015c\7K\2\2\u015c\u0164\7\r\2\2\u015d"+
		"\u015e\7L\2\2\u015e\u0164\7\r\2\2\u015f\u0160\7M\2\2\u0160\u0164\7\r\2"+
		"\2\u0161\u0162\7N\2\2\u0162\u0164\7\r\2\2\u0163\u014b\3\2\2\2\u0163\u014d"+
		"\3\2\2\2\u0163\u014f\3\2\2\2\u0163\u0151\3\2\2\2\u0163\u0153\3\2\2\2\u0163"+
		"\u0155\3\2\2\2\u0163\u0157\3\2\2\2\u0163\u0159\3\2\2\2\u0163\u015b\3\2"+
		"\2\2\u0163\u015d\3\2\2\2\u0163\u015f\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"%\3\2\2\2\u0165\u0166\7Z\2\2\u0166\u0172\7\25\2\2\u0167\u0168\7Z\2\2\u0168"+
		"\u0172\7\66\2\2\u0169\u016a\7Z\2\2\u016a\u0172\7O\2\2\u016b\u016c\7Z\2"+
		"\2\u016c\u0172\7.\2\2\u016d\u016e\7Z\2\2\u016e\u0172\7P\2\2\u016f\u0170"+
		"\7Z\2\2\u0170\u0172\7Q\2\2\u0171\u0165\3\2\2\2\u0171\u0167\3\2\2\2\u0171"+
		"\u0169\3\2\2\2\u0171\u016b\3\2\2\2\u0171\u016d\3\2\2\2\u0171\u016f\3\2"+
		"\2\2\u0172\'\3\2\2\2\u0173\u0174\7Z\2\2\u0174\u0175\7R\2\2\u0175)\3\2"+
		"\2\2\u0176\u017b\5\16\b\2\u0177\u017b\5,\27\2\u0178\u017b\5&\24\2\u0179"+
		"\u017b\5\"\22\2\u017a\u0176\3\2\2\2\u017a\u0177\3\2\2\2\u017a\u0178\3"+
		"\2\2\2\u017a\u0179\3\2\2\2\u017b+\3\2\2\2\u017c\u017d\7Z\2\2\u017d\u0187"+
		"\7S\2\2\u017e\u017f\7Z\2\2\u017f\u0187\7T\2\2\u0180\u0181\7Z\2\2\u0181"+
		"\u0187\7#\2\2\u0182\u0183\7Z\2\2\u0183\u0187\7U\2\2\u0184\u0185\7Z\2\2"+
		"\u0185\u0187\7V\2\2\u0186\u017c\3\2\2\2\u0186\u017e\3\2\2\2\u0186\u0180"+
		"\3\2\2\2\u0186\u0182\3\2\2\2\u0186\u0184\3\2\2\2\u0187-\3\2\2\2+\60\65"+
		"8=LQTY\\cfkptx~\u0081\u0086\u008a\u0092\u0095\u0097\u009e\u00aa\u00bc"+
		"\u00ce\u00d2\u00d6\u00ea\u0110\u0122\u0128\u012e\u0130\u0135\u013d\u0149"+
		"\u0163\u0171\u017a\u0186";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}