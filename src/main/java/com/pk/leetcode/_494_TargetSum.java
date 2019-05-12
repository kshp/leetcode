package com.pk.leetcode;

import java.util.Map;

public class _494_TargetSum {

    int result = 0;

    public int findTargetSumWays(int[] nums, int s) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
//        return helper(nums, 0, 0, s, new HashMap<>());
        helper(nums, s, 0, 0);
        return result;
    }

    private int helper(int[] nums, int index, int sum, int s, Map<String, Integer> map) {
        String encodeString = index + "->" + sum;
        if (map.containsKey(encodeString)) {
            return map.get(encodeString);
        }
        if (index == nums.length) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int curNum = nums[index];
        int add = helper(nums, index + 1, sum - curNum, s, map);
        int minus = helper(nums, index + 1, sum + curNum, s, map);
        map.put(encodeString, add + minus);
        return add + minus;
    }

    private void helper(int[] nums, int target, int pos, long eval) {
        if (pos == nums.length) {
            if (target == eval) result++;
            return;
        }
        helper(nums, target, pos + 1, eval + nums[pos]);
        helper(nums, target, pos + 1, eval - nums[pos]);
    }
}
