package ast.expressions;

import ast.Expression;

public class Parenthesis extends AbstractUnaryExpression {

    public Parenthesis(int line, int column, Expression expression) {
        super(line, column, expression);
    }

    @Override
    public String toString() {
        return "Parenthesis{" +
                "expression=" + expression +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
