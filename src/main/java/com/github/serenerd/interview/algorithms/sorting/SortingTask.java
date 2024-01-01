package com.github.serenerd.interview.algorithms.sorting;

/**
 * Implement any sort algo
 * 1. What is complexity?
 * 2. What is the best complexity for general case?
 * 3. Can array be sorted for O(n)?
 */
public class SortingTask {

    /**
     * 1. O(n^2)
     * 2. O(n)
     * 3. No
     */
    public static int[] bubbleSort(int[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            for (int j = 0; j < unsortedArray.length - 1; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int buff = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = buff;
                }
            }
        }
        return unsortedArray;
    }
}