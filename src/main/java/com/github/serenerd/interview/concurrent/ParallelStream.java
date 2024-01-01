package com.github.serenerd.interview.concurrent;

import lombok.SneakyThrows;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class ParallelStream {

    /**
     * How long will this method be executed? What will be the output?
     */
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ExecutorService executor = Executors.newCachedThreadPool();

        List<String> results = integers.stream()
                .map(integer -> integer * 500)
                .map(integer -> CompletableFuture.supplyAsync(() -> process(integer), executor))
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println(results);
    }

    @SneakyThrows
    private static String process(Integer integer) {
        System.out.println("integer " + integer + " is being processed");
        Thread.sleep(integer);
        System.out.println("integer: " + integer + " was processed");
        return String.valueOf(integer);
    }
}