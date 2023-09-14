package ast.expressions;

import ast.Expression;
import visitor.Visitor;

public class UnaryNot extends AbstractUnaryExpression {

    public UnaryNot(int line, int column, Expression expression) {
        super(line, column, expression);
    }

    @Override
    public String toString() {
        return "UnaryNot{" +
                "expression=" + expression +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }
}
