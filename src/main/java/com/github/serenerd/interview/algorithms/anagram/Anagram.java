package com.github.serenerd.interview.algorithms.anagram;

import java.util.*;

/**
 * Implement a method that will return a list of anagrams
 * Assume there can't be more that one group of anagrams
 * Assume all words are lowercase
 * An anagram is a word formed by rearranging the letters of a different word or phrase, using all the original letters exactly once
 */
public class Anagram {

    public static void main(String[] args) {
        System.out.println(Set.of("night", "thing").equals(findAnagrams(Set.of("night", "tea", "thing"))));
        System.out.println(Set.of("tea", "ate", "eat").equals(findAnagrams(Set.of("night", "tea", "eat", "ate"))));
        System.out.println(Set.of().equals(findAnagrams(Set.of("night", "tea", "team"))));
    }

    public static Set<String> findAnagrams(Set<String> words) {
        return null;
    }
}