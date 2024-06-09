package lesson_13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        /*String[] array = {"Cat", "dog", "hamster", "guinea pig", "fancy rat", "ferret",
        "rabbit", "canary", "cat", "dog", "goldfish"};
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
       } */
        String[] arrayOfWords = {"Cat", "dog", "hamster", "guinea pig", "fancy rat", "ferret",
              "rabbit", "canary", "cat", "dog", "goldfish"};
        ArrayList<String> unique = new ArrayList<>();
        HashMap<String, Integer> repeatCount = new HashMap<>();
        for (int i = 0; i < arrayOfWords.length; i++) {
            int count = 0;
            for (int j = 0; j < arrayOfWords.length; j++) {
                if (arrayOfWords[i].equals(arrayOfWords[j]) && i != j) {
                    count++;
                }
            }
            repeatCount.put(arrayOfWords[i], count);
            if (count == 0) {
                unique.add(arrayOfWords[i]);
            }
        }
        System.out.println("Список уникальных слов:");
        System.out.println(unique);
        System.out.println("Количество повторений каждого слова:");
        System.out.println(repeatCount);

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


