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

    @Override
    public void run(int distance) {
        if (distance<0){
            System.out.println("Отрицательное значение для бега: " + name);
            return;
        }
        if (distance <= runObstacle) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " устал");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance<0){
            System.out.println("Отрицательное значение для плавания: " + name);
            return;
        }
        if(distance<=swimObstacle){
            System.out.println(name + " проплыл " + distance + " м");
        }else {
            System.out.println(name + " устал");
        }
    }
}
