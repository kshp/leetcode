package com.pk.datastruct;

import org.junit.Test;

import static org.junit.Assert.*;

public class _739_DailyTemperaturesTest {

    private static final int [] input1 = {73, 74, 75, 71, 69, 72, 76, 73};
    private static final int [] result1 = {1, 1, 4, 2, 1, 1, 0, 0};

    @Test
    public void dailyTemperatures() {
        _739_DailyTemperatures instance = new _739_DailyTemperatures();
        assertArrayEquals(result1, instance.dailyTemperatures(input1));
    }
}