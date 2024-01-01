package com.github.serenerd.interview.algorithms.palindrome;

import java.util.ArrayList;
import java.util.Collections;

public class PalindromeSolutions {

    public boolean isPalindrome(String text) {
        text = text.toLowerCase().replace(" ", "");

        var charArray = text.toCharArray();
        var charList = new ArrayList<Character>();
        for (var character : text.toCharArray()) {
            charList.add(character);
        }
        Collections.reverse(charList);
        for (int i = 0; i < text.length(); i++) {
            if (charArray[i] != charList.get(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeOptimized(String text) {
        text = text.toLowerCase().replace(" ", "");
        char[] charArray = text.toCharArray();

        int leftIndex = 0;
        int rightIndex = charArray.length - 1;
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[leftIndex] != charArray[rightIndex]) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }

    public boolean isPalindrome1(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    public boolean isPalindrome2(String text) {
        // Extra validation and conversion
        text = text.toLowerCase().replace(" ", "");

        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome3(String text) {
        text = text.toLowerCase().replace(" ", "");
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindrome(text.substring(1, text.length() - 1));
    }

    public boolean isPalindrome4(String text) {
        text = text.toLowerCase().replace(" ", "");
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome5(String text) {
        text = text.toLowerCase().replace(" ", "");
        StringBuilder reversed = new StringBuilder(text).reverse();
        return text.equals(reversed.toString());
    }
}