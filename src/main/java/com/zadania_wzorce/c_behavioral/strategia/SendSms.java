package com.zadania_wzorce.c_behavioral.strategia;

public class SendSms implements SendingStrategy {
    @Override
    public void send(String message) {
        System.out.println("Wysyłam sms o treści: " + message);
    }
}
