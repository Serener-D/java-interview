package com.github.serenerd.interview.algorithms.palindrome;

import org.junit.Assert;
import org.junit.Test;

public class Palindrome extends PalindromeSolutions {

    @Override
    public boolean isPalindrome(String text) {
        return false;
    }

    @Test
    public void test() {
        Assert.assertTrue(isPalindrome("aba"));
        Assert.assertFalse(isPalindrome("abb"));
        Assert.assertTrue(isPalindrome("abA"));
        Assert.assertTrue(isPalindrome("a ba"));
    }
}