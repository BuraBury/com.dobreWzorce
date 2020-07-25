package com.zadania_wzorce.b_structural.decorator_demo;

public class LineStyleDecorator extends ShapeDecorator {

    protected LineStyle style;

    public LineStyleDecorator(Shape shape, LineStyle style) {
        super(shape);
        this.style = style;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Styl linii: " + style);
    }

    //no change
    @Override
    public void resize() {
        decoratedShape.resize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + "narysowano z użyciem " + style + " stylu linii";
    }

    //no change
    @Override
    public boolean isHidden() {
        return decoratedShape.isHidden();
    }


}
