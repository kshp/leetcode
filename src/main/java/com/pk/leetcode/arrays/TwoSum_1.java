package com.pk.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public static int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1)
            return new int[2];

        Map<Integer, Integer> diffMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            diffMap.put(target - nums[i], i);

        for (int i = 0; i < nums.length; i++) {
            Integer diff = diffMap.get(nums[i]);
            if (diff != null && diff != i)
                return new int[]{i, diffMap.get(nums[i])};
        }

        return new int[2];
    }
}
