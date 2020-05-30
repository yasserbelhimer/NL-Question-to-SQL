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
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, DD=86, MM=87, YYYY=88, 
		WORD=89, INT=90, WS=91;
	public static final int
		RULE_qa = 0, RULE_whquestion = 1, RULE_filter = 2, RULE_ng_filter = 3, 
		RULE_ng = 4, RULE_ng1_filter = 5, RULE_ng1 = 6, RULE_nominal_term = 7, 
		RULE_noun = 8, RULE_measure_indicator = 9, RULE_dimention_marker = 10, 
		RULE_temporal_dimention = 11, RULE_temporal_lexion = 12, RULE_date = 13, 
		RULE_filter_operator = 14, RULE_prepeposition = 15, RULE_wh_determiner = 16, 
		RULE_adverb = 17, RULE_dt = 18, RULE_mmm = 19, RULE_adjective = 20, RULE_past_participle = 21, 
		RULE_string = 22, RULE_verb = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"qa", "whquestion", "filter", "ng_filter", "ng", "ng1_filter", "ng1", 
			"nominal_term", "noun", "measure_indicator", "dimention_marker", "temporal_dimention", 
			"temporal_lexion", "date", "filter_operator", "prepeposition", "wh_determiner", 
			"adverb", "dt", "mmm", "adjective", "past_participle", "string", "verb"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'?_.'", "'what'", "'_WP'", "'how'", "'_WRB'", "'who'", "'when'", 
			"'where'", "',_,'", "'and_CC'", "'_NN'", "'_PRP'", "'_NNS'", "'_NNP'", 
			"'_NNPS'", "'quantity'", "'amount'", "'total'", "'_JJ'", "'many'", "'numbre'", 
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
			null, null, "DD", "MM", "YYYY", "WORD", "INT", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitQa(this);
			else return visitor.visitChildren(this);
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
			setState(48);
			whquestion();
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(49);
				string();
				}
				break;
			}
			setState(53); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(52);
					ng();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(55); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(57);
				string();
				}
				break;
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__46) | (1L << T__47) | (1L << T__49) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__56) | (1L << T__57) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (DD - 64)) | (1L << (MM - 64)) | (1L << (YYYY - 64)) | (1L << (WORD - 64)))) != 0)) {
				{
				{
				setState(60);
				filter();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitWhquestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhquestionContext whquestion() throws RecognitionException {
		WhquestionContext _localctx = new WhquestionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_whquestion);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__1);
				setState(69);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(T__3);
				setState(71);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(T__5);
				setState(73);
				match(T__2);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(T__6);
				setState(75);
				match(T__4);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				match(T__7);
				setState(77);
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
		public Ng_filterContext ng_filter() {
			return getRuleContext(Ng_filterContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_filter);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				dimention_marker();
				setState(81);
				ng_filter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) {
					{
					setState(83);
					dimention_marker();
					}
				}

				setState(86);
				temporal_dimention();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				filter_operator();
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__57) | (1L << T__61) | (1L << T__62))) != 0)) {
						{
						setState(88);
						dt();
						}
					}

					setState(91);
					adverb();
					}
					break;
				}
				setState(94);
				ng_filter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				filter_operator();
				setState(97);
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

	public static class Ng_filterContext extends ParserRuleContext {
		public List<Ng1_filterContext> ng1_filter() {
			return getRuleContexts(Ng1_filterContext.class);
		}
		public Ng1_filterContext ng1_filter(int i) {
			return getRuleContext(Ng1_filterContext.class,i);
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
		public Ng_filterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterNg_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitNg_filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitNg_filter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_filterContext ng_filter() throws RecognitionException {
		Ng_filterContext _localctx = new Ng_filterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ng_filter);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__57) | (1L << T__61) | (1L << T__62))) != 0)) {
					{
					setState(101);
					dt();
					}
				}

				setState(104);
				ng1_filter();
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(110); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(105);
						match(T__8);
						setState(107);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__57) | (1L << T__61) | (1L << T__62))) != 0)) {
							{
							setState(106);
							dt();
							}
						}

						setState(109);
						ng1_filter();
						}
						}
						setState(112); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__8 );
					setState(114);
					match(T__9);
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__57) | (1L << T__61) | (1L << T__62))) != 0)) {
						{
						setState(115);
						dt();
						}
					}

					setState(118);
					ng1_filter();
					}
					break;
				}
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(122);
					prepeposition();
					setState(123);
					dt();
					setState(124);
					ng1_filter();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__57) | (1L << T__61) | (1L << T__62))) != 0)) {
					{
					setState(128);
					dt();
					}
				}

				setState(131);
				ng1_filter();
				setState(132);
				match(T__9);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__57) | (1L << T__61) | (1L << T__62))) != 0)) {
					{
					setState(133);
					dt();
					}
				}

				setState(136);
				ng1_filter();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitNg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgContext ng() throws RecognitionException {
		NgContext _localctx = new NgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ng);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__57) | (1L << T__61) | (1L << T__62))) != 0)) {
					{
					setState(140);
					dt();
					}
				}

				setState(143);
				ng1();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(149); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(144);
						match(T__8);
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__57) | (1L << T__61) | (1L << T__62))) != 0)) {
							{
							setState(145);
							dt();
							}
						}

						setState(148);
						ng1();
						}
						}
						setState(151); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__8 );
					setState(153);
					match(T__9);
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__57) | (1L << T__61) | (1L << T__62))) != 0)) {
						{
						setState(154);
						dt();
						}
					}

					setState(157);
					ng1();
					}
				}

				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(161);
					prepeposition();
					setState(162);
					dt();
					setState(163);
					ng1();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__57) | (1L << T__61) | (1L << T__62))) != 0)) {
					{
					setState(167);
					dt();
					}
				}

				setState(170);
				ng1();
				setState(171);
				match(T__9);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__57) | (1L << T__61) | (1L << T__62))) != 0)) {
					{
					setState(172);
					dt();
					}
				}

				setState(175);
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

	public static class Ng1_filterContext extends ParserRuleContext {
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
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<AdverbContext> adverb() {
			return getRuleContexts(AdverbContext.class);
		}
		public AdverbContext adverb(int i) {
			return getRuleContext(AdverbContext.class,i);
		}
		public List<Temporal_dimentionContext> temporal_dimention() {
			return getRuleContexts(Temporal_dimentionContext.class);
		}
		public Temporal_dimentionContext temporal_dimention(int i) {
			return getRuleContext(Temporal_dimentionContext.class,i);
		}
		public List<DtContext> dt() {
			return getRuleContexts(DtContext.class);
		}
		public DtContext dt(int i) {
			return getRuleContext(DtContext.class,i);
		}
		public Ng1_filterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng1_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterNg1_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitNg1_filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitNg1_filter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng1_filterContext ng1_filter() throws RecognitionException {
		Ng1_filterContext _localctx = new Ng1_filterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ng1_filter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			nominal_term();
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(180);
						nominal_term();
						}
						break;
					case 2:
						{
						setState(181);
						adjective();
						}
						break;
					case 3:
						{
						setState(182);
						past_participle();
						}
						break;
					case 4:
						{
						setState(183);
						wh_determiner();
						}
						break;
					case 5:
						{
						setState(184);
						string();
						}
						break;
					case 6:
						{
						setState(186);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__57) | (1L << T__61) | (1L << T__62))) != 0)) {
							{
							setState(185);
							dt();
							}
						}

						setState(188);
						adverb();
						}
						break;
					case 7:
						{
						setState(189);
						temporal_dimention();
						}
						break;
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitNg1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng1Context ng1() throws RecognitionException {
		Ng1Context _localctx = new Ng1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_ng1);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			nominal_term();
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(196);
						nominal_term();
						}
						break;
					case 2:
						{
						setState(197);
						adjective();
						}
						break;
					case 3:
						{
						setState(198);
						past_participle();
						}
						break;
					case 4:
						{
						setState(199);
						wh_determiner();
						}
						break;
					case 5:
						{
						setState(200);
						string();
						}
						break;
					case 6:
						{
						setState(202);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__57) | (1L << T__61) | (1L << T__62))) != 0)) {
							{
							setState(201);
							dt();
							}
						}

						setState(204);
						adverb();
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitNominal_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nominal_termContext nominal_term() throws RecognitionException {
		Nominal_termContext _localctx = new Nominal_termContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nominal_term);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				noun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				measure_indicator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				temporal_lexion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitNoun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounContext noun() throws RecognitionException {
		NounContext _localctx = new NounContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_noun);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(WORD);
				setState(217);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(WORD);
				setState(219);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(WORD);
				setState(221);
				match(T__12);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(WORD);
				setState(223);
				match(T__13);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				match(WORD);
				setState(225);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitMeasure_indicator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Measure_indicatorContext measure_indicator() throws RecognitionException {
		Measure_indicatorContext _localctx = new Measure_indicatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_measure_indicator);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(T__15);
				setState(229);
				match(T__10);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(T__16);
				setState(231);
				match(T__10);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(T__17);
				setState(233);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(T__19);
				setState(235);
				match(T__18);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				match(T__20);
				setState(237);
				match(T__18);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				match(T__21);
				setState(239);
				match(T__10);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 7);
				{
				setState(240);
				match(T__22);
				setState(241);
				match(T__10);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 8);
				{
				setState(242);
				match(T__23);
				setState(243);
				match(T__10);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				match(T__24);
				setState(245);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitDimention_marker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dimention_markerContext dimention_marker() throws RecognitionException {
		Dimention_markerContext _localctx = new Dimention_markerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dimention_marker);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(T__25);
				setState(249);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__27);
				setState(251);
				match(T__26);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(T__28);
				setState(253);
				match(T__26);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				match(T__29);
				setState(255);
				match(T__26);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				match(T__30);
				setState(257);
				match(T__26);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 6);
				{
				setState(258);
				match(T__31);
				setState(259);
				match(T__26);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(260);
				match(T__6);
				setState(261);
				match(T__4);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 8);
				{
				setState(262);
				match(T__32);
				setState(263);
				match(T__33);
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
		public Ng_filterContext ng_filter() {
			return getRuleContext(Ng_filterContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitTemporal_dimention(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Temporal_dimentionContext temporal_dimention() throws RecognitionException {
		Temporal_dimentionContext _localctx = new Temporal_dimentionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_temporal_dimention);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case T__17:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__57:
			case T__61:
			case T__62:
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				ng_filter();
				setState(268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(267);
					date();
					}
					break;
				}
				}
				break;
			case T__63:
			case T__64:
			case T__65:
			case T__67:
			case T__68:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case DD:
			case MM:
			case YYYY:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				date();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitTemporal_lexion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Temporal_lexionContext temporal_lexion() throws RecognitionException {
		Temporal_lexionContext _localctx = new Temporal_lexionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_temporal_lexion);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(T__34);
				setState(274);
				match(T__10);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(T__35);
				setState(276);
				match(T__10);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(T__36);
				setState(278);
				match(T__18);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				match(T__37);
				setState(280);
				match(T__10);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				match(T__38);
				setState(282);
				match(T__10);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				match(T__39);
				setState(284);
				match(T__10);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 7);
				{
				setState(285);
				match(T__40);
				setState(286);
				match(T__10);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 8);
				{
				setState(287);
				match(T__41);
				setState(288);
				match(T__10);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 9);
				{
				setState(289);
				match(T__42);
				setState(290);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_date);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(DD);
				setState(294);
				match(T__43);
				setState(295);
				match(MM);
				setState(296);
				match(T__43);
				setState(297);
				match(YYYY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(MM);
				setState(299);
				match(T__43);
				setState(300);
				match(YYYY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				match(DD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				match(MM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				match(YYYY);
				setState(304);
				match(T__44);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				match(DD);
				setState(306);
				match(T__45);
				setState(307);
				mmm();
				setState(308);
				match(T__45);
				setState(309);
				match(YYYY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(311);
				mmm();
				setState(312);
				match(T__45);
				setState(313);
				match(YYYY);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(315);
				match(MM);
				setState(316);
				match(T__43);
				setState(317);
				match(DD);
				setState(318);
				match(T__43);
				setState(319);
				match(YYYY);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(320);
				mmm();
				setState(321);
				match(DD);
				setState(322);
				match(T__8);
				setState(323);
				match(YYYY);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(325);
				mmm();
				setState(326);
				match(T__8);
				setState(327);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitFilter_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_operatorContext filter_operator() throws RecognitionException {
		Filter_operatorContext _localctx = new Filter_operatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_filter_operator);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(T__46);
				setState(332);
				match(T__18);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(T__47);
				setState(334);
				match(T__48);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(T__49);
				setState(336);
				match(T__50);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				match(T__51);
				setState(338);
				match(T__52);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				match(T__49);
				setState(340);
				match(T__50);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(341);
				match(T__53);
				setState(342);
				match(T__26);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(343);
				match(T__54);
				setState(344);
				match(T__55);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(345);
				match(T__56);
				setState(346);
				match(T__26);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitPrepeposition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrepepositionContext prepeposition() throws RecognitionException {
		PrepepositionContext _localctx = new PrepepositionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_prepeposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__57);
			setState(350);
			match(T__26);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitWh_determiner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wh_determinerContext wh_determiner() throws RecognitionException {
		Wh_determinerContext _localctx = new Wh_determinerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_wh_determiner);
		try {
			int _alt;
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(WORD);
				setState(353);
				match(T__58);
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(356);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(354);
							verb();
							}
							break;
						case 2:
							{
							setState(355);
							past_participle();
							}
							break;
						}
						} 
					}
					setState(360);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(WORD);
				setState(362);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitAdverb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdverbContext adverb() throws RecognitionException {
		AdverbContext _localctx = new AdverbContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_adverb);
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(WORD);
				setState(366);
				match(T__50);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(WORD);
				setState(368);
				match(T__48);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				match(WORD);
				setState(370);
				match(T__60);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitDt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtContext dt() throws RecognitionException {
		DtContext _localctx = new DtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dt);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(T__61);
				setState(374);
				match(T__55);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(T__57);
				setState(376);
				match(T__26);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(T__57);
				setState(378);
				match(T__26);
				setState(379);
				match(T__62);
				setState(380);
				match(T__55);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
				match(T__62);
				setState(382);
				match(T__55);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitMmm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MmmContext mmm() throws RecognitionException {
		MmmContext _localctx = new MmmContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mmm);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__63:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(T__63);
				setState(386);
				match(T__10);
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(T__64);
				setState(388);
				match(T__10);
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				match(T__65);
				setState(390);
				match(T__66);
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				match(T__67);
				setState(392);
				match(T__66);
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 5);
				{
				setState(393);
				match(T__68);
				setState(394);
				match(T__69);
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 6);
				{
				setState(395);
				match(T__70);
				setState(396);
				match(T__10);
				}
				break;
			case T__71:
				enterOuterAlt(_localctx, 7);
				{
				setState(397);
				match(T__71);
				setState(398);
				match(T__10);
				}
				break;
			case T__72:
				enterOuterAlt(_localctx, 8);
				{
				setState(399);
				match(T__72);
				setState(400);
				match(T__10);
				}
				break;
			case T__73:
				enterOuterAlt(_localctx, 9);
				{
				setState(401);
				match(T__73);
				setState(402);
				match(T__10);
				}
				break;
			case T__74:
				enterOuterAlt(_localctx, 10);
				{
				setState(403);
				match(T__74);
				setState(404);
				match(T__10);
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 11);
				{
				setState(405);
				match(T__75);
				setState(406);
				match(T__10);
				}
				break;
			case T__76:
				enterOuterAlt(_localctx, 12);
				{
				setState(407);
				match(T__76);
				setState(408);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitAdjective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdjectiveContext adjective() throws RecognitionException {
		AdjectiveContext _localctx = new AdjectiveContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_adjective);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(WORD);
				setState(412);
				match(T__18);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(WORD);
				setState(414);
				match(T__52);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				match(WORD);
				setState(416);
				match(T__77);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				match(WORD);
				setState(418);
				match(T__44);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(419);
				match(WORD);
				setState(420);
				match(T__78);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(421);
				match(WORD);
				setState(422);
				match(T__79);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitPast_participle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Past_participleContext past_participle() throws RecognitionException {
		Past_participleContext _localctx = new Past_participleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_past_participle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(WORD);
			setState(426);
			match(T__80);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_string);
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				noun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				verb();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				adjective();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitVerb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_verb);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				match(WORD);
				setState(435);
				match(T__81);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(WORD);
				setState(437);
				match(T__82);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				match(WORD);
				setState(439);
				match(T__33);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				match(WORD);
				setState(441);
				match(T__83);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(442);
				match(WORD);
				setState(443);
				match(T__84);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3]\u01c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\5\2\65\n\2\3\2\6\28\n\2\r\2\16\29\3\2\5\2=\n\2\3\2\7\2@\n\2\f"+
		"\2\16\2C\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Q\n\3"+
		"\3\4\3\4\3\4\3\4\5\4W\n\4\3\4\3\4\3\4\5\4\\\n\4\3\4\5\4_\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4f\n\4\3\5\5\5i\n\5\3\5\3\5\3\5\5\5n\n\5\3\5\6\5q\n\5\r\5"+
		"\16\5r\3\5\3\5\5\5w\n\5\3\5\3\5\5\5{\n\5\3\5\3\5\3\5\3\5\5\5\u0081\n\5"+
		"\3\5\5\5\u0084\n\5\3\5\3\5\3\5\5\5\u0089\n\5\3\5\3\5\5\5\u008d\n\5\3\6"+
		"\5\6\u0090\n\6\3\6\3\6\3\6\5\6\u0095\n\6\3\6\6\6\u0098\n\6\r\6\16\6\u0099"+
		"\3\6\3\6\5\6\u009e\n\6\3\6\3\6\5\6\u00a2\n\6\3\6\3\6\3\6\3\6\5\6\u00a8"+
		"\n\6\3\6\5\6\u00ab\n\6\3\6\3\6\3\6\5\6\u00b0\n\6\3\6\3\6\5\6\u00b4\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00bd\n\7\3\7\3\7\7\7\u00c1\n\7\f\7\16"+
		"\7\u00c4\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00cd\n\b\3\b\7\b\u00d0"+
		"\n\b\f\b\16\b\u00d3\13\b\3\t\3\t\3\t\3\t\5\t\u00d9\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e5\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f9"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u010b\n\f\3\r\3\r\5\r\u010f\n\r\3\r\5\r\u0112\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0126\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u014c"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u015e\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22"+
		"\u0167\n\22\f\22\16\22\u016a\13\22\3\22\3\22\5\22\u016e\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0176\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0182\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u019c\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u01aa\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30"+
		"\u01b3\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01bf"+
		"\n\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2"+
		"\2\2\u0226\2\62\3\2\2\2\4P\3\2\2\2\6e\3\2\2\2\b\u008c\3\2\2\2\n\u00b3"+
		"\3\2\2\2\f\u00b5\3\2\2\2\16\u00c5\3\2\2\2\20\u00d8\3\2\2\2\22\u00e4\3"+
		"\2\2\2\24\u00f8\3\2\2\2\26\u010a\3\2\2\2\30\u0111\3\2\2\2\32\u0125\3\2"+
		"\2\2\34\u014b\3\2\2\2\36\u015d\3\2\2\2 \u015f\3\2\2\2\"\u016d\3\2\2\2"+
		"$\u0175\3\2\2\2&\u0181\3\2\2\2(\u019b\3\2\2\2*\u01a9\3\2\2\2,\u01ab\3"+
		"\2\2\2.\u01b2\3\2\2\2\60\u01be\3\2\2\2\62\64\5\4\3\2\63\65\5.\30\2\64"+
		"\63\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\668\5\n\6\2\67\66\3\2\2\289\3"+
		"\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;=\5.\30\2<;\3\2\2\2<=\3\2\2\2="+
		"A\3\2\2\2>@\5\6\4\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2"+
		"CA\3\2\2\2DE\7\3\2\2E\3\3\2\2\2FG\7\4\2\2GQ\7\5\2\2HI\7\6\2\2IQ\7\7\2"+
		"\2JK\7\b\2\2KQ\7\5\2\2LM\7\t\2\2MQ\7\7\2\2NO\7\n\2\2OQ\7\7\2\2PF\3\2\2"+
		"\2PH\3\2\2\2PJ\3\2\2\2PL\3\2\2\2PN\3\2\2\2Q\5\3\2\2\2RS\5\26\f\2ST\5\b"+
		"\5\2Tf\3\2\2\2UW\5\26\f\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2Xf\5\30\r\2Y^\5"+
		"\36\20\2Z\\\5&\24\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]_\5$\23\2^[\3\2\2"+
		"\2^_\3\2\2\2_`\3\2\2\2`a\5\b\5\2af\3\2\2\2bc\5\36\20\2cd\5\30\r\2df\3"+
		"\2\2\2eR\3\2\2\2eV\3\2\2\2eY\3\2\2\2eb\3\2\2\2f\7\3\2\2\2gi\5&\24\2hg"+
		"\3\2\2\2hi\3\2\2\2ij\3\2\2\2jz\5\f\7\2km\7\13\2\2ln\5&\24\2ml\3\2\2\2"+
		"mn\3\2\2\2no\3\2\2\2oq\5\f\7\2pk\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2"+
		"st\3\2\2\2tv\7\f\2\2uw\5&\24\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\5\f\7\2"+
		"y{\3\2\2\2zp\3\2\2\2z{\3\2\2\2{\u0080\3\2\2\2|}\5 \21\2}~\5&\24\2~\177"+
		"\5\f\7\2\177\u0081\3\2\2\2\u0080|\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u008d"+
		"\3\2\2\2\u0082\u0084\5&\24\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\5\f\7\2\u0086\u0088\7\f\2\2\u0087\u0089\5&"+
		"\24\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\5\f\7\2\u008b\u008d\3\2\2\2\u008ch\3\2\2\2\u008c\u0083\3\2\2\2"+
		"\u008d\t\3\2\2\2\u008e\u0090\5&\24\2\u008f\u008e\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\u00a1\5\16\b\2\u0092\u0094\7\13\2\2\u0093"+
		"\u0095\5&\24\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\5\16\b\2\u0097\u0092\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\7\f"+
		"\2\2\u009c\u009e\5&\24\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\5\16\b\2\u00a0\u00a2\3\2\2\2\u00a1\u0097\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a7\3\2\2\2\u00a3\u00a4\5 \21\2\u00a4"+
		"\u00a5\5&\24\2\u00a5\u00a6\5\16\b\2\u00a6\u00a8\3\2\2\2\u00a7\u00a3\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00b4\3\2\2\2\u00a9\u00ab\5&\24\2\u00aa"+
		"\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\5\16"+
		"\b\2\u00ad\u00af\7\f\2\2\u00ae\u00b0\5&\24\2\u00af\u00ae\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5\16\b\2\u00b2\u00b4\3"+
		"\2\2\2\u00b3\u008f\3\2\2\2\u00b3\u00aa\3\2\2\2\u00b4\13\3\2\2\2\u00b5"+
		"\u00c2\5\20\t\2\u00b6\u00c1\5\20\t\2\u00b7\u00c1\5*\26\2\u00b8\u00c1\5"+
		",\27\2\u00b9\u00c1\5\"\22\2\u00ba\u00c1\5.\30\2\u00bb\u00bd\5&\24\2\u00bc"+
		"\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\5$"+
		"\23\2\u00bf\u00c1\5\30\r\2\u00c0\u00b6\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0"+
		"\u00b8\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bc\3\2"+
		"\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\r\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00d1\5\20\t"+
		"\2\u00c6\u00d0\5\20\t\2\u00c7\u00d0\5*\26\2\u00c8\u00d0\5,\27\2\u00c9"+
		"\u00d0\5\"\22\2\u00ca\u00d0\5.\30\2\u00cb\u00cd\5&\24\2\u00cc\u00cb\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\5$\23\2\u00cf"+
		"\u00c6\3\2\2\2\u00cf\u00c7\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00c9\3\2"+
		"\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\17\3\2\2\2\u00d3\u00d1\3\2\2"+
		"\2\u00d4\u00d9\5\22\n\2\u00d5\u00d9\5\24\13\2\u00d6\u00d9\5\32\16\2\u00d7"+
		"\u00d9\5*\26\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d7\3\2\2\2\u00d9\21\3\2\2\2\u00da\u00db\7[\2\2\u00db\u00e5"+
		"\7\r\2\2\u00dc\u00dd\7[\2\2\u00dd\u00e5\7\16\2\2\u00de\u00df\7[\2\2\u00df"+
		"\u00e5\7\17\2\2\u00e0\u00e1\7[\2\2\u00e1\u00e5\7\20\2\2\u00e2\u00e3\7"+
		"[\2\2\u00e3\u00e5\7\21\2\2\u00e4\u00da\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4"+
		"\u00de\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\23\3\2\2"+
		"\2\u00e6\u00e7\7\22\2\2\u00e7\u00f9\7\r\2\2\u00e8\u00e9\7\23\2\2\u00e9"+
		"\u00f9\7\r\2\2\u00ea\u00eb\7\24\2\2\u00eb\u00f9\7\25\2\2\u00ec\u00ed\7"+
		"\26\2\2\u00ed\u00f9\7\25\2\2\u00ee\u00ef\7\27\2\2\u00ef\u00f9\7\25\2\2"+
		"\u00f0\u00f1\7\30\2\2\u00f1\u00f9\7\r\2\2\u00f2\u00f3\7\31\2\2\u00f3\u00f9"+
		"\7\r\2\2\u00f4\u00f5\7\32\2\2\u00f5\u00f9\7\r\2\2\u00f6\u00f7\7\33\2\2"+
		"\u00f7\u00f9\7\r\2\2\u00f8\u00e6\3\2\2\2\u00f8\u00e8\3\2\2\2\u00f8\u00ea"+
		"\3\2\2\2\u00f8\u00ec\3\2\2\2\u00f8\u00ee\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f8"+
		"\u00f2\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\25\3\2\2"+
		"\2\u00fa\u00fb\7\34\2\2\u00fb\u010b\7\35\2\2\u00fc\u00fd\7\36\2\2\u00fd"+
		"\u010b\7\35\2\2\u00fe\u00ff\7\37\2\2\u00ff\u010b\7\35\2\2\u0100\u0101"+
		"\7 \2\2\u0101\u010b\7\35\2\2\u0102\u0103\7!\2\2\u0103\u010b\7\35\2\2\u0104"+
		"\u0105\7\"\2\2\u0105\u010b\7\35\2\2\u0106\u0107\7\t\2\2\u0107\u010b\7"+
		"\7\2\2\u0108\u0109\7#\2\2\u0109\u010b\7$\2\2\u010a\u00fa\3\2\2\2\u010a"+
		"\u00fc\3\2\2\2\u010a\u00fe\3\2\2\2\u010a\u0100\3\2\2\2\u010a\u0102\3\2"+
		"\2\2\u010a\u0104\3\2\2\2\u010a\u0106\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\27\3\2\2\2\u010c\u010e\5\b\5\2\u010d\u010f\5\34\17\2\u010e\u010d\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u0112\5\34\17\2\u0111"+
		"\u010c\3\2\2\2\u0111\u0110\3\2\2\2\u0112\31\3\2\2\2\u0113\u0114\7%\2\2"+
		"\u0114\u0126\7\r\2\2\u0115\u0116\7&\2\2\u0116\u0126\7\r\2\2\u0117\u0118"+
		"\7\'\2\2\u0118\u0126\7\25\2\2\u0119\u011a\7(\2\2\u011a\u0126\7\r\2\2\u011b"+
		"\u011c\7)\2\2\u011c\u0126\7\r\2\2\u011d\u011e\7*\2\2\u011e\u0126\7\r\2"+
		"\2\u011f\u0120\7+\2\2\u0120\u0126\7\r\2\2\u0121\u0122\7,\2\2\u0122\u0126"+
		"\7\r\2\2\u0123\u0124\7-\2\2\u0124\u0126\7\r\2\2\u0125\u0113\3\2\2\2\u0125"+
		"\u0115\3\2\2\2\u0125\u0117\3\2\2\2\u0125\u0119\3\2\2\2\u0125\u011b\3\2"+
		"\2\2\u0125\u011d\3\2\2\2\u0125\u011f\3\2\2\2\u0125\u0121\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0126\33\3\2\2\2\u0127\u0128\7X\2\2\u0128\u0129\7.\2\2"+
		"\u0129\u012a\7Y\2\2\u012a\u012b\7.\2\2\u012b\u014c\7Z\2\2\u012c\u012d"+
		"\7Y\2\2\u012d\u012e\7.\2\2\u012e\u014c\7Z\2\2\u012f\u014c\7X\2\2\u0130"+
		"\u014c\7Y\2\2\u0131\u0132\7Z\2\2\u0132\u014c\7/\2\2\u0133\u0134\7X\2\2"+
		"\u0134\u0135\7\60\2\2\u0135\u0136\5(\25\2\u0136\u0137\7\60\2\2\u0137\u0138"+
		"\7Z\2\2\u0138\u014c\3\2\2\2\u0139\u013a\5(\25\2\u013a\u013b\7\60\2\2\u013b"+
		"\u013c\7Z\2\2\u013c\u014c\3\2\2\2\u013d\u013e\7Y\2\2\u013e\u013f\7.\2"+
		"\2\u013f\u0140\7X\2\2\u0140\u0141\7.\2\2\u0141\u014c\7Z\2\2\u0142\u0143"+
		"\5(\25\2\u0143\u0144\7X\2\2\u0144\u0145\7\13\2\2\u0145\u0146\7Z\2\2\u0146"+
		"\u014c\3\2\2\2\u0147\u0148\5(\25\2\u0148\u0149\7\13\2\2\u0149\u014a\7"+
		"Z\2\2\u014a\u014c\3\2\2\2\u014b\u0127\3\2\2\2\u014b\u012c\3\2\2\2\u014b"+
		"\u012f\3\2\2\2\u014b\u0130\3\2\2\2\u014b\u0131\3\2\2\2\u014b\u0133\3\2"+
		"\2\2\u014b\u0139\3\2\2\2\u014b\u013d\3\2\2\2\u014b\u0142\3\2\2\2\u014b"+
		"\u0147\3\2\2\2\u014c\35\3\2\2\2\u014d\u014e\7\61\2\2\u014e\u015e\7\25"+
		"\2\2\u014f\u0150\7\62\2\2\u0150\u015e\7\63\2\2\u0151\u0152\7\64\2\2\u0152"+
		"\u015e\7\65\2\2\u0153\u0154\7\66\2\2\u0154\u015e\7\67\2\2\u0155\u0156"+
		"\7\64\2\2\u0156\u015e\7\65\2\2\u0157\u0158\78\2\2\u0158\u015e\7\35\2\2"+
		"\u0159\u015a\79\2\2\u015a\u015e\7:\2\2\u015b\u015c\7;\2\2\u015c\u015e"+
		"\7\35\2\2\u015d\u014d\3\2\2\2\u015d\u014f\3\2\2\2\u015d\u0151\3\2\2\2"+
		"\u015d\u0153\3\2\2\2\u015d\u0155\3\2\2\2\u015d\u0157\3\2\2\2\u015d\u0159"+
		"\3\2\2\2\u015d\u015b\3\2\2\2\u015e\37\3\2\2\2\u015f\u0160\7<\2\2\u0160"+
		"\u0161\7\35\2\2\u0161!\3\2\2\2\u0162\u0163\7[\2\2\u0163\u0168\7=\2\2\u0164"+
		"\u0167\5\60\31\2\u0165\u0167\5,\27\2\u0166\u0164\3\2\2\2\u0166\u0165\3"+
		"\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016e\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7[\2\2\u016c\u016e\7>\2"+
		"\2\u016d\u0162\3\2\2\2\u016d\u016b\3\2\2\2\u016e#\3\2\2\2\u016f\u0170"+
		"\7[\2\2\u0170\u0176\7\65\2\2\u0171\u0172\7[\2\2\u0172\u0176\7\63\2\2\u0173"+
		"\u0174\7[\2\2\u0174\u0176\7?\2\2\u0175\u016f\3\2\2\2\u0175\u0171\3\2\2"+
		"\2\u0175\u0173\3\2\2\2\u0176%\3\2\2\2\u0177\u0178\7@\2\2\u0178\u0182\7"+
		":\2\2\u0179\u017a\7<\2\2\u017a\u0182\7\35\2\2\u017b\u017c\7<\2\2\u017c"+
		"\u017d\7\35\2\2\u017d\u017e\7A\2\2\u017e\u0182\7:\2\2\u017f\u0180\7A\2"+
		"\2\u0180\u0182\7:\2\2\u0181\u0177\3\2\2\2\u0181\u0179\3\2\2\2\u0181\u017b"+
		"\3\2\2\2\u0181\u017f\3\2\2\2\u0182\'\3\2\2\2\u0183\u0184\7B\2\2\u0184"+
		"\u019c\7\r\2\2\u0185\u0186\7C\2\2\u0186\u019c\7\r\2\2\u0187\u0188\7D\2"+
		"\2\u0188\u019c\7E\2\2\u0189\u018a\7F\2\2\u018a\u019c\7E\2\2\u018b\u018c"+
		"\7G\2\2\u018c\u019c\7H\2\2\u018d\u018e\7I\2\2\u018e\u019c\7\r\2\2\u018f"+
		"\u0190\7J\2\2\u0190\u019c\7\r\2\2\u0191\u0192\7K\2\2\u0192\u019c\7\r\2"+
		"\2\u0193\u0194\7L\2\2\u0194\u019c\7\r\2\2\u0195\u0196\7M\2\2\u0196\u019c"+
		"\7\r\2\2\u0197\u0198\7N\2\2\u0198\u019c\7\r\2\2\u0199\u019a\7O\2\2\u019a"+
		"\u019c\7\r\2\2\u019b\u0183\3\2\2\2\u019b\u0185\3\2\2\2\u019b\u0187\3\2"+
		"\2\2\u019b\u0189\3\2\2\2\u019b\u018b\3\2\2\2\u019b\u018d\3\2\2\2\u019b"+
		"\u018f\3\2\2\2\u019b\u0191\3\2\2\2\u019b\u0193\3\2\2\2\u019b\u0195\3\2"+
		"\2\2\u019b\u0197\3\2\2\2\u019b\u0199\3\2\2\2\u019c)\3\2\2\2\u019d\u019e"+
		"\7[\2\2\u019e\u01aa\7\25\2\2\u019f\u01a0\7[\2\2\u01a0\u01aa\7\67\2\2\u01a1"+
		"\u01a2\7[\2\2\u01a2\u01aa\7P\2\2\u01a3\u01a4\7[\2\2\u01a4\u01aa\7/\2\2"+
		"\u01a5\u01a6\7[\2\2\u01a6\u01aa\7Q\2\2\u01a7\u01a8\7[\2\2\u01a8\u01aa"+
		"\7R\2\2\u01a9\u019d\3\2\2\2\u01a9\u019f\3\2\2\2\u01a9\u01a1\3\2\2\2\u01a9"+
		"\u01a3\3\2\2\2\u01a9\u01a5\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa+\3\2\2\2"+
		"\u01ab\u01ac\7[\2\2\u01ac\u01ad\7S\2\2\u01ad-\3\2\2\2\u01ae\u01b3\5\22"+
		"\n\2\u01af\u01b3\5\60\31\2\u01b0\u01b3\5*\26\2\u01b1\u01b3\5&\24\2\u01b2"+
		"\u01ae\3\2\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2"+
		"\2\2\u01b3/\3\2\2\2\u01b4\u01b5\7[\2\2\u01b5\u01bf\7T\2\2\u01b6\u01b7"+
		"\7[\2\2\u01b7\u01bf\7U\2\2\u01b8\u01b9\7[\2\2\u01b9\u01bf\7$\2\2\u01ba"+
		"\u01bb\7[\2\2\u01bb\u01bf\7V\2\2\u01bc\u01bd\7[\2\2\u01bd\u01bf\7W\2\2"+
		"\u01be\u01b4\3\2\2\2\u01be\u01b6\3\2\2\2\u01be\u01b8\3\2\2\2\u01be\u01ba"+
		"\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\61\3\2\2\2\65\649<APV[^ehmrvz\u0080"+
		"\u0083\u0088\u008c\u008f\u0094\u0099\u009d\u00a1\u00a7\u00aa\u00af\u00b3"+
		"\u00bc\u00c0\u00c2\u00cc\u00cf\u00d1\u00d8\u00e4\u00f8\u010a\u010e\u0111"+
		"\u0125\u014b\u015d\u0166\u0168\u016d\u0175\u0181\u019b\u01a9\u01b2\u01be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}