package com.zadania_wzorce.b_structural.decorator_home_exercise;

import java.util.Scanner;

public class CollarCollorDecorator extends AnimalDecorator {
    Scanner scanner = new Scanner(System.in);
    Color color;

    public CollarCollorDecorator(Animal animal) {
        super(animal);
        System.out.println("What color is your pet's collar?");
        try {
            this.color = Color.valueOf(scanner.next().toUpperCase());
        } catch (Exception e) {
            System.out.println("There's no such color...");
            this.color = Color.DEFAULT;
        }
    }

    public CollarCollorDecorator(Animal animal, Color color) {
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
        System.out.println("Collar color: " + color);
    }
}
