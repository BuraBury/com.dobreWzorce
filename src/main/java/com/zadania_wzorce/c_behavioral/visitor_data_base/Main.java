package com.zadania_wzorce.c_behavioral.visitor_data_base;

import static com.zadania_wzorce.c_behavioral.visitor_data_base.Visitor.visit;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("female", 2300, "Ala Makota");
        Person person2 = new Person("female", 3400, "Monika Brodka");
        Person person3 = new Person("male", 1500, "Andrzej Tubka");
        Person person4 = new Person("male", 5000, "Albert Bercicky");
        Person person5 = new Person("female", 10000, "Elżbieta Zapendowska");
        Person person6 = new Person("FEMALE", 10000, "Anastazja Grajewska");
        Person person7 = new Person("male", 4000, "Gwidon Grajewski");

        DataBase<Person> personsDataBase = new DataBase<>();
        personsDataBase.add(person1);
        personsDataBase.add(person2);
        personsDataBase.add(person3);
        personsDataBase.add(person4);
        personsDataBase.add(person5);
        personsDataBase.add(person6);
        personsDataBase.add(person7);

        personsDataBase.list.stream().map(Person::toString).forEach(System.out::println);

        visit(personsDataBase);


    }
}
