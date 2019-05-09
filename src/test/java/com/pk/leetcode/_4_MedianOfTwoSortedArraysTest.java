package com.pk.leetcode;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class _4_MedianOfTwoSortedArraysTest {

    private static int[] nums1_1 = {1, 3};
    private static int[] nums2_1 = {2};
    private static double result1 = 2.0D;

    private static int[] nums1_2 = {1, 2};
    private static int[] nums2_2 = {3, 4};
    private static double result2 = 2.5D;

    private static int[] nums1_3 = {1, 4, 6, 8, 9};
    private static int[] nums2_3 = {-3, -2, 7, 15, 16, 17};
    private static double result3 = 7D;

    private static int[] nums1_4 = {1, 4, 6, 8, 9};
    private static int[] nums2_4 = {-3, -2, 7, 15, 16};
    private static double result4 = 6.5D;

    private static int[] nums1_5 = {3};
    private static int[] nums2_5 = {-2, -1};
    private static double result5 = -1D;

    private static int[] nums1_6 = {2, 2, 2};
    private static int[] nums2_6 = {2, 2, 2, 2};
    private static double result6 = 2D;

    private static int[] nums1_7 = {1};
    private static int[] nums2_7 = {2, 3, 4, 5};
    private static double result7 = 3D;


    @Test
    public void findMedianSortedArrays() {
        assertThat(_4_MedianOfTwoSortedArrays.findMedianSortedArrays(nums1_1, nums2_1), is(equalTo(result1)));
        assertThat(_4_MedianOfTwoSortedArrays.findMedianSortedArrays(nums1_2, nums2_2), is(equalTo(result2)));
        assertThat(_4_MedianOfTwoSortedArrays.findMedianSortedArrays(nums1_3, nums2_3), is(equalTo(result3)));
        assertThat(_4_MedianOfTwoSortedArrays.findMedianSortedArrays(nums1_4, nums2_4), is(equalTo(result4)));
        assertThat(_4_MedianOfTwoSortedArrays.findMedianSortedArrays(nums1_5, nums2_5), is(equalTo(result5)));
        assertThat(_4_MedianOfTwoSortedArrays.findMedianSortedArrays(nums1_6, nums2_6), is(equalTo(result6)));
        assertThat(_4_MedianOfTwoSortedArrays.findMedianSortedArrays(nums1_7, nums2_7), is(equalTo(result7)));
    }
}