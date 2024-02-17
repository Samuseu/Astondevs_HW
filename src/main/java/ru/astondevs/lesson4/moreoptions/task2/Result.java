package ru.astondevs.lesson4.moreoptions.task2;

import ru.astondevs.lesson4.Data;

public class Result extends Data {
    public static void main(String[] args) {
        Employee[] arrayEmployees = EmployeeInitializer.initializeEmployees(5);

        for (Employee employee : arrayEmployees) {
            employee.displayInformation();
            System.out.println();
        }
    }
}