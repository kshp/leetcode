package com.pk.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class _16_Sum_ClosestTest {

    private static int[] arr1 = {-1, 2, 1, -4};
    private static int target1 = 1;
    private static int result1 = 2;

    private static int[] arr2 = {3,1,5,-4,-7,8};
    private static int target2 = 2;
    private static int result2 = 2;

    private static int[] arr3 = {1,1,-1,-1,3};
    private static int target3 = -1;
    private static int result3 = -1;

    @Test
    public void threeSumClosest() {
        assertThat(_16_Sum_Closest.threeSumClosest(arr1, target1), is(equalTo(result1)));
        assertThat(_16_Sum_Closest.threeSumClosest(arr2, target2), is(equalTo(result2)));
        assertThat(_16_Sum_Closest.threeSumClosest(arr3, target3), is(equalTo(result3)));
    }
}