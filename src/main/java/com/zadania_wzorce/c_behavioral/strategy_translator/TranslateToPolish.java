package com.zadania_wzorce.c_behavioral.strategy_translator;

public class TranslateToPolish implements TranslatingStrategy {
    @Override
    public void send(String txt) {
        System.out.println("Translating your text to polish...");

    }
}
