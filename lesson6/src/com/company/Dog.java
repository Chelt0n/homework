package com.company;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + "м");
        } else {
            System.out.println(name + " может пробежать только 500м");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + "м");
        } else {
            System.out.println(name + " может проплыть только 10м");
        }
    }

}