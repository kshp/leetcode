package com.pk.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class _57_InsertInterval {

    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if (intervals==null || intervals.size()==0 && newInterval!=null)
            return Collections.singletonList(newInterval);

        if (newInterval==null)
            return intervals;

        List<Interval> result = new LinkedList<>();
        int i = 0;

        while (i < intervals.size() && intervals.get(i).end < newInterval.start)
            result.add(intervals.get(i++));

        int start = newInterval.start;
        int end = newInterval.end;
        while (i < intervals.size() && intervals.get(i).start <= end) {
            start = Math.min(start, intervals.get(i).start);
            end = Math.max(end, intervals.get(i).end);
            i++;
        }
        result.add(new Interval(start, end));

        while (i < intervals.size())
            result.add(intervals.get(i++));

        return result;
    }

    static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            _57_InsertInterval.Interval interval = (_57_InsertInterval.Interval) o;
            return start == interval.start &&
                    end == interval.end;
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, end);
        }
    }

}
