package com.company;

public class Robot extends Champions {

    public Robot(String name) {
        super(name);
    }

    public void showRun(){
        System.out.println(name + " не умеет бегать");
    }
    public void showJump(){
        System.out.println(name + " не умеет прыгать");

    }

}
