grammar bcc;
prog : fn_decl_list main_prog;
var_decl : ID ':' DATATYPE (',' ID ':' DATATYPE)*;
fn_decl_list : ( FUNCTION FID ':' DATATYPE '(' var_decl? ')' [ '[' lexp ']' ] VAR var_decl ';'] stmt_block )*;
stmt_block : '{' stmt+ '}'
    | stmt;
stmt : PRINT lexpr ';'
    | INPUT ID ';'
    | WHEN '(' lexpr ')' DO stmt_block
    | IF '(' lexpr ')' DO stmt_block ELSE stmt_block
    | UNLESS '(' lexpr ')' DO stmt_block
    | WHILE '(' expr ')' DO stmt_block
    | RETURN expr ';'
    | UNTIL '(' lexpr ')' DO stmt_block
    | LOOP stmt_block
    | DO stmt_block WHILE '(' lexpr ')'
    | DO stmt_block UNTIL '(' lexpr ')'
    | REPEAT NUM ':' stmt_block
    | FOR '(' lexpr ';' lexpr ';' lexpr ')' DO stmt_block
    | END ';'
    | NEXT ';'
    | BREAK ';'
    | ID ':=' lexp ';'
    | ID '+=' lexpr ';'
    | ID '-=' lexpr ';'
    | ID '*=' lexpr ';'
    | ID '/=' lexpr ';'
    | ID '%=' lexpr ';'
    | ID '++' ';'
    | ID '--' ';'
    | '--' ID ';'
    | '++' ID ';';
lexpr : nexpr ((AND nexpr)* | (OR nexpr)*);
nexpr : NOT '(' lexpr ')'
    | rexpr;
rexpr : simple_expr ('<'|'=='|'<='|'>'|'>='|'!=') simple_expr;
simple_expr : term (('+'|'-') term)*;
term : factor (('*'|'/'|'%') factor)*;
factor : NUM
    | BOOL
    | ID ('++'| '--')
    | ('++'|'--') ID
    | ID
    | '(' expr ')'
    | FID '(' (lexpr (',' lexpr)*) ')';
main_prog : (VAR var_decl ';') stmt* END;

FUNCTION : 'function';
FID : '@' ID;
VAR : 'var';
PRINT : 'print';
INPUT : 'input';
WHEN : 'when';
DO : 'do';
IF : 'if';
UNLESS : 'unless';
WHILE : 'while';
RETURN : 'return';
UNTIL : 'until';
LOOP : 'loop';
REPEAT : 'repeat';
NUM : 'num';
FOR : 'for';
END : 'end';
NEXT : 'next';
BREAK : 'break';
AND : 'and';
OR : 'or';
NOT : 'not';

BOOL : ('true' | 'false');
ID : [a-z];
DATATYPE : ('num');
