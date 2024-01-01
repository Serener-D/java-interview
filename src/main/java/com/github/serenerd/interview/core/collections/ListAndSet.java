package com.github.serenerd.interview.core.collections;

import java.util.*;

/**
 * What will this code print?
 */
public class ListAndSet {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(3, 2, 1);
        System.out.println(Objects.equals(list1, list2));

        Set<Integer> set1 = Set.of(1, 2, 3);
        Set<Integer> set2 = Set.of(3, 2, 1);
        System.out.println(Objects.equals(set1, set2));

        Iterable<Integer> iterable1 = new HashSet<>(list1);
        Iterable<Integer> iterable2 = new LinkedHashSet<>(list2);
        System.out.println(Objects.equals(iterable1, iterable2));
    }
}