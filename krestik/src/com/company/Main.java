package com.company;

import java.util.Scanner;

public class Main {
    public static char[][] map;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static final int FIELD = 3;

    public static void main(String[] args) {
        initMap();
        checkMap();

        humanTurn();
    }

    private static void humanTurn() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt()
        for (int i = 0; i < map.length; i++) {

        }
    }



    private static void checkMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void initMap() {
        map = new char[FIELD][FIELD];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

}
