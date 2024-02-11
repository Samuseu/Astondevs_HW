package ru.astondevs.lesson2.moreoptions;


public class Result {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(4, 10);
        printColor(115);
        compareNumbers(21, 20);
    }

    private static void printThreeWords() {
        String[] fruits = {"Orange", "Banana", "Apple"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    private static void checkSumSign(int a, int b) {
        int sum = a + b;
        String result = switch (Integer.signum(sum)) {
            case 1 -> "Сумма положительная";
            default -> "Сумма отрицательная";
        };
        System.out.println(result);
    }

    private static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers(int a, int b) {
        String result = (a >= b) ? "a>=b" : "a<b";
        System.out.println(result);
    }
}
