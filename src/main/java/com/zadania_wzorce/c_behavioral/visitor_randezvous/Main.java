package com.zadania_wzorce.c_behavioral.visitor_randezvous;

public class Main {
    public static void main(String[] args) {
        Randkowicze[] people = new Randkowicze[] {new Aga(), new Tomek(), new Maciek(), new Kasia()};

        Odwiedzajacy odwiedzajacy = new DajKwiaty();
        for(Randkowicze person : people) {
            person.accept(odwiedzajacy);
        }

        odwiedzajacy = new DajBuzi();
        for (Randkowicze person : people) {
            person.accept(odwiedzajacy);
        }
    }
}
