package org.example.task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] randomSequence = RandomSequenceGenerator.getRandomSequence(30, 50);
        printArr(randomSequence);

        sort(randomSequence);
        printArr(randomSequence);
    }

    public static void sort(int[] arr) {

        int oddCounter = 0, evenCounter = 0, zeroCounter = 0;

        for (int i : arr) {
            if (i % 2 != 0) oddCounter++;
            else if (i != 0) evenCounter++;
            else zeroCounter++;
        }

        int[] oddArr = new int[oddCounter];
        int[] evenArr = new int[evenCounter];

        oddCounter = 0;
        evenCounter = 0;

        for (int i : arr) {
            if (i % 2 != 0) oddArr[oddCounter++] = i;
            else if (i != 0) evenArr[evenCounter++] = i;
        }

        Arrays.sort(oddArr);
        rockSort(evenArr);

        for (int i = 0; i < arr.length; i++) {
            if (i < oddCounter)
                arr[i] = oddArr[i];
            else if (i < oddCounter + zeroCounter) {
                arr[i] = 0;
            } else arr[i] = evenArr[i - oddCounter - zeroCounter];
        }
    }

    public static void rockSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

}
