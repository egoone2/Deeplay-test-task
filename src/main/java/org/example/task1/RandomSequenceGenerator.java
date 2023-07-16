package org.example.task1;

import java.util.Random;

public class RandomSequenceGenerator {

    private static final Random rnd = new Random();


    public static int[] getRandomSequence(int length, int bound) {
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = rnd.nextInt(bound);
        }
        return arr;
    }
}
