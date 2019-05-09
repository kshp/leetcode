package com.pk.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class _56_MergeIntervalsTest {

    private static List<_56_MergeIntervals.Interval> intervals1 = new ArrayList<>(Arrays.asList(
            new _56_MergeIntervals.Interval(1,2),
            new _56_MergeIntervals.Interval(2,3)
    ));
    private static List<_56_MergeIntervals.Interval> result1 = new LinkedList<>(Arrays.asList(
            new _56_MergeIntervals.Interval(1,3)
    ));


    private static List<_56_MergeIntervals.Interval> intervals2 = new ArrayList<>(Arrays.asList(
            new _56_MergeIntervals.Interval(1,3),
            new _56_MergeIntervals.Interval(2,6),
            new _56_MergeIntervals.Interval(8,10),
            new _56_MergeIntervals.Interval(15,18)
    ));
    private static List<_56_MergeIntervals.Interval> result2 = new LinkedList<>(Arrays.asList(
            new _56_MergeIntervals.Interval(1,6),
            new _56_MergeIntervals.Interval(8,10),
            new _56_MergeIntervals.Interval(15,18)
    ));

    private static List<_56_MergeIntervals.Interval> intervals3 = new ArrayList<>(Arrays.asList(
            new _56_MergeIntervals.Interval(1,4),
            new _56_MergeIntervals.Interval(0,4)
    ));
    private static List<_56_MergeIntervals.Interval> result3 = new LinkedList<>(Arrays.asList(
            new _56_MergeIntervals.Interval(0,4)
    ));


    private static List<_56_MergeIntervals.Interval> intervals4 = new ArrayList<>(Arrays.asList(
            new _56_MergeIntervals.Interval(1,4),
            new _56_MergeIntervals.Interval(2,3)
    ));
    private static List<_56_MergeIntervals.Interval> result4 = new LinkedList<>(Arrays.asList(
            new _56_MergeIntervals.Interval(1,4)
    ));

    @Test
    public void merge() {
        assertThat(_56_MergeIntervals.merge(intervals1).equals(result1), is(true));
        assertThat(_56_MergeIntervals.merge(intervals2).equals(result2), is(true));
        assertThat(_56_MergeIntervals.merge(intervals3).equals(result3), is(true));
        assertThat(_56_MergeIntervals.merge(intervals4).equals(result4), is(true));
    }
}