package ast.types;

import ast.ASTNode;
import ast.Type;
import visitor.Visitor;

public class ArrayType extends AbstractType {
    private int size;
    private Type type;

    public ArrayType(int line, int column, int size, Type type) {
        super(line, column);
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ArrayType[of:" + type + ",size:" + size + "]";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }

    @Override
    public Type squareBrackets(Type other, ASTNode ast) {
        if (other instanceof IntType) {
            return this.type;
        }
        return super.squareBrackets(other, ast);
    }

    @Override
    public int numberOfBytes() {
        int totalNumberOfBytes = 0;
        for (int i = 0; i < size; i++) {
            totalNumberOfBytes += type.numberOfBytes();
        }
        return totalNumberOfBytes;
    }
}
