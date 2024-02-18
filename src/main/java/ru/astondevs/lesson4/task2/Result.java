package ru.astondevs.lesson4.task2;

import static ru.astondevs.lesson4.Data.*;

public class Result {

    public static void main(String[] args) {
        Employee[] arrayEmployees = new Employee[5];
        for (int i = 0; i < arrayEmployees.length; i++) {
            arrayEmployees[i] = new Employee(getFullName(),
                    getPosition(),
                    getEmail(),
                    getPhone(),
                    getSalary(),
                    getAge());
        }

        for (Employee employee : arrayEmployees) {
            employee.displayInformation();
        }
    }
}