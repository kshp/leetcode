package com.pk.leetcode.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairs_70Test {

    private static int n1 = 2;
    private static int r1 = 2;
    private static int n2 = 3;
    private static int r2 = 3;
    private static int n3 = 5;
    private static int r3 = 8;

    @Test
    public void climbStairs() {
        ClimbingStairs_70 instance = new ClimbingStairs_70();
        assertEquals(r1, instance.climbStairs(n1));
        assertEquals(r2, instance.climbStairs(n2));
        assertEquals(r3, instance.climbStairs(n3));
    }
}