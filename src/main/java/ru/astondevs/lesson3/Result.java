package ru.astondevs.lesson3;

public class Result {
    public static void main(String[] args) {
        System.out.println(checkSum(5, 8));
        System.out.println("__________________");
        checkNumberIsPositiveOrNegative(-20);
        System.out.println("__________________");
        System.out.println(checkPositiveOrNegative(10));
        System.out.println("__________________");


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
        }else {
            return true;
        }
    }
}
