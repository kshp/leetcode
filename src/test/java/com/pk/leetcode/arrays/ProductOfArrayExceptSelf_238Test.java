package com.pk.leetcode.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductOfArrayExceptSelf_238Test {

    private static int [] arr1 = {1,2,3,4};
    private static int [] result1 = {24,12,8,6};

    @Test
    public void productExceptSelfTest() {
        assertArrayEquals(ProductOfArrayExceptSelf_238.productExceptSelf(arr1), result1);
    }
}