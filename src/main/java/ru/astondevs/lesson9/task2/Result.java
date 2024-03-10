package ru.astondevs.lesson9.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Result {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Highload", "High", "load", "Highload"));
        List<String> listEmpty = new ArrayList<>();
        System.out.println("\nКоллекция: " + list);

        long high = list.stream().filter(Predicate.isEqual("High")).count();
        System.out.println("\nКоличество слов High: " + high);

        String firstElement = list.stream().findFirst().orElse(String.valueOf((int) 0));
        String firstElement1 = listEmpty.stream().findFirst().orElse(String.valueOf((int) 0));

        System.out.println("\nПервый элемент: " + firstElement);
        System.out.println("\nПервый элемент в пустой коллекции: " + firstElement1);

        System.out.println(getLastElement(list));
        System.out.println(getLastElement(listEmpty));
    }

    public static String getLastElement(List<String> list) {
        if (list.isEmpty()) {
            return "\nПоследний элемент в пустой коллекции: " + 0;
        }
        String lastElement = null;
        Iterator<String> iterator = list.stream().iterator();
        while (iterator.hasNext()) {
            lastElement = iterator.next();
        }
        return "\nПоследний элемент: " + lastElement;
    }
}
