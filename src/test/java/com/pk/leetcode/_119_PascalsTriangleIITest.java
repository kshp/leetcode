package com.pk.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class _119_PascalsTriangleIITest {

    @Test
    public void getRow() {
        _119_PascalsTriangleII instance = new _119_PascalsTriangleII();
        assertEquals(Arrays.asList(1,4,6,4,1), instance.getRow(4));
    }
}