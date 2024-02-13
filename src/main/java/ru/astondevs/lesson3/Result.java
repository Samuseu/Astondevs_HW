package ru.astondevs.lesson3;

import java.util.Arrays;

public class Result {
    public static void main(String[] args) {
        System.out.println(checkSum(5, 8));
        System.out.println("__________________");

        checkNumberIsPositiveOrNegative(-20);
        System.out.println("__________________");

        System.out.println(checkPositiveOrNegative(10));
        System.out.println("__________________");

        printRepeatString("Aston", 5);
        System.out.println("__________________");

        System.out.println(checkLeapYear(2024));
        System.out.println("__________________");

        swapZeroToOne();
        System.out.println("__________________");

        fillTo100();
        System.out.println("__________________");

        numbersLessThan6MultipliedBy2();
        System.out.println("__________________");

        diagonally();
        System.out.println("__________________");

        int[] result = arrays(3, 67);
        System.out.println(Arrays.toString(result));
    }

    public static boolean checkSum(int a, int b) {
        int check = a + b;
        if (check >= 10 && check <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkNumberIsPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " положительное");
        } else {
            System.out.println("Число " + number + " отрицательное");
        }
    }


    public static boolean checkPositiveOrNegative(int number) {
        if (number > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printRepeatString(String word, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(word);
        }
    }

    public static boolean checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else
            return false;
    }

    public static void swapZeroToOne() {
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 1;
            } else if (numbers[i] == 1) {
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void fillTo100() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void numbersLessThan6MultipliedBy2() {
        int[] arrays = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < 6) {
                arrays[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrays));
    }

    public static void diagonally() {
        int[][] square = new int[5][5];

        for (int i = 0; i < 5; i++) {
            square[i][i] = 1;
        }
        for (int i = 0; i < 5; i++) {
            square[i][5 - 1 - i] = 1;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] arrays(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}

