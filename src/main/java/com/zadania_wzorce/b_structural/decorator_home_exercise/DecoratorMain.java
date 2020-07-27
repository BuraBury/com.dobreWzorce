package com.zadania_wzorce.b_structural.decorator_home_exercise;

public class DecoratorMain {
    public static void main(String[] args) {
        System.out.println("Creating classic Animals...");
        Animal cat = new Cat();
        Animal dog = new Dog();
        System.out.println("Petting classic Animal");
        cat.pet();
        dog.pet();
        System.out.println();

        System.out.println("Creating decorated Object - type Dog...");
        Animal decDog =
                new WeightDecorator(
                        new NameDecorator(
                                new FurrColorDecorator(
                                        new CollarCollorDecorator(
                                                new EyesCollorDecorator(new Dog(), Color.BLACK), Color.ORANGE), Color.WHITE), "Bercik"), 20);
        decDog.pet();
        System.out.println();


        System.out.println("Creating custom Object - type Dog...");
        Animal dog1 =
                new WeightDecorator(
                        new NameDecorator(
                                new FurrColorDecorator(
                                        new CollarCollorDecorator(
                                                new EyesCollorDecorator(new Dog())))));

        dog1.pet();
        System.out.println();

        System.out.println("Creating custom Object - type Cat...");
        Animal cat1 =
                new WeightDecorator(
                        new NameDecorator(
                                new FurrColorDecorator(
                                        new CollarCollorDecorator(
                                                new EyesCollorDecorator(new Cat())))));

        cat1.pet();
        System.out.println();
    }
}
