package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Integer[] arr = {4, 2};
//        swap(arr, 0, 1);
//        changeToArrayList(arr);

        Apple apple = new Apple();
        Apple apple1 = new Apple();
        Orange orange = new Orange();
        Orange orange1 = new Orange();

        Box<Apple> appleBox = new Box<>(apple, apple1);
        Box<Orange> orangeBox = new Box<>(orange, orange1);
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));


        Box<Apple> newBox = new Box<>();
        appleBox.transfer(newBox);
        System.out.println(newBox.getWeight());
        System.out.println(appleBox.getWeight());


    }


    public static <T> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        System.out.println(Arrays.toString(array));



    }
    public static <T> ArrayList <T> changeToArrayList(T[] array){
        return new ArrayList<T>(Arrays.asList(array));

    }
}
