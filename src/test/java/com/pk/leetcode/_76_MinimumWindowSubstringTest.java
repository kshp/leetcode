package com.pk.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class _76_MinimumWindowSubstringTest {

    private static String str1 = "ADOBECODEBANC";
    private static String pattern1 = "ABC";
    private static String result1 = "BANC";

    private static String str2 = "ADOBECODEBANC";
    private static String pattern2 = "AABC";
    private static String result2 = "ADOBECODEBA";

    @Test
    public void minWindow() {
        assertThat(_76_MinimumWindowSubstring.minWindow(str1, pattern1), is(equalTo(result1)));
        assertThat(_76_MinimumWindowSubstring.minWindow(str2, pattern2), is(equalTo(result2)));

        assertThat(_76_MinimumWindowSubstring.myMinWindow(str2, pattern2), is(equalTo(result2)));

        assertThat(_76_MinimumWindowSubstring.minWindow2(str1, pattern1), is(equalTo(result1)));
        assertThat(_76_MinimumWindowSubstring.minWindow2(str2, pattern2), is(equalTo(result2)));
    }
}