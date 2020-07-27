package com.zadania_wzorce.c_behavioral.memento;

public class StanWlaczony implements Stan {

    @Override
    public String toString() {
        return "włączony";
    }

    @Override
    public void wlaczWylacz(Czajnik czajnik) {
        czajnik.ustawStan(new StanWylaczony());
    }
}
