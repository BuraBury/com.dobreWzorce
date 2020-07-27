package com.zadania_wzorce.b_structural.decorator_home_exercise;

import java.util.Scanner;

public class CollarCollorDecorator extends AnimalDecorator {
    Scanner scanner = new Scanner(System.in);
    Color color;

    public CollarCollorDecorator(Animal animal) {
        super(animal);
        System.out.println("Jakiego koloru ma być obroża?");
        this.color = Color.valueOf(scanner.next().toUpperCase());

    }

    @Override
    public String description() {
        return decoratedAnimal.description();
    }

    @Override
    public void pet() {
        decoratedAnimal.pet();
        System.out.println("Kolor obroży: " + color);
    }
}
