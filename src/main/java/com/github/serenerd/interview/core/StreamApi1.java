package com.github.serenerd.interview.core;

import java.util.List;

public class StreamApi1 {

    public static class Person {
        private String name;
        private int age;
    }

    public static class Room {
        private int number;
        private List<Person> persons;
    }

    /**
     * Print the first room number where person's age is less than minAge
     */
    public int findRoom(List<Room> rooms, int minAge) {
        return 0;
    }
}