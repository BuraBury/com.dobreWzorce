package com.zadania_wzorce.c_behavioral.visitor_randezvous;

public class Tomek implements Randkowicze {
    @Override
    public void accept(Odwiedzajacy odwiedzajacy) {
        odwiedzajacy.visit(this);
    }

    @Override
    public String toString() {
        return "Tomek";
    }
}
