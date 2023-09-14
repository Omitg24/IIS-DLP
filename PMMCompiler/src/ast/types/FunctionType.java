package ast.types;

import ast.ASTNode;
import ast.Type;
import ast.definitions.VariableDefinition;
import visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractType {
    private List<VariableDefinition> varDefinitions;

    private Type returnType;

    private int bytesParams;

    private int bytesReturn;

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

    public int getBytesParams() {
        return bytesParams;
    }

    public void setBytesParams(int bytesParams) {
        this.bytesParams = bytesParams;
    }

    public int getBytesReturn() {
        return bytesReturn;
    }

    public void setBytesReturn(int bytesReturn) {
        this.bytesReturn = bytesReturn;
    }

    @Override
    public String toString() {
        return "FunctionType{" +
                "varDefinitions=" + varDefinitions +
                ", returnType=" + returnType +
                ", bytesParams=" + bytesParams +
                ", bytesReturn=" + bytesReturn +
                '}';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }

    @Override
    public Type parenthesis(List<Type> types, ASTNode ast) {
        if (types.size() != varDefinitions.size()) {
            return super.parenthesis(types, ast);
        }
        for (int i = 0; i < varDefinitions.size(); i++) {
            if (types.get(i).promotesTo(varDefinitions.get(i).getType(), ast) instanceof ErrorType) {
                return super.parenthesis(types, ast);
            }
        }
        return returnType;
    }
}
