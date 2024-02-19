package ru.astondevs.lesson4.moreoptions.task2;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void displayInformation() {
        System.out.println(
                "ФИО: " + this.fullName + "\n" +
                "Должность: " + this.position + "\n" +
                "Email: " + this.email + "\n" +
                "Телефон: " + this.phone + "\n" +
                "Зарплата: " + this.salary + "\n" +
                "Возраст: " + this.age);
}

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}