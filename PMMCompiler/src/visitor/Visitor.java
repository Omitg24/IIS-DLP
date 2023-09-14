package visitor;

import ast.Program;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public interface Visitor<TP, TR> {
    TR visit(Program ast, TP p);

    /* Definitions */
    TR visit(FunctionDefinition ast, TP p);

    TR visit(VariableDefinition ast, TP p);

    /* Expressions */
    TR visit(Arithmetic ast, TP p);

    TR visit(ArrayAccess ast, TP p);

    TR visit(Cast ast, TP p);

    TR visit(CharLiteral ast, TP p);

    TR visit(Comparison ast, TP p);

    TR visit(IntLiteral ast, TP p);

    TR visit(Logical ast, TP p);

    TR visit(RealLiteral ast, TP p);

    TR visit(StructAccess ast, TP p);

    TR visit(UnaryMinus ast, TP p);

    TR visit(UnaryNot ast, TP p);

    TR visit(Variable ast, TP p);

    /* Expression & Assignment */
    TR visit(FunctionInvocation ast, TP p);

    /* Statements */
    TR visit(Assignment ast, TP p);

    TR visit(IfElse ast, TP p);

    TR visit(Input ast, TP p);

    TR visit(Print ast, TP p);

    TR visit(Return ast, TP p);

    TR visit(While ast, TP p);

    /* Types */
    TR visit(ArrayType ast, TP p);

    TR visit(StructField ast, TP p);

    TR visit(CharType ast, TP p);

    TR visit(ErrorType ast, TP p);

    TR visit(FunctionType ast, TP p);

    TR visit(IntType ast, TP p);

    TR visit(RealType ast, TP p);

    TR visit(StructType ast, TP p);

    TR visit(VoidType ast, TP p);
}
