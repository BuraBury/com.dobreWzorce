package com.zadania_wzorce.b_structural.facade_demo;

public class FacadeMain {

    public static void main(String[] args) {
        //uzywamy fasady zeby ukryc skomplikowane systemy

        Kelner kelner = new Kelner();
        kelner.przyniesPiwo();
        kelner.podajMenuVege();
        kelner.podajMiesneMenu();
        kelner.proszeRachunek();


    }
}
