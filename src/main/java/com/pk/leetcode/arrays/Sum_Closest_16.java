package com.pk.leetcode.arrays;

import java.util.Arrays;

public class Sum_Closest_16 {
    public static int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3)
            return target;
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE / 2;
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                closest = getClosest(target, sum, closest);
                if (closest == target)
                    return closest;
                else if (sum < target)
                    l++;
                else
                    r--;
            }
        }
        return closest;
    }

    private static int getClosest(int target, int sum, int closest) {
        if (Math.abs(target - sum) < Math.abs(target - closest))
            return sum;
        return closest;
    }
}
