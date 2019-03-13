package com.pk.leetcode.recursion_dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class RangeSumQuery_Immutable_303Test {

    private int [] arr1 = {-2, 0, 3, -5, 2, -1};

    @Test
    public void sumRange() {
        RangeSumQuery_Immutable_303 instance = new RangeSumQuery_Immutable_303(arr1);
        assertEquals(1, instance.sumRange(0,2));
        assertEquals(-1, instance.sumRange(2,5));
        assertEquals(-3, instance.sumRange(0,5));
    }
}