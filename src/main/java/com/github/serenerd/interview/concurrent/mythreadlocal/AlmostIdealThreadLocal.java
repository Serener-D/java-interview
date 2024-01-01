package com.github.serenerd.interview.concurrent.mythreadlocal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Problem with collection of saved objects
 */
class AlmostIdealThreadLocal<T> implements MyThreadLocal<T> {

    private final Map<Long, T> values = new ConcurrentHashMap<>();

    @Override
    public T get() {
        return values.get(Thread.currentThread().getId());
    }

    @Override
    public void put(T object) {
        values.put(Thread.currentThread().getId(), object);
    }
}