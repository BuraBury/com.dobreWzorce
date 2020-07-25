package com.zadania_wzorce.a_creational.builder_demo;

public class Human {
    //parametry wymagane
    private final String sex;
    private final String name;
    private String age;

    //parametry opcjonalne
    private boolean didCommitSin;
    private boolean worshipsGod;

    //metody do pozyskania danych
    String getSex() {
        return sex;
    }

    String getName() {
        return name;
    }

    String getAge() {
        return age;
    }

    boolean isSinner() {
        return didCommitSin;
    }

    boolean isWorshipper() {
        return worshipsGod;
    }

    //konstruktor prywatny
    private Human(HumanBuilder builder) {
        this.sex = builder.sex;
        this.name = builder.name;
        this.age = builder.age;
        this.didCommitSin = builder.didCommitSin;
        this.worshipsGod = builder.worshipsGod;
    }

    //klasa buildera służąca do tworzenia obiektu
    static class HumanBuilder {

        //pola
        private final String sex;
        private final String name;
        private String age;
        private boolean didCommitSin;
        private boolean worshipsGod;

        //konstruktor
        HumanBuilder(String sex, String name, String age) {
            this.sex = sex;
            this.name = name;
            this.age = age;
        }

        //metody ustawiające opcjonalne wartości,
        // jeśli ich użyjemy pola przyjmą wartości domyślne
        public HumanBuilder isWorshipper(boolean worshipsGod) {
            this.worshipsGod = worshipsGod;
            return this;
        }

        public HumanBuilder isSinner(boolean didCommitSin) {
            this.didCommitSin = didCommitSin;
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }


}

