package ru.astondevs.lesson7.moreoptions;

public class Result {
    public static void main(String[] args) throws MyArraySizeException {
        String[][] array = new String[4][4];
        correctArray(array);

    }


    public static void correctArray(String[][] array) throws MyArraySizeException {
        int rows = 4;
        int cols = 4;

        if(array.length !=rows || array[0].length !=cols){
            throw new MyArraySizeException("Размер массива должен быть 4x4");
        }
    }
}
