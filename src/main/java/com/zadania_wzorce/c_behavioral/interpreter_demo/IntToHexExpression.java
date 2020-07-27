package com.zadania_wzorce.c_behavioral.interpreter_demo;

public class IntToHexExpression implements Expression {
    private int i;

    public IntToHexExpression(int c) {
        this.i = c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(this.i);
    }
}
