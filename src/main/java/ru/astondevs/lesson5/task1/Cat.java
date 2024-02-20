package ru.astondevs.lesson5.task1;

public class Cat extends Animal implements AnimalsMethods {
    public static int catCount;
    public int appetite;
    public boolean satiety;

    public Cat(String name, int age, int appetite) {
        super(name, age, 200, 0);
        this.appetite = appetite;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= getAppetite()) {
            plate.reductionFood(appetite);
            satiety = true;
            System.out.println("Кот " + name + " покушал,его аппетит " + getAppetite());
        } else {
            satiety = false;
            System.out.println("Кот " + name + " не покушал, не хватило еды в тарелке.");
        }
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
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
        if (distance < 0) {
            System.out.println("Отрицательное значение для плавания: " + name);
            return;
        }
        if (swimObstacle == 0) {
            System.out.println(name + " не умеет плавать");
        }
    }
}
