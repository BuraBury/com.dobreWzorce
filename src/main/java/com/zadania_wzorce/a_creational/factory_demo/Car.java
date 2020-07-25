package com.zadania_wzorce.a_creational.factory_demo;

import java.text.MessageFormat;

public abstract class Car {

    public abstract String getType();

    public abstract String getEngine();

    public abstract String getBodyType();

    public abstract String getBrand();

    @Override
    public String toString() {
        return MessageFormat.format("Your {0} is: {1}, {2}, {3}", getType(), getEngine(), getBodyType(), getBrand());
    }

}
