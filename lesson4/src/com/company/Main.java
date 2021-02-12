package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static char[][] map;
    public static final int SIZE = 4;

    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';


    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (isEndgame(DOT_X, "Игрок победил")) {
                break;
            }


            aiTurn();
            printMap();
            if (isEndgame(DOT_O, "Компьютер победил")) {
                break;
            }
        }

        System.out.println("Игра окончена ");
    }

    private static boolean isEndgame(char dotValue, String message) {
        if (checkWin(dotValue)) {
            System.out.println(message);
            return true;
        } else if (isMapFull()) {
            System.out.println("Ничья");
            return true;
        }
        return false;

    }

    private static boolean checkWin(char symb) {
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                if (checkDiagonal(symb, col, row) || checkLanes(symb, col, row)) return true;
            }
        }
        return false;
    }


    private static boolean checkDiagonal(char symb, int col, int row) {
        boolean toRight, toLeft;
        toRight = true;
        toLeft = true;
        for (int i = 0; i < map.length; i++) {
            toRight &= (map[i][i] == symb);
            toLeft &= (map[map.length - i - 1][i] == symb);
        }

        return toRight || toLeft;
    }

    private static boolean checkLanes(char symb, int offsetX, int offsetY) {
        boolean cols, rows;
        for (int col = 0; col < map.length; col++) {
            cols = true;
            rows = true;
            for (int row = 0; row < map.length; row++) {
                cols &= (map[col][row] == symb);
                rows &= (map[row][col] == symb);
            }
            if (cols || rows) return true;
        }

        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            if (i == 0) {
                System.out.print("\t");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " \t");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void humanTurn() {
        int y, x;
        do {
            System.out.println("Введите координаты в формате X Y");
            y = scanner.nextInt() - 1;
            x = scanner.nextInt() - 1;

        } while (!isValidCell(y, x));

        map[y][x] = DOT_X;
    }

    private static void aiTurn() {
        int x, y;
        do {
            y = random.nextInt(map.length);
            x = random.nextInt(map.length);

        } while (!isValidCell(y, x));

        System.out.println("Компьютер занял ячейку " + x + " " + y);
        map[y][x] = DOT_O;
    }

    private static boolean isValidCell(int y, int x) {
        if (x < 0 || x >= map.length || y < 0 || y >= map.length) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }
}
