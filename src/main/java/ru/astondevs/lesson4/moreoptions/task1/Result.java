package ru.astondevs.lesson4.moreoptions.task1;



public class Result {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Ivanov",
                "Ivan",
                "Ivanovich",
                "Engineer",
                "ivivan@gmail.com",
                "+37529892312312",
                2000,
                28);
        employee.displayInformation(employee);

    }
}

