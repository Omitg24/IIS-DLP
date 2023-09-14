package ast.types;

public class VoidType extends AbstractType {

    private static VoidType instance;

    private VoidType() {
        super(0, 0);
    }

    public static VoidType getInstance() {
        if (instance == null) {
            instance = new VoidType();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "VoidType{" +
                "line=" + line +
                ", column=" + column +
                '}';
    }
}
