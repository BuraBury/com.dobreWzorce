package com.zadania_wzorce.c_behavioral.strategia;

public class StrategyMain {
    public static void main(String[] args) {

        String message = "To jest moja wiadomość";
        MessageContext mailContext = new MessageContext(new SendMail());
        mailContext.executeSend(message);
        MessageContext smsContext = new MessageContext(new SendSms());
        smsContext.executeSend(message);
    }
}
