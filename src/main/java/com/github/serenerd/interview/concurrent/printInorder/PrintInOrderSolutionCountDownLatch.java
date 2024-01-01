package com.github.serenerd.interview.concurrent.printInorder;

import java.util.concurrent.CountDownLatch;

public class PrintInOrderSolutionCountDownLatch {

    private CountDownLatch count = new CountDownLatch(1);
    private CountDownLatch count1 = new CountDownLatch(1);

    public void first() {
        System.out.print("1");
        count.countDown();
    }

    public void second() throws InterruptedException {
        count.await();
        System.out.print("2");
        count1.countDown();
    }

    public void third() throws InterruptedException {
        count1.await();
        System.out.print("3");
    }
}