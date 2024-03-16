package ru.astondevs.lesson10;

import java.util.ArrayList;

public class Result {
    public static void main(String[] args) {
        Apple apple1 = new Apple("Apple1");
        Apple apple2 = new Apple("Apple2");
        Orange orange1 = new Orange("Orange1");

        Box<Apple> appleBox1 = new Box<>(new ArrayList<>());
        appleBox1.addFruit(apple1);
        appleBox1.addFruit(apple2);

        Box<Apple> appleBox2 = new Box<>(new ArrayList<>());
        appleBox2.addFruit(apple1);
        appleBox2.addFruit(apple2);

        Box<Orange> orangeBox = new Box<>(new ArrayList<>());
        orangeBox.addFruit(orange1);

        double appleBoxWeight = appleBox1.getWeight();
        double orangeBoxWeight = orangeBox.getWeight();

        System.out.println("\nВес коробки с яблоками: " + appleBoxWeight + " кг.");
        System.out.println("\nВес коробки с апельсинами: " + orangeBoxWeight + " кг.");

        System.out.println("\nСравнение коробок appleBox1 и appleBox2: " + appleBox1.compare(appleBox2));
        System.out.println("\nСравнение коробок appleBox1 и orangeBox: " + appleBox1.compare(orangeBox));

        Box<Apple> boxNewFruit = new Box<>(new ArrayList<>());
        appleBox1.transferFruit(boxNewFruit);
        System.out.println("\nТрансфер яблок в новую коробку и ее вес: " + boxNewFruit.getWeight() + " кг.");
    }
}
