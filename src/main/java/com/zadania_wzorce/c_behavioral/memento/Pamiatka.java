package com.zadania_wzorce.c_behavioral.memento;

public class Pamiatka {
    private Stan stan;

    public Pamiatka(Stan stan) {
        this.stan = stan;
    }

    public Stan dajStan() {
        return this.stan;
    }
}
