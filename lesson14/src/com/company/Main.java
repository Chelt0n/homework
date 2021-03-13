package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] ints = outElementsFromArray(array, 4);
        System.out.println(Arrays.toString(ints));

        int[] arr = {1, 4, 4, 4, 4, 4, 4, 4};
        boolean b = findOneORFour(arr);
        System.out.println(b);


    }

    public static int[] outElementsFromArray(int[] array, int value) {
        List<Integer> list = new ArrayList<>();
        int x = -1;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == value) {
                x = i;
                break;
            }
        }
        if (x == -1) {
            throw new RuntimeException("Эллемент в масиве не найден");
        }

        for (int i = x + 1; i < array.length; i++) {
            list.add(array[i]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static boolean findOneORFour(int[] arr) {
        boolean one = false;
        boolean four = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                one = true;
            } else if (arr[i] == 4) {
                four = true;
            }
        }
        if (one && four == true) return true;
        return false;
    }
}
