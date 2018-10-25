package com.pk.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays_349 {
    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (Integer i : nums1)
            set1.add(i);

        for (Integer i : nums2)
            set2.add(i);

        List<Integer> result = new ArrayList<>();
        if (nums1.length <=nums2.length){
            for (Integer i : set1)
                if (set2.contains(i))
                    result.add(i);
        }else{
            for (Integer i : set2)
                if (set1.contains(i))
                    result.add(i);
        }


        int[] arr = new int[result.size()];

        for(int i = 0; i < result.size(); i++)
            arr[i] = result.get(i);

        return arr;
    }
}
