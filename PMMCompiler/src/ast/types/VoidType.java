package ast.types;

import visitor.Visitor;

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
        return "VoidType";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }
}
