package semantic;

import ast.Expression;
import ast.Statement;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import visitor.AbstractVisitor;

import java.util.stream.Collectors;

public class TypeCheckingVisitor extends AbstractVisitor<FunctionType, Void> {
    /* Expressions */
    @Override
    public Void visit(Arithmetic ast, FunctionType p) {
        ast.getLeft().accept(this, p);
        ast.getRight().accept(this, p);
        ast.setLValue(false);
        ast.setType(ast.getLeft().getType().arithmetic(ast.getRight().getType(), ast));
        return null;
    }

    @Override
    public Void visit(ArrayAccess ast, FunctionType p) {
        ast.getLeft().accept(this, p);
        ast.getRight().accept(this, p);
        ast.setLValue(true);
        ast.setType(ast.getLeft().getType().squareBrackets(ast.getRight().getType(), ast));
        return null;
    }

    @Override
    public Void visit(Cast ast, FunctionType p) {
        ast.getCastingType().accept(this, p);
        ast.getExpression().accept(this, p);
        ast.setLValue(false);
        ast.setType(ast.getExpression().getType().canBeCastTo(ast.getCastingType(), ast));
        return null;
    }

    @Override
    public Void visit(CharLiteral ast, FunctionType p) {
        ast.setLValue(false);
        ast.setType(CharType.getInstance());
        return null;
    }

    @Override
    public Void visit(Comparison ast, FunctionType p) {
        ast.getLeft().accept(this, p);
        ast.getRight().accept(this, p);
        ast.setLValue(false);
        ast.setType(ast.getLeft().getType().comparison(ast.getRight().getType(), ast));
        return null;
    }

    @Override
    public Void visit(IntLiteral ast, FunctionType p) {
        ast.setLValue(false);
        ast.setType(IntType.getInstance());
        return null;
    }

    @Override
    public Void visit(Logical ast, FunctionType p) {
        ast.getLeft().accept(this, p);
        ast.getRight().accept(this, p);
        ast.setLValue(false);
        ast.setType(ast.getLeft().getType().logical(ast.getRight().getType(), ast));
        return null;
    }

    @Override
    public Void visit(RealLiteral ast, FunctionType p) {
        ast.setLValue(false);
        ast.setType(RealType.getInstance());
        return null;
    }

    @Override
    public Void visit(StructAccess ast, FunctionType p) {
        ast.getExpression().accept(this, p);
        ast.setLValue(true);
        ast.setType(ast.getExpression().getType().dot(ast.getName(), ast));
        return null;
    }

    @Override
    public Void visit(UnaryMinus ast, FunctionType p) {
        ast.getExpression().accept(this, p);
        ast.setLValue(false);
        ast.setType(ast.getType().arithmetic(ast));
        return null;
    }

    @Override
    public Void visit(UnaryNot ast, FunctionType p) {
        ast.getExpression().accept(this, p);
        ast.setLValue(false);
        ast.setType(ast.getExpression().getType().logical(ast));
        return null;
    }

    @Override
    public Void visit(Variable ast, FunctionType p) {
        ast.setLValue(true);
        ast.setType(ast.getDefinition().getType());
        return null;
    }

    /* Expression & Statement */
    @Override
    public Void visit(FunctionInvocation ast, FunctionType p) {
        ast.getVariable().accept(this, p);
        for (Expression e : ast.getExpressions()) {
            e.accept(this, p);
        }
        ast.setLValue(false);
        ast.setType(ast.getVariable().getDefinition().getType().parenthesis(
                ast.getExpressions().stream().map(Expression::getType).collect(Collectors.toList()), ast));
        return null;
    }

    /* Statements */
    @Override
    public Void visit(Assignment ast, FunctionType p) {
        ast.getLeft().accept(this, p);
        ast.getRight().accept(this, p);
        if (!ast.getLeft().getLValue()) {
            new ErrorType(ast.getLine(), ast.getColumn(), "A LValue was expected at assignment");
        }
        ast.getRight().getType().promotesTo(ast.getLeft().getType(), ast);
        return null;
    }

    @Override
    public Void visit(IfElse ast, FunctionType p) {
        ast.getExpression().accept(this, p);
        ast.getExpression().setType(ast.getExpression().getType().asLogical(ast.getExpression().getType(), ast));
        for (Statement s : ast.getIfBody()) {
            s.accept(this, p);
        }
        for (Statement s : ast.getElseBody()) {
            s.accept(this, p);
        }
        return null;
    }

    @Override
    public Void visit(Input ast, FunctionType p) {
        ast.getExpression().accept(this, p);
        if (!ast.getExpression().getLValue()) {
            new ErrorType(ast.getLine(), ast.getColumn(), "A LValue was expected at input");
        }
        ast.getExpression().setType(ast.getExpression().getType().asBuiltInType(ast.getExpression().getType(), ast));
        return null;
    }

    @Override
    public Void visit(Print ast, FunctionType p) {
        ast.getExpression().accept(this, p);
        ast.getExpression().setType(ast.getExpression().getType().asBuiltInType(ast.getExpression().getType(), ast));
        return null;
    }

    @Override
    public Void visit(Return ast, FunctionType p) {
        ast.getExpression().accept(this, p);
        ast.getExpression().setType(ast.getExpression().getType().promotesTo(p.getReturnType(), ast));
        return null;
    }

    @Override
    public Void visit(While ast, FunctionType p) {
        ast.getExpression().accept(this, p);
        ast.getExpression().setType(ast.getExpression().getType().asLogical(ast.getExpression().getType(), ast));
        for (Statement s : ast.getStatements()) {
            s.accept(this, p);
        }
        return null;
    }

    @Override
    public Void visit(FunctionDefinition ast, FunctionType p) {
        ast.getType().accept(this, p);
        for (VariableDefinition v : ast.getVarDefinitions()) {
            v.accept(this, p);
        }
        for (Statement s : ast.getStatements()) {
            s.accept(this, (FunctionType) ast.getType());
        }
        return null;
    }
}
