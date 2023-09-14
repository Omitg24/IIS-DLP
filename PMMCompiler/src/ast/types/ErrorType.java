package ast.types;

import errorhandler.ErrorHandler;
import visitor.Visitor;

public class ErrorType extends AbstractType {
    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
        ErrorHandler.getInstance().addError(this);
    }

    public String getMessage() {
        return message;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP p) {
        return v.visit(this, p);
    }

    @Override
    public String toString() {
        return "error";
    }
}
