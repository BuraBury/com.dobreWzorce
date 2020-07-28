package com.zadania_wzorce.c_behavioral.visitor_data_base;

import java.util.Objects;

public class Person {
    private final String gender;
    private final String income;
    private final String name;

    public Person(String gender, String income, String name) {
        this.gender = gender;
        this.income = income;
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public String getIncome() {
        return income;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name: " + name +
                "\nincome: " + income + ".00 PLN" +
                "\ngender: " + gender
                + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(gender, person.gender) &&
                Objects.equals(income, person.income) &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, income, name);
    }
}
