package ru.astondevs.lesson5.task1;

public class Animal implements AnimalsMethods {
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

    public static int getAnimalCount() {
        return animalCount;
    }

    @Override
    public void run(int distance) {
        if(distance<=runObstacle){
            System.out.println(name + " пробежал " + distance + " м");
        }else {
            System.out.println(name + " устал");
        }
    }

    @Override
    public void swim(int distance) {
        if(distance<=swimObstacle){
            System.out.println(name + " пробежал " + distance + " м");
        }else {
            System.out.println(name + " устал");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
