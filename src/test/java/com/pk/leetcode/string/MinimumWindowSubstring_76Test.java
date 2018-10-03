package com.pk.leetcode.string;

import com.pk.leetcode.string.MinimumWindowSubstring_76;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MinimumWindowSubstring_76Test {

    private static String str1 = "ADOBECODEBANC";
    private static String pattern1 = "ABC";
    private static String result1 = "BANC";

    private static String str2 = "ADOBECODEBANC";
    private static String pattern2 = "AABC";
    private static String result2 = "ADOBECODEBA";

    @Test
    public void minWindow() {
        assertThat(MinimumWindowSubstring_76.minWindow(str1, pattern1), is(equalTo(result1)));
        assertThat(MinimumWindowSubstring_76.minWindow(str2, pattern2), is(equalTo(result2)));

        assertThat(MinimumWindowSubstring_76.myMinWindow(str2, pattern2), is(equalTo(result2)));

        assertThat(MinimumWindowSubstring_76.minWindow2(str1, pattern1), is(equalTo(result1)));
        assertThat(MinimumWindowSubstring_76.minWindow2(str2, pattern2), is(equalTo(result2)));
    }
}