package com.github.serenerd.interview.algorithms.fibonacci;

/**
 * Implement a method that will print last number in fibonacci sequence for a given length
 * For example, calling fibonacci(5) should return 3
 * Start your sequence with 0
 * Assume the length will be at least 1
 * Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(1) == 0);
        System.out.println(fibonacci(10) == 55);
        System.out.println(fibonacci(20) == 6765);
        System.out.println(fibonacci(30) == 832040);
    }

    private static int fibonacci(int length) {
        return 0;
    }
}