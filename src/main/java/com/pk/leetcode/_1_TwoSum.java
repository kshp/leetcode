package com.pk.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1)
            return new int[2];

        Map<Integer, Integer> diffMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (diffMap.get(nums[i]) != null && i != diffMap.get(nums[i]))
                return new int[]{diffMap.get(nums[i]), i};
            diffMap.put(complement, i);
        }

        return new int[2];
    }
}
