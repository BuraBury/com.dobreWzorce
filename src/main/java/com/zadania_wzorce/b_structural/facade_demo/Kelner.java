package com.zadania_wzorce.b_structural.facade_demo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Kelner {

    public void przyniesPiwo() {
        Scanner reader = new Scanner(System.in);
        System.out.println("\"male\" czy \"duze\"?");
        String rozmiar = reader.nextLine();
        reader.close();
        System.out.println("Proszę, " + rozmiar + " piwo");
    }

    public void podajMenuVege() {
        String pozycja1 = "Kapusta z grochem";
        String pozycja2 = "Tatar z buraka";
        String pozycja3 = "Tatar z fioletowej marchwii";
        ArrayList<String> vegeMenu = new ArrayList<>();
        vegeMenu.add(pozycja1);
        vegeMenu.add(pozycja2);
        vegeMenu.add(pozycja3);
        System.out.println("Menu vege to: " + vegeMenu.toString());
    }

    public void podajMiesneMenu() {
        System.out.println("Menu mięsne to: " + MeatMenu.getMenu());
    }

    public void proszeRachunek() {
        Random random = new Random();
        System.out.println("Należy się " + random.nextInt(200) + "." + random.nextInt(99) + " PLN");
    }

}
