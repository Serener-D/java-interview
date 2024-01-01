package com.github.serenerd.interview.algorithms.simple;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Find third element starting from the end
 */
public class ThirdListNode {

    @Data
    public static class ListNode {
        private final int value;
        private final ListNode next;
    }

    public static void main(String[] args) {
        var result = solution(new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        null)
                                        )
                                )
                        )
                )
        );
        System.out.println(result.getValue() == 3);
    }

    public static ListNode findElement(ListNode head) {
        return null;
    }

    public static ListNode solution(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        var currentNode = head;
        do {
            list.add(currentNode);
            currentNode = currentNode.next;
        } while (currentNode.next != null);
        return list.get(list.size() - 2);
    }
}