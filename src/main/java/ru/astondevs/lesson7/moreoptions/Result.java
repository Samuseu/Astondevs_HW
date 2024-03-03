package ru.astondevs.lesson7.moreoptions;

public class Result {
    public static void main(String[] args) {
        String[][] array = {
                {"19", "21", "32", "43"},
                {"54", "65", "76", "87"},
                {"98", "10", "10", "11"},
                {"12", "13", "14", "15"}
        };

        try {
            int sum = correctArray(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int correctArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int rows = 4;
        int cols = 4;

        if (array.length != rows || array[0].length != cols) {
            throw new MyArraySizeException("Неправильный формат массива, нужен 4x4");
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
