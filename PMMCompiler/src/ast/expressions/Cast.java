package ast.expressions;

import ast.Expression;
import ast.Type;
import visitor.Visitor;

public class Cast extends AbstractUnaryExpression {
    private Type castingType;

    public Cast(int line, int column, Expression expression, Type castingType) {
        super(line, column, expression);
        this.castingType = castingType;
    }

    public Type getCastingType() {
        return castingType;
    }

    @Override
    public String toString() {
        return "Cast{" +
                "type=" + castingType +
                ", expression=" + expression +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }
}
