package com.pk.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class _238_ProductOfArrayExceptSelfTest {

    private static int [] arr1 = {1,2,3,4};
    private static int [] result1 = {24,12,8,6};

    @Test
    public void productExceptSelfTest() {
        assertArrayEquals(_238_ProductOfArrayExceptSelf.productExceptSelf(arr1), result1);
    }
}