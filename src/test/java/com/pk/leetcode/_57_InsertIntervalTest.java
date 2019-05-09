package com.pk.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class _57_InsertIntervalTest {

    private static List<_57_InsertInterval.Interval> intervals1 = new LinkedList<>(Arrays.asList(
            new _57_InsertInterval.Interval(1,3),
            new _57_InsertInterval.Interval(6,9)
    ));
    private static _57_InsertInterval.Interval interval1 = new _57_InsertInterval.Interval(2,5);
    private static LinkedList<_57_InsertInterval.Interval> result1 = new LinkedList<>(Arrays.asList(
            new _57_InsertInterval.Interval(1,5),
            new _57_InsertInterval.Interval(6,9)
    ));

    @Test
    public void insert() {
        assertThat(_57_InsertInterval.insert(intervals1, interval1).equals(result1), is(true));
    }
}