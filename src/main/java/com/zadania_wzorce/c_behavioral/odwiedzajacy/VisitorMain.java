package com.zadania_wzorce.c_behavioral.odwiedzajacy;

public class VisitorMain {
    public static void main(String[] args) {

        Person[] people = new Person[]{new Bob(), new Rob(), new Tod()};

        Visitor visitor = new BoliCos();
        for (Person person : people) {
            person.accept(visitor);
        }

        visitor = new BoliNos();
        for (Person person : people) {
            person.accept(visitor);
        }
    }
}
