package com.company;

public class Wall implements Obstacles {
    public void jumping(Jumping jumping){
        jumping.showJump();
    }

    @Override
    public void interact(Champions champions) {
        champions.showJump();
    }
}
