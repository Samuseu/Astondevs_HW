package ru.astondevs.lesson9.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Result {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        List<String> sortedList = list.stream()
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(i -> "f" + i)
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
