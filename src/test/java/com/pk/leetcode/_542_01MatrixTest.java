package com.pk.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _542_01MatrixTest {
    private static final int[][] input1 = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
    };

    private static final int[][] result1 = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
    };

    private static final int[][] input2 = {
            {0, 0, 0},
            {0, 1, 0},
            {1, 1, 1}
    };

    private static final int[][] result2 = {
            {0, 0, 0},
            {0, 1, 0},
            {1, 2, 1}
    };


    @Test
    public void updateMatrixBFS() {
        _542_01Matrix instance = new _542_01Matrix();
        assertArrayEquals(result1, instance.updateMatrixBFS(input1));
        assertArrayEquals(result2, instance.updateMatrixBFS(input2));
    }
}