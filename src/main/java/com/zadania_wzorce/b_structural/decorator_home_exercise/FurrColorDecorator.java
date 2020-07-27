package com.zadania_wzorce.b_structural.decorator_home_exercise;

import java.util.Scanner;

public class FurrColorDecorator extends AnimalDecorator {
    Color color;
    Scanner scanner = new Scanner(System.in);

    public FurrColorDecorator(Animal animal) {
        super(animal);
        System.out.println("Jakiego koloru ma być sierść?");
        try {
            this.color = Color.valueOf(scanner.next().toUpperCase());
        } catch (Exception e) {
            System.out.println("Nie ma takiego koloru");
            this.color = Color.DEFAULT;
        }

    }

    public FurrColorDecorator(Animal animal, Color color) {
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
        System.out.println("Kolor sierści: " + color);
    }
}
