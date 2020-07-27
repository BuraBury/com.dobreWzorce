package com.zadania_wzorce.a_creational.factory_demo;

public class SportVehicle extends Car {
    private final String type;
    private final String engine;
    private final String bodyType;
    private final String brand;

    public SportVehicle(String engine, String bodyType, String brand) {
        this.type = this.getClass().getSimpleName();
        this.engine = engine;
        this.bodyType = bodyType;
        this.brand = brand;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getEngine() {
        return this.engine;
    }

    @Override
    public String getBodyType() {
        return this.bodyType;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }
}
