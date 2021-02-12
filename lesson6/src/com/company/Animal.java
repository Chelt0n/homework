package com.company;

public class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;

    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + "м");
    }
    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + "м");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}