package com.pk.leetcode.string;;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class DecodeStringTest {

    private static String s1 = "3[a]2[bc]";
    private static String r1 = "aaabcbc";

    private static String s2 = "3[a2[c]]";
    private static String r2 = "accaccacc";

    private static String s3 = "2[abc]3[cd]ef";
    private static String r3 = "abcabccdcdcdef";

    @Test
    public void decodeString() {
        DecodeString_384 instance = new DecodeString_384();

        assertTrue(r1.equals(instance.decodeString(s1)));
        assertTrue(r2.equals(instance.decodeString(s2)));
        assertTrue(r3.equals(instance.decodeString(s3)));
    }
}