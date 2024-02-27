package ru.astondevs.lesson6;


import java.io.IOException;

/**
 * 1. Реализовать сохранение данных в csv файл;
 * 2. Реализовать загрузку данных из csv файла. Файл читается целиком.
 * Структура csv файла:
 * ● Строка заголовок с набором столбцов
 * ● Набор строк с целочисленными значениями
 * ● Разделитель между столбцами - символ точка с запятой (;)
 * Для хранения данных использовать класс вида:
 * public class AppData {
 * private String[] header;
 * private int[][] data;
 * }
 * Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.
 */

public class Result {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/test.csv";
        AppData data = new AppData();
        data.setHeader(new String[]{"Value 1", "Value 2", "Value 3"});
        data.setData(new int[][]{{100, 200, 300}, {200, 100, 400}});

        data.save(path);
        data.load(path);

        for (String line : data.load(path)) {
            System.out.println(line);
        }
    }
}
