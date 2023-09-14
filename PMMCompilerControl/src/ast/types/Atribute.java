package ast.types;

import ast.AbstractASTNode;
import ast.Type;

public class Atribute extends AbstractASTNode {
    private final Type type;

    private final String name;


    public Atribute(int line, int column, Type type, String name) {
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

    @Override
    public String toString() {
        return "Atribute{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
