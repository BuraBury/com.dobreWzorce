package com.zadania_wzorce.b_structural.decorator_demo;

public class FillColorDecorator extends ShapeDecorator {
    protected Color color;

    public FillColorDecorator(Shape shape, Color color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Kolor wypełnienia: " + color);
    }

    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " rysuje wypełniony kolorem " + color;
    }

    @Override
    public boolean isHidden() {
        return decoratedShape.isHidden();
    }
}
