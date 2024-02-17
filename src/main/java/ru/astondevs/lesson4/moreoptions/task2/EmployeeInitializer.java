package ru.astondevs.lesson4.moreoptions.task2;

import ru.astondevs.lesson4.Data;

public class EmployeeInitializer {
    public static Employee[] initializeEmployees(int size) {
        Employee[] employees = new Employee[size];

        for (int i = 0; i < employees.length; i++) {
            employees[i] =new Employee(
                    Data.faker.name().fullName(),
                    Data.faker.job().position(),
                    Data.englishFaker.internet().emailAddress(),
                    Data.faker.phoneNumber().phoneNumber(),
                    Data.faker.number().numberBetween(2000, 4000),
                    Data.faker.number().numberBetween(18, 42)
            );
        }
        return employees;
    }
}
