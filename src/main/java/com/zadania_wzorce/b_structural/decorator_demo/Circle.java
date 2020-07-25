package com.zadania_wzorce.b_structural.decorator_demo;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rysuje koło...");
    }

    @Override
    public void resize() {
        System.out.println("zmieniam rozmiar koła...");
    }

    @Override
    public String description() {
        return "Obiekt - koło";
    }

    @Override
    public boolean isHidden() {
        return false;
    }
}
