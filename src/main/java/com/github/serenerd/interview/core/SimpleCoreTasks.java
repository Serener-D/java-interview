package com.github.serenerd.interview.core;

public class SimpleCoreTasks {

    /**
     * Q: What will this method return?
     * A: 2
     */
    public static int getSomeValue() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }
}