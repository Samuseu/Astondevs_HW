package ru.astondevs.lesson12;

public class Factorial {
    public static int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Факториал не может быть отрицательным ");
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

}

