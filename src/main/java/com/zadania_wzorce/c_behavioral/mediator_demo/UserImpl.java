package com.zadania_wzorce.c_behavioral.mediator_demo;

public class UserImpl extends User {
    public UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Wysyłam wiadomość= " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Odbieram wiadomość= " + msg);
    }
}
