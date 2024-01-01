package com.github.serenerd.interview.core;

import java.util.List;

public class StreamApi3 {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3);
        System.out.println(stream(list1) == 4);

        List<Integer> list2 = List.of(1, 2, 6, 5, 7, 8);
        System.out.println(stream(list2) == 104);
    }

    /**
     * Implement a method that takes each even number, raises it to the power of 2, and sums all the results using the Stream API.
     */
    private static int stream(List<Integer> list) {
        return 0;
    }

    private static int solution(List<Integer> list) {
        return list.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .reduce(Integer::sum)
                .orElse(0);
    }
}