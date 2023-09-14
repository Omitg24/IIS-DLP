package ast.expressions;

import ast.Expression;

public class ArrayAccess extends AbstractBinaryExpression {
    public ArrayAccess(int line, int column, Expression left, Expression right) {
        super(line, column, left, right);
    }

    @Override
    public String toString() {
        return "ArrayAccess{" +
                "left=" + left +
                ", right=" + right +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
