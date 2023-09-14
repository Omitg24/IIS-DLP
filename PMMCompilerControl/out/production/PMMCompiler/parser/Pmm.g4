grammar Pmm;	

@header{
/* El contenido va a ser copiado en PmmParser */
import ast.*;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
}

/*
    rule returns [ASTNode ast(=initialization)?] locals [Type variable (=initializacion)?]:
        nt=nonterminal T=token {$ast = $nt.ast $T.text $variable}
*/

program returns [Program ast] locals [List<Definition> definitions = new ArrayList<Definition>()]:
            (vd=variableDefinition';' { $definitions.addAll($vd.ast); }
            | fd=functionDefinition { $definitions.add($fd.ast); })*
            m=main EOF
                {
                    $definitions.add($m.ast);
                    $ast = new Program(0, 0, $definitions);
                }
            ;

main returns [Definition ast]:
            T='def' 'main' '(' ')'':''{' fb=functionBody '}'
                {
                    $ast = new FunctionDefinition($T.getLine(), $T.getCharPositionInLine() + 1,
                        new FunctionType($T.getLine(), $T.getCharPositionInLine() + 1,
                            new ArrayList<VariableDefinition>(), VoidType.getInstance()), "main", $fb.ast);
                }
            ;

statement returns [List<Statement> ast = new ArrayList<Statement>()]
    locals [List<Statement> elseBody = new ArrayList<Statement>()]:
            'print' ex=expressions';'
                {
                    for (Expression expression : $ex.ast) {
                        $ast.add(new Print(expression.getLine(), expression.getColumn(), expression));
                    }
                }
            | 'input' ex=expressions';'
                {
                    for (Expression expression : $ex.ast) {
                        $ast.add(new Input(expression.getLine(), expression.getColumn(), expression));
                    }
                }
            | 'return' ex1=expression';'
                {
                    $ast.add(new Return($ex1.ast.getLine(), $ex1.ast.getColumn(), $ex1.ast));
                }
            | ex1=expression'='ex2=expression';'
                {
                    $ast.add(new Assignment($ex1.ast.getLine(), $ex1.ast.getColumn(), $ex1.ast, $ex2.ast));
                }
            | T='if' ex1=expression ':' b1=body ('else'':' b2=body { $elseBody = $b2.ast; })?
                {
                    $ast.add(new IfElse($T.getLine(), $T.getCharPositionInLine() + 1, $ex1.ast, $b1.ast, $elseBody));
                }
            | T='while' ex1=expression ':' b1=body
                {
                    $ast.add(new While($T.getLine(), $T.getCharPositionInLine() + 1, $ex1.ast, $b1.ast));
                }
            | fi=functionInvocation';'
                {
                    $ast.add($fi.ast);
                }
            ;

expression returns [Expression ast]:
            ID
                {
                    $ast = new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text);
                }
            | INT_CONSTANT
                {
                    $ast = new IntLiteral($INT_CONSTANT.getLine(),
                        $INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text));
                }
            | CHAR_CONSTANT
                {
                    $ast = new CharLiteral($CHAR_CONSTANT.getLine(),
                        $CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text));
                }
            | REAL_CONSTANT
                {
                    $ast = new RealLiteral($REAL_CONSTANT.getLine(),
                        $REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal($REAL_CONSTANT.text));
                }
            | T='('ex1=expression')'
                {
                    $ast = new Parenthesis($T.getLine(), $T.getCharPositionInLine() + 1, $ex1.ast);
                }
            | fi=functionInvocation
                {
                    $ast = $fi.ast;
                }
            | ex1=expression'['ex2=expression']'
                {
                    $ast = new ArrayAccess($ex1.ast.getLine(), $ex1.ast.getColumn(), $ex1.ast, $ex2.ast);
                }
            | ex1=expression'.'ID
                {
                    $ast = new StructAccess($ex1.ast.getLine(), $ex1.ast.getColumn(), $ex1.ast, $ID.text);
                }
            | T='('tp=type')' ex1=expression
                {
                    $ast = new Cast($T.getLine(), $T.getCharPositionInLine() + 1, $ex1.ast, $tp.ast);
                }
            | '-' ex1=expression
                {
                    $ast = new UnaryMinus($ex1.ast.getLine(), $ex1.ast.getColumn(), $ex1.ast);
                }
            | '!' ex1=expression
                {
                    $ast = new UnaryNot($ex1.ast.getLine(), $ex1.ast.getColumn(), $ex1.ast);
                }
            | ex1=expression OP=('*'|'/'|'%') ex2=expression
                {
                    $ast = new Arithmetic($ex1.ast.getLine(), $ex1.ast.getColumn(), $ex1.ast, $ex2.ast, $OP.text);
                }
            | ex1=expression OP=('+'|'-') ex2=expression
                {
                    $ast = new Arithmetic($ex1.ast.getLine(), $ex1.ast.getColumn(), $ex1.ast, $ex2.ast, $OP.text);
                }
            | ex1=expression OP=('=='|'!='|'>'|'>='|'<'|'<=') ex2=expression
                {
                    $ast = new Comparison($ex1.ast.getLine(), $ex1.ast.getColumn(), $ex1.ast, $ex2.ast, $OP.text);
                }
            | ex1=expression OP=('||'|'&&') ex2=expression
                {
                    $ast = new Logical($ex1.ast.getLine(), $ex1.ast.getColumn(), $ex1.ast, $ex2.ast, $OP.text);
                }
            ;

type returns [Type ast]:
            T='char'
                {
                    $ast = CharType.getInstance();
                }
            | T='double'
                {
                    $ast = RealType.getInstance();
                }
            | T='int'
                {
                    $ast = IntType.getInstance();
                }
            | T='['INT_CONSTANT']'tp=type
                {
                    $ast = new ArrayType($T.getLine(), $T.getCharPositionInLine() + 1,
                        LexerHelper.lexemeToInt($INT_CONSTANT.text), $tp.ast);
                }
            | T='struct''{'atributeList=atributes'}'
                {
                    $ast = new StructType($T.getLine(), $T.getCharPositionInLine() + 1, $atributeList.ast);
                }
            ;

atributes returns [List<Atribute> ast = new ArrayList<Atribute>()]:
            (idList=ids ':' tp=type ';'
                {
                    for (Variable v : $idList.ast) {
                        $ast.add(new Atribute(v.getLine(), v.getColumn(), $tp.ast, v.getName()));
                    }
                }
            )+
            ;

variableDefinition returns [List<VariableDefinition> ast = new ArrayList<VariableDefinition>()]:
            idList=ids ':' tp=type
                {
                    for (Variable v : $idList.ast) {
                        $ast.add(new VariableDefinition(v.getLine(), v.getColumn(), $tp.ast, v.getName()));
                    }
                }
            ;

functionDefinition returns [FunctionDefinition ast]
    locals [Type returnType = VoidType.getInstance(), List<VariableDefinition> paramsList = new ArrayList<VariableDefinition>()]:
            T='def' ID '(' (p=params { $paramsList = $p.ast; })? ')'':' (tp=type { $returnType = $tp.ast; })? '{' fb=functionBody '}'
                {
                    $ast = new FunctionDefinition($T.getLine(), $T.getCharPositionInLine() + 1,
                        new FunctionType($returnType.getLine(), $returnType.getColumn(), $paramsList, $returnType), $ID.text, $fb.ast);
                }
            ;

functionInvocation returns [FunctionInvocation ast]
    locals [List<Expression> paramsList = new ArrayList<Expression>()]:
            ID'(' (ex=expressions { $paramsList=$ex.ast; })?')'
                {
                    $ast = new FunctionInvocation($ID.getLine(), $ID.getCharPositionInLine() + 1,
                        $paramsList, new Variable($ID.getLine(), $ID.getCharPositionInLine() + 1, $ID.text));
                }
            ;

body returns [List<Statement> ast = new ArrayList<Statement>()]:
            st1=statement { $ast.addAll($st1.ast); } | '{' (st2=statement { $ast.addAll($st2.ast); } )* '}'
            ;

expressions returns [List<Expression> ast = new ArrayList<Expression>()]:
            ex1=expression { $ast.add($ex1.ast); }(','ex2=expression { $ast.add($ex2.ast); } )*
            ;

params returns [List<VariableDefinition> ast = new ArrayList<VariableDefinition>()]:
            vd1=variableDefinition { $ast.addAll($vd1.ast); } (','vd2=variableDefinition { $ast.addAll($vd2.ast); })*
            ;

functionBody returns [List<Statement> ast = new ArrayList<Statement>()]:
            (vd1=variableDefinition';' { $ast.addAll($vd1.ast); })* (st1=statement { $ast.addAll($st1.ast); })*
            ;

ids returns [List<Variable> ast = new ArrayList<Variable>()]:
            id1=ID { $ast.add(new Variable($id1.getLine(), $id1.getCharPositionInLine() + 1, $id1.text)); }
                (','id2=ID { $ast.add(new Variable($id2.getLine(), $id2.getCharPositionInLine() + 1, $id2.text)); })*
            ;

TRASH: [ \n\r\t]+ -> skip
            ;

COMMENT: ('#'.*?('\n'|EOF)|'"""'.*?'"""') -> skip
            ;

ID: ([a-zA-Z]|'_'[a-zA-Z0-9_])[a-zA-Z0-9_]*
            ;

INT_CONSTANT: '0'|[1-9][0-9]*
            ;

CHAR_CONSTANT: '\''(.|'\\'([0-9]+|[nt]))'\''
            ;

REAL_CONSTANT: (INT_CONSTANT'.'?|'.')INT_CONSTANT?([Ee][+-]?INT_CONSTANT)?
            ;