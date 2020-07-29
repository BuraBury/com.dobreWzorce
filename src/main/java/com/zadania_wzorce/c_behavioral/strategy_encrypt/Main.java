package com.zadania_wzorce.c_behavioral.strategy_encrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put message to encrypt");
        String text = sc.nextLine();
        System.out.println("How many chars do you need to move?");
        int offset = sc.nextInt();

        EncryptContext cesarEncrypt = new EncryptContext(new CesarEncrypt());
        cesarEncrypt.executeEncrypt(text, offset);



    }
}
