package ast.types;

public class IntType extends AbstractType {

    private static IntType instance;

    private IntType() {
        super(0, 0);
    }

    public static IntType getInstance() {
        if (instance == null) {
            instance = new IntType();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "IntType{" +
                "line=" + line +
                ", column=" + column +
                '}';
    }
}
