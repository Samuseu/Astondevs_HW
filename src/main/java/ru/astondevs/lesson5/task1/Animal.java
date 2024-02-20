package ru.astondevs.lesson5.task1;

public abstract class Animal implements AnimalsMethods {
    public static int animalCount;
    public String name;
    public int age;
    public int runObstacle;
    public int swimObstacle;

    public Animal(String name, int age, int runObstacle, int swimObstacle) {
        this.name = name;
        this.age = age;
        this.runObstacle = runObstacle;
        this.swimObstacle = swimObstacle;
        animalCount++;
    }

    public  static int getAnimalCount() {
        return animalCount;
    }

    @Override
    public abstract void  run(int distance);



    @Override
    public abstract void swim(int distance);

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
