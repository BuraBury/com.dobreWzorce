package com.zadania_wzorce.c_behavioral.strategy_szyfr;

public interface EncryptingStrategy {
    void send(String message, int offset);
}
