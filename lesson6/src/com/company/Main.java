package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Бобик");
        dog.run(501);
        dog.swim(11);
        Animal cat = new Cat("Барсик");
        cat.run(201);
        cat.swim(54);
    }
}
