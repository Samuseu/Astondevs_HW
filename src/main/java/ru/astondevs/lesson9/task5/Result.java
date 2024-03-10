package ru.astondevs.lesson9.task5;

import java.util.ArrayList;
import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Введите логин: ");

        while (true) {
            String login = sc.nextLine();

            if (login.isEmpty()) {
                break;
            }

            if (login.startsWith("f")) {
                list.add(login);
            }
        }

        for (Object login : list) {
            System.out.println(login);
        }
        sc.close();
    }
}
