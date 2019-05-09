package com.pk.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class _165_CompareVersionNumbersTest {

    @Test
    public void compareVersionTest() {
        _165_CompareVersionNumbers instance = new _165_CompareVersionNumbers();
        assertEquals(-1, instance.compareVersion("0.1","1.1"));
        assertEquals(0, instance.compareVersion("1.0","1"));
    }
}