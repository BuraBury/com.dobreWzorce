package com.zadania_wzorce.b_structural.decorator_home_exercise;

import java.util.Scanner;

public class NameDecorator extends AnimalDecorator {
    String name;
    Scanner scanner = new Scanner(System.in);

    public NameDecorator(Animal animal) {
        super(animal);
        System.out.println("Podaj imię zwierzęcia: ");
        this.name = scanner.nextLine();

    }

    @Override
    public String description() {
        return decoratedAnimal.description();
    }

    @Override
    public void pet() {
        decoratedAnimal.pet();
        System.out.println("Imię: " + name);
    }
}
