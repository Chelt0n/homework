package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOT_WIN = 4;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();


    public static void main(String[] args) {

        initMap();
        checkMap();

        while(true){
            if (isWin(DOT_X)){
                humanTurn();
                checkMap();
                break;
            }

            if (isWin(DOT_0)){
                aiTurn();
                checkMap();
                break;
            }
       }


    }

    private static boolean isWin(char symb) {
        boolean toRight = true;
        for (int i = 0; i < DOT_WIN; i++) {
            toRight = toRight & (map[i][i] == symb);
        }
        if(toRight) return true;
        return false;

    }

    private static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(map.length);
            y = random.nextInt(map.length);

        } while (!validCell(x, y));
        map[x][y] = DOT_0;
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты вашего хода X, Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

        } while (!validCell(x, y));
        map[x][y] = DOT_X;
    }

    private static boolean validCell(int x, int y){
        if(x < 0 || x > map.length || y < 0 || y > map.length ){
            return false;
        } else return map[x][y] == DOT_EMPTY;
    }

    private static void checkMap() {
        for (int i = 0; i <= map.length; i++) {
            if (i == 0) {
                System.out.print("\t");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1);
            System.out.print("\t");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
}
