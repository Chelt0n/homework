package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                result += 10;
            } else {
                result += i;
            }
        }
        System.out.println(result);

//        byte b = 123;
//        short s = 123;
//        int i = 1;
//        long l = 2222222222222222222L;
//        float f = 2.3f;
//        double d = 2.3;
//
//        char s = '!'; //либо число из таблицы utf8
//        boolean b = false; // true

//        String str = "SUSSES";
//
//        int firstNum = 25;
//        int secondNum = 5;
//        System.out.println(firstNum + secondNum);
//        System.out.println(firstNum - secondNum);
//        System.out.println(firstNum / secondNum);
//        System.out.println(firstNum * secondNum);
//        System.out.println(firstNum % secondNum);
//        System.out.println();


//        firstNum = firstNum + 5;
//        firstNum += 5;

//        int num =10;
//
//        if (num % 2 == 0){
//            System.out.println("четное");
//        } else {
//            System.out.println("нечетное");
//        }
//      int i = 1;
//      int b = 1;
//      System.out.println(i);
//      supp(i, b);
//    }
//    static void supp(int i, int b){
//        if(i == b){
//            System.out.println("xs");
//        }
    }

}
