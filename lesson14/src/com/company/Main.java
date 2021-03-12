package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] ints = outElementsFromArray(array, 4);


    }

    public static int[] outElementsFromArray(int[] array, int value) {
        List<Integer> list = new ArrayList<>();
        try {

            int x = 0;
            for (int i = array.length - 1; i > 0; i--) {
                if (array[i] == value) {
                    x = i;
                    break;
                }
            }

            for (int i = x + 1 ; i  < array.length ; i++) {
                list.add(array[i]);
            }
            System.out.println(list.toString());
        } catch (RuntimeException runtimeException){

        }



        return array;
    }


}

