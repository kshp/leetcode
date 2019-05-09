package com.pk.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class _70_ClimbingStairsTest {

    private static int n1 = 2;
    private static int r1 = 2;
    private static int n2 = 3;
    private static int r2 = 3;
    private static int n3 = 5;
    private static int r3 = 8;

    @Test
    public void climbStairs() {
        _70_ClimbingStairs instance = new _70_ClimbingStairs();
        assertEquals(r1, instance.climbStairs(n1));
        assertEquals(r2, instance.climbStairs(n2));
        assertEquals(r3, instance.climbStairs(n3));
    }
}