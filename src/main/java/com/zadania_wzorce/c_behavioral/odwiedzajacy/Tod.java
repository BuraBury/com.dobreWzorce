package com.zadania_wzorce.c_behavioral.odwiedzajacy;

public class Tod implements Person {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Tod";
    }
}
