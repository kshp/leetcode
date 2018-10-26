package com.pk.leetcode.arrays.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class InsertInterval_57Test {

    private static List<InsertInterval_57.Interval> intervals1 = new LinkedList<>(Arrays.asList(
            new InsertInterval_57.Interval(1,3),
            new InsertInterval_57.Interval(6,9)
    ));
    private static InsertInterval_57.Interval interval1 = new InsertInterval_57.Interval(2,5);
    private static LinkedList<InsertInterval_57.Interval> result1 = new LinkedList<>(Arrays.asList(
            new InsertInterval_57.Interval(1,5),
            new InsertInterval_57.Interval(6,9)
    ));

    @Test
    public void insert() {
        assertThat(InsertInterval_57.insert(intervals1, interval1).equals(result1), is(true));
    }
}