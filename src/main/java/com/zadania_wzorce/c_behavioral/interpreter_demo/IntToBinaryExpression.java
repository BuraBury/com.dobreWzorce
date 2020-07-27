package com.zadania_wzorce.c_behavioral.interpreter_demo;

public class IntToBinaryExpression implements Expression {

    private int i;

    public IntToBinaryExpression(int c) {
        this.i = c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(this.i);
    }
}
