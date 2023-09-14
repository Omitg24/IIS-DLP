package ast.expressions;

import ast.Expression;

public abstract class AbstractOperationExpression extends AbstractBinaryExpression {
    protected String operator;

    public AbstractOperationExpression(int line, int column, Expression left, Expression right, String operator) {
        super(line, column, left, right);
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}
