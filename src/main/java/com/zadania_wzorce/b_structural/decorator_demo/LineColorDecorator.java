package com.zadania_wzorce.b_structural.decorator_demo;

public class LineColorDecorator extends ShapeDecorator {
    protected Color color;

    public LineColorDecorator(Shape shape, Color color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Kolor linii: " + color);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " narysowany z linia w kolorze " + color;
    }

    @Override
    public boolean isHidden() {
        return decoratedShape.isHidden();
    }
}
