grammar bcc;

prog: fn_decl_list main_prog;
var_decl:
	ID TK_DOSPUNTOS DATATYPE (TK_COMA ID TK_DOSPUNTOS DATATYPE)*;
fn_decl_list: (
		FUNCTION FID TK_DOSPUNTOS DATATYPE TK_PAR_IZQ (var_decl)? TK_PAR_DER TK_COR_IZQ stmt_block
	)*;
stmt_block: TK_LLAVE_IZQ stmt+ TK_LLAVE_DER | stmt;
stmt:
	PRINT lexpr TK_PUNTOYCOMA
	| INPUT ID TK_PUNTOYCOMA
	| WHEN TK_PAR_IZQ lexpr TK_PAR_DER DO stmt_block
	| IF TK_PAR_IZQ lexpr TK_PAR_DER DO stmt_block ELSE stmt_block
	| UNLESS TK_PAR_IZQ lexpr TK_PAR_DER DO stmt_block
	| WHILE TK_PAR_IZQ lexpr TK_PAR_DER DO stmt_block
	| RETURN lexpr TK_PUNTOYCOMA
	| UNTIL TK_PAR_IZQ lexpr TK_PAR_DER DO stmt_block
	| LOOP stmt_block
	| DO stmt_block WHILE TK_PAR_IZQ lexpr TK_PAR_DER
	| DO stmt_block UNTIL TK_PAR_IZQ lexpr TK_PAR_DER
	| REPEAT NUM TK_DOSPUNTOS stmt_block
	| FOR TK_PAR_IZQ lexpr TK_PUNTOYCOMA lexpr TK_PUNTOYCOMA lexpr TK_PAR_DER DO stmt_block
	| END TK_PUNTOYCOMA
	| NEXT TK_PUNTOYCOMA
	| BREAK TK_PUNTOYCOMA
	| ID TK_ASIGNACION lexpr TK_PUNTOYCOMA
	| ID TK_SUM_ASIG lexpr TK_PUNTOYCOMA
	| ID TK_RES_ASIG lexpr TK_PUNTOYCOMA
	| ID TK_MUL_ASIG lexpr TK_PUNTOYCOMA
	| ID TK_DIV_ASIG lexpr TK_PUNTOYCOMA
	| ID TK_MOD_ASIG lexpr TK_PUNTOYCOMA
	| ID TK_INCREMENTO TK_PUNTOYCOMA
	| ID TK_DECREMENTO TK_PUNTOYCOMA
	| TK_DECREMENTO ID TK_PUNTOYCOMA
	| TK_INCREMENTO ID TK_PUNTOYCOMA;
lexpr: nexpr ((AND nexpr)* | (OR nexpr)*);
nexpr: NOT TK_PAR_IZQ lexpr TK_PAR_DER | rexpr;
rexpr:
	simple_expr (
		TK_MENOR
		| TK_IGUALDAD
		| TK_MENOR_IGUAL
		| TK_MAYOR
		| TK_MAYOR_IGUAL
		| TK_DIFERENTE
	) simple_expr;
simple_expr: term ((TK_MAS | TK_MENOS) term)*;
term: factor ((TK_MUL | TK_DIV | TK_MOD) factor)*;
factor:
	NUM
	| TRUE
	| FALSE
	| ID (TK_INCREMENTO | TK_DECREMENTO)
	| (TK_INCREMENTO | TK_DECREMENTO) ID
	| ID
	| TK_PAR_IZQ lexpr TK_PAR_DER
	| FID TK_PAR_IZQ (lexpr (TK_COMA lexpr)*) TK_PAR_DER;
main_prog: (VAR var_decl TK_PUNTOYCOMA) stmt* END;

FUNCTION: 'function';
FID: '@' ID;
VAR: 'var';
PRINT: 'print';
INPUT: 'input';
WHEN: 'when';
DO: 'do';
IF: 'if';
ELSE: 'else';
UNLESS: 'unless';
WHILE: 'while';
RETURN: 'return';
UNTIL: 'until';
LOOP: 'loop';
REPEAT: 'repeat';
NUM: 'num';
BOOL: 'bool';
FOR: 'for';
END: 'end';
NEXT: 'next';
BREAK: 'break';
AND: 'and';
OR: 'or';
NOT: 'not';

TK_MOD_ASIG: '%=';
TK_MENOR_IGUAL: '<=';
TK_MAYOR_IGUAL: '>=';
TK_SUM_ASIG: '+=';
TK_RES_ASIG: '-=';
TK_MUL_ASIG: '*=';
TK_DIV_ASIG: '/=';
TK_INCREMENTO: '++';
TK_DECREMENTO: '--';
TK_IGUALDAD: '==';
TK_DIFERENTE: '!=';
TK_ASIGNACION: ':=';
TK_DOSPUNTOS: ':';
TK_COMA: ',';
TK_PUNTOYCOMA: ';';
TK_PAR_IZQ: '(';
TK_PAR_DER: ')';
TK_COR_IZQ: '[';
TK_COR_DER: ']';
TK_LLAVE_IZQ: '{';
TK_LLAVE_DER: '}';
TK_MENOR: '<';
TK_MAYOR: '>';
TK_MAS: '+';
TK_MENOS: '-';
TK_MUL: '*';
TK_DIV: '/';
TK_MOD: '%';

TRUE: 'true';
FALSE: 'false';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
TK_NUM: [0-9]+ ('.' [0-9]+)?;
DATATYPE: ('num' | 'bool');
COMMENT: '#' ~[\r\n\f]* -> skip;
WS: [ \t\n\r] -> skip;

