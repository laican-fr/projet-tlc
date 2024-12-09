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
	FOR;
	EXPRBASE;
	EXPR;
	COMMAND;
	COMMANDS;
	EXPRS;
	EXPR;
	PROGRAM;
	FUNC;
	BODY;
	PARAM;
	OUTPUT;
	CONS;
	LIST;
	HD;
	TL;
	CALL;
	FOREACH;
	ASSIGN_VARS;
	ASSIGN_EXPR;
	ASSIGN;
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


vars	:	Variable(','Variable)*->Variable+;
inputSub	:	vars;
input	:	inputSub? -> ^(PARAM inputSub?);
command	:	'nop'  | vars ':=' exprs -> ^(ASSIGN ^(ASSIGN_VARS vars) ^(ASSIGN_EXPR exprs)) | s_if | s_while | s_for | s_foreach;
commands	:	command(';'command)* ->command+;
output 	:	Variable(','Variable)*⁽-> ^(OUTPUT Variable+)⁽;
definition	:	'read' input '%' commands '%' 'write' output -> ^(BODY input ^(COMMANDS commands) output);
function	: 	'function' i = Symbol ':' definition -> ⁽^(FUNC $i definition)⁽ ;
program 	: 	function+ ->   ^(PROGRAM function+);
s_if	:	'if' expr  'then' s_then ('else' s_then)? 'fi' -> ^(IF expr s_then+);
s_while	:	'while' expr 'do' commands 'od' -> ^(WHILE expr ^(COMMANDS commands));
s_then	:	commands -> ^(COMMANDS commands);
s_for	:	'for' expr 'do' commands 'od' -> ^(FOR expr ^(COMMANDS commands));
s_foreach	:	'foreach' i = Variable 'in' expr 'do' commands 'od' -> ^(FOREACH ^(VARIABLE $i) expr ^(COMMANDS commands));
exprs	:	expr (','expr)* -> expr+;
expr	: 	exprBase ('=?' exprBase)? -> ^(EXPR exprBase+);
exprBase 	:	'nil' -> ^('nil')| v = Variable -> ^(VARIABLE $v)| s=Symbol -> ^(SYMBOL $s)
	|	'(' 'cons' lexpr ')' -> ^(CONS lexpr)| '(' 'list' lexpr ')' -> ⁽⁽^(LIST lexpr)
	|	'(' 'hd' exprBase ')' -> ⁽^(HD exprBase)| '(' 'tl' exprBase ')' -> ^(TL exprBase)
	|	'(' s=Symbol lexpr? ')' -> ⁽^(CALL $s lexpr?);
lexpr	:	exprBase (exprBase)*;
