package com.pk.leetcode.dp;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PaintHouse_256Test {

    private static int[][] houses1 = {{17, 2, 17}, {16, 16, 5}, {14, 3, 19}};
    private static int result1 = 10;

    @Test
    public void minCost() {
        PaintHouse_256 instance = new PaintHouse_256();
        assertEquals(result1, instance.minCost(houses1));
    }
}