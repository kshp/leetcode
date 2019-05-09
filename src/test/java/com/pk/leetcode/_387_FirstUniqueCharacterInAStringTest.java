package com.pk.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class _387_FirstUniqueCharacterInAStringTest {

    private static String s1 = "leetcode";
    private static String s2= "loveleetcode";
    @Test
    public void firstUniqChar() {
        _387_FirstUniqueCharacterInAString instance = new _387_FirstUniqueCharacterInAString();
        assertEquals("Should be 0", 0, instance.firstUniqChar(s1));
        assertEquals("Should be 2", 2, instance.firstUniqChar(s2));
    }
}