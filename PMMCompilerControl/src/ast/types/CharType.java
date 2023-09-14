package ast.types;

public class CharType extends AbstractType {
    private static CharType instance;

    private CharType() {
        super(0, 0);
    }

    public static CharType getInstance() {
        if (instance == null) {
            instance = new CharType();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "CharType{" +
                "line=" + line +
                ", column=" + column +
                '}';
    }
}
