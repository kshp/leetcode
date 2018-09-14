package com.pk.leetcode.arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RotateArray_189Test {

    private int[] arr1;
    private int k1 = 3;
    private int[] result1;

    private int[] arr2;
    private int k2;
    private int[] result2;

    @Before
    public void init() {
        arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        k1 = 3;
        result1 = new int[]{5, 6, 7, 1, 2, 3, 4};

        arr2 = new int[]{-1, -100, 3, 99};
        k2 = 2;
        result2 = new int[]{3, 99, -1, -100};
    }

    @Test
    public void rotate() {
        RotateArray_189.rotate(arr1, k1);
        assertThat(Arrays.equals(arr1, result1), is(true));

        RotateArray_189.rotate(arr2, k2);
        assertThat(Arrays.equals(arr2, result2), is(true));
    }

    @Test
    public void rotateCyclic() {
        RotateArray_189.rotateCyclic(arr1, k1);
        assertThat(Arrays.equals(arr1, result1), is(true));

        RotateArray_189.rotateCyclic(arr2, k2);
        assertThat(Arrays.equals(arr2, result2), is(true));
    }

    @Test
    public void rotateReverse() {
        RotateArray_189.rotateReverse(arr1, k1);
        assertThat(Arrays.equals(arr1, result1), is(true));

        RotateArray_189.rotateReverse(arr2, k2);
        assertThat(Arrays.equals(arr2, result2), is(true));
    }
}