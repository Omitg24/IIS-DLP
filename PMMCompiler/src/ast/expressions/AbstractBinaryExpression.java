package ast.expressions;

import ast.Expression;

public abstract class AbstractBinaryExpression extends AbstractExpression {
    protected Expression left;
    protected Expression right;

    public AbstractBinaryExpression(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}
