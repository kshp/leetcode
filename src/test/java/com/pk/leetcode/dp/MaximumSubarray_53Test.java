package com.pk.leetcode.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSubarray_53Test {

    private int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    private int result1 = 6;

    @Test
    public void maxSubArray() {
        assertEquals(result1, new MaximumSubarray_53().maxSubArray(arr1));
    }
}