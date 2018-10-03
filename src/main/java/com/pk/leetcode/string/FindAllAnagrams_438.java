package com.pk.leetcode.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindAllAnagrams_438 {
    public static List<Integer> findAnagrams(String s, String p) {
        if (s == null || s.length() == 0 || p == null || p.length() == 0 || s.length() < p.length())
            return Collections.emptyList();

        int[] chars = new int[26];
        for (char c : p.toCharArray())
            chars[c - 'a']++;

        List<Integer> result = new ArrayList<>();

        int charsInAnagramCount = p.length();
        char temp;

        int start = 0, end = 0;

        for (end = 0; end < p.length(); end++) {
            temp = s.charAt(end);
            chars[temp - 'a']--;
            if (chars[temp - 'a'] >= 0) {
                charsInAnagramCount--;
            }
        }

        if (charsInAnagramCount == 0)
            result.add(0);

        while (end < s.length()) {

            temp = s.charAt(start);
            if (chars[temp - 'a'] >= 0)
                charsInAnagramCount++;

            chars[temp - 'a']++;

            start++;

            temp = s.charAt(end);
            chars[temp - 'a']--;

            if (chars[temp - 'a'] >= 0)
                charsInAnagramCount--;

            if (charsInAnagramCount == 0)
                result.add(start);

            end++;

        }

        return result;
    }
}
