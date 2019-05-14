package com.pk.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _119_PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if(rowIndex < 0) return list;
        list.add(1);
        for(int i = 1;i<= rowIndex;i++){
            list.add(1);                                //O(1) if add to the end
            for(int j = list.size()-2;j>=1;j--){        //update from last to 2nd
                list.set(j,list.get(j)+list.get(j-1));
            }
        }
        return list;
    }
}
