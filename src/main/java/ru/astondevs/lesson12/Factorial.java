package ru.astondevs.lesson12;

public class Factorial {
    public static int factorial(int num) {
        int factorial = 1;
        if (num <= 0) {
            System.out.println("Введите положительное число");
        } else if (num > 0) {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
        }
        return factorial;
    }
}
