package com.bridgelabz.hashtable;

public class Operations {
    public static void findFrequency() {
        String sentance = "To be or not to be";
        HashTable hashTable = new HashTable();

        String[] words = sentance.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = (Integer) hashTable.get(word);
            if (value == null) {
                value = 1;
            } else {
                value = value + 1;
            }
            hashTable.add(word, value);
        }
        for (String word : words) {
            Integer frequency = (Integer) hashTable.get(word);
            System.out.println("Key: " + word + "-frequency: " + frequency);
        }
    }
}
