package com.pk.leetcode;

public class _303_RangeSumQuery_Immutable {

    private int [] pre;

    public _303_RangeSumQuery_Immutable(int[] nums) {
        pre = new int[nums.length];
        if (nums.length==0)
            return;

        pre[0] = nums[0];
        for (int i=1; i< nums.length; i++)
            pre[i] = nums[i] + pre[i-1];
    }

    public int sumRange(int i, int j) {
        if (i==0)
            return pre[j];

        return pre[j] - pre[i-1];
    }
}
