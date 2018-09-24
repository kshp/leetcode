package com.pk.leetcode.arrays;

import java.util.Arrays;

public class MedianOfTwoSortedArrays_4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.sort(nums);

        boolean isOdd = nums.length % 2 != 0;
        if (isOdd)
            return nums[nums.length / 2];
        return (double) (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2;
    }
}
