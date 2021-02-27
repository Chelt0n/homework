package com.company;

public class Cat {
    private String name;
    private int appetite;
    private int satiety = 0;
    private final int CAT_IS_FULL = 15;
    private boolean isSatiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (CAT_IS_FULL > satiety) {
            if (appetite > p.getFood()) {
                System.out.println("нужно больше еды");
            } else {
                satiety += appetite;
                p.decreaseFood(appetite);
                isSatiety = false;
            }
        } else {
            System.out.println("достаточно еды для кота");
            isSatiety = true;
        }
    }
}
