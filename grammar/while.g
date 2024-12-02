grammar while;
options { output=AST; }

tokens  {
	VARIABLE;
	SYMBOL;
	DEFINITION;
	INPUT;
	INPUTSUB;
	IF;
	WHILE;
	EXPRBASE;
	EXPR;
	COMMAND;
	COMMANDS;
	EXPRS;
	EXPR;
	
}

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
    
fragment    
Min 	:	'a'..'z';
fragment
Maj 	:	'A'..'Z';
fragment
Dec 	:	'0'..'9'; 
    
// GRAMMAIRE DU LANGAGE
Symbol  	:	Min (Maj|Min|Dec)*('!'|'?')?;
Variable	: 	Maj (Maj|Min|Dec)*('!'|'?')?;

start_rule	:	program;


vars	:	Variable(','Variable)*;
inputSub	:	vars;
input	:	inputSub?;
command	:	'nop'  | vars ':=' exprs | s_if | s_while | s_for | s_foreach;
commands	:	command(';'command)*;
output 	:	Variable(','Variable)*;
definition	:	'read' input '%' commands '%' 'write' output;
function	: 	'function' Symbol ':' definition;
program 	: 	function+;
s_if	:	'if' expr  'then' s_then ('else' s_then)? 'fi';
s_while	:	'while' expr 'do' commands 'od';
s_then	:	commands ;
s_for	:	'for' expr 'do' commands 'od';
s_foreach	:	'foreach';
exprs	:	expr (','expr)*;
expr	: 	exprBase ('=?' exprBase)?;
exprBase 	:	'nil' | Variable |Symbol
	|	'(' 'cons' lexpr ')' | '(' 'list' lexpr ')'
	|	'(' 'hd' exprBase ')' | '(' 'tl' exprBase ')'
	|	'(' Symbol lexpr? ')';
lexpr	:	exprBase (exprBase)*;
