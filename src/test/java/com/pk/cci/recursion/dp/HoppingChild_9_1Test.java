package com.pk.cci.recursion.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class HoppingChild_9_1Test {

    private static int n1 = 2;
    private static int r1 = 2;
    private static int n2 = 3;
    private static int r2 = 4;
    private static int n3 = 5;
    private static int r3 = 13;

    @Test
    public void countWays() {
        HoppingChild_9_1 instance = new HoppingChild_9_1();
        assertEquals(r1, instance.countWays(n1));
        assertEquals(r2, instance.countWays(n2));
        assertEquals(r3, instance.countWays(n3));
    }
}