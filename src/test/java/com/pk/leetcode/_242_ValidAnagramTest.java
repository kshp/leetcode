package com.pk.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class _242_ValidAnagramTest {

    private static String s1= "anagram";
    private static String t1= "nagaram";

    private static String s2= "car";
    private static String t2= "rat";

    @Test
    public void isAnagram() {
        assertThat (_242_ValidAnagram.isAnagram(s1,t1), is(true));
        assertThat (_242_ValidAnagram.isAnagram(s2,t2), is(false));
    }
}