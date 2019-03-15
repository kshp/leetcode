package com.pk.datastruct;

import java.util.ArrayDeque;

public class MovingAverage {

    private ArrayDeque<Integer> q;
    private Integer sum;
    private int size;

    /**
     * Initialize your data structure here.
     */
    public MovingAverage(int size) {
        this.q = new ArrayDeque<>(size);
        this.sum = 0;
        this.size = size;
    }

    public double next(int val) {
        if (q.size() == size) {
            Integer head = q.pollFirst();
            if (head != null)
                sum -= head;
        }
        q.add(val);
        sum += val;
        Double avg = (double)sum / q.size();
        System.out.println(avg);
        return avg;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
