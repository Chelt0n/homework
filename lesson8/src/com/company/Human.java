package com.company;

public class Human extends Champions {

    public Human(String name) {
        super(name);
    }
    public void showRun(){
        System.out.println(name + " успешно пробежал");
    }
    public void showJump(){
        System.out.println(name + " успешно пропрыгал");

    }

}
