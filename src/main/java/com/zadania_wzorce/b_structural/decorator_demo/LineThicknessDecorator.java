package com.zadania_wzorce.b_structural.decorator_demo;

public class LineThicknessDecorator extends ShapeDecorator {

    protected double thickness;

    public LineThicknessDecorator(Shape shape, double thickness) {
        super(shape);
        this.thickness = thickness;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Grubość linii: " + thickness);
    }

    //no change
    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " z linią grubości " + thickness;
    }

    @Override
    public boolean isHidden() {
        return decoratedShape.isHidden();
    }


}
