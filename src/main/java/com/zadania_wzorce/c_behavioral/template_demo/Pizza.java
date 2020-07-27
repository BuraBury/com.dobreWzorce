package com.zadania_wzorce.c_behavioral.template_demo;

public abstract class Pizza {

    public void prepare() {
        prepareCake();
        addSauce();
        addAdditions();
        addSpices();
        bake();
    }

    protected void addSauce() {
        addTomatoSauce();
    }

    private void bake() {
        System.out.println("Pizza upieczona w: " + getBakeTime() + " minut!");
    }

    protected String getBakeTime() {
        return "15";
    }

    protected abstract void addSpices();

    protected abstract void addAdditions();

    protected abstract void prepareCake();

    private void addTomatoSauce() {
        System.out.println("Dodaję sosu pomidorowego...");
    }

}
