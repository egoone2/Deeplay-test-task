package org.example.task2;


import org.example.task1.RandomSequenceGenerator;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] randomSequence = RandomSequenceGenerator.getRandomSequence(30, 50);
        showMostFrequentNums(randomSequence);
    }

    public static void showMostFrequentNums(int[] arr) {
        Map<Integer, Integer> frequencies = new HashMap<>();

        for (int i : arr) {
            frequencies.put(i, frequencies.getOrDefault(i,0) + 1);
        }

        int maxFreq = frequencies.values().stream().max(Integer::compareTo).get();
        frequencies.entrySet().stream().filter(entry -> entry.getValue() == maxFreq).forEach(entry -> {
            System.out.println("Element: " + entry.getKey() + ", frequency: " + entry.getValue());
        });
    }
}
