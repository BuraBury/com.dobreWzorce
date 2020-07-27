package com.zadania_wzorce.c_behavioral.odwiedzajacy;

public class BoliCos implements Visitor {
    @Override
    public void visit(Person person) {
        if(person.toString().equalsIgnoreCase("Bob")) {
            System.out.println(person.toString() + " skarży się na oko");
        } else {
            System.out.println(person.toString() + " skarży się na nogę");
        }
        System.out.println();
    }
}
