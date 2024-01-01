package com.github.serenerd.interview.core.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class SimpleCollectionsTasks {

    /**
     * Q1: Is it possible to do so? Why?
     * Q2: Why exception may happen in runtime? ClassCastException when we use Integer methods on String element
     */
    public static List<Integer> genericTypes() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        ((List) list).add("someValue");
        return list;
    }

    public static class FailFastSafe {
        /**
         * Q1: What will happen when calling this method?
         * A: ConcurrentModificationException will be thrown
         * Q2: How are iterators like this called? Why would we want such behaviour?
         * A: fail-fast iterators. It can be useful when one thread reads data from collection while the other is trying to
         * modify it (saving, deleted, updating), so we can be sure in data integrity
         * Q3: Are there iterators that don't throw exceptions in these cases, how are they called? Give some example of
         * collections that support such behaviour
         * A: fail-safe (weakly consistent) iterators. CopyOnWriteArrayList - creates copy or original collection, ConcurrentHashMap - doesn't
         * create copy or original collection,.
         * https://www.baeldung.com/java-fail-safe-vs-fail-fast-iterator
         * https://www.geeksforgeeks.org/fail-fast-fail-safe-iterators-java/
         */
        public void someFunction() {
            ArrayList<Integer> list = new ArrayList<>();

            list.add(1);
            list.add(2);
            list.add(3);

            Iterator<Integer> it = list.iterator();

            while (it.hasNext()) {
                Integer integer = it.next();
                list.add(5);
            }
        }

        public void concurrentHashMapExample() {
            ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
            map.put("ONE", 1);
            map.put("TWO", 2);
            map.put("THREE", 3);
            map.put("FOUR", 4);
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                String key = it.next();
                System.out.println(key + " : " + map.get(key));
                if ("TWO".equals(key)) {
                    // This will reflect in iterator.
                    // Hence, it has not created separate copy
                    map.put("SEVEN", 7);
                }
            }
        }

        public void copyOnWriteArrayListExample() {
            CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8});
            Iterator<Integer> itr = list.iterator();
            while (itr.hasNext()) {
                Integer no = itr.next();
                System.out.println(no);
                if (no == 3)
                    // This will not print,
                    // hence it has created separate copy
                    list.add(14);
            }
        }
    }

    /**
     * What will this code print?
     */
    public static void unsortedMap() {
        Map<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(10, "z");
        unsortedMap.put(5, "b");
        unsortedMap.put(1, "d");
        unsortedMap.put(7, "e");
        unsortedMap.put(50, "j");
        Map<Integer, String> treeMap = new TreeMap<>(unsortedMap);
        treeMap.values().forEach(System.out::print);
    }
}