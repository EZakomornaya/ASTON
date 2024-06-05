package lesson_13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] array = {"cat", "dog", "hamster", "guinea pig", "fancy rat", "ferret",
                "rabbit", "canary", "сat", "dog", "goldfish"};
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : array) {
            uniqueWords.add(word);
        }
        System.out.println("Список уникальных слов:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : array) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println("Количество вхождений каждого слова:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Duglas", "89605851130");
        phoneBook.add("Korneo", "89605853323");
        phoneBook.add("Duglas", "89508976767");
        System.out.println("Телефоны фамилии Duglas:");
        ArrayList<String> duglasNumbers = phoneBook.get("Duglas");
        for (String number : duglasNumbers) {
            System.out.println(number);
        }
        System.out.println("Телефоны фамилии Korneo:");
        ArrayList<String> korneoNumbers = phoneBook.get("Korneo");
        for (String number : korneoNumbers) {
            System.out.println(number);
        }
    }
}