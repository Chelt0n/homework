package com.company;

public class Main {

    final static int ARR_SIZE = 4;

    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "err", "1"},
                {"1", "1", "1", "1"}
        };
        try {
            try {
                int result = valueStringToInt(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Неверный размер");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }


    public static int valueStringToInt(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != ARR_SIZE) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != ARR_SIZE) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}