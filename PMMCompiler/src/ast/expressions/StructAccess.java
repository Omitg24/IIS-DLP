package ast.expressions;

import ast.Expression;
import visitor.Visitor;

public class StructAccess extends AbstractUnaryExpression {
    private String name;

    public StructAccess(int line, int column, Expression expression, String name) {
        super(line, column, expression);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StructAccess{" +
                "name='" + name + '\'' +
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
