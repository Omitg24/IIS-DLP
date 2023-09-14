package ast.types;

import java.util.List;

public class StructType extends AbstractType {

    private final List<Atribute> atributes;

    public StructType(int line, int column, List<Atribute> atributes) {
        super(line, column);
        this.atributes = atributes;
    }

    public List<Atribute> getAtributes() {
        return atributes;
    }

    @Override
    public String toString() {
        return "StructType{" +
                "atributes=" + atributes +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
