package ru.astondevs.lesson9.task3;

import java.util.Arrays;
import java.util.Comparator;

public class ResultOtherOptions {
    public static void main(String[] args) {
        String[] collection = {"f10", "f15", "f2", "f4", "f4"};

        Arrays.sort(collection, Comparator.comparing(ResultOtherOptions::extractNumber).thenComparing(Comparator.naturalOrder()));

        for (String element : collection) {
            System.out.println(element);
        }
    }

    private static Integer extractNumber(String string) {
        return Integer.parseInt(string.replaceAll("\\D", ""));
    }
}


