package com.pk.leetcode;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _256_PaintHouseTest {

    private static int[][] houses1 = {{17, 2, 17}, {16, 16, 5}, {14, 3, 19}};
    private static int result1 = 10;

    @Test
    public void minCost() {
        _256_PaintHouse instance = new _256_PaintHouse();
        assertEquals(result1, instance.minCost(houses1));
    }
}