package com.pk.datastruct;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovingAverageTest {

    @Test
    public void testMovingAverage() {
        MovingAverage instance = new MovingAverage(3);

        assertEquals(0, Double.compare(1, instance.next(1)));
        assertEquals(0, Double.compare(5.5, instance.next(10)));
        assertEquals(0, Double.compare(4.666666666666667, instance.next(3)));
        assertEquals(0, Double.compare(6, instance.next(5)));
    }

}