package com.company;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + "м");
        } else {
            System.out.println(name + " может пробежать только 200м");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }
}
