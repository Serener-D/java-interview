package com.github.serenerd.interview.algorithms.anagram;

import java.util.*;

public class AnagramSolutions {

    public static Set<String> solution(Set<String> words) {
        var wordsMap = new HashMap<Integer, String>();
        var anagramSet = new HashSet<String>();
        for (var word : words) {
            int characterSum = word.chars().reduce(0, Integer::sum);
            if (wordsMap.containsKey(characterSum)) {
                anagramSet.add(wordsMap.get(characterSum));
                anagramSet.add(word);
            }
            wordsMap.put(characterSum, word);
        }
        return anagramSet;
    }
}