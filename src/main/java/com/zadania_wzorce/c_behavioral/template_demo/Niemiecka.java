package com.zadania_wzorce.c_behavioral.template_demo;

public class Niemiecka extends Pizza {
    @Override
    protected void addSauce() {
        addCreamySos();
    }

    private void addCreamySos() {
        System.out.println("Dodaje sos śmietanowy z musztardą...");
    }

    @Override
    protected void addSpices() {
        System.out.println("Dodaję gorczycę i pieprz...");
    }

    @Override
    protected void addAdditions() {
        System.out.println("Dodaję boczek i ogórki kiszone...");
    }

    @Override
    protected void prepareCake() {
        System.out.println("Przygotowuję ciasto piwne...");
    }
}
