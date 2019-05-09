package com.pk.leetcode;

public class _165_CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");

        int depth = Math.max(arr1.length, arr2.length);

        for (int i = 0; i < depth; i++){
            String tmp1 = (arr1.length<i+1)? "0" : arr1[i];
            String tmp2 = (arr2.length<i+1)? "0" : arr2[i];

            int result = Integer.valueOf(tmp1).compareTo(Integer.valueOf(tmp2));
            if (result!=0)
                return result;
        }
        return 0;
    }
}
