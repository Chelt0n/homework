package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();
        int[] array = new int[]{2, 3, 1, 4, 5, 1, 7, 3};
        System.out.println("\n" + taskSix(array));
        System.out.println("\n" + Arrays.toString(array));
        taskSeven(array, 2);
        System.out.println();
    }

    private static void taskOne() {
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i]++;
            } else {
                array[i]--;
            }
        }
        System.out.println(Arrays.toString(array) + "\n ");
    }

    public static void taskTwo() {
        int[] array = new int[8];
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
        System.out.println(Arrays.toString(array) + "\n ");
    }

    public static void taskThree() {
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array) + "\n ");
    }

    public static void taskFour() {
        int size = 5;
        int array[][] = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i + j == size - 1) {
                    array[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static void taskFive() {
        int array[] = new int[]{1, 5, 3, 2, -11, 4, 5, 2, 4, 8, 9, 1};
        int maxNumber = array[0];
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            maxNumber = max(maxNumber, array[i]);
            minNumber = min(minNumber, array[i]);
        }
        System.out.println("\n" + maxNumber);
        System.out.println(minNumber);
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }


    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static boolean taskSix(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        return true;
    }

    public static void taskSeven(int[] array, int n) {
        int swapCount = n % array.length;
        if (swapCount == 0) {
            System.out.println("Элементы массива останутся на своих местах \n");
            return;
        }
        while (swapCount != 0) {
            if (swapCount > 0) {
                int currentNumber = array[0], nextNumber;
                for (int i = 0; i < array.length - 1; i++) {
                    nextNumber = array[i + 1];
                    array[i + 1] = currentNumber;
                    currentNumber = nextNumber;
                }
                array[0] = currentNumber;
                swapCount--;
            } else {
                int currentNumber = array[array.length - 1], nextNumber;
                for (int i = array.length - 1; i > 0; i--) {
                    nextNumber = array[i - 1];
                    array[i - 1] = currentNumber;
                    currentNumber = nextNumber;
                }
                array[array.length - 1] = currentNumber;
                swapCount++;

            }
        }
        System.out.println(Arrays.toString(array));
    }
}
