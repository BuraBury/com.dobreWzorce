package com.zadania_wzorce.c_behavioral.visitor_randezvous;

public class DajKwiaty implements Odwiedzajacy {
    @Override
    public void visit(Randkowicze randkowicz) {
        if (randkowicz.toString().equalsIgnoreCase("maciek")) {
            System.out.println(randkowicz.toString() + " daje kwiaty");
        } else {
            System.out.println(randkowicz.toString() + " zaprasza do kina");
        }
        System.out.println();
    }
}
