package com.company;

public class Treadmill implements Obstacles {
    public void running(Runable runable){
        runable.showRun();
    }

    @Override
    public void interact(Champions champions) {
        champions.showRun();
    }
}
