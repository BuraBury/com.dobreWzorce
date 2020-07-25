package com.zadania_wzorce.b_structural.decorator_demo;

public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape) {
        super();
        this.decoratedShape = shape;
    }


}
