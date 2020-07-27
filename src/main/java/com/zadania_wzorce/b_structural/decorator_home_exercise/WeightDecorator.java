package com.zadania_wzorce.b_structural.decorator_home_exercise;

import java.util.Scanner;

public class WeightDecorator extends AnimalDecorator {
    double weight;
    Scanner scanner = new Scanner(System.in);

    public WeightDecorator(Animal animal) {
        super(animal);
        System.out.println("Your pet weight = ");
        try {
            this.weight = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public WeightDecorator(Animal animal, double weight) {
        super(animal);
        this.weight = weight;
    }

    @Override
    public String description() {
        return decoratedAnimal.description();
    }

    @Override
    public void pet() {
        decoratedAnimal.pet();
        System.out.println("Weight: " + weight + "kg");
        if (weight > 5) {
            System.out.println("uff fatty");
        }
    }
}
