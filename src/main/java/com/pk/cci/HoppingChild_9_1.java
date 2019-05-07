package com.pk.cci;


//A child is running up a staircase with n steps, and can hop either 1 step, 2 steps, or
//3 steps at a time. Implement a method to count how many possible ways the child
//can run up the stairs.

import java.util.HashMap;
import java.util.Map;

public class HoppingChild_9_1 {

    public long countWays(int n) {
        return countWays(n, new HashMap<>());
    }

    private long countWays(long n, Map<Long, Long> map) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (map.get(n) != null)
            return map.get(n);
        long result = countWays(n - 1, map) + countWays(n - 2, map) + countWays(n - 3, map);
        map.put(n, result);
        return map.get(n);
    }

}
