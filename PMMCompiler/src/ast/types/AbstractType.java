package ast.types;

import ast.ASTNode;
import ast.AbstractASTNode;
import ast.Type;

import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public Type arithmetic(Type other, ASTNode ast) {
        if (other instanceof ErrorType) {
            return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "An arithmetic operation cannot be done for types " + other + " and " + this);
    }

    @Override
    public Type arithmetic(ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn(), "An arithmetic type was expected");
    }

    @Override
    public Type comparison(Type other, ASTNode ast) {
        if (other instanceof ErrorType) {
            return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "A comparison operation cannot be done for types " + other + " and " + this);
    }

    @Override
    public Type logical(Type other, ASTNode ast) {
        if (other instanceof ErrorType) {
            return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "A logical operation cannot be done for types " + other + " and " + this);
    }

    @Override
    public Type logical(ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn(), "A logical type was expected");
    }

    @Override
    public Type squareBrackets(Type other, ASTNode ast) {
        if (other instanceof ErrorType) {
            return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "An indexing is not supported for this type, it was expected an ArrayType, but received " + this);
    }

    @Override
    public Type canBeCastTo(Type other, ASTNode ast) {
        if (other instanceof ErrorType) {
            return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "A cast cannot be done to this type, it was expected " + other + " but received " + this);
    }

    @Override
    public Type parenthesis(List<Type> others, ASTNode ast) {
        StringBuilder paramTypes = new StringBuilder();
        for (Type other : others) {
            if (other instanceof ErrorType) {
                return other;
            } else {
                paramTypes.append(other.toString()).append(" ");
            }
        }
        if (paramTypes.length() == 0) {
            paramTypes.append("none");
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "Wrong parameters in function call, it received " + paramTypes.toString());
    }

    @Override
    public Type dot(String id, ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn(), "Field " + id + " hasn't been defined in struct");
    }

    @Override
    public Type promotesTo(Type other, ASTNode ast) {
        if (other instanceof ErrorType) {
            return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "Types cannot promote to, it was expected " + this + " but received " + other);
    }

    @Override
    public Type asLogical(Type other, ASTNode ast) {
        if (other instanceof ErrorType) {
            return other;
        } else if (other.isLogical(ast)) {
            return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "A logical type was expected, but received " + this);
    }

    @Override
    public boolean isLogical(ASTNode ast) {
        return false;
    }

    @Override
    public Type asBuiltInType(Type other, ASTNode ast) {
        if (other instanceof ErrorType) {
            return other;
        } else if (other.isBuiltInType(ast)) {
            return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "A built-in type was expected, but received " + this);
    }

    @Override
    public boolean isBuiltInType(ASTNode ast) {
        return false;
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }

    @Override
    public char suffix() {
        return '\0';
    }
}
