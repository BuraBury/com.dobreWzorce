package com.zadania_wzorce.c_behavioral.memento;

public class StanWylaczony implements Stan {

    @Override
    public String toString() {
        return "wyłączony";
    }

    @Override
    public void wlaczWylacz(Czajnik czajnik) {
        czajnik.ustawStan(new StanWlaczony());
    }
}
