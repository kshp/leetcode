package com.pk.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _494_TargetSumTest {

    private static int[] input1 = {1, 1, 1, 1, 1};
    private static int target1 = 3;
    private static int result1 = 5;

    @Test
    public void findTargetSumWays() {
        _494_TargetSum instance = new _494_TargetSum();
        assertEquals(result1, instance.findTargetSumWays(input1, target1));
    }
}