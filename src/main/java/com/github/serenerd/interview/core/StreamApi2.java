package com.github.serenerd.interview.core;

import java.util.stream.Stream;

public class StreamApi2 {

    /**
     * What is the output?
     */
    public static void main(String[] args) {
        Stream.of("d2", "a2", "b1", "c")
                .map(s -> {
                    System.out.println(s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println(s);
                    return s.startsWith("A");
                });
    }
}