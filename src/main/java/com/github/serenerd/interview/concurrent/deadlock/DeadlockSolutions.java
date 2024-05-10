package com.github.serenerd.interview.concurrent.deadlock;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockSolutions {

    public static void deadlock() {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Executor executor = Executors.newFixedThreadPool(2);
        executor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + "locking lock 1");
            lock1.lock();
            System.out.println(Thread.currentThread().getName() + "locking lock 2");
            lock2.lock();

            lock2.unlock();

            lock1.unlock();
        });
        executor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + "locking lock 2");
            lock2.lock();
            System.out.println(Thread.currentThread().getName() + "locking lock 1");
            lock1.lock();
            lock1.unlock();

            lock2.unlock();
        });
    }

    private static class Example {
        private static final Lock lock1 = new ReentrantLock();
        private static final Lock lock2 = new ReentrantLock();

        public static void deadlock() {
            Thread thread1 = new Thread(() -> {
                lock1.lock();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                lock2.lock();
            });

            Thread thread2 = new Thread(() -> {
                lock2.lock();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                lock1.lock();
            });

            thread1.start();
            thread2.start();
        }
    }
}