package com.pk.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonSubstringTest {

    private static Boolean printLookupTable = Boolean.TRUE;

    private static String s1 = "ABABC";
    private static String s2 = "BABCA";
    private static String result1 = "BABC";

    private static String s3 = "ABAB";
    private static String s4 = "BABA";
    private static String result2 = "ABA";

    @Test
    public void getLongestCommonsSubstring() {
        assertEquals(result1, LongestCommonSubstring.getLongestCommonsSubstring(s1, s2, printLookupTable));
        assertEquals(result2, LongestCommonSubstring.getLongestCommonsSubstring(s3, s4, printLookupTable));
    }
}