package ast.types;

import ast.ASTNode;
import ast.Type;
import visitor.Visitor;

import java.util.List;

public class StructType extends AbstractType {

    private final List<StructField> structFields;

    public StructType(int line, int column, List<StructField> structFields) {
        super(line, column);
        this.structFields = structFields;
    }

    public List<StructField> getStructFields() {
        return structFields;
    }

    public StructField getField(String name) {
        for (StructField structField : structFields) {
            if (structField.getName().equals(name)) {
                return structField;
            }
        }
        ;
        return null;
    }

    @Override
    public String toString() {
        return "StructType[" +
                "fields:" + structFields +
                ']';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }

    @Override
    public Type dot(String id, ASTNode ast) {
        for (StructField structField : structFields) {
            if (structField.getName().equals(id)) {
                return structField.getType();
            }
        }
        return super.dot(id, ast);
    }

    @Override
    public int numberOfBytes() {
        int totalNumberOfBytes = 0;
        for (StructField structField : structFields) {
            totalNumberOfBytes += structField.getType().numberOfBytes();
        }
        return totalNumberOfBytes;
    }
}
