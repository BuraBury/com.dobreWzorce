package com.zadania_wzorce.b_structural.decorator_home_exercise;

public class Dog implements Animal {
    @Override
    public String description() {
        return "I am dog";
    }

    @Override
    public void pet() {
        System.out.println("Petting dog...");
    }
}
