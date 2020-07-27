package com.zadania_wzorce.b_structural.decorator_home_exercise;

public class DecoratorMain {
    public static void main(String[] args) {
        System.out.println("Tworzenie zwykłych obiektów Animal...");
        Animal cat = new Cat();
        Animal dog = new Dog();
        System.out.println("Głaskanie zwykłych obiektów Animal");
        cat.pet();
        dog.pet();
        System.out.println();
        System.out.println("Tworzenie udekorowanego obiektu typu Pies...");
        Animal dog1 =
                new WeightDecorator(
                        new NameDecorator(
                                new FurrColorDecorator(
                                        new CollarCollorDecorator(
                                                new EyesCollorDecorator(new Dog())))));

        dog1.pet();
        System.out.println();

        System.out.println("Tworzenie udekorownego obiektu typu Kot...");
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
