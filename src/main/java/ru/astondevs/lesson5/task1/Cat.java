package ru.astondevs.lesson5.task1;

public class Cat extends Animal implements AnimalsMethods {
    public static int catCount;

    public Cat(String name, int age) {
        super(name, age, 200, 0);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void swim(int distance) {
        if (swimObstacle == 0) {
            System.out.println(name + " не умеет плавать");
        }
    }
}
