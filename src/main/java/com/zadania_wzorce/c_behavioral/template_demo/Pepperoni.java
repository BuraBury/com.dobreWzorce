package com.zadania_wzorce.c_behavioral.template_demo;

public class Pepperoni extends Pizza {
    @Override
    protected void addSpices() {
        System.out.println("Dodaję oregano i chilli...");
    }

    @Override
    protected void addAdditions() {
        System.out.println("Dodaję ser i kiełbaskę peperoni...");
    }

    @Override
    protected void prepareCake() {
        System.out.println("Przygotowuję ciasto na cienką włoską pizzunię...");
    }
}
