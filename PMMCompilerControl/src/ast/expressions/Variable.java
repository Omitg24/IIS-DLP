package ast.expressions;

public class Variable extends AbstractExpression {
    private String name;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "name='" + name + '\'' +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}
