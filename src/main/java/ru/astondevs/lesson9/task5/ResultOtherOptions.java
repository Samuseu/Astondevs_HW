package ru.astondevs.lesson9.task5;

import java.util.ArrayList;
import java.util.Scanner;

public class ResultOtherOptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Введите логин: ");

        while (true) {
            String login = sc.nextLine();

            if (login.isEmpty()) {
                break;
            }
            list.add(login);
        }

        list.stream()
                .filter(login -> login.startsWith("f"))
                .forEach(System.out::println);

        sc.close();
    }
}
