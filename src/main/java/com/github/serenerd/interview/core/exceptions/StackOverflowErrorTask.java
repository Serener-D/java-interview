package com.github.serenerd.interview.core.exceptions;


/**
 * How to get StackOverflowError
 * How to catch and handle?
 */
public class StackOverflowErrorTask {

    public static void raiseStackOverflowError() {
    }

    /**
     * You should catch and handle StackOverflowError
     */
    public static void solution() {
        solution();
    }
}