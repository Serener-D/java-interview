package com.github.serenerd.interview.concurrent.readwritelock;

import lombok.Data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ReadWriteLockTaskSolution {

    @Data
    public class Element {
        private int id;
        private String name;
    }

    public class Cache {

        Map<Integer, Element> idToElementMap = new ConcurrentHashMap<>();
        Map<String, Element> nameToElementMap = new ConcurrentHashMap<>();

        public void add(Element element) {
            synchronized (this) {
                idToElementMap.put(element.getId(), element);
                nameToElementMap.put(element.getName(), element);
            }
        }

        public Element getById(int id) {
            return idToElementMap.get(id);
        }

        public Element getByName(String name) {
            return nameToElementMap.get(name);
        }
    }
}