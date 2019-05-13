package com.pk.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        // initialize the edge
        for (int i = 0; i< numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            for (int j= 0; j <= i; j++) {
                row.add(1);
            }
            result.add(row);
        }

        helper(numRows, result);
        return result;
    }

    private void helper(int numRows, List<List<Integer>> result) {
        if (numRows == 0) return;
        helper(numRows - 1, result);
        for (int j = 1; j < numRows - 1; j++) {
            int value = result.get(numRows - 2).get(j-1) + result.get(numRows - 2).get(j);
            result.get(numRows -1).set(j, value);
        }
    }
}
