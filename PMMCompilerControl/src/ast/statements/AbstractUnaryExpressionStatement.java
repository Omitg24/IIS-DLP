package ast.statements;

import ast.Expression;

public abstract class AbstractUnaryExpressionStatement extends AbstractStatement {
    protected Expression expression;

    public AbstractUnaryExpressionStatement(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}
