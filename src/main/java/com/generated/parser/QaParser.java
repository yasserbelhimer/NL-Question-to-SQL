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
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, DD=89, YYYY=90, WORD=91, WS=92;
	public static final int
		RULE_wh_question = 0, RULE_question_pronoun = 1, RULE_filter = 2, RULE_ng_filter = 3, 
		RULE_ng = 4, RULE_ng1_filter = 5, RULE_ng1 = 6, RULE_nominal_term = 7, 
		RULE_mg = 8, RULE_noun = 9, RULE_prepeposition = 10, RULE_measure_indicator = 11, 
		RULE_dimention_marker = 12, RULE_temporal_dimention = 13, RULE_spatial_dimention = 14, 
		RULE_spatial_lexion = 15, RULE_temporal_lexion = 16, RULE_date = 17, RULE_wh_determiner = 18, 
		RULE_adverb = 19, RULE_dt = 20, RULE_mmm = 21, RULE_adjective = 22, RULE_past_participle = 23, 
		RULE_string = 24, RULE_verb = 25, RULE_dim = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"wh_question", "question_pronoun", "filter", "ng_filter", "ng", "ng1_filter", 
			"ng1", "nominal_term", "mg", "noun", "prepeposition", "measure_indicator", 
			"dimention_marker", "temporal_dimention", "spatial_dimention", "spatial_lexion", 
			"temporal_lexion", "date", "wh_determiner", "adverb", "dt", "mmm", "adjective", 
			"past_participle", "string", "verb", "dim"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'?_.'", "'what'", "'_WP'", "'who'", "'when'", "'_WRB'", "'where'", 
			"',_,'", "'and_CC'", "'_PRP'", "'_FW'", "'_NN'", "'_NNS'", "'_NNP'", 
			"'_NNPS'", "'of'", "'_IN'", "'the'", "'_DT'", "'quantity'", "'amount'", 
			"'total'", "'_JJ'", "'many'", "'numbre'", "'volume'", "'ration'", "'percentage'", 
			"'degree'", "'for'", "'during'", "'in'", "'at'", "'on'", "'since'", "'while'", 
			"'according'", "'_VBG'", "'between'", "'with'", "'city'", "'town'", "'country'", 
			"'village'", "'region'", "'time'", "'year'", "'month'", "'day'", "'season'", 
			"'hour'", "'minute'", "'seconde'", "'/'", "'_CD'", "'-'", "'_WDT'", "'_WP$'", 
			"'_RB'", "'_RBR'", "'_RBS'", "'a'", "'jan'", "'feb'", "'mar'", "'apr'", 
			"'may'", "'_MD'", "'jun'", "'jul'", "'aug'", "'sep'", "'oct'", "'nov'", 
			"'dec'", "'_JJR'", "'_JJS'", "'_POS'", "'_EX'", "'_VBN'", "'_VB'", "'_VBD'", 
			"'_VBP'", "'_VBZ'", "'today'", "'this'", "'last'", "'yesterday'"
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
			null, null, null, null, null, "DD", "YYYY", "WORD", "WS"
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

	public static class Wh_questionContext extends ParserRuleContext {
		public Question_pronounContext question_pronoun() {
			return getRuleContext(Question_pronounContext.class,0);
		}
		public TerminalNode EOF() { return getToken(QaParser.EOF, 0); }
		public MgContext mg() {
			return getRuleContext(MgContext.class,0);
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
		public Wh_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wh_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterWh_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitWh_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitWh_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wh_questionContext wh_question() throws RecognitionException {
		Wh_questionContext _localctx = new Wh_questionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_wh_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			question_pronoun();
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(55);
				mg();
				}
				break;
			}
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				ng();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__61))) != 0) || _la==WORD );
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__15) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__38) | (1L << T__39))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (T__85 - 85)) | (1L << (T__86 - 85)) | (1L << (T__87 - 85)))) != 0)) {
				{
				{
				setState(63);
				filter();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(T__0);
			setState(70);
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

	public static class Question_pronounContext extends ParserRuleContext {
		public Question_pronounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question_pronoun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterQuestion_pronoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitQuestion_pronoun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitQuestion_pronoun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Question_pronounContext question_pronoun() throws RecognitionException {
		Question_pronounContext _localctx = new Question_pronounContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_question_pronoun);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T__1);
				setState(73);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__3);
				setState(75);
				match(T__2);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(T__4);
				setState(77);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				match(T__6);
				setState(79);
				match(T__5);
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
		public AdverbContext adverb() {
			return getRuleContext(AdverbContext.class,0);
		}
		public DtContext dt() {
			return getRuleContext(DtContext.class,0);
		}
		public DimContext dim() {
			return getRuleContext(DimContext.class,0);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__15:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__38:
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				dimention_marker();
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__17 || _la==T__61) {
						{
						setState(83);
						dt();
						}
					}

					setState(86);
					adverb();
					}
					break;
				}
				setState(89);
				ng_filter();
				}
				break;
			case T__84:
			case T__85:
			case T__86:
			case T__87:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				dim();
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
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__61) {
					{
					setState(94);
					dt();
					}
				}

				setState(97);
				ng1_filter();
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(98);
						match(T__7);
						setState(100);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__17 || _la==T__61) {
							{
							setState(99);
							dt();
							}
						}

						setState(102);
						ng1_filter();
						}
						}
						setState(105); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__7 );
					setState(107);
					match(T__8);
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__17 || _la==T__61) {
						{
						setState(108);
						dt();
						}
					}

					setState(111);
					ng1_filter();
					}
					break;
				}
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(115);
					ng1_filter();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__61) {
					{
					setState(118);
					dt();
					}
				}

				setState(121);
				ng1_filter();
				setState(122);
				match(T__8);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__61) {
					{
					setState(123);
					dt();
					}
				}

				setState(126);
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
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__61) {
					{
					setState(130);
					dt();
					}
				}

				setState(133);
				ng1();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(134);
						match(T__7);
						setState(136);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__17 || _la==T__61) {
							{
							setState(135);
							dt();
							}
						}

						setState(138);
						ng1();
						}
						}
						setState(141); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__7 );
					setState(143);
					match(T__8);
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__17 || _la==T__61) {
						{
						setState(144);
						dt();
						}
					}

					setState(147);
					ng1();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__61) {
					{
					setState(151);
					dt();
					}
				}

				setState(154);
				ng1();
				setState(155);
				match(T__8);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__61) {
					{
					setState(156);
					dt();
					}
				}

				setState(159);
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
		public List<Spatial_dimentionContext> spatial_dimention() {
			return getRuleContexts(Spatial_dimentionContext.class);
		}
		public Spatial_dimentionContext spatial_dimention(int i) {
			return getRuleContext(Spatial_dimentionContext.class,i);
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
			setState(163);
			nominal_term();
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(174);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(164);
						nominal_term();
						}
						break;
					case 2:
						{
						setState(165);
						adjective();
						}
						break;
					case 3:
						{
						setState(166);
						past_participle();
						}
						break;
					case 4:
						{
						setState(167);
						wh_determiner();
						}
						break;
					case 5:
						{
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__17 || _la==T__61) {
							{
							setState(168);
							dt();
							}
						}

						setState(171);
						adverb();
						}
						break;
					case 6:
						{
						setState(172);
						temporal_dimention();
						}
						break;
					case 7:
						{
						setState(173);
						spatial_dimention();
						}
						break;
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		public List<AdverbContext> adverb() {
			return getRuleContexts(AdverbContext.class);
		}
		public AdverbContext adverb(int i) {
			return getRuleContext(AdverbContext.class,i);
		}
		public List<MgContext> mg() {
			return getRuleContexts(MgContext.class);
		}
		public MgContext mg(int i) {
			return getRuleContext(MgContext.class,i);
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
			setState(179);
			nominal_term();
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(189);
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
						setState(185);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__17 || _la==T__61) {
							{
							setState(184);
							dt();
							}
						}

						setState(187);
						adverb();
						}
						break;
					case 6:
						{
						setState(188);
						mg();
						}
						break;
					}
					} 
				}
				setState(193);
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

	public static class Nominal_termContext extends ParserRuleContext {
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public Measure_indicatorContext measure_indicator() {
			return getRuleContext(Measure_indicatorContext.class,0);
		}
		public PrepepositionContext prepeposition() {
			return getRuleContext(PrepepositionContext.class,0);
		}
		public Temporal_lexionContext temporal_lexion() {
			return getRuleContext(Temporal_lexionContext.class,0);
		}
		public Spatial_lexionContext spatial_lexion() {
			return getRuleContext(Spatial_lexionContext.class,0);
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
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				noun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				measure_indicator();
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(196);
					prepeposition();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				temporal_lexion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				spatial_lexion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
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

	public static class MgContext extends ParserRuleContext {
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public TerminalNode WORD() { return getToken(QaParser.WORD, 0); }
		public MgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterMg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitMg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitMg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MgContext mg() throws RecognitionException {
		MgContext _localctx = new MgContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mg);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				verb();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(WORD);
				setState(206);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(WORD);
				setState(208);
				match(T__10);
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
		enterRule(_localctx, 18, RULE_noun);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(WORD);
				setState(212);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(WORD);
				setState(214);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(WORD);
				setState(216);
				match(T__13);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				match(WORD);
				setState(218);
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
		enterRule(_localctx, 20, RULE_prepeposition);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(T__15);
				setState(222);
				match(T__16);
				setState(223);
				match(T__17);
				setState(224);
				match(T__18);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(T__15);
				setState(226);
				match(T__16);
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
		enterRule(_localctx, 22, RULE_measure_indicator);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(T__19);
				setState(230);
				match(T__11);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(T__20);
				setState(232);
				match(T__11);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(T__21);
				setState(234);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(T__23);
				setState(236);
				match(T__22);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				match(T__24);
				setState(238);
				match(T__22);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				match(T__25);
				setState(240);
				match(T__11);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 7);
				{
				setState(241);
				match(T__26);
				setState(242);
				match(T__11);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
				match(T__27);
				setState(244);
				match(T__11);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 9);
				{
				setState(245);
				match(T__28);
				setState(246);
				match(T__11);
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
		enterRule(_localctx, 24, RULE_dimention_marker);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(T__29);
				setState(250);
				match(T__16);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(T__30);
				setState(252);
				match(T__16);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(T__31);
				setState(254);
				match(T__16);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(T__32);
				setState(256);
				match(T__16);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				match(T__15);
				setState(258);
				match(T__16);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				match(T__33);
				setState(260);
				match(T__16);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 7);
				{
				setState(261);
				match(T__34);
				setState(262);
				match(T__16);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 8);
				{
				setState(263);
				match(T__35);
				setState(264);
				match(T__16);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 9);
				{
				setState(265);
				match(T__4);
				setState(266);
				match(T__5);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 10);
				{
				setState(267);
				match(T__36);
				setState(268);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 11);
				{
				setState(269);
				match(T__38);
				setState(270);
				match(T__16);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 12);
				{
				setState(271);
				match(T__39);
				setState(272);
				match(T__16);
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
		enterRule(_localctx, 26, RULE_temporal_dimention);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__19:
			case T__20:
			case T__21:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__61:
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				ng_filter();
				setState(277);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(276);
					date();
					}
					break;
				}
				}
				break;
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case DD:
			case YYYY:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
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

	public static class Spatial_dimentionContext extends ParserRuleContext {
		public Spatial_lexionContext spatial_lexion() {
			return getRuleContext(Spatial_lexionContext.class,0);
		}
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public Spatial_dimentionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spatial_dimention; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterSpatial_dimention(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitSpatial_dimention(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitSpatial_dimention(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spatial_dimentionContext spatial_dimention() throws RecognitionException {
		Spatial_dimentionContext _localctx = new Spatial_dimentionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_spatial_dimention);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			spatial_lexion();
			setState(283);
			noun();
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

	public static class Spatial_lexionContext extends ParserRuleContext {
		public Spatial_lexionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spatial_lexion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterSpatial_lexion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitSpatial_lexion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitSpatial_lexion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spatial_lexionContext spatial_lexion() throws RecognitionException {
		Spatial_lexionContext _localctx = new Spatial_lexionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_spatial_lexion);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(T__40);
				setState(286);
				match(T__11);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(T__41);
				setState(288);
				match(T__11);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(T__42);
				setState(290);
				match(T__11);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				match(T__43);
				setState(292);
				match(T__11);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
				match(T__44);
				setState(294);
				match(T__11);
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
		enterRule(_localctx, 32, RULE_temporal_lexion);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(T__45);
				setState(298);
				match(T__11);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(T__46);
				setState(300);
				match(T__11);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				match(T__47);
				setState(302);
				match(T__11);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				match(T__48);
				setState(304);
				match(T__11);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 5);
				{
				setState(305);
				match(T__49);
				setState(306);
				match(T__11);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 6);
				{
				setState(307);
				match(T__50);
				setState(308);
				match(T__11);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 7);
				{
				setState(309);
				match(T__51);
				setState(310);
				match(T__11);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 8);
				{
				setState(311);
				match(T__52);
				setState(312);
				match(T__11);
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
		public List<TerminalNode> DD() { return getTokens(QaParser.DD); }
		public TerminalNode DD(int i) {
			return getToken(QaParser.DD, i);
		}
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
		enterRule(_localctx, 34, RULE_date);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(DD);
				setState(316);
				match(T__53);
				setState(317);
				match(DD);
				setState(318);
				match(T__53);
				setState(319);
				match(YYYY);
				setState(320);
				match(T__54);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(DD);
				setState(322);
				match(T__55);
				setState(323);
				match(DD);
				setState(324);
				match(T__55);
				setState(325);
				match(YYYY);
				setState(326);
				match(T__54);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				match(DD);
				setState(328);
				match(T__53);
				setState(329);
				match(YYYY);
				setState(330);
				match(T__54);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				match(DD);
				setState(332);
				match(T__54);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(333);
				match(YYYY);
				setState(334);
				match(T__54);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(335);
				match(DD);
				setState(336);
				match(T__55);
				setState(337);
				mmm();
				setState(338);
				match(T__55);
				setState(339);
				match(YYYY);
				setState(340);
				match(T__54);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(342);
				mmm();
				setState(343);
				match(T__55);
				setState(344);
				match(YYYY);
				setState(345);
				match(T__54);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(347);
				match(DD);
				setState(348);
				match(T__53);
				setState(349);
				match(DD);
				setState(350);
				match(T__53);
				setState(351);
				match(YYYY);
				setState(352);
				match(T__54);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(353);
				mmm();
				setState(354);
				match(DD);
				setState(355);
				match(T__7);
				setState(356);
				match(YYYY);
				setState(357);
				match(T__54);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(359);
				mmm();
				setState(360);
				match(T__7);
				setState(361);
				match(YYYY);
				setState(362);
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
		enterRule(_localctx, 36, RULE_wh_determiner);
		try {
			int _alt;
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(WORD);
				setState(367);
				match(T__56);
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(370);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(368);
							verb();
							}
							break;
						case 2:
							{
							setState(369);
							past_participle();
							}
							break;
						}
						} 
					}
					setState(374);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(WORD);
				setState(376);
				match(T__57);
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
		enterRule(_localctx, 38, RULE_adverb);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(WORD);
				setState(380);
				match(T__58);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				match(WORD);
				setState(382);
				match(T__59);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				match(WORD);
				setState(384);
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
		enterRule(_localctx, 40, RULE_dt);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__61:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(T__61);
				setState(388);
				match(T__18);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(T__17);
				setState(390);
				match(T__18);
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
		enterRule(_localctx, 42, RULE_mmm);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__62:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(T__62);
				setState(394);
				match(T__11);
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(T__63);
				setState(396);
				match(T__11);
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				match(T__64);
				setState(398);
				match(T__10);
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				match(T__65);
				setState(400);
				match(T__10);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 5);
				{
				setState(401);
				match(T__66);
				setState(402);
				match(T__67);
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 6);
				{
				setState(403);
				match(T__68);
				setState(404);
				match(T__11);
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 7);
				{
				setState(405);
				match(T__69);
				setState(406);
				match(T__11);
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 8);
				{
				setState(407);
				match(T__70);
				setState(408);
				match(T__11);
				}
				break;
			case T__71:
				enterOuterAlt(_localctx, 9);
				{
				setState(409);
				match(T__71);
				setState(410);
				match(T__11);
				}
				break;
			case T__72:
				enterOuterAlt(_localctx, 10);
				{
				setState(411);
				match(T__72);
				setState(412);
				match(T__11);
				}
				break;
			case T__73:
				enterOuterAlt(_localctx, 11);
				{
				setState(413);
				match(T__73);
				setState(414);
				match(T__11);
				}
				break;
			case T__74:
				enterOuterAlt(_localctx, 12);
				{
				setState(415);
				match(T__74);
				setState(416);
				match(T__11);
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
		enterRule(_localctx, 44, RULE_adjective);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(WORD);
				setState(420);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(WORD);
				setState(422);
				match(T__75);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				match(WORD);
				setState(424);
				match(T__76);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				match(WORD);
				setState(426);
				match(T__54);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(427);
				match(WORD);
				setState(428);
				match(T__77);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(429);
				match(WORD);
				setState(430);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitPast_participle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Past_participleContext past_participle() throws RecognitionException {
		Past_participleContext _localctx = new Past_participleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_past_participle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(WORD);
			setState(434);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_string);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				noun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				verb();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				adjective();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
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
		enterRule(_localctx, 50, RULE_verb);
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				match(WORD);
				setState(443);
				match(T__80);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(WORD);
				setState(445);
				match(T__81);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				match(WORD);
				setState(447);
				match(T__37);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				match(WORD);
				setState(449);
				match(T__82);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(450);
				match(WORD);
				setState(451);
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

	public static class DimContext extends ParserRuleContext {
		public DimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).enterDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QaListener ) ((QaListener)listener).exitDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QaVisitor ) return ((QaVisitor<? extends T>)visitor).visitDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimContext dim() throws RecognitionException {
		DimContext _localctx = new DimContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dim);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(T__84);
				setState(455);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				match(T__85);
				setState(457);
				match(T__18);
				setState(458);
				match(T__48);
				setState(459);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				match(T__86);
				setState(461);
				match(T__22);
				setState(462);
				match(T__48);
				setState(463);
				match(T__11);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(464);
				match(T__87);
				setState(465);
				match(T__11);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(466);
				match(T__85);
				setState(467);
				match(T__18);
				setState(468);
				match(T__47);
				setState(469);
				match(T__11);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(470);
				match(T__86);
				setState(471);
				match(T__22);
				setState(472);
				match(T__47);
				setState(473);
				match(T__11);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(474);
				match(T__85);
				setState(475);
				match(T__18);
				setState(476);
				match(T__46);
				setState(477);
				match(T__11);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(478);
				match(T__86);
				setState(479);
				match(T__22);
				setState(480);
				match(T__46);
				setState(481);
				match(T__11);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3^\u01e7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\5\2;\n\2\3\2\6\2>\n\2\r\2\16\2"+
		"?\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3S\n\3\3\4\3\4\5\4W\n\4\3\4\5\4Z\n\4\3\4\3\4\3\4\5\4_\n\4\3\5\5"+
		"\5b\n\5\3\5\3\5\3\5\5\5g\n\5\3\5\6\5j\n\5\r\5\16\5k\3\5\3\5\5\5p\n\5\3"+
		"\5\3\5\5\5t\n\5\3\5\5\5w\n\5\3\5\5\5z\n\5\3\5\3\5\3\5\5\5\177\n\5\3\5"+
		"\3\5\5\5\u0083\n\5\3\6\5\6\u0086\n\6\3\6\3\6\3\6\5\6\u008b\n\6\3\6\6\6"+
		"\u008e\n\6\r\6\16\6\u008f\3\6\3\6\5\6\u0094\n\6\3\6\3\6\5\6\u0098\n\6"+
		"\3\6\5\6\u009b\n\6\3\6\3\6\3\6\5\6\u00a0\n\6\3\6\3\6\5\6\u00a4\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u00ac\n\7\3\7\3\7\3\7\7\7\u00b1\n\7\f\7\16\7"+
		"\u00b4\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00bc\n\b\3\b\3\b\7\b\u00c0\n"+
		"\b\f\b\16\b\u00c3\13\b\3\t\3\t\3\t\5\t\u00c8\n\t\3\t\3\t\3\t\5\t\u00cd"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00d4\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00de\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e6\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00fa"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0114\n\16"+
		"\3\17\3\17\5\17\u0118\n\17\3\17\5\17\u011b\n\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u012a\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u013c\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u016f\n\23\3\24"+
		"\3\24\3\24\3\24\7\24\u0175\n\24\f\24\16\24\u0178\13\24\3\24\3\24\5\24"+
		"\u017c\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0184\n\25\3\26\3\26\3"+
		"\26\3\26\5\26\u018a\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u01a4\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u01b2\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u01bb"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01c7\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u01e5\n\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\66\2\2\2\u024c\28\3\2\2\2\4R\3\2\2\2\6^\3\2\2\2\b\u0082"+
		"\3\2\2\2\n\u00a3\3\2\2\2\f\u00a5\3\2\2\2\16\u00b5\3\2\2\2\20\u00cc\3\2"+
		"\2\2\22\u00d3\3\2\2\2\24\u00dd\3\2\2\2\26\u00e5\3\2\2\2\30\u00f9\3\2\2"+
		"\2\32\u0113\3\2\2\2\34\u011a\3\2\2\2\36\u011c\3\2\2\2 \u0129\3\2\2\2\""+
		"\u013b\3\2\2\2$\u016e\3\2\2\2&\u017b\3\2\2\2(\u0183\3\2\2\2*\u0189\3\2"+
		"\2\2,\u01a3\3\2\2\2.\u01b1\3\2\2\2\60\u01b3\3\2\2\2\62\u01ba\3\2\2\2\64"+
		"\u01c6\3\2\2\2\66\u01e4\3\2\2\28:\5\4\3\29;\5\22\n\2:9\3\2\2\2:;\3\2\2"+
		"\2;=\3\2\2\2<>\5\n\6\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@D\3\2\2"+
		"\2AC\5\6\4\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2"+
		"\2GH\7\3\2\2HI\7\2\2\3I\3\3\2\2\2JK\7\4\2\2KS\7\5\2\2LM\7\6\2\2MS\7\5"+
		"\2\2NO\7\7\2\2OS\7\b\2\2PQ\7\t\2\2QS\7\b\2\2RJ\3\2\2\2RL\3\2\2\2RN\3\2"+
		"\2\2RP\3\2\2\2S\5\3\2\2\2TY\5\32\16\2UW\5*\26\2VU\3\2\2\2VW\3\2\2\2WX"+
		"\3\2\2\2XZ\5(\25\2YV\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\5\b\5\2\\_\3\2\2\2"+
		"]_\5\66\34\2^T\3\2\2\2^]\3\2\2\2_\7\3\2\2\2`b\5*\26\2a`\3\2\2\2ab\3\2"+
		"\2\2bc\3\2\2\2cs\5\f\7\2df\7\n\2\2eg\5*\26\2fe\3\2\2\2fg\3\2\2\2gh\3\2"+
		"\2\2hj\5\f\7\2id\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mo\7\13"+
		"\2\2np\5*\26\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\5\f\7\2rt\3\2\2\2si\3\2"+
		"\2\2st\3\2\2\2tv\3\2\2\2uw\5\f\7\2vu\3\2\2\2vw\3\2\2\2w\u0083\3\2\2\2"+
		"xz\5*\26\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\5\f\7\2|~\7\13\2\2}\177\5*"+
		"\26\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\5\f\7\2\u0081"+
		"\u0083\3\2\2\2\u0082a\3\2\2\2\u0082y\3\2\2\2\u0083\t\3\2\2\2\u0084\u0086"+
		"\5*\26\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0097\5\16\b\2\u0088\u008a\7\n\2\2\u0089\u008b\5*\26\2\u008a\u0089\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\5\16\b\2\u008d"+
		"\u0088\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0093\7\13\2\2\u0092\u0094\5*\26\2\u0093"+
		"\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\5\16"+
		"\b\2\u0096\u0098\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u00a4\3\2\2\2\u0099\u009b\5*\26\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009d\5\16\b\2\u009d\u009f\7\13\2\2\u009e"+
		"\u00a0\5*\26\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a2\5\16\b\2\u00a2\u00a4\3\2\2\2\u00a3\u0085\3\2\2\2\u00a3"+
		"\u009a\3\2\2\2\u00a4\13\3\2\2\2\u00a5\u00b2\5\20\t\2\u00a6\u00b1\5\20"+
		"\t\2\u00a7\u00b1\5.\30\2\u00a8\u00b1\5\60\31\2\u00a9\u00b1\5&\24\2\u00aa"+
		"\u00ac\5*\26\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00b1\5(\25\2\u00ae\u00b1\5\34\17\2\u00af\u00b1\5\36\20\2\u00b0"+
		"\u00a6\3\2\2\2\u00b0\u00a7\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00a9\3\2"+
		"\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\r\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b5\u00c1\5\20\t\2\u00b6\u00c0\5\20\t\2\u00b7\u00c0"+
		"\5.\30\2\u00b8\u00c0\5\60\31\2\u00b9\u00c0\5&\24\2\u00ba\u00bc\5*\26\2"+
		"\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c0"+
		"\5(\25\2\u00be\u00c0\5\22\n\2\u00bf\u00b6\3\2\2\2\u00bf\u00b7\3\2\2\2"+
		"\u00bf\u00b8\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\17\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00cd\5\24\13\2\u00c5\u00c7\5\30"+
		"\r\2\u00c6\u00c8\5\26\f\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00cd\3\2\2\2\u00c9\u00cd\5\"\22\2\u00ca\u00cd\5 \21\2\u00cb\u00cd\5"+
		".\30\2\u00cc\u00c4\3\2\2\2\u00cc\u00c5\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\21\3\2\2\2\u00ce\u00d4\5\64\33"+
		"\2\u00cf\u00d0\7]\2\2\u00d0\u00d4\7\f\2\2\u00d1\u00d2\7]\2\2\u00d2\u00d4"+
		"\7\r\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\23\3\2\2\2\u00d5\u00d6\7]\2\2\u00d6\u00de\7\16\2\2\u00d7\u00d8\7]\2\2"+
		"\u00d8\u00de\7\17\2\2\u00d9\u00da\7]\2\2\u00da\u00de\7\20\2\2\u00db\u00dc"+
		"\7]\2\2\u00dc\u00de\7\21\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd"+
		"\u00d9\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\25\3\2\2\2\u00df\u00e0\7\22\2"+
		"\2\u00e0\u00e1\7\23\2\2\u00e1\u00e2\7\24\2\2\u00e2\u00e6\7\25\2\2\u00e3"+
		"\u00e4\7\22\2\2\u00e4\u00e6\7\23\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e3\3"+
		"\2\2\2\u00e6\27\3\2\2\2\u00e7\u00e8\7\26\2\2\u00e8\u00fa\7\16\2\2\u00e9"+
		"\u00ea\7\27\2\2\u00ea\u00fa\7\16\2\2\u00eb\u00ec\7\30\2\2\u00ec\u00fa"+
		"\7\31\2\2\u00ed\u00ee\7\32\2\2\u00ee\u00fa\7\31\2\2\u00ef\u00f0\7\33\2"+
		"\2\u00f0\u00fa\7\31\2\2\u00f1\u00f2\7\34\2\2\u00f2\u00fa\7\16\2\2\u00f3"+
		"\u00f4\7\35\2\2\u00f4\u00fa\7\16\2\2\u00f5\u00f6\7\36\2\2\u00f6\u00fa"+
		"\7\16\2\2\u00f7\u00f8\7\37\2\2\u00f8\u00fa\7\16\2\2\u00f9\u00e7\3\2\2"+
		"\2\u00f9\u00e9\3\2\2\2\u00f9\u00eb\3\2\2\2\u00f9\u00ed\3\2\2\2\u00f9\u00ef"+
		"\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f5\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\31\3\2\2\2\u00fb\u00fc\7 \2\2\u00fc\u0114\7\23\2"+
		"\2\u00fd\u00fe\7!\2\2\u00fe\u0114\7\23\2\2\u00ff\u0100\7\"\2\2\u0100\u0114"+
		"\7\23\2\2\u0101\u0102\7#\2\2\u0102\u0114\7\23\2\2\u0103\u0104\7\22\2\2"+
		"\u0104\u0114\7\23\2\2\u0105\u0106\7$\2\2\u0106\u0114\7\23\2\2\u0107\u0108"+
		"\7%\2\2\u0108\u0114\7\23\2\2\u0109\u010a\7&\2\2\u010a\u0114\7\23\2\2\u010b"+
		"\u010c\7\7\2\2\u010c\u0114\7\b\2\2\u010d\u010e\7\'\2\2\u010e\u0114\7("+
		"\2\2\u010f\u0110\7)\2\2\u0110\u0114\7\23\2\2\u0111\u0112\7*\2\2\u0112"+
		"\u0114\7\23\2\2\u0113\u00fb\3\2\2\2\u0113\u00fd\3\2\2\2\u0113\u00ff\3"+
		"\2\2\2\u0113\u0101\3\2\2\2\u0113\u0103\3\2\2\2\u0113\u0105\3\2\2\2\u0113"+
		"\u0107\3\2\2\2\u0113\u0109\3\2\2\2\u0113\u010b\3\2\2\2\u0113\u010d\3\2"+
		"\2\2\u0113\u010f\3\2\2\2\u0113\u0111\3\2\2\2\u0114\33\3\2\2\2\u0115\u0117"+
		"\5\b\5\2\u0116\u0118\5$\23\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u011b\3\2\2\2\u0119\u011b\5$\23\2\u011a\u0115\3\2\2\2\u011a\u0119\3\2"+
		"\2\2\u011b\35\3\2\2\2\u011c\u011d\5 \21\2\u011d\u011e\5\24\13\2\u011e"+
		"\37\3\2\2\2\u011f\u0120\7+\2\2\u0120\u012a\7\16\2\2\u0121\u0122\7,\2\2"+
		"\u0122\u012a\7\16\2\2\u0123\u0124\7-\2\2\u0124\u012a\7\16\2\2\u0125\u0126"+
		"\7.\2\2\u0126\u012a\7\16\2\2\u0127\u0128\7/\2\2\u0128\u012a\7\16\2\2\u0129"+
		"\u011f\3\2\2\2\u0129\u0121\3\2\2\2\u0129\u0123\3\2\2\2\u0129\u0125\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u012a!\3\2\2\2\u012b\u012c\7\60\2\2\u012c\u013c"+
		"\7\16\2\2\u012d\u012e\7\61\2\2\u012e\u013c\7\16\2\2\u012f\u0130\7\62\2"+
		"\2\u0130\u013c\7\16\2\2\u0131\u0132\7\63\2\2\u0132\u013c\7\16\2\2\u0133"+
		"\u0134\7\64\2\2\u0134\u013c\7\16\2\2\u0135\u0136\7\65\2\2\u0136\u013c"+
		"\7\16\2\2\u0137\u0138\7\66\2\2\u0138\u013c\7\16\2\2\u0139\u013a\7\67\2"+
		"\2\u013a\u013c\7\16\2\2\u013b\u012b\3\2\2\2\u013b\u012d\3\2\2\2\u013b"+
		"\u012f\3\2\2\2\u013b\u0131\3\2\2\2\u013b\u0133\3\2\2\2\u013b\u0135\3\2"+
		"\2\2\u013b\u0137\3\2\2\2\u013b\u0139\3\2\2\2\u013c#\3\2\2\2\u013d\u013e"+
		"\7[\2\2\u013e\u013f\78\2\2\u013f\u0140\7[\2\2\u0140\u0141\78\2\2\u0141"+
		"\u0142\7\\\2\2\u0142\u016f\79\2\2\u0143\u0144\7[\2\2\u0144\u0145\7:\2"+
		"\2\u0145\u0146\7[\2\2\u0146\u0147\7:\2\2\u0147\u0148\7\\\2\2\u0148\u016f"+
		"\79\2\2\u0149\u014a\7[\2\2\u014a\u014b\78\2\2\u014b\u014c\7\\\2\2\u014c"+
		"\u016f\79\2\2\u014d\u014e\7[\2\2\u014e\u016f\79\2\2\u014f\u0150\7\\\2"+
		"\2\u0150\u016f\79\2\2\u0151\u0152\7[\2\2\u0152\u0153\7:\2\2\u0153\u0154"+
		"\5,\27\2\u0154\u0155\7:\2\2\u0155\u0156\7\\\2\2\u0156\u0157\79\2\2\u0157"+
		"\u016f\3\2\2\2\u0158\u0159\5,\27\2\u0159\u015a\7:\2\2\u015a\u015b\7\\"+
		"\2\2\u015b\u015c\79\2\2\u015c\u016f\3\2\2\2\u015d\u015e\7[\2\2\u015e\u015f"+
		"\78\2\2\u015f\u0160\7[\2\2\u0160\u0161\78\2\2\u0161\u0162\7\\\2\2\u0162"+
		"\u016f\79\2\2\u0163\u0164\5,\27\2\u0164\u0165\7[\2\2\u0165\u0166\7\n\2"+
		"\2\u0166\u0167\7\\\2\2\u0167\u0168\79\2\2\u0168\u016f\3\2\2\2\u0169\u016a"+
		"\5,\27\2\u016a\u016b\7\n\2\2\u016b\u016c\7\\\2\2\u016c\u016d\79\2\2\u016d"+
		"\u016f\3\2\2\2\u016e\u013d\3\2\2\2\u016e\u0143\3\2\2\2\u016e\u0149\3\2"+
		"\2\2\u016e\u014d\3\2\2\2\u016e\u014f\3\2\2\2\u016e\u0151\3\2\2\2\u016e"+
		"\u0158\3\2\2\2\u016e\u015d\3\2\2\2\u016e\u0163\3\2\2\2\u016e\u0169\3\2"+
		"\2\2\u016f%\3\2\2\2\u0170\u0171\7]\2\2\u0171\u0176\7;\2\2\u0172\u0175"+
		"\5\64\33\2\u0173\u0175\5\60\31\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2"+
		"\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017c"+
		"\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7]\2\2\u017a\u017c\7<\2\2\u017b"+
		"\u0170\3\2\2\2\u017b\u0179\3\2\2\2\u017c\'\3\2\2\2\u017d\u017e\7]\2\2"+
		"\u017e\u0184\7=\2\2\u017f\u0180\7]\2\2\u0180\u0184\7>\2\2\u0181\u0182"+
		"\7]\2\2\u0182\u0184\7?\2\2\u0183\u017d\3\2\2\2\u0183\u017f\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0184)\3\2\2\2\u0185\u0186\7@\2\2\u0186\u018a\7\25\2\2"+
		"\u0187\u0188\7\24\2\2\u0188\u018a\7\25\2\2\u0189\u0185\3\2\2\2\u0189\u0187"+
		"\3\2\2\2\u018a+\3\2\2\2\u018b\u018c\7A\2\2\u018c\u01a4\7\16\2\2\u018d"+
		"\u018e\7B\2\2\u018e\u01a4\7\16\2\2\u018f\u0190\7C\2\2\u0190\u01a4\7\r"+
		"\2\2\u0191\u0192\7D\2\2\u0192\u01a4\7\r\2\2\u0193\u0194\7E\2\2\u0194\u01a4"+
		"\7F\2\2\u0195\u0196\7G\2\2\u0196\u01a4\7\16\2\2\u0197\u0198\7H\2\2\u0198"+
		"\u01a4\7\16\2\2\u0199\u019a\7I\2\2\u019a\u01a4\7\16\2\2\u019b\u019c\7"+
		"J\2\2\u019c\u01a4\7\16\2\2\u019d\u019e\7K\2\2\u019e\u01a4\7\16\2\2\u019f"+
		"\u01a0\7L\2\2\u01a0\u01a4\7\16\2\2\u01a1\u01a2\7M\2\2\u01a2\u01a4\7\16"+
		"\2\2\u01a3\u018b\3\2\2\2\u01a3\u018d\3\2\2\2\u01a3\u018f\3\2\2\2\u01a3"+
		"\u0191\3\2\2\2\u01a3\u0193\3\2\2\2\u01a3\u0195\3\2\2\2\u01a3\u0197\3\2"+
		"\2\2\u01a3\u0199\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3"+
		"\u019f\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4-\3\2\2\2\u01a5\u01a6\7]\2\2\u01a6"+
		"\u01b2\7\31\2\2\u01a7\u01a8\7]\2\2\u01a8\u01b2\7N\2\2\u01a9\u01aa\7]\2"+
		"\2\u01aa\u01b2\7O\2\2\u01ab\u01ac\7]\2\2\u01ac\u01b2\79\2\2\u01ad\u01ae"+
		"\7]\2\2\u01ae\u01b2\7P\2\2\u01af\u01b0\7]\2\2\u01b0\u01b2\7Q\2\2\u01b1"+
		"\u01a5\3\2\2\2\u01b1\u01a7\3\2\2\2\u01b1\u01a9\3\2\2\2\u01b1\u01ab\3\2"+
		"\2\2\u01b1\u01ad\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2/\3\2\2\2\u01b3\u01b4"+
		"\7]\2\2\u01b4\u01b5\7R\2\2\u01b5\61\3\2\2\2\u01b6\u01bb\5\24\13\2\u01b7"+
		"\u01bb\5\64\33\2\u01b8\u01bb\5.\30\2\u01b9\u01bb\5*\26\2\u01ba\u01b6\3"+
		"\2\2\2\u01ba\u01b7\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb"+
		"\63\3\2\2\2\u01bc\u01bd\7]\2\2\u01bd\u01c7\7S\2\2\u01be\u01bf\7]\2\2\u01bf"+
		"\u01c7\7T\2\2\u01c0\u01c1\7]\2\2\u01c1\u01c7\7(\2\2\u01c2\u01c3\7]\2\2"+
		"\u01c3\u01c7\7U\2\2\u01c4\u01c5\7]\2\2\u01c5\u01c7\7V\2\2\u01c6\u01bc"+
		"\3\2\2\2\u01c6\u01be\3\2\2\2\u01c6\u01c0\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c7\65\3\2\2\2\u01c8\u01c9\7W\2\2\u01c9\u01e5\7\16\2"+
		"\2\u01ca\u01cb\7X\2\2\u01cb\u01cc\7\25\2\2\u01cc\u01cd\7\63\2\2\u01cd"+
		"\u01e5\7\16\2\2\u01ce\u01cf\7Y\2\2\u01cf\u01d0\7\31\2\2\u01d0\u01d1\7"+
		"\63\2\2\u01d1\u01e5\7\16\2\2\u01d2\u01d3\7Z\2\2\u01d3\u01e5\7\16\2\2\u01d4"+
		"\u01d5\7X\2\2\u01d5\u01d6\7\25\2\2\u01d6\u01d7\7\62\2\2\u01d7\u01e5\7"+
		"\16\2\2\u01d8\u01d9\7Y\2\2\u01d9\u01da\7\31\2\2\u01da\u01db\7\62\2\2\u01db"+
		"\u01e5\7\16\2\2\u01dc\u01dd\7X\2\2\u01dd\u01de\7\25\2\2\u01de\u01df\7"+
		"\61\2\2\u01df\u01e5\7\16\2\2\u01e0\u01e1\7Y\2\2\u01e1\u01e2\7\31\2\2\u01e2"+
		"\u01e3\7\61\2\2\u01e3\u01e5\7\16\2\2\u01e4\u01c8\3\2\2\2\u01e4\u01ca\3"+
		"\2\2\2\u01e4\u01ce\3\2\2\2\u01e4\u01d2\3\2\2\2\u01e4\u01d4\3\2\2\2\u01e4"+
		"\u01d8\3\2\2\2\u01e4\u01dc\3\2\2\2\u01e4\u01e0\3\2\2\2\u01e5\67\3\2\2"+
		"\2\66:?DRVY^afkosvy~\u0082\u0085\u008a\u008f\u0093\u0097\u009a\u009f\u00a3"+
		"\u00ab\u00b0\u00b2\u00bb\u00bf\u00c1\u00c7\u00cc\u00d3\u00dd\u00e5\u00f9"+
		"\u0113\u0117\u011a\u0129\u013b\u016e\u0174\u0176\u017b\u0183\u0189\u01a3"+
		"\u01b1\u01ba\u01c6\u01e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}