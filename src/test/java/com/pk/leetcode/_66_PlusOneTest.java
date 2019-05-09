package com.pk.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class _66_PlusOneTest {

    private static int[] arr1 = {1, 2, 3};
    private static int[] resultArr1 = {1, 2, 4};

    private static int[] arr2 = {4, 3, 2, 1};
    private static int[] resultArr2 = {4, 3, 2, 2};

    private static int[] arr3 = {0};
    private static int[] resultArr3 = {1};

    private static int[] arr4 = {9};
    private static int[] resultArr4 = {1, 0};

    private static int[] arr5 = {9, 9, 9};
    private static int[] resultArr5 = {1, 0, 0, 0};

    @Test
    public void plusOne() {
        assertThat(compareArrays(_66_PlusOne.plusOne(arr1), resultArr1), is(true));
        assertThat(compareArrays(_66_PlusOne.plusOne(arr2), resultArr2), is(true));
        assertThat(compareArrays(_66_PlusOne.plusOne(arr3), resultArr3), is(true));
        assertThat(compareArrays(_66_PlusOne.plusOne(arr4), resultArr4), is(true));
        assertThat(compareArrays(_66_PlusOne.plusOne(arr5), resultArr5), is(true));
    }

    private boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
}