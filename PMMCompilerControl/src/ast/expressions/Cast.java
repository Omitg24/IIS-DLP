package ast.expressions;

import ast.Expression;
import ast.Type;

public class Cast extends AbstractUnaryExpression {
    private Type type;

    public Cast(int line, int column, Expression expression, Type type) {
        super(line, column, expression);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Cast{" +
                "type=" + type +
                ", expression=" + expression +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
