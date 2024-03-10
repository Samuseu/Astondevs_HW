package ru.astondevs.lesson9.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Result {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        int evenNumbers = (int) list.stream().filter(n -> n % 2 == 0).count();
        List<Integer> evenNumbers1 = list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println("\nЧисла: " + list);
        System.out.println("\nЧетные числа: " + evenNumbers1);
        System.out.println("\nКоличество четных чисел: " + evenNumbers);

    }
}
