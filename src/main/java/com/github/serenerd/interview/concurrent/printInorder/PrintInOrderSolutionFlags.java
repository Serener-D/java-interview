package com.github.serenerd.interview.concurrent.printInorder;


public class PrintInOrderSolutionFlags {

    private volatile boolean firstExecuted = false;
    private volatile boolean secondExecuted = false;

    public void first() {
        System.out.print("1");
        firstExecuted = true;
    }

    public void second() {
        while (true) {
            if (firstExecuted) {
                break;
            }
        }
        System.out.print("2");
        secondExecuted = true;
    }

    public void third() {
        while (true) {
            if (secondExecuted) {
                break;
            }
        }
        System.out.print("3");
    }
}