package com.github.serenerd.interview.concurrent.readwritelock;

import lombok.Data;

/**
 * We have cache
 * How to make it work in concurrent environment?
 */
public class ReadWriteLockTask {

    @Data
    public class Element {
        private int id;
        private String name;
    }

    public class Cache {

        // TODO

        public void add(Element element) {
            // TODO
        }

        public Element getById(int id) {
            // TODO
            return null;
        }

        public Element getByName(String name) {
            // TODO
            return null;
        }
    }
}