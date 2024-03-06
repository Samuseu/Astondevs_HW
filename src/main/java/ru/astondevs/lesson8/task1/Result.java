package ru.astondevs.lesson8.task1;

import java.util.*;

public class Result {
    public static void main(String[] args) {
        String[] arrayWords = {"Максим","Влад","Анна","Лидия","Максим","Лидия","Влад","Антон","Паша"};

        Set<String> setWordsArray = new HashSet<>();

        for (String words: arrayWords) {
            setWordsArray.add(words);
        }


    }
}
