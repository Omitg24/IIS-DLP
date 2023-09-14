package ast.definitions;

import ast.Statement;
import ast.Type;

public class VariableDefinition extends AbstractDefinition implements Statement {

    public VariableDefinition(int line, int column, Type type, String name) {
        super(line, column, type, name);
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
}
