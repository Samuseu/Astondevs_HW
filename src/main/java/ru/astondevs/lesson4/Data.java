package ru.astondevs.lesson4;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Data {
    public static Faker faker = new Faker(new Locale("ru"));

    public static String fullName = faker.name().fullName();
    public static String position = faker.job().position();
    public static String phone = faker.phoneNumber().phoneNumber();
    public static int salary = faker.number().numberBetween(2000, 4000);
    public static int age = faker.number().numberBetween(18, 42);

    public static Faker englishFaker = new Faker(new Locale("en"));
    public static String email = englishFaker.internet().emailAddress();
}
