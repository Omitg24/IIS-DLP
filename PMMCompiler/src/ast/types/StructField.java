package ast.types;

import ast.AbstractASTNode;
import ast.Type;
import visitor.Visitor;

import java.util.Objects;

public class StructField extends AbstractASTNode {
    private Type type;

    private String name;

    private int offset;

    public StructField(int line, int column, Type type, String name) {
        super(line, column);
        this.type = type;
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "Field[" +
                "name:" + name +
                ",type:" + type +
                " offset:" + offset +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StructField structField = (StructField) o;
        return Objects.equals(name, structField.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }
}
