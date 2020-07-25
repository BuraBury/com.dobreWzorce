package com.zadania_wzorce.b_structural.decorator_demo;

public class DecoratorMain {
    public static void main(String[] args) {

        System.out.println("Tworzenie zwykłych obiektów Shape...");
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        System.out.println("Rysowanie zwykłych obiektów Shape...");
        rectangle.draw();
        circle.draw();
        System.out.println();
        System.out.println("Tworzenie udekorowanego, czerwonego koła z niebieskim obrysem w stylu dash " +
                "i grubością linii 2.0...");
        Shape circle1 =
                new FillColorDecorator(
                        new LineColorDecorator(
                                new LineStyleDecorator(
                                        new LineThicknessDecorator(new Circle(), 2.0d), LineStyle.DASH),
                                Color.BLUE), Color.RED);

        circle1.draw();
        System.out.println();


    }
}
