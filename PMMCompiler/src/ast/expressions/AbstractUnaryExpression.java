package ast.expressions;

import ast.Expression;

public abstract class AbstractUnaryExpression extends AbstractExpression {
    protected Expression expression;

    public AbstractUnaryExpression(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}
