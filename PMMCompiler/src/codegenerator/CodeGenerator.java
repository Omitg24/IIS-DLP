package codegenerator;

import ast.Type;
import ast.types.CharType;
import ast.types.IntType;
import ast.types.RealType;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeGenerator {
    private PrintWriter out;

    private int label;

    public CodeGenerator(String outputFileName, String inputFileName) throws FileNotFoundException {
        this.out = new PrintWriter(new File(outputFileName));
        commentSource(inputFileName);
    }

    /* Instructions */
    // ---> PUSH
    public void pushBP() {
        this.out.println("\tpush\tbp");
        this.out.flush();
    }

    public void push(char charConstant) {
        this.out.println("\tpushb\t" + (int) charConstant);
        this.out.flush();
    }

    public void push(int intConstant) {
        this.out.println("\tpushi\t" + intConstant);
        this.out.flush();
    }

    public void push(double realConstant) {
        this.out.println("\tpushf\t" + realConstant);
        this.out.flush();
    }

    public void pusha(int intConstant) {
        this.out.println("\tpusha\t" + intConstant);
        this.out.flush();
    }

    // ---> LOAD
    public void load(Type type) {
        this.out.println("\tload" + type.suffix());
        this.out.flush();
    }

    // ---> STORE
    public void store(Type type) {
        this.out.println("\tstore" + type.suffix());
        this.out.flush();
    }

    // ---> POP
    public void pop(Type type) {
        this.out.println("\tpop" + type.suffix());
        this.out.flush();
    }

    // ---> DUP
    public void dup(Type type) {
        this.out.println("\tdup" + type.suffix());
        this.out.flush();
    }

    // ---> ARITHMETIC
    public void arithmetic(String operator, Type type) {
        switch (operator) {
            case "+" -> add(type);
            case "-" -> sub(type);
            case "*" -> mul(type);
            case "/" -> div(type);
            case "%" -> mod(type);
        }
    }

    public void add(Type type) {
        this.out.println("\tadd" + type.suffix());
        this.out.flush();
    }

    public void sub(Type type) {
        this.out.println("\tsub" + type.suffix());
        this.out.flush();
    }

    public void mul(Type type) {
        this.out.println("\tmul" + type.suffix());
        this.out.flush();
    }

    public void div(Type type) {
        this.out.println("\tdiv" + type.suffix());
        this.out.flush();
    }

    public void mod(Type type) {
        this.out.println("\tmod" + type.suffix());
        this.out.flush();
    }

    // ---> COMPARISON
    public void comparison(String operator, Type type) {
        switch (operator) {
            case ">" -> gt(type);
            case "<" -> lt(type);
            case ">=" -> ge(type);
            case "<=" -> le(type);
            case "==" -> eq(type);
            case "!=" -> ne(type);
        }
        this.out.flush();
    }

    public void gt(Type type) {
        this.out.println("\tgt" + type.suffix());
        this.out.flush();
    }

    public void lt(Type type) {
        this.out.println("\tlt" + type.suffix());
        this.out.flush();
    }

    public void ge(Type type) {
        this.out.println("\tge" + type.suffix());
        this.out.flush();
    }

    public void le(Type type) {
        this.out.println("\tle" + type.suffix());
        this.out.flush();
    }

    public void eq(Type type) {
        this.out.println("\teq" + type.suffix());
        this.out.flush();
    }

    public void ne(Type type) {
        this.out.println("\tne" + type.suffix());
        this.out.flush();
    }

    // ---> LOGICAL
    public void logical(String operator) {
        switch (operator) {
            case "&&" -> and();
            case "||" -> or();
            case "!" -> not();
        }
        this.out.flush();
    }

    public void and() {
        this.out.println("\tand");
        this.out.flush();
    }

    public void or() {
        this.out.println("\tor");
        this.out.flush();
    }

    public void not() {
        this.out.println("\tnot");
        this.out.flush();
    }

    // ---> OUTPUT
    public void out(Type type) {
        this.out.println("\tout" + type.suffix());
        this.out.flush();
    }

    // ---> INPUT
    public void in(Type type) {
        this.out.println("\tin" + type.suffix());
        this.out.flush();
    }

    // ---> CONVERSION
    public void convertTo(Type from, Type to) {
        if (from.equals(IntType.getInstance())) {
            if (to.equals(CharType.getInstance())) {
                this.out.println("\ti2b");
            } else if (to.equals(RealType.getInstance())) {
                this.out.println("\ti2f");
            }
        } else if (from.equals(RealType.getInstance())) {
            if (to.equals(IntType.getInstance())) {
                this.out.println("\tf2i");
            } else if (to.equals(CharType.getInstance())) {
                this.out.println("\tf2i");
                this.out.println("\ti2b");
            }
        } else if (from.equals(CharType.getInstance())) {
            if (to.equals(IntType.getInstance())) {
                this.out.println("\tb2i");
            } else if (to.equals(RealType.getInstance())) {
                this.out.println("\tb2i");
                this.out.println("\ti2f");
            }
        }
        this.out.flush();
    }

    // ---> JUMP
    public void jmp(int labelNumber) {
        this.out.println("\tjmp\tlabel" + labelNumber);
        this.out.flush();
    }

    public void jz(int labelNumber) {
        this.out.println("\tjz\tlabel" + labelNumber);
        this.out.flush();
    }

    public void jnz(int labelNumber) {
        this.out.println("\tjnz\tlabel" + labelNumber);
        this.out.flush();
    }

    // ---> FUNCTION
    public void call(String id) {
        this.out.println("\tcall\t" + id);
        this.out.flush();
    }

    public void callMain() {
        this.out.println("\n' Invocation to the main function");
        this.out.println("call main");
        this.out.flush();
    }

    public void enter(int bytesLocals) {
        this.out.println("\tenter\t" + bytesLocals);
        this.out.flush();
    }

    public void ret(int bytesReturn, int bytesLocals, int bytesParams) {
        this.out.println("\tret\t" + bytesReturn + ", " + bytesLocals + ", " + bytesParams);
        this.out.flush();

    }

    public void halt() {
        this.out.println("halt\n");
        this.out.flush();
    }

    /* Labels */
    public void printFunction(String functionName) {
        this.out.println("\n " + functionName + ":");
        this.out.flush();
    }

    public void printLabel(int labelNumber) {
        this.out.println(" label" + labelNumber + ":");
        this.out.flush();
    }

    public int getLabel() {
        return this.label++;
    }

    /* Comments */
    private void commentSource(String inputFileName) {
        this.out.println("\n#source\t" + "\"" + inputFileName + "\"\n");
        this.out.flush();
    }

    public void commentLine(int line) {
        this.out.println("\n#line\t" + line);
        this.out.flush();
    }

    public void comment(String text) {
        this.out.println("\t' * " + text);
        this.out.flush();
    }
}
