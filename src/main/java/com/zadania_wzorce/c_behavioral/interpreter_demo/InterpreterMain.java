package com.zadania_wzorce.c_behavioral.interpreter_demo;

public class InterpreterMain {

    private InterpreterContext ic;

    private InterpreterMain(InterpreterContext i ) {
        this.ic = i;
    }

    private String interpret(String str) {
        Expression exp;
        if(str.contains("Hexadecimal")) {
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else if(str.contains("Binary")) {
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else return str;

        return exp.interpret(ic);
    }

    public static void main(String[] args) {

        String str1 = "205 to Binary";
        String str2 = "100000 to Hexadecimal";

        InterpreterMain interpreter = new InterpreterMain(new InterpreterContext());
        System.out.println(str1 + "= " + interpreter.interpret(str1));
        System.out.println(str2 + "= " + interpreter.interpret(str2));


    }
}
