package com.company;


public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 20);
        Plate plate = new Plate(100);


        Cat cats[] = new Cat[5];
        cats[0] = new Cat("Кот1", 15);
        cats[1] = new Cat("Кот2", 15);
        cats[2] = new Cat("Кот3", 15);
        cats[3] = new Cat("Кот4", 20);
        cats[4] = new Cat("Кот5", 20);
        for (Cat cat1 : cats) {
            cat1.eat(plate);
        }
        System.out.println();
        plate.addFood(100);
        plate.info();
    }
}
