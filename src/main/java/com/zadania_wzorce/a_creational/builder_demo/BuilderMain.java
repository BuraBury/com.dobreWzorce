package com.zadania_wzorce.a_creational.builder_demo;

public class BuilderMain {
    public static void main(String[] args) {
        Human adas = new Human.HumanBuilder("Male", "Adam", "28")
                .isSinner(false)
                .isWorshipper(true)
                .build();

        System.out.println("Gender: " + adas.getSex());
        System.out.println(adas.getName());
        System.out.println(adas.getAge() + " years old");
        System.out.println("is a sinner - " + adas.isSinner());
        System.out.println("is a worshipper - " + adas.isWorshipper());



    }
}

