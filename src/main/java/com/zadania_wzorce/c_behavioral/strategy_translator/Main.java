package com.zadania_wzorce.c_behavioral.strategy_translator;

public class Main {
    public static void main(String[] args) {
        String text = "This is text in foreign language";
        TextContext polishTranslation = new TextContext(new TranslateToPolish());
        polishTranslation.executeTranslation(text);
        TextContext germanTranslation = new TextContext(new TranslateToGerman());
        germanTranslation.executeTranslation(text);

    }
}
