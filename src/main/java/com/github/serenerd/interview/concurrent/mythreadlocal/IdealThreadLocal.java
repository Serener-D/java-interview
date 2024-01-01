package com.github.serenerd.interview.concurrent.mythreadlocal;

import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Weak pointers will be collected after death of their creator-thread
 */
class IdealThreadLocal<T> implements MyThreadLocal<T> {

    private final Map<Long, T> values = new ConcurrentHashMap<>(new WeakHashMap<>());

    @Override
    public T get() {
        return values.get(Thread.currentThread().getId());
    }

    @Override
    public void put(T object) {
        values.put(Thread.currentThread().getId(), object);
    }
}