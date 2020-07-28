package com.zadania_wzorce.c_behavioral.strategy_encrypt;

public class CesarEncrypt implements EncryptingStrategy {

    @Override
    public void send(String message, int offset) {
        offset %= 26;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            result.append((char) ((message.charAt(i) % 97 + offset) % 26 + 97));
        }
        System.out.println(result);
    }

}
