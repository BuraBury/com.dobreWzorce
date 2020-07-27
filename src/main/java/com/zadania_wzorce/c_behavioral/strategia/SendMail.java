package com.zadania_wzorce.c_behavioral.strategia;

public class SendMail implements SendingStrategy {
    @Override
    public void send(String message) {
        System.out.println("Wysyłam mail o treści: " + message);
    }
}
