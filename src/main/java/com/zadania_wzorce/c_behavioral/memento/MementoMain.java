package com.zadania_wzorce.c_behavioral.memento;

public class MementoMain {
    public static void main(String[] args) {

        Czajnik czajnik = new Czajnik (new StanWylaczony());
        Pamiatka pamiatka = czajnik.zapiszDoPamiatki();
        System.out.println("Czajnik jest: " + czajnik.dajStan());
        czajnik.zmienStan();
        System.out.println("Czajnik jest " + czajnik.dajStan());
        czajnik.odtworzPamiatke(pamiatka);
        System.out.println("Czajnik jest: " + czajnik.dajStan());

    }
}
