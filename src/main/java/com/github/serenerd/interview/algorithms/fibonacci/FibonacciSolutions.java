package com.github.serenerd.interview.algorithms.fibonacci;

public class FibonacciSolutions {

    private static int solution(int length) {
        if (length == 1) {
            return 0;
        }
        int prev = 0;
        int current = 1;
        for (int i = 1; i < length; i++) {
            int temp = current;
            current = current + prev;
            prev = temp;
        }
        return current;
    }

    private static int solution1(int length) {
        return 0;
    }
}