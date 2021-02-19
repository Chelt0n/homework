package com.company;

public abstract class Champions implements Runable, Jumping {
    protected String name;

    public Champions(String name) {
        this.name = name;
    }
}
