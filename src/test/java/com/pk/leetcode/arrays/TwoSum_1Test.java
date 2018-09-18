package com.pk.leetcode.arrays;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TwoSum_1Test {

    private static int[] arr1 = {2, 7, 11, 15};
    private static int target1 = 9;
    private static int[] result1 = {0, 1};

    private static int[] arr2 = {3, 2, 4};
    private static int target2 = 6;
    private static int[] result2 = {1, 2};

    @Test
    public void twoSum() {
        int[] r = TwoSum_1.twoSum(arr1, target1);
        assertThat(Arrays.equals(result1, r), is(true));

        int[] r2 = TwoSum_1.twoSum(arr2, target2);
        assertThat(Arrays.equals(result2, r2), is(true));
    }
}