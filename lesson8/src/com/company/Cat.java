package com.company;

public class Cat extends Champions {

    public Cat(String name) {
        super(name);
    }

    public void showRun(){
        System.out.println(name + " успешно пробежал");
    }
    public void showJump(){
        System.out.println(name + " успешно прыгнул");

    }
}
