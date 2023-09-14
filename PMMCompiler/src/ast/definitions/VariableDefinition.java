package ast.definitions;

import ast.Statement;
import ast.Type;
import visitor.Visitor;

import java.util.Objects;

public class VariableDefinition extends AbstractDefinition implements Statement {

    private int offset;

    public VariableDefinition(int line, int column, Type type, String name) {
        super(line, column, type, name);
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "VariableDefinition{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", line=" + line +
                ", column=" + column +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VariableDefinition variableDefinition = (VariableDefinition) o;
        return Objects.equals(name, variableDefinition.name);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }
}
