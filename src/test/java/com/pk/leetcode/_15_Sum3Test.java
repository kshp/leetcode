package com.pk.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class _15_Sum3Test {

    private static int[] arr1 = {-1, 0, 1, 2, -1, -4};
    private static List<List<Integer>> expectedResult1;

    @Before
    public void init() {
        expectedResult1 = new ArrayList<>();
        expectedResult1.add(Arrays.asList(-1, -1, 2));
        expectedResult1.add(Arrays.asList(-1, 0, 1));
    }

    @Test
    public void threeSum() {
        assertThat(_15_Sum3.threeSum(arr1), is(equalTo(expectedResult1)));
    }
}