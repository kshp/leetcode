package com.pk.leetcode;

import java.util.*;

public class _56_MergeIntervals {

    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0)
            return Collections.emptyList();

        intervals.sort(Comparator.comparingInt(a -> a.start));
        LinkedList<Interval> merged = new LinkedList<>();
        merged.add(intervals.get(0));

        for (Interval interval : intervals) {
            if (merged.getLast().end >= interval.start && merged.getLast().end <= interval.end)
                merged.getLast().end = interval.end;
            else if (merged.getLast().end < interval.end)
                merged.add(interval);
        }

        return merged;
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
            Interval interval = (Interval) o;
            return start == interval.start &&
                    end == interval.end;
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, end);
        }
    }
}
