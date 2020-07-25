package com.zadania_wzorce.b_structural.decorator_demo;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rysuje prostokąt...");
    }

    @Override
    public void resize() {
        System.out.println("zmieniam rozmiar prostokąta");
    }

    @Override
    public String description() {
        return "Obiekt - prostokąt";
    }

    @Override
    public boolean isHidden() {
        return false;
    }
}
