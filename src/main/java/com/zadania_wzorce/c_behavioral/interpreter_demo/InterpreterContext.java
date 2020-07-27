package com.zadania_wzorce.c_behavioral.interpreter_demo;

public class InterpreterContext {
    String getBinaryFormat(int i) {
        return Integer.toBinaryString(i);
    }

    String getHexadecimalFormat(int i) {
        return Integer.toHexString(i);
    }
}
