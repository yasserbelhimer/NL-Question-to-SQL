grammar Qa;
@header {
    package com.generated.parser;
}
wh_question         :question_pronoun (mg)? (ng)+ (filter)* '?_.' EOF;
question_pronoun    :'what''_WP'
                    |'who''_WP'
                    |'when''_WRB'
                    |'where''_WRB'
                    ;
filter              :dimention_marker ((dt)? adverb )? ng_filter
                    |dim
                    ;
ng_filter           :(dt)? ng1_filter ((',_,' (dt)? ng1_filter)+ 'and_CC' (dt)? ng1_filter)? (ng1_filter)?
                    |(dt)? ng1_filter 'and_CC' (dt)? ng1_filter
                    ;
ng                  :(dt)? ng1 ((',_,' (dt)? ng1)+ 'and_CC' (dt)? ng1)?
                    |(dt)? ng1 'and_CC' (dt)? ng1
                    ;
ng1_filter          :nominal_term ( nominal_term | adjective | past_participle | wh_determiner | (dt)? adverb | temporal_dimention |spatial_dimention)*
                    ;
ng1                 :nominal_term ( nominal_term | adjective | past_participle | wh_determiner | (dt)? adverb | mg)*
                    ;
nominal_term        :noun
                    |measure_indicator (prepeposition)?
                    |temporal_lexion
                    |spatial_lexion
                    |adjective
                    ;
mg                  :verb
                    |WORD '_PRP'
                    |WORD '_FW'
                    ;
noun                :WORD '_NN'
                    |WORD '_NNS'
                    |WORD '_NNP'
                    |WORD '_NNPS'
                    ;
prepeposition       :'of' '_IN' 'the' '_DT'
                    |'of' '_IN'
                    ;
measure_indicator   :'quantity' '_NN'
                    |'amount' '_NN'
                    |'total' '_JJ'
                    |'many' '_JJ'
                    |'numbre' '_JJ'
                    |'volume' '_NN'
                    |'ration' '_NN'
                    |'percentage' '_NN'
                    |'degree' '_NN'
                    ;
dimention_marker    :'for' '_IN'
                    |'during' '_IN'
                    |'in' '_IN'
                    |'at' '_IN'
                    |'of' '_IN'
                    |'on' '_IN'
                    |'since' '_IN'
                    |'while' '_IN'
                    |'when' '_WRB'
                    |'according' '_VBG'
                    |'between' '_IN'
                    |'with' '_IN'
                    ;
temporal_dimention  :ng_filter (date)?
                    |date
                    ;
spatial_dimention   :spatial_lexion noun;
spatial_lexion 	    : 'city' '_NN'
                    | 'town' '_NN'
                    | 'country' '_NN'
                    | 'village' '_NN'
                    | 'region' '_NN'
                    ;
temporal_lexion     :'time' '_NN'
                    |'year' '_NN'
                    |'month' '_NN'
                    |'day' '_NN'
                    |'season' '_NN'
                    |'hour' '_NN'
                    |'minute' '_NN'
                    |'seconde' '_NN'
                    ;
date                :DD '/' DD '/' YYYY '_CD'
                    |DD '-' DD '-' YYYY '_CD'
                    |DD '/' YYYY '_CD'
                    |DD '_CD'
                    |YYYY '_CD'
                    |DD '-' mmm '-' YYYY '_CD'
                    |mmm '-' YYYY '_CD'
                    |DD '/' DD '/' YYYY '_CD'
                    |mmm DD ',_,' YYYY '_CD'
                    |mmm ',_,' YYYY '_CD'
                    ;
wh_determiner       :WORD '_WDT' (verb | past_participle)*
                    |WORD '_WP$'
                    ;
adverb              :WORD '_RB'
                    |WORD '_RBR' 
                    |WORD '_RBS'
                    ;
dt                  :'a' '_DT'
                    |'the' '_DT'
                    ;
DD                  :[0-2][1-9]
                    |[3][0-1]
                    ;
YYYY                :[1][9][9][0-9]
                    |[2][0][0-1][0-9]
                    |[2][0][2][0]
                    ;
mmm                 :'jan' '_NN'
                    |'feb' '_NN'
                    |'mar' '_FW'
                    |'apr' '_FW'
                    |'may' '_MD' 
                    |'jun' '_NN' 
                    |'jul' '_NN' 
                    |'aug' '_NN' 
                    |'sep' '_NN' 
                    |'oct' '_NN' 
                    |'nov' '_NN'
                    |'dec' '_NN'
                    ;
adjective           :WORD '_JJ'
                    |WORD '_JJR'
                    |WORD '_JJS'
                    |WORD '_CD' 
                    |WORD '_POS'
                    |WORD '_EX'
                    ;
past_participle     :WORD '_VBN'
                    ;
string              :noun
                    |verb
                    |adjective
                    |dt
                    ;
verb                :WORD '_VB'
                    |WORD '_VBD'
                    |WORD '_VBG'
                    |WORD '_VBP'
                    |WORD '_VBZ'
                    ;
dim                 :'today' '_NN'
                    |'this' '_DT' 'day' '_NN'
                    |'last' '_JJ' 'day' '_NN'
                    |'yesterday' '_NN'
                    |'this' '_DT' 'month' '_NN'
                    |'last' '_JJ' 'month' '_NN'
                    |'this' '_DT' 'year' '_NN'
                    |'last' '_JJ' 'year' '_NN'
                    ;
WORD        :[A-Za-z\-]+;
WS          :(' '|'\t'|'\r'|'\n')+ -> skip ;