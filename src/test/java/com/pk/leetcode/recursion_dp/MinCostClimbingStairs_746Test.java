package com.pk.leetcode.recursion_dp;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MinCostClimbingStairs_746Test {

    private static int[] arr1 = {10, 15, 20};
    private static int result1= 15;

    private static int[] arr2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
    private static int result2= 6;

    @Test
    public void minCostClimbingStairs() {
        MinCostClimbingStairs_746 instance = new MinCostClimbingStairs_746();
        assertEquals(result1, instance.minCostClimbingStairs(arr1));
        assertEquals(result2, instance.minCostClimbingStairs(arr2));
    }
}