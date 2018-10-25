package com.pk.leetcode.arrays.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MergeIntervals_56Test {

    private static List<MergeIntervals_56.Interval> intervals1 = new ArrayList<>(Arrays.asList(
            new MergeIntervals_56.Interval(1,2),
            new MergeIntervals_56.Interval(2,3)
    ));
    private static List<MergeIntervals_56.Interval> result1 = new LinkedList<>(Arrays.asList(
            new MergeIntervals_56.Interval(1,3)
    ));


    private static List<MergeIntervals_56.Interval> intervals2 = new ArrayList<>(Arrays.asList(
            new MergeIntervals_56.Interval(1,3),
            new MergeIntervals_56.Interval(2,6),
            new MergeIntervals_56.Interval(8,10),
            new MergeIntervals_56.Interval(15,18)
    ));
    private static List<MergeIntervals_56.Interval> result2 = new LinkedList<>(Arrays.asList(
            new MergeIntervals_56.Interval(1,6),
            new MergeIntervals_56.Interval(8,10),
            new MergeIntervals_56.Interval(15,18)
    ));

    private static List<MergeIntervals_56.Interval> intervals3 = new ArrayList<>(Arrays.asList(
            new MergeIntervals_56.Interval(1,4),
            new MergeIntervals_56.Interval(0,4)
    ));
    private static List<MergeIntervals_56.Interval> result3 = new LinkedList<>(Arrays.asList(
            new MergeIntervals_56.Interval(0,4)
    ));


    private static List<MergeIntervals_56.Interval> intervals4 = new ArrayList<>(Arrays.asList(
            new MergeIntervals_56.Interval(1,4),
            new MergeIntervals_56.Interval(2,3)
    ));
    private static List<MergeIntervals_56.Interval> result4 = new LinkedList<>(Arrays.asList(
            new MergeIntervals_56.Interval(1,4)
    ));

    @Test
    public void merge() {
        assertThat(MergeIntervals_56.merge(intervals1).equals(result1), is(true));
        assertThat(MergeIntervals_56.merge(intervals2).equals(result2), is(true));
        assertThat(MergeIntervals_56.merge(intervals3).equals(result3), is(true));
        assertThat(MergeIntervals_56.merge(intervals4).equals(result4), is(true));
    }
}