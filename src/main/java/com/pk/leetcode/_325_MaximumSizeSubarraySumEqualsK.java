package com.pk.leetcode;

import java.util.HashMap;

public class _325_MaximumSizeSubarraySumEqualsK {

    public int maxSubArrayLen(int[] nums, int k) {
        int sum = 0, max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum == k) {
                max = i + 1;
            } else if (map.containsKey(sum - k)) {
                max = Math.max(max, i - map.get(sum - k));
            }
            if (!map.containsKey(sum))
                map.put(sum, i);
        }
        Integer.compare(1, 2);
        return max;
    }
}
