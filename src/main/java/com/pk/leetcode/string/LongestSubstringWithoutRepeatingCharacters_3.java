package com.pk.leetcode.string;

public class LongestSubstringWithoutRepeatingCharacters_3 {
    public static int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, count = 0, maxCount = 0;
        int[] hash = new int[256];

        while (end < s.length()) {
            char c = s.charAt(end);
            hash[c]++;
            count++;

            while (start <= end && hash[c] > 1) {
                char temp = s.charAt(start);
                hash[temp]--;
                start++;
                count--;
            }

            if (count>maxCount)
                maxCount=count;
            end++;
        }
        return maxCount;
    }
}
