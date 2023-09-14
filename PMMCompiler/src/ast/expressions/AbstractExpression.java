package ast.expressions;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {

    protected boolean lvalue;

    protected Type type;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean getLValue() {
        return lvalue;
    }

    @Override
    public void setLValue(boolean lvalue) {
        this.lvalue = lvalue;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }
}
