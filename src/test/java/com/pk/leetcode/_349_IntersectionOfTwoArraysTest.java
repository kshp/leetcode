package com.pk.leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class _349_IntersectionOfTwoArraysTest {

    private static int[] nums1 = {1, 2, 2, 1};
    private static int[] nums2 = {2, 2};
    private static int[] result1 = {2};

    @Test
    public void intersection() {
        assertThat(_349_IntersectionOfTwoArrays.intersection(nums1, nums2), is(equalTo(result1)));
    }
}