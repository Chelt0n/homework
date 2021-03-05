package com.company;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) throws InterruptedException {


        firstMethod();
        secondMethod();

    }

    private static void secondMethod() throws InterruptedException {
        long a = System.currentTimeMillis();
        ThreadExapmleClass t1 = new ThreadExapmleClass(HALF, 0);
        ThreadExapmleClass t2 = new ThreadExapmleClass(HALF, HALF);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        float[] arr = new float[SIZE];
        System.arraycopy(t1.arr, 0, arr, 0, HALF);
        System.arraycopy(t2.arr, 0, arr, HALF, HALF);
        System.out.println(System.currentTimeMillis() - a);


    }

    private static void firstMethod() {
        float[] arr = new float[SIZE];


        long a = System.currentTimeMillis();
        Arrays.fill(arr, 1);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }
}
