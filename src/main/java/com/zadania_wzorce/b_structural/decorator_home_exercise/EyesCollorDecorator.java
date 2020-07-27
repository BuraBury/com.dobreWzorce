package com.zadania_wzorce.b_structural.decorator_home_exercise;

import java.util.Scanner;

public class EyesCollorDecorator extends AnimalDecorator {
    protected Color color;
    Scanner scanner = new Scanner(System.in);

    public EyesCollorDecorator(Animal animal) {
        super(animal);
        System.out.println("Your pet eyes' color = ");
        try {
            this.color = Color.valueOf(scanner.next().toUpperCase());
        } catch (Exception e) {
            System.out.println("There's no such color");
            this.color = Color.DEFAULT;
        }

    }

    public EyesCollorDecorator(Animal animal, Color color) {
        super(animal);
        this.color = color;

    }

    @Override
    public String description() {
        return decoratedAnimal.description();
    }

    @Override
    public void pet() {
        decoratedAnimal.pet();
        System.out.println("Eyes color: " + color);

    }
}
