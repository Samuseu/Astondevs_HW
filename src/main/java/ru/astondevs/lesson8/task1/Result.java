package ru.astondevs.lesson8.task1;

import java.util.*;

public class Result {

    public static void main(String[] args) {
        String[] words = {"Максим", "Влад", "Анна", "Лидия", "Максим", "Лидия", "Влад", "Антон", "Паша"};

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            int count = wordCount.getOrDefault(word, 0) + 1;
            wordCount.put(word, count);
        }

        Set<String> wordsUnique = new HashSet<>();
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) == 1) {
                wordsUnique.add(word);
            }
        }

        System.out.println("Уникальные слова:");
        for (String word : wordsUnique) {
            System.out.println(word);
        }

        System.out.println("\nКоличество повторений:");
        for (Map.Entry<String, Integer> wordEntry : wordCount.entrySet()) {
            String key = wordEntry.getKey();
            int value = wordEntry.getValue();
            System.out.printf("%s : %d\n", key, value);
        }
    }
}