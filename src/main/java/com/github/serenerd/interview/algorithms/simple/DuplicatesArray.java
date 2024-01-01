package com.github.serenerd.interview.algorithms.simple;

import java.util.Arrays;

/**
 * Implement a method that will remove duplicate elements
 * Without using any collections like Set or ArrayList
 * You may use any utility classes or methods present in Java standard library
 * What is the complexity of your solution?
 */
public class DuplicatesArray {

    public static void main(String[] args) {
        var result = removeDuplicates(new int[]{1, 2, 3, 2, 1, 5});
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.equals(new int[]{1, 2, 3, 5}, result));

        var result1 = removeDuplicates(new int[]{});
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.equals(new int[]{}, result1));

        var result2 = removeDuplicates(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.equals(new int[]{1, 2, 3, 4, 5}, result2));
    }

    public static int[] removeDuplicates(int[] numbersWithDuplicates) {
        return numbersWithDuplicates;
    }

    /**
     * This solution assumes that there are no zeros in the input array
     * O(n^2)
     */
    public static int[] solution(int[] numbersWithDuplicates) {
        int duplicatesCounter = 0;
        for (int i = 0; i < numbersWithDuplicates.length - 1; i++) {
            for (int j = 0; j < numbersWithDuplicates.length - 1; j++) {
                if (numbersWithDuplicates[j + 1] != 0 && (numbersWithDuplicates[j] == numbersWithDuplicates[j + 1])) {
                    numbersWithDuplicates[j + 1] = 0;
                    duplicatesCounter++;
                }
                if (numbersWithDuplicates[j] > numbersWithDuplicates[j + 1]) {
                    int buff = numbersWithDuplicates[j];
                    numbersWithDuplicates[j] = numbersWithDuplicates[j + 1];
                    numbersWithDuplicates[j + 1] = buff;
                }
            }
        }

        int[] result = new int[numbersWithDuplicates.length - duplicatesCounter];
        int cursor = 0;
        for (int numbersWithDuplicate : numbersWithDuplicates) {
            if (numbersWithDuplicate != 0) {
                result[cursor] = numbersWithDuplicate;
                cursor++;
            }
        }
        return result;
    }
}