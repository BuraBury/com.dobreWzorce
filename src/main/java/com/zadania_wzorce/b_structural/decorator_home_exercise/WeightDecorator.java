package com.zadania_wzorce.b_structural.decorator_home_exercise;

import java.util.Scanner;

public class WeightDecorator extends AnimalDecorator {
    double weight;
    Scanner scanner = new Scanner(System.in);

    public WeightDecorator(Animal animal) {
        super(animal);
        System.out.println("Podaj wagę zwierzęcia: ");
        this.weight = scanner.nextDouble();
    }

    @Override
    public String description() {
        return decoratedAnimal.description();
    }

    @Override
    public void pet() {
        decoratedAnimal.pet();
        System.out.println("Waga: " + weight + "kg");
        if (weight > 5) {
            System.out.println("uff grubasek");
        }
    }
}
