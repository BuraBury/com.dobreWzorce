package com.zadania_wzorce.c_behavioral.memento;

public class Czajnik {
    private Stan stan;

    public void ustawStan(Stan stan) {
        this.stan = stan;
    }

    public Czajnik(Stan stan) {
        ustawStan(stan);
    }

    public void zmienStan() {
        this.stan.wlaczWylacz(this);
    }

    public Pamiatka zapiszDoPamiatki() {
        System.out.println("Stan: " + this.stan.toString() + " zapisany do pamiątki");
        return new Pamiatka(this.stan);
    }

    public void odtworzPamiatke(Pamiatka pamiatka) {
        this.stan = pamiatka.dajStan();
    }

    public String dajStan() {
        return stan.toString();
    }
}
