grammar Qa;
qa                  :whquestion (string)? (ng)+ (string)? (filter)* '?_.';
whquestion          :'what''_WP'
                    |'how''_WRB'
                    |'who''_WP'
                    |'when''_WRB'
                    |'where''_WRB'
                    ;
filter              :dimention_marker ng (temporal_dimention)?
                    |(dimention_marker)? temporal_dimention
                    |filter_operator ((dt)? adverb )? ng
                    |filter_operator temporal_dimention
                    ;
ng                  :(dt)? ng1 ((',_,' (dt)? ng1)+ 'and_CC' (dt)? ng1)? (prepeposition dt ng1)?
                    |(dt)? ng1 'and_CC' (dt)? ng1
                    ;
ng1                 :nominal_term ( nominal_term | adjective | past_participle | wh_determiner| (dt)? adverb)*
                    ;
nominal_term        :noun
                    |measure_indicator
                    |temporal_lexion
                    |adjective
                    ;
noun                :WORD '_NN'
                    |WORD '_PRP'
                    |WORD '_NNS'
                    |WORD '_NNP'
                    |WORD '_NNPS'
                    ;
measure_indicator   :'quantity' '_NN'
                    |'amount' '_NN'
                    |'total' '_JJ'
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
                    |'since' '_IN'
                    |'while' '_IN'
                    |'when' '_WRB'
                    |'according' '_VBG'
                    ;
temporal_dimention  :ng (date)?
                    |date
                    |past_participle
                    ;
temporal_lexion     :'time' '_NN'
                    |'year' '_NN'
                    |'mounth' '_JJ'
                    |'day' '_NN'
                    |'season' '_NN'
                    |'hour' '_NN'
                    |'minute' '_NN'
                    |'seconde' '_NN'
                    |'cety' '_NN'
                    ;
date                :DD '/' MM '/' YYYY
                    |MM '/' YYYY
                    |DD
                    |MM
                    |YYYY '_CD'
                    |DD '-' mmm '-' YYYY
                    |mmm '-' YYYY
                    |MM '/' DD '/' YYYY
                    |mmm DD ',_,' YYYY
                    |mmm ',_,' YYYY
                    ;
filter_operator     :'equal' '_JJ'
                    |'more' '_RBR'
                    |'then' '_RB' 
                    |'less' '_JJR'
                    |'then' '_RB'
                    |'with' '_IN'
                    |'this' '_DT'
                    |'between' '_IN'
                    ;
prepeposition       :'of' '_IN'
                    |'at' '_IN'
                    ; 
wh_determiner       :WORD '_WDT' (verb | past_participle)*
                    |WORD '_WP$'
                    ;
adverb              :WORD '_RB'
                    |WORD '_RBR' 
                    |WORD '_RBS'
                    ;
dt                  :'a' '_DT'
                    |'of' '_IN'
                    |'of' '_IN' 'the' '_DT' 
                    |'the' '_DT'
                    ;
DD                  :[0-2][1-9]
                    |[3][0-1]
                    ;
MM                  :[0][1-9]
                    |[1][0-2]
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

WORD        :[A-Za-z]+;
INT         :[0-9]+;
WS          :(' '|'\t'|'\r'|'\n')+ -> skip ;