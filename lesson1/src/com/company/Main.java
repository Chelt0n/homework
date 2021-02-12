package com.company;

public class Main {

    public static void main(String[] args) {


        taskFive(6);
        taskSeven("Сергей");
        taskEight(2025);

        //        Задание 2
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807l;
        double d =1245.4871;
        float f = 21.482F;
        char c = '&';
        boolean bo = true;
    }


    private static float taskThree(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }



    private static boolean taskFour(int a, int b){
        int sum = a + b;
        if(sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }

    }


    public static void taskFive(int a){
        if (a >= 0){
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }


    private static boolean taskSix(int a){
        if(a < 0){
            return true;
        } else {
            return false;
        }
    }


    private static void taskSeven(String name){
        System.out.println("Привет, " + name + "!");
    }



    private static void taskEight(int year){
        String leap = " високосный год";
        String lowRise = " невисокосный год";
        if(year % 4 == 0){
            if(year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println(year + leap);
                } else{
                    System.out.println(year + lowRise);
                }
            }else{
                System.out.println(year + leap);
            }
        } else{
            System.out.println(year + lowRise);
        }
    }
    // Последнее задание из методички тяжело было понять
    // пришлось воспользоваться гуглом где написана последовательность действий по пунктам.
    // Осталось отобразить это в коде, собственно что я и сделал.




}