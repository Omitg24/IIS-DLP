package ast.types;

import ast.Type;

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
        return "ArrayType{" +
                "size=" + size +
                ", type=" + type +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
