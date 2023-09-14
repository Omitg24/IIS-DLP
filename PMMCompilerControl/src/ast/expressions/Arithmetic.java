package ast.expressions;

import ast.Expression;

public class Arithmetic extends AbstractOperationExpression {
    public Arithmetic(int line, int column, Expression left, Expression right, String operator) {
        super(line, column, left, right, operator);
    }

    @Override
    public String toString() {
        return "Arithmetic{" +
                "operator='" + operator + '\'' +
                ", left=" + left +
                ", right=" + right +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
