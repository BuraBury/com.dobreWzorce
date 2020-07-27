package com.zadania_wzorce.c_behavioral.template_demo;

public class Hawajska extends Pizza {
    @Override
    protected void addSpices() {
        System.out.println("Dodaję oregano...");
    }

    @Override
    protected void addAdditions() {
        System.out.println("Dodaję ananasa i kurczaka...");
    }

    @Override
    protected void prepareCake() {
        System.out.println("Przygotowuję ciasto na grubą pizzę...");

    }
}
