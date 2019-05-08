package com.pk.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstring_516Test {

    private static String s1 = "bb";
    private static String result1 = "bb";
    private static String s2 = "abb";
    private static String result2 = "bb";

    @Test
    public void longestPalindromeTest() {
        LongestPalindromicSubstring_5 instance = new LongestPalindromicSubstring_5();
        assertEquals(result1, instance.longestPalindromeLongestCommonSubstring(s1));
        assertEquals(result2, instance.longestPalindromeLongestCommonSubstring(s2));
    }
}