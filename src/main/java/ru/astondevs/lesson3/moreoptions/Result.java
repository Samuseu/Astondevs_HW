package ru.astondevs.lesson3.moreoptions;

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
        return check >= 10 && check <= 20;
    }

    public static void checkNumberIsPositiveOrNegative(int number) {
        String result = (number >= 0) ? "Число " + number + " положительное" : "Число " + number + " отрицательное";
        System.out.println(result);
    }

    public static boolean checkPositiveOrNegative(int number) {
        return number < 0;
    }
}

