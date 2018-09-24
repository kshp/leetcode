package com.pk.leetcode.arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MinimumWindowSubstring_76Test {

    private static String str1 = "ADOBECODEBANC";
    private static String pattern1 = "ABC";
    private static String result1 = "BANC";

    @Test
    public void minWindow() {
        assertThat(MinimumWindowSubstring_76.minWindow(str1, pattern1), is(equalTo(result1)));
    }
}