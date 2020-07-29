package com.zadania_wzorce.c_behavioral.visitor_randezvous;

public class DajBuzi implements Odwiedzajacy {
    @Override
    public void visit(Randkowicze randkowicz) {
        if (randkowicz.toString().equalsIgnoreCase("kasia")) {
            System.out.println(randkowicz.toString() + " daje buzi");
        } else {
            System.out.println(randkowicz.toString() + " daje kosza");
        }
        System.out.println();
    }
}
