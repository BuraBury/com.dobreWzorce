package com.zadania_wzorce.c_behavioral.strategia;

public class MessageContext {
    private SendingStrategy sendingStrategy;

    public MessageContext(SendingStrategy sendingStrategy) {
        this.sendingStrategy = sendingStrategy;
    }

    public void executeSend(String message) {
        sendingStrategy.send(message);
    }
}
