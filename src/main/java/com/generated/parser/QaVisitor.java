// Generated from Qa.g4 by ANTLR 4.8

    package com.generated.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QaParser#qa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQa(QaParser.QaContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#whquestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhquestion(QaParser.WhquestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(QaParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#ng}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg(QaParser.NgContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#ng1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg1(QaParser.Ng1Context ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#nominal_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNominal_term(QaParser.Nominal_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#noun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoun(QaParser.NounContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#measure_indicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasure_indicator(QaParser.Measure_indicatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#dimention_marker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimention_marker(QaParser.Dimention_markerContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#temporal_dimention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporal_dimention(QaParser.Temporal_dimentionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#temporal_lexion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporal_lexion(QaParser.Temporal_lexionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(QaParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#filter_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_operator(QaParser.Filter_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#prepeposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepeposition(QaParser.PrepepositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#wh_determiner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWh_determiner(QaParser.Wh_determinerContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#adverb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdverb(QaParser.AdverbContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#dt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDt(QaParser.DtContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#mmm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMmm(QaParser.MmmContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#adjective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdjective(QaParser.AdjectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#past_participle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPast_participle(QaParser.Past_participleContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(QaParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link QaParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(QaParser.VerbContext ctx);
}