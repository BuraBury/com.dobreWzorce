package com.zadania_wzorce.c_behavioral.template_demo;

public class TemplateMain {
    public static void main(String[] args) {
        Pizza firstPizza = new Pepperoni();
        Pizza secondPizza = new Hawajska();
        Pizza thirdPizza = new Niemiecka();
        System.out.println(firstPizza.getBakeTime());
        System.out.println(secondPizza.getBakeTime());
        System.out.println(thirdPizza.getBakeTime());
        System.out.println();
        firstPizza.prepare();
        System.out.println();
        secondPizza.prepare();
        System.out.println();
        thirdPizza.prepare();
        System.out.println();
    }
}
