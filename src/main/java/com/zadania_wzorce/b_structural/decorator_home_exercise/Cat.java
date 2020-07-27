package com.zadania_wzorce.b_structural.decorator_home_exercise;

public class Cat implements Animal {
    @Override
    public String description() {
        return "I am cat";
    }

    @Override
    public void pet() {
        System.out.println("Petting cat...");
    }
}
