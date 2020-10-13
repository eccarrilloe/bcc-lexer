grammar bcc;

prog: fn_decl_list main_prog;
var_decl:
	ID TK_DOSPUNTOS DATATYPE (TK_COMA ID TK_DOSPUNTOS DATATYPE)*;
fn_decl_list: (
		TK_FUNCTION FID TK_DOSPUNTOS DATATYPE TK_PAR_IZQ (
			var_decl
		)? TK_PAR_DER (VAR var_decl TK_PUNTOYCOMA)? stmt_block
	)*;
stmt_block: TK_LLAVE_IZQ stmt+ TK_LLAVE_DER | stmt;
stmt:
	PRINT lexpr TK_PUNTOYCOMA
	| TK_INPUT ID TK_PUNTOYCOMA
	| TK_WHEN TK_PAR_IZQ lexpr TK_PAR_DER TK_DO stmt_block
	| TK_IF TK_PAR_IZQ lexpr TK_PAR_DER TK_DO stmt_block TK_ELSE stmt_block
	| TK_UNLESS TK_PAR_IZQ lexpr TK_PAR_DER TK_DO stmt_block
	| TK_WHILE TK_PAR_IZQ lexpr TK_PAR_DER TK_DO stmt_block
	| TK_RETURN lexpr TK_PUNTOYCOMA
	| TK_UNTIL TK_PAR_IZQ lexpr TK_PAR_DER TK_DO stmt_block
	| TK_LOOP stmt_block
	| TK_DO stmt_block TK_WHILE TK_PAR_IZQ lexpr TK_PAR_DER
	| TK_DO stmt_block TK_UNTIL TK_PAR_IZQ lexpr TK_PAR_DER
	| TK_REPEAT TK_NUM TK_DOSPUNTOS stmt_block
	| TK_FOR TK_PAR_IZQ lexpr TK_PUNTOYCOMA lexpr TK_PUNTOYCOMA lexpr TK_PAR_DER TK_DO stmt_block
	| TK_NEXT TK_PUNTOYCOMA
	| TK_BREAK TK_PUNTOYCOMA
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
lexpr: nexpr ((TK_AND nexpr)* | (TK_OR nexpr)*);
nexpr: TK_NOT TK_PAR_IZQ lexpr TK_PAR_DER | rexpr;
rexpr:
	simple_expr (
		(
			TK_MENOR
			| TK_IGUALDAD
			| TK_MENOR_IGUAL
			| TK_MAYOR
			| TK_MAYOR_IGUAL
			| TK_DIFERENTE
		) simple_expr
	)?;
simple_expr: term ((TK_MAS | TK_MENOS) term)*;
term: factor ((TK_MUL | TK_DIV | TK_MOD) factor)*;
factor:
	TK_NUM
	| TRUE
	| FALSE
	| ID (TK_INCREMENTO | TK_DECREMENTO)
	| (TK_INCREMENTO | TK_DECREMENTO) ID
	| ID
	| TK_PAR_IZQ lexpr TK_PAR_DER
	| FID TK_PAR_IZQ (lexpr (TK_COMA lexpr)*) TK_PAR_DER;
main_prog: (VAR var_decl TK_PUNTOYCOMA)* stmt* TK_END;

TK_FUNCTION: 'function';
FID: '@' ID;
VAR: 'var';
PRINT: 'print';
TK_INPUT: 'input';
TK_WHEN: 'when';
TK_DO: 'do';
TK_IF: 'if';
TK_ELSE: 'else';
TK_UNLESS: 'unless';
TK_WHILE: 'while';
TK_RETURN: 'return';
TK_UNTIL: 'until';
TK_LOOP: 'loop';
TK_REPEAT: 'repeat';
TK_FOR: 'for';
TK_END: 'end';
TK_NEXT: 'next';
TK_BREAK: 'break';
TK_AND: 'and';
TK_OR: 'or';
TK_NOT: 'not';

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

DATATYPE: ('num' | 'bool');
TRUE: 'true';
FALSE: 'false';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
TK_NUM: [0-9]+;
COMMENT: '#' ~[\r\n\f]* -> skip;
WS: [ \t\n\r] -> skip;

