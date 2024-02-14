package ru.astondevs.lesson3.moreoptions;

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

    private static boolean checkSum(int a, int b) {
        int check = a + b;
        return check >= 10 && check <= 20;
    }

    private static void checkNumberIsPositiveOrNegative(int number) {
        String result = (number >= 0) ? "Число " + number + " положительное" : "Число " + number + " отрицательное";
        System.out.println(result);
    }

    private static boolean checkPositiveOrNegative(int number) {
        return number < 0;
    }

    private static void printRepeatString(String word, int number) {
        int i = 0;
        while (i < number) {
            System.out.println(word);
            i++;
        }
    }

    private static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    private static void swapZeroToOne() {
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] == 0) ? 1 : 0;
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void fillTo100() {
        int[] arr = new int[100];
        int value = 1;
        int i = 0;
        for (int arrs : arr) {
            arr[i++] = value++;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void numbersLessThan6MultipliedBy2() {
        int[] arrays = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int i = 0;
        while (i < arrays.length) {
            if (arrays[i] < 6) {
                arrays[i] *= 2;
            }
            i++;
        }
        System.out.println(Arrays.toString(arrays));
    }

    private static void diagonally() {
        int[][] square = new int[5][5];

        for (int i = 0; i < square.length; i++) {
            square[i][i] = 1;
        }
        for (int i = 0; i < square.length ; i++) {
            square[i][square.length-1-i]=1;
        }
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static int[] arrays(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}


