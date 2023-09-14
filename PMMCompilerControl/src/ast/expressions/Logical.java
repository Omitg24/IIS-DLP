package ast.expressions;

import ast.Expression;

public class Logical extends AbstractOperationExpression {
    public Logical(int line, int column, Expression left, Expression right, String operator) {
        super(line, column, left, right, operator);
    }

    @Override
    public String toString() {
        return "Logical{" +
                "operator='" + operator + '\'' +
                ", left=" + left +
                ", right=" + right +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
