package com.pk.leetcode.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompareVersionNumbers_165Test {

    @Test
    public void compareVersionTest() {
        CompareVersionNumbers_165 instance = new CompareVersionNumbers_165();
        assertEquals(-1, instance.compareVersion("0.1","1.1"));
        assertEquals(0, instance.compareVersion("1.0","1"));
    }
}