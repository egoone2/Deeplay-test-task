package org.example.task4;

public class Main {

    public static void main(String[] args) {

        int[] array1 = {10, 11, 7, 7, 12};
        int k1 = 2;
        splitArray(array1, k1);

        int[] array2 = {5, 2, 6, 4, 3, 6};
        int k2 = 4;
        splitArray(array2, k2);

        int[] array3 = {7, 8, 12, 1};
        int k3 = 3;
        splitArray(array3, k3);

    }

    public static void splitArray(int[] nums, int k) {
        int n = nums.length;
        int totalSum = 0;
        for (int j : nums) {
            totalSum += j;
        }
        int multiplicity = totalSum - ((k * k - k) / 2);
        if (multiplicity % k != 0) {
            System.out.println("Невозможно");
            return;
        }
    }

}
