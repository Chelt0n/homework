package com.company;

import java.util.Arrays;

public class ThreadExapmleClass extends Thread {
    float[] arr;
    int offset;

    public ThreadExapmleClass(int size, int offset) {
        this.arr = new float[size];
        this.offset = offset;
    }

    @Override
    public void run() {

        Arrays.fill(arr, 1);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (i + offset) / 5) * Math.cos(0.2f + (i + offset) / 5) * Math.cos(0.4f + (i + offset) / 2));

        }
    }
}
