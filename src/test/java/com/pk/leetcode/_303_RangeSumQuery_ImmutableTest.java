package com.pk.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class _303_RangeSumQuery_ImmutableTest {

    private int [] arr1 = {-2, 0, 3, -5, 2, -1};

    @Test
    public void sumRange() {
        _303_RangeSumQuery_Immutable instance = new _303_RangeSumQuery_Immutable(arr1);
        assertEquals(1, instance.sumRange(0,2));
        assertEquals(-1, instance.sumRange(2,5));
        assertEquals(-3, instance.sumRange(0,5));
    }
}