package com.pk.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _53_MaximumSubarrayTest {

    private int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    private int result1 = 6;

    @Test
    public void maxSubArray() {
        assertEquals(result1, new _53_MaximumSubarray().maxSubArray(arr1));
    }
}