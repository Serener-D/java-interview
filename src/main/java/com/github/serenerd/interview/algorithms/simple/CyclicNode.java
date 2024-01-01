package com.github.serenerd.interview.algorithms.simple;

public class CyclicNode {

    /**
     * Make simple definition of an element of singly LinkedList
     */
    public static class Node<T> {
        private Node<T> next;
        private T value;
    }

    public static void main(String[] args) {
        var node = new Node();

        var node1 = new Node();
        node.next = node1;

        var node2 = new Node();
        node1.next = node2;

        var node3 = new Node();
        node2.next = node3;

        var node4 = new Node();
        node3.next = node4;

        node4.next = node;

        System.out.println(isCyclic(node));
    }

    /**
     * Implement method which defines if linked list is cyclic
     */
    public static boolean isCyclic(Node head) {
        return false;
    }

    public boolean solution(Node head) {
        Node currentElement = head.next;
        while (currentElement != null) {
            if (currentElement == head) {
                return true;
            }
            currentElement = currentElement.next;
        }
        return false;
    }
}