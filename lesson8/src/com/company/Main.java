package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        Cat cat = new Cat("murz");
//        Human human = new Human("bob");
//        Robot robot = new Robot("ROBOT");
//        Treadmill treadmill = new Treadmill();
//        treadmill.running(cat);
//        treadmill.running(human);
//        treadmill.running(robot);
//        System.out.println();
//        Wall wall = new Wall();
//        wall.jumping(cat);
//        wall.jumping(human);
//        wall.jumping(robot);

        Obstacles[] obstacles = new Obstacles[4];
        Champions[] champions = new Champions[4];
        for (int i = 0; i < champions.length; i++) {
            champions[i] = createChampions(i);
            obstacles[i] = createObstacles();
        }
        for (int i = 0; i < obstacles.length; i++) {
            for (int j = 0; j < champions.length; j++) {
                obstacles[i].interact(champions[j]);
            }
        }
    }

    private static Obstacles createObstacles() {
       Random random = new Random();
       switch (random.nextInt(2)){
           case 0:
               return new Treadmill();
           default:
               return new Wall();
       }
    }

    public static Champions createChampions(int number) {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                return new Human("Human" + number);
            case 1:
                return new Cat("Cat" + number);
            default:
                return new Robot("Robot" + number);
        }
    }
}
