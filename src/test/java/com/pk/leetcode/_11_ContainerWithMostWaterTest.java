package com.pk.leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class _11_ContainerWithMostWaterTest {

    private static int[] arr1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    private static int ans1 = 49;

    @Test
    public void maxArea() {
        assertThat(_11_ContainerWithMostWater.maxArea(arr1), is(equalTo(ans1)));
    }
}