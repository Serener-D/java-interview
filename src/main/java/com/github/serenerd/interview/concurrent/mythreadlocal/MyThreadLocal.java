package com.github.serenerd.interview.concurrent.mythreadlocal;

/**
 * Implement your ThreadLocal
 */
public interface MyThreadLocal<T> {
    static void main(String[] args) {
        MyThreadLocal<String> threadLocal = new MyThreadLocal<>() {

            @Override
            public String get() {
                return null;
            }

            @Override
            public void put(String object) {

            }
        };

        Thread t1 = new Thread(() -> {
            threadLocal.put("t1");
            System.out.println(threadLocal.get());
        });

        Thread t2 = new Thread(() -> {
            threadLocal.put("t2");
            System.out.println(threadLocal.get());
        });

        t1.start();
        t2.start();

        threadLocal.put("main");
        System.out.println(threadLocal.get());
    }

    T get();

    void put(T object);
}