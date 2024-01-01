package com.github.serenerd.interview.concurrent.printInorder;

/**
 * Three threads get the same instance of PrintInOrder
 * First thread calls first(), second calls first(), third calls third()
 * Make that the output will always be "123"
 */
public class PrintInOrder {

    public void first() {
        System.out.print("1");
    }

    public void second() {
        System.out.print("2");
    }

    public void third() {
        System.out.print("3");
    }
}