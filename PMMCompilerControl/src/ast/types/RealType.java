package ast.types;

public class RealType extends AbstractType {

    private static RealType instance;

    private RealType() {
        super(0, 0);
    }

    public static RealType getInstance() {
        if (instance == null) {
            instance = new RealType();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "RealType{" +
                "line=" + line +
                ", column=" + column +
                '}';
    }
}
