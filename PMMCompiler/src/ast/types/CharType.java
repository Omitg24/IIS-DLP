package ast.types;

import ast.ASTNode;
import ast.Type;
import visitor.Visitor;

public class CharType extends AbstractType {
    private static CharType instance;

    private CharType() {
        super(0, 0);
    }

    public static CharType getInstance() {
        if (instance == null) {
            instance = new CharType();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "CharType";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }

    @Override
    public Type arithmetic(Type other, ASTNode ast) {
        if (other.isBuiltInType(ast)) {
            return IntType.getInstance();
        }
        return super.arithmetic(other, ast);
    }

    @Override
    public Type arithmetic(ASTNode ast) {
        return IntType.getInstance();
    }

    @Override
    public Type comparison(Type other, ASTNode ast) {
        if (other.isBuiltInType(ast)) {
            return IntType.getInstance();
        }
        return super.comparison(other, ast);
    }

    @Override
    public Type canBeCastTo(Type other, ASTNode ast) {
        if (other.isBuiltInType(ast)) {
            return other;
        }
        return super.canBeCastTo(other, ast);
    }

    @Override
    public Type promotesTo(Type other, ASTNode ast) {
        if (other.isBuiltInType(ast)) {
            return other;
        }
        return super.promotesTo(other, ast);
    }

    @Override
    public boolean isBuiltInType(ASTNode ast) {
        return true;
    }

    @Override
    public int numberOfBytes() {
        return 1;
    }

    @Override
    public char suffix() {
        return 'b';
    }
}
