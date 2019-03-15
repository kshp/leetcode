package com.pk.leetcode.dp;

public class MaximumSubarray_53 {

    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = curr > 0 ? curr + nums[i] : nums[i];
            max = Math.max(curr, max);
        }
        return max;
    }
}
