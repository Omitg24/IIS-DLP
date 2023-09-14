package codegenerator;

import ast.Program;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import visitor.Visitor;

public abstract class AbstractCGVisitor<TP, TR> implements Visitor<TP, TR> {

    /* Program */
    @Override
    public TR visit(Program ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"Program\" not defined for function: " + ast.getClass().getSimpleName());
    }

    /* Definitions */
    @Override
    public TR visit(FunctionDefinition ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"FunctionDefinition\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(VariableDefinition ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"VariableDefinition\" not defined for function: " + ast.getClass().getSimpleName());
    }

    /* Expressions */
    @Override
    public TR visit(Arithmetic ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"Arithmetic\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(ArrayAccess ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"ArrayAccess\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(Cast ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"Cast\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(CharLiteral ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"CharLiteral\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(Comparison ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"Comparison\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(IntLiteral ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"IntLiteral\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(Logical ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"Logical\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(RealLiteral ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"RealLiteral\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(StructAccess ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"StructAccess\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(UnaryMinus ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"UnaryMinus\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(UnaryNot ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"UnaryNot\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(Variable ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"Variable\" not defined for function: " + ast.getClass().getSimpleName());
    }

    /* Expression & Statement */
    @Override
    public TR visit(FunctionInvocation ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"FunctionInvocation\" not defined for function: " + ast.getClass().getSimpleName());
    }

    /* Statements */
    @Override
    public TR visit(Assignment ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"Assignment\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(IfElse ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"IfElse\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(Input ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"Input\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(Print ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"Print\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(Return ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"Return\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(While ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"While\" not defined for function: " + ast.getClass().getSimpleName());
    }

    /* Types */
    @Override
    public TR visit(ArrayType ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"ArrayType\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(StructField ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"StructField\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(CharType ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"CharType\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(ErrorType ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"ErrorType\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(FunctionType ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"FunctionType\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(IntType ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"IntType\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(RealType ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"RealType\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(StructType ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"StructType\" not defined for function: " + ast.getClass().getSimpleName());
    }

    @Override
    public TR visit(VoidType ast, TP p) {
        throw new IllegalStateException("ERROR: Code generation template \"TRType\" not defined for function: " + ast.getClass().getSimpleName());
    }
}
