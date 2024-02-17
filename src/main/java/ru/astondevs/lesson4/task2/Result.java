package ru.astondevs.lesson4.task2;

import ru.astondevs.lesson4.Data;

public class Result extends Data {

    public static void main(String[] args) {
        Employee[] arrayEmployees = new Employee[5];
        for (int i = 0; i < arrayEmployees.length; i++) {
            arrayEmployees[i] = new Employee(fullName, position, email, phone, salary, age);
        }

        for (Employee employee : arrayEmployees) {
            employee.displayInformation();
            System.out.println();
        }
    }
}