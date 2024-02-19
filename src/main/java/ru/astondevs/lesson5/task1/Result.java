package ru.astondevs.lesson5.task1;

public class Result {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик", 2);
        Dog dog2 = new Dog("Рекс", 3);
        Cat cat1 = new Cat("Валик", 1);
        Cat cat2 = new Cat("Бакс", 3);

        dog1.run(150);
        dog2.run(550);
        dog1.swim(5);
        dog2.swim(15);

        cat1.run(150);
        cat2.run(250);
        cat1.swim(100);
        cat2.swim(0);

        System.out.println("Общие количество животных " + Animal.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());
    }
}
