package com.pk.leetcode.string;

public class FirstUniqueCharacterInAString_387 {
    public int firstUniqChar(String s) {
        int[] freqArr = new int[26];
        for (Character c : s.toCharArray()) {
            freqArr[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freqArr[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
}
