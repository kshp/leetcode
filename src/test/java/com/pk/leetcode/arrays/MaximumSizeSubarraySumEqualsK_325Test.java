package com.pk.leetcode.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSizeSubarraySumEqualsK_325Test {

    private static int[] nums1 = {1, -1, 5, -2, 3};
    private static int k1 = 3;
    private static int[] nums2 = {-2, -1, 2, 1};
    private static int k2 = 1;


    @Test
    public void maxSubArrayLenTest() {
        MaximumSizeSubarraySumEqualsK_325 instance = new MaximumSizeSubarraySumEqualsK_325();
        assertEquals(4, instance.maxSubArrayLen(nums1, k1));
        assertEquals(2, instance.maxSubArrayLen(nums2, k2));
    }
}