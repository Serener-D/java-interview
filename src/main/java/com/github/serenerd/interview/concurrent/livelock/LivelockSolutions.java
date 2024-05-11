package com.github.serenerd.interview.concurrent.livelock;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LivelockSolutions {

    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        LivelockSolutions livelock = new LivelockSolutions();

        Executor executor = Executors.newFixedThreadPool(2);
        executor.execute(() -> {
            try {
                livelock.operation1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executor.execute(() -> {
            try {
                livelock.operation2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void operation1() throws InterruptedException {
        while (true) {
            lock1.tryLock();
            System.out.println("lock1 acquired, trying to acquire lock2.");
            Thread.sleep(50);

            if (lock2.tryLock()) {
                System.out.println("lock2 acquired.");
            } else {
                System.out.println("cannot acquire lock2, releasing lock1.");
                lock1.unlock();
                continue;
            }

            System.out.println("executing first operation.");
            break;
        }
        lock1.unlock();
        lock2.unlock();
    }

    public void operation2() throws InterruptedException {
        while (true) {
            lock2.tryLock();
            System.out.println("lock2 acquired, trying to acquire lock1.");
            Thread.sleep(50);

            if (lock1.tryLock()) {
                System.out.println("lock1 acquired.");
            } else {
                System.out.println("cannot acquire lock1, releasing lock2.");
                lock2.unlock();
                continue;
            }

            System.out.println("executing second operation.");
            break;
        }
        lock2.unlock();
        lock1.unlock();
    }
}