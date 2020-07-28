package com.zadania_wzorce.c_behavioral.strategy_szyfr;

public class EncryptContext {
    private EncryptingStrategy encryptingStrategy;

    public EncryptContext(EncryptingStrategy encryptingStrategy) {
        this.encryptingStrategy = encryptingStrategy;
    }

    public void executeEncrypt(String text, int offset) {
        encryptingStrategy.send(text, offset);
    }


}
