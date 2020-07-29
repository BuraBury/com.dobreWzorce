package com.zadania_wzorce.c_behavioral.visitor_data_base;

public interface Visitor {
    static void visit(DataBase<Person> dataBase) {
        int amountFemales = 0;
        int amountMales = 0;
        int sumOfIncomeFemales = 0;
        int sumOfIncomeMales = 0;

        for (int i = 0; i < dataBase.list.size(); i++) {
            Person person = dataBase.list.get(i);
            String gender = person.getGender();
            if (gender.equalsIgnoreCase("female")) {
                amountFemales++;
                sumOfIncomeFemales += dataBase.list.get(i).getIncome();

            } else {
                amountMales++;
                sumOfIncomeMales += dataBase.list.get(i).getIncome();
            }
        }

        double averageFemaleIncome = (double) sumOfIncomeFemales / amountFemales;
        double averageMaleIncome = (double) sumOfIncomeMales / amountMales;

        int amountOfPersonsInDataBase = amountFemales + amountMales;
        double percentageOfFemalesInDataBase = ((double) amountFemales / amountOfPersonsInDataBase) * 100;
        double percentageOfMansInDataBase = ((double) amountMales / amountOfPersonsInDataBase) * 100;


        System.out.println("Percentage of Females in DataBase = " + percentageOfFemalesInDataBase + "%");
        System.out.println("Percentage of Males in DataBase = " + percentageOfMansInDataBase + "%");
        System.out.println();
        System.out.println("Persons in DataBase = " + amountOfPersonsInDataBase);
        System.out.println("Females in DataBase = " + amountFemales);
        System.out.println("Males in DataBase = " + amountMales);
        System.out.println();
        System.out.println("Average Females income = " + averageFemaleIncome + "PLN");
        System.out.println("Average Males income = " + averageMaleIncome + "PLN");


    }
}
