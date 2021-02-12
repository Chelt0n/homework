package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        gameFindNumber();
        //gameFindWorld();
    }

    private static void gameFindNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        do {
            boolean isWin = false;
            int tryCount = 3;
            int randomNumber = random.nextInt(10);
            System.out.println("=====================Начало игры==================");
            System.out.print("Введите число от 0 до 9 =>");
            while (tryCount > 0) {
                int userNumber = scanner.nextInt();
                if (userNumber > randomNumber) {
                    tryCount--;
                    if (tryCount > 0) {
                        System.out.println("Число должно быть меньше");
                    }
                } else if (userNumber < randomNumber) {
                    tryCount--;
                    if (tryCount > 0) {
                        System.out.println("Число должно быть больше");
                    }
                } else {
                    isWin = true;
                    break;
                }
            }
            if (isWin) {
                System.out.println("Вы победили, хотите сыгать еще? (1 - да; 0 - нет)");
            } else {
                System.out.println("Вы проиграли, хотите сыгать еще? (1 - да; 0 - нет)");
            }
        } while (scanner.nextInt() == 1);
        scanner.close();
        System.out.println("End");
    }


    private static void gameFindWorld() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        do {
            String[] words = {"apple", "apricot", "avocado", "banana", "broccoli",
                    "carrot", "cherry", "garlic", "grape", "kiwi",
                    "leak", "lemon", "mango", "melon", "mushroom",
                    "nut", "olive", "orange", "pea", "peanut",
                    "pear", "pepper", "pineapple", "potato", "pumpkin"};
            boolean isWin = false;
            int randomWord = random.nextInt(words.length);
            int tryCount = words[randomWord].length();
            StringBuilder template = new StringBuilder("###############");
            System.out.print("Загаданное слово фрукт или овощ! Введите слово: ");
            while (tryCount > 0) {
                String userInput = scanner.nextLine();
                if (!userInput.equals(words[randomWord])) {
                    int index = words[randomWord].length() - tryCount;
                    char letter = words[randomWord].charAt(index);
                    template.setCharAt(index, letter);
                    tryCount--;
                    if (tryCount > 0) {
                        System.out.println("Ответ не верный! Подсказка: " + template.toString());
                    }

                } else {
                    isWin = true;
                    break;
                }
            }
            if (isWin) {
                System.out.println("Вы победили, хотите сыгать еще? (1 - да; 0 - нет)");
            } else {
                System.out.println("Вы проиграли! Загаданное слово " + words[randomWord] + ", хотите сыгать еще? (1 - да; 0 - нет)");
            }
        } while (scanner.nextInt() == 1);
        System.out.println("End");
        scanner.close();
    }
}