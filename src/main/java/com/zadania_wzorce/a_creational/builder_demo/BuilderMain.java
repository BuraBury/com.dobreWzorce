package com.zadania_wzorce.a_creational.builder_demo;

public class BuilderMain {
    public static void main(String[] args) {

        Human adas = new Human.HumanBuilder("Male", "Adam", "28")
                .isSinner(false)
                .isWorshipper(true)
                .build();
        Human ewa = new Human.HumanBuilder("Female", "Ewa", "25")
                .isSinner(false)
                .isWorshipper(true)
                .build();

        Animal dog = new Animal.AnimalBuilder("pies", "Bercik", "7")
                .isDanger(true)
                .canTakeHome(true)
                .build();

        Animal cat = new Animal.AnimalBuilder("kot", "Niunia", "2")
                .isDanger(false)
                .canTakeHome(true)
                .build();

        Animal snake = new Animal.AnimalBuilder("wąż", "Python", "3")
                .canGullYou(true)
                .isDanger(true)
                .canTakeHome(false)
                .build();

        Animal mouse = new Animal.AnimalBuilder("mysz", "Micky", "1.4")
                .isDanger(false)
                .canTakeHome(true)
                .whatIsFavouriteFood("serek")
                .build();

        Animal spider = new Animal.AnimalBuilder("pająk", "SpiderMan", "0.3")
                .howManyPaws(8)
                .whatIsFavouriteFood("myszki")
                .isDanger(true)
                .canTakeHome(false)
                .build();

        Animal dragon = new Animal.AnimalBuilder("dragon", "Jacek", "130")
                .canBreatheFire(true)
                .canGullYou(true)
                .canTakeHome(false)
                .isDanger(true)
                .howManyPaws(4)
                .whatIsFavouriteFood("dziewice")
                .build();

        Animal unicorn = new Animal.AnimalBuilder("unicorn", "Marzena", "300")
                .canBreatheFire(false)
                .hasSparklingHorn(true)
                .whatIsFavouriteFood("sparkling stars")
                .isDanger(false)
                .canGullYou(false)
                .canTakeHome(false)
                .build();


        System.out.println("Gender: " + adas.getSex());
        System.out.println(adas.getName());
        System.out.println(adas.getAge() + " years old");
        System.out.println("is a sinner - " + adas.isSinner());
        System.out.println("is a worshipper - " + adas.isWorshipper());
        System.out.println("Gender: " + ewa.getSex());
        System.out.println(ewa.getName());
        System.out.println(ewa.getAge() + " years old");
        System.out.println("is a sinner - " + ewa.isSinner());
        System.out.println("is a worshipper - " + ewa.isWorshipper());
        System.out.println();

        System.out.println("Zwierzę typu: " + dog.getType() + "/ imie: " + dog.getName() + "/ wiek: " + dog.getAge() + " lat");
        System.out.println("Może ugryźć? " + dog.isDanger());
        System.out.println("Może być zabrany do domu? " + dog.canTakeHome());
        System.out.println();
        System.out.println("Zwierzę typu: " + cat.getType() + "/ imie: " + cat.getName() + "/ wiek: " + cat.getAge() + " lat");
        System.out.println("Może ugryźć? " + cat.isDanger());
        System.out.println("Może być zabrany do domu? " + cat.canTakeHome());
        System.out.println();
        System.out.println("Zwierzę typu: " + snake.getType() + "/ imie: " + snake.getName() + "/ wiek: " + snake.getAge() + " lat");
        System.out.println("Potrafi kusić? " + snake.canGullYou());
        System.out.println("Może ugryźć? " + snake.isDanger());
        System.out.println("Może być zabrany do domu? " + snake.canTakeHome());
        System.out.println();
        System.out.println("Zwierzę typu: " + mouse.getType() + "/ imie: " + mouse.getName() + "/ wiek: " + mouse.getAge() + " lat");
        System.out.println("Może ugryźć? " + mouse.isDanger());
        System.out.println("Może być zabrany do domu? " + mouse.canTakeHome());
        System.out.println("Ulubiony typ pokarmu: " + mouse.getFavouriteFood());
        System.out.println();
        System.out.println("Zwierzę typu: " + spider.getType() + "/ imie: " + spider.getName() + "/ wiek: " + spider.getAge() + " lat");
        System.out.println("Ilość odnóży: " + spider.getPaws());
        System.out.println("Może ugryźć? " + spider.isDanger());
        System.out.println("Może być zabrany do domu? " + spider.canTakeHome());
        System.out.println("Ulubiony typ pokarmu: " + spider.getFavouriteFood());
        System.out.println();
        System.out.println("Zwierzę typu: " + dragon.getType() + "/ imie: " + dragon.getName() + "/ wiek: " + dragon.getAge() + " lat");
        System.out.println("Zieje ogniem? " + dragon.canBreatheFire());
        System.out.println("Potrafi kusić? " + dragon.canGullYou());
        System.out.println("Może być zabrany do domu? " + dragon.canTakeHome());
        System.out.println("Może ugryźć? " + dragon.isDanger());
        System.out.println("Ulubiony typ pokarmu: " + dragon.getFavouriteFood());
        System.out.println();
        System.out.println("Zwierzę typu: " + unicorn.getType() + "/ imie: " + unicorn.getName() + "/ wiek: " + unicorn.getAge() + " lat");
        System.out.println("Zieje ogniem? " + unicorn.canBreatheFire());
        System.out.println("Posiada błyszczący róg? " + unicorn.hasSparklingHorn());
        System.out.println("Ulubiony typ pokarmu: " + unicorn.getFavouriteFood());
        System.out.println("Może ugryźć? " + unicorn.isDanger());
        System.out.println("Potrafi kusić? " + unicorn.canGullYou());
        System.out.println("Może być zabrany do domu? " + unicorn.canTakeHome());
        System.out.println();


    }
}

