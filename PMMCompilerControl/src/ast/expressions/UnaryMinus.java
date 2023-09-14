package ast.expressions;

import ast.Expression;

public class UnaryMinus extends AbstractUnaryExpression {
    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column, expression);
    }

    @Override
    public String toString() {
        return "UnaryMinus{" +
                "expression=" + expression +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
