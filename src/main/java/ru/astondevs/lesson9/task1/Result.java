package ru.astondevs.lesson9.task1;

import java.util.ArrayList;

public class Result {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        int evenNumbers = (int) list.stream().filter(n -> n % 2 == 0).count();

        System.out.println("Числа: " + list);
        System.out.println("Количество четных чисел: " + evenNumbers);
    }
}
