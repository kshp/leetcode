package com.pk.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class _394_DecodeStringTest {

    @Test
    public void decodeString() {
        _394_DecodeString instance = new  _394_DecodeString();
        assertEquals("aaabcbc", instance.decodeString("3[a]2[bc]"));
    }
}