package com.github.serenerd.interview.core;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/**
 * What will this code print?
 */
public class WhatIPrint1 {

    public static void main(String[] args) {
        Collection<Element<Integer>> set = new HashSet<>();
        set.add(new Element<>(1));
        set.add(new Element<>(1));
        set.add(new Element<>(2));
        set.add(new Element<>(3));
        System.out.println(set.size());
        System.out.println(set.contains(new Element<>(2)));
    }

    private static class Element<T> {
        private final T value;

        public Element(T value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof Element
                    && Objects.equals(value, ((Element) obj).value);
        }
    }
}