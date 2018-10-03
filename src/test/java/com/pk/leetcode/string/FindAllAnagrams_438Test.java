package com.pk.leetcode.string;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FindAllAnagrams_438Test {

    private static String str1 = "cbaebabacd";
    private static String pattern1 = "abc";
    private static List<Integer> result1 = Arrays.asList(0,6);

    @Test
    public void findAnagrams() {
        assertThat(FindAllAnagrams_438.findAnagrams(str1, pattern1), is(equalTo(result1)));
    }
}