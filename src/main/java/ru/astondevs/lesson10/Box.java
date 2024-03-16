package ru.astondevs.lesson10;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public double getWeight() {
        double weight = 0.0;
        for (T fruit : fruits) {
            weight += ((Number) fruit.getWeight()).doubleValue();
        }
        return weight;
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void transferFruit(Box<T> box) {
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
}
