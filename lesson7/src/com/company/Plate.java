package com.company;

public class Plate {

    private int food;

    Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    void info() {
        if (food <= 0) {
            System.out.println("тарелка пуста");
        } else {
            System.out.println("plate: " + food);
        }
    }

    void decreaseFood(int count) {
        if (food < count) {
            System.out.println("еды больше нету");
        } else {
            food -= count;
            info();
        }
    }

    void addFood(int food) {
        System.out.println("еда добавленна");
        this.food += food;

    }
}