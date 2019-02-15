package com.pk.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstUniqueCharacterInAString_387Test {

    private static String s1 = "leetcode";
    private static String s2= "loveleetcode";
    @Test
    public void firstUniqChar() {
        FirstUniqueCharacterInAString_387 instance = new FirstUniqueCharacterInAString_387();
        assertEquals("Should be 0", 0, instance.firstUniqChar(s1));
        assertEquals("Should be 2", 2, instance.firstUniqChar(s2));
    }
}