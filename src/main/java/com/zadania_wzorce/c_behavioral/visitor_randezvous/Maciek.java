package com.zadania_wzorce.c_behavioral.visitor_randezvous;

public class Maciek implements Randkowicze {
    @Override
    public void accept(Odwiedzajacy odwiedzajacy) {
        odwiedzajacy.visit(this);
    }

    @Override
    public String toString() {
        return "Maciek";
    }
}
