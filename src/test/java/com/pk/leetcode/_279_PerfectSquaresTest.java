package com.pk.leetcode;

import com.pk.leetcode._279_PerfectSquares;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _279_PerfectSquaresTest {

    @Test
    public void numSquares() {
        _279_PerfectSquares instance = new _279_PerfectSquares();
        assertEquals(3, instance.numSquares(12));
    }
}