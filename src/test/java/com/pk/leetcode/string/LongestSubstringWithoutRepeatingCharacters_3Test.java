package com.pk.leetcode.string;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LongestSubstringWithoutRepeatingCharacters_3Test {

    private static String str1 = "abcabcbb";
    private static int result1 = 3;

    private static String str2 = "bbbbb";
    private static int result2 = 1;

    private static String str3 = "pwwkew";
    private static int result3 = 3;

    private static String str4 = " ";
    private static int result4 = 1;

    @Test
    public void lengthOfLongestSubstring() {
        assertThat(LongestSubstringWithoutRepeatingCharacters_3.lengthOfLongestSubstring(str1), is(equalTo(result1)));
        assertThat(LongestSubstringWithoutRepeatingCharacters_3.lengthOfLongestSubstring(str2), is(equalTo(result2)));
        assertThat(LongestSubstringWithoutRepeatingCharacters_3.lengthOfLongestSubstring(str3), is(equalTo(result3)));
        assertThat(LongestSubstringWithoutRepeatingCharacters_3.lengthOfLongestSubstring(str4), is(equalTo(result4)));
    }
}