package ast.types;

import ast.Type;
import ast.definitions.VariableDefinition;

import java.util.List;

public class FunctionType extends AbstractType {
    private final List<VariableDefinition> varDefinitions;

    private final Type returnType;

    public FunctionType(int line, int column, List<VariableDefinition> varDefinitions, Type returnType) {
        super(line, column);
        this.varDefinitions = varDefinitions;
        this.returnType = returnType;
    }

    public List<VariableDefinition> getVarDefinitions() {
        return varDefinitions;
    }

    public Type getReturnType() {
        return returnType;
    }

    @Override
    public String toString() {
        return "FunctionType{" +
                "varDefinitions=" + varDefinitions +
                ", returnType=" + returnType +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
