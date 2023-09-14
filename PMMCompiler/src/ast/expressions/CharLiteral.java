package ast.expressions;

import visitor.Visitor;

public class CharLiteral extends AbstractExpression {
    private char value;

    public CharLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "CharLiteral{" +
                "value=" + value +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }
}
