package com.zadania_wzorce.c_behavioral.strategy_translator;

public class TextContext {
    private TranslatingStrategy translatingStrategy;

    public TextContext(TranslatingStrategy translatingStrategy) {
        this.translatingStrategy = translatingStrategy;
    }

    public void executeTranslation(String txt) {
        translatingStrategy.send(txt);
    }
}
