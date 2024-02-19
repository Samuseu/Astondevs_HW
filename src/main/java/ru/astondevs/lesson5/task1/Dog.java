package ru.astondevs.lesson5.task1;

public class Dog extends Animal implements AnimalsMethods {
    public static int dogCount;
    public Dog(String name, int age) {
        super(name, age, 500, 10);
        dogCount++;
    }
    public static int getDogCount() {
        return dogCount;
    }
}
