package com.zadania_wzorce.a_creational.builder_demo;

public class Animal {
    //parametry wymagane
    private final String type;
    private final String name;
    private String age;

    //parametry opcjonalne
    private boolean canBite;
    private boolean isNice;
    private boolean isCunning;
    private String favouriteFood;
    private int paws;
    private boolean breatheFire;
    private boolean sparklingHorn;

    //metody do pozyskania danych
    String getType() {
        return type;
    }

    String getName() {
        return name;
    }

    String getAge() {
        return age;
    }

    boolean isDanger() {
        return canBite;
    }

    boolean canTakeHome() {
        return isNice;
    }

    boolean canGullYou() {
        return isCunning;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public int getPaws() {
        return paws;
    }

    public boolean canBreatheFire() {
        return breatheFire;
    }

    public boolean hasSparklingHorn() {
        return sparklingHorn;
    }

    //konstruktor prywatny
    private Animal(AnimalBuilder builder) {
        this.type = builder.type;
        this.name = builder.name;
        this.age = builder.age;
        this.canBite = builder.canBite;
        this.isNice = builder.isNice;
        this.isCunning = builder.isCunning;
        this.favouriteFood = builder.favouriteFood;
        this.paws = builder.paws;
        this.breatheFire = builder.breatheFire;
        this.sparklingHorn = builder.sparklingHorn;
    }

    //klasa buildera służąca do tworzenia obiektu
    static class AnimalBuilder {

        //pola
        private final String type;
        private final String name;
        private String age;
        private boolean canBite;
        private boolean isNice;
        private boolean isCunning;
        private String favouriteFood;
        private int paws;
        private boolean breatheFire;
        private boolean sparklingHorn;

        //konstruktor
        AnimalBuilder(String type, String name, String age) {
            this.type = type;
            this.name = name;
            this.age = age;
        }

        //metody ustawiające opcjonalne wartości,
        // jeśli ich użyjemy pola przyjmą wartości domyślne
        public AnimalBuilder isDanger(boolean canBite) {
            this.canBite = canBite;
            return this;
        }

        public AnimalBuilder canTakeHome(boolean isNice) {
            this.isNice = isNice;
            return this;
        }

        public AnimalBuilder canGullYou(boolean isCunning) {
            this.isCunning = isCunning;
            return this;
        }

        public AnimalBuilder whatIsFavouriteFood(String favouriteFood) {
            this.favouriteFood = favouriteFood;
            return this;
        }

        public AnimalBuilder howManyPaws(int paws) {
            this.paws = paws;
            return this;
        }

        public AnimalBuilder canBreatheFire(boolean breatheFire) {
            this.breatheFire = breatheFire;
            return this;
        }

        public AnimalBuilder hasSparklingHorn(boolean sparklingHorn) {
            this.sparklingHorn = sparklingHorn;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }


}