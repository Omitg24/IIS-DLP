package codegenerator;

import ast.Statement;
import ast.definitions.FunctionDefinition;
import ast.definitions.VariableDefinition;
import ast.types.FunctionType;
import ast.types.StructField;
import ast.types.StructType;
import visitor.AbstractVisitor;

public class OffSetVisitor extends AbstractVisitor<Void, Void> {

    private int totalLocalVarDefSizes;
    private int totalGlobalVarDefSizes;

    @Override
    public Void visit(VariableDefinition ast, Void p) {
        if (ast.getScope() == 0) {
            ast.setOffset(totalGlobalVarDefSizes);
            this.totalGlobalVarDefSizes += ast.getType().numberOfBytes();
        } else {
            this.totalLocalVarDefSizes -= ast.getType().numberOfBytes();
            ast.setOffset(totalLocalVarDefSizes);
        }
        ast.getType().accept(this, p);
        return null;
    }

    @Override
    public Void visit(FunctionDefinition ast, Void p) {
        this.totalLocalVarDefSizes = 0;
        ast.getType().accept(this, p);
        for (VariableDefinition v : ast.getVarDefinitions()) {
            v.accept(this, p);
        }
        for (Statement s : ast.getStatements()) {
            s.accept(this, p);
        }
        return null;
    }

    @Override
    public Void visit(FunctionType ast, Void p) {
        int totalOffset = 4;
        for (int i = ast.getVarDefinitions().size() - 1; i >= 0; i--) {
            ast.getVarDefinitions().get(i).setOffset(totalOffset);
            totalOffset += ast.getVarDefinitions().get(i).getType().numberOfBytes();
        }
        return null;
    }

    @Override
    public Void visit(StructType ast, Void p) {
        int totalFieldSize = 0;
        for (StructField structField : ast.getStructFields()) {
            structField.setOffset(totalFieldSize);
            totalFieldSize += structField.getType().numberOfBytes();
            structField.getType().accept(this, p);
        }
        return null;
    }
}
