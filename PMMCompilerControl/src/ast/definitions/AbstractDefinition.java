package ast.definitions;

import ast.AbstractASTNode;
import ast.Definition;
import ast.Type;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {

    protected Type type;
    protected String name;

    public AbstractDefinition(int line, int column, Type type, String name) {
        super(line, column);
        this.type = type;
        this.name = name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }
}
