package com.pk.leetcode.recursion_dp;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HouseRobber_196Test {

    private static int[] arr1 = {1, 2, 3, 1};
    private static int result1 = 4;

    private static int[] arr2 = {2, 7, 9, 3, 1};
    private static int result2 = 12;

    private static int[] arr3 = {1, 100, 2, 3, 1000};
    private static int result3 = 1100;

    private static int[] arr4 = {2, 1, 1, 2};
    private static int result4 = 4;

    @Test
    public void rob() {
        HouseRobber_196 instance = new HouseRobber_196();
        assertEquals(result1, instance.rob(arr1));
        assertEquals(result2, instance.rob(arr2));
        assertEquals(result3, instance.rob(arr3));
        assertEquals(result4, instance.rob(arr4));
    }
}