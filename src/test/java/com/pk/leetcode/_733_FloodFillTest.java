package com.pk.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class _733_FloodFillTest {

    private static final int[][] input1 = {
            {1,1,1},
            {1,1,0},
            {1,0,1}
    };

    private static final int[][] result1 = {
            {2,2,2},
            {2,2,0},
            {2,0,1}
    };

    @Test
    public void floodFill() {
        _733_FloodFill instance = new _733_FloodFill();
        assertArrayEquals(result1, instance.floodFill(input1, 1, 1, 2));
    }
}