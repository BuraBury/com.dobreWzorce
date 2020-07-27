package com.zadania_wzorce.c_behavioral.odwiedzajacy;

public class BoliNos implements Visitor {
    @Override
    public void visit(Person person) {
        System.out.println(person.toString() + " skarży się na nos");
        System.out.println("1...2...3... dmuchamy...");
        System.out.println(person.toString() + " już nie narzeka");
        System.out.println();
    }
}
