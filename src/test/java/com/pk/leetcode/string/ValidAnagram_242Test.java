package com.pk.leetcode.string;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ValidAnagram_242Test {

    private static String s1= "anagram";
    private static String t1= "nagaram";

    private static String s2= "car";
    private static String t2= "rat";

    @Test
    public void isAnagram() {
        assertThat (ValidAnagram_242.isAnagram(s1,t1), is(true));
        assertThat (ValidAnagram_242.isAnagram(s2,t2), is(false));
    }
}