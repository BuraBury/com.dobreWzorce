package com.zadania_wzorce.b_structural.decorator_home_exercise;

public abstract class AnimalDecorator implements Animal {
    protected Animal decoratedAnimal;

    public AnimalDecorator(Animal animal) {
        super();
        this.decoratedAnimal = animal;
    }
}
