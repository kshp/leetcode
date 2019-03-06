package com.pk.leetcode.recursion;


//You are climbing a stair case. It takes n steps to reach to the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//Note: Given n will be a positive integer.

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs_70 {

    public int climbStairs(int n) {
        return countWays(n, new HashMap<Integer, Integer>());
    }

    private int countWays(int n, Map<Integer, Integer> map) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (map.get(n) != null)
            return map.get(n);
        int result = countWays(n - 1, map) + countWays(n - 2, map);
        map.put(n, result);
        return map.get(n);
    }

}
