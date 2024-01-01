package com.github.serenerd.interview.core.exceptions;

import java.util.LinkedList;
import java.util.List;

/**
 * How to get OutOfMemoryError?
 * How to catch and handle?
 */
public class OutOfMemoryErrorTask {

    public static void raiseOutMemoryError() {
    }

    /**
     * You should catch and handle OutOfMemoryError
     */
    public static void solution() {
        List<Object> list = new LinkedList<>();
        while (true) {
            list.add(new Object());
        }
    }
}