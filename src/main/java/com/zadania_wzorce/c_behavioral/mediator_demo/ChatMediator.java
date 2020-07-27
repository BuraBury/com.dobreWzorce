package com.zadania_wzorce.c_behavioral.mediator_demo;

public interface ChatMediator {

    void sendMessage(String msg, User user);
    void addUser(User user);
}
