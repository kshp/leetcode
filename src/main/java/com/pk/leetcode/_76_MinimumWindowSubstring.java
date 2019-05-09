package com.pk.leetcode;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _76_MinimumWindowSubstring {

    static final int NO_OF_CHARS = 256;

    public static String myMinWindow(String s, String p) {

        int[] sHash = new int[NO_OF_CHARS];
        int[] pHash = new int[NO_OF_CHARS];

        for (int i = 0; i < p.length(); i++)
            pHash[p.charAt(i)]++;

        int left = 0;
        int currentWinLen = 0;
        int expectedWinLen = p.length();

        int startIndex = -1;
        int minWindowLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            sHash[c]++;

            if (pHash[c] > 0 && sHash[c] <= pHash[c])
                currentWinLen++;

            if (currentWinLen == expectedWinLen) {
                while (sHash[s.charAt(left)] > pHash[s.charAt(left)] || pHash[s.charAt(left)] == 0) {
                    if (sHash[s.charAt(left)] > pHash[s.charAt(left)])
                        sHash[s.charAt(left)]--;
                    left++;
                }

                int tmpWinLen = right - left + 1;
                if (minWindowLen > tmpWinLen) {
                    minWindowLen = tmpWinLen;
                    startIndex = left;
                }
            }
        }

        if (startIndex == -1)
            return "";

        return s.substring(startIndex, startIndex + minWindowLen);
    }

    public static String minWindow(String s, String pattern) {
        int strLength = s.length();
        int patternLength = pattern.length();

        // check if string's length is less than pattern's
        // length. If yes then no such window can exist
        if (strLength < patternLength) {
            System.out.println("No such window exists");
            return "";
        }

        int hash_pat[] = new int[NO_OF_CHARS];
        int hash_str[] = new int[NO_OF_CHARS];

        // store occurrence ofs characters of pattern
        for (int i = 0; i < patternLength; i++)
            hash_pat[pattern.charAt(i)]++;

        int start = 0, start_index = -1;
        int minLen = Integer.MAX_VALUE;

        // start traversing the string
        int count = 0;  // count of characters
        for (int j = 0; j < strLength; j++) {
            // count occurrence of characters of string
            hash_str[s.charAt(j)]++;

            // If string's char matches with pattern's char
            // then increment count
            if (hash_pat[s.charAt(j)] != 0 &&
                    hash_str[s.charAt(j)] <= hash_pat[s.charAt(j)])
                count++;

            // if all the characters are matched
            if (count == patternLength) {
                // Try to minimize the window i.e., check if
                // any character is occurring more no. of times
                // than its occurrence  in pattern, if yes
                // then remove it from starting and also remove
                // the useless characters.
                while (hash_str[s.charAt(start)] > hash_pat[s.charAt(start)]
                        || hash_pat[s.charAt(start)] == 0) {

                    if (hash_str[s.charAt(start)] > hash_pat[s.charAt(start)])
                        hash_str[s.charAt(start)]--;
                    start++;
                }

                // update window size
                int lenWindow = j - start + 1;
                if (minLen > lenWindow) {
                    minLen = lenWindow;
                    start_index = start;
                }
            }
        }

        // If no window found
        if (start_index == -1) {
            System.out.println("No such window exists");
            return "";
        }

        // Return substring starting from start_index
        // and length minLen
        return s.substring(start_index, start_index + minLen);
    }


    public static String minWindow2(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        Map<Character, Integer> dictT = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            int count = dictT.getOrDefault(t.charAt(i), 0);
            dictT.put(t.charAt(i), count + 1);
        }

        int required = dictT.size();

        // Filter all the characters from s into a new list along with their index.
        // The filtering criteria is that the character should be present in t.
        List<Pair<Integer, Character>> filteredS = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (dictT.containsKey(c)) {
                filteredS.add(new Pair<>(i, c));
            }
        }

        int l = 0, r = 0, formed = 0;
        Map<Character, Integer> windowCounts = new HashMap<>();
        int[] ans = {-1, 0, 0};

        // Look for the characters only in the filtered list instead of entire s.
        // This helps to reduce our search.
        // Hence, we follow the sliding window approach on as small list.
        while (r < filteredS.size()) {
            char c = filteredS.get(r).getValue();
            int count = windowCounts.getOrDefault(c, 0);
            windowCounts.put(c, count + 1);

            if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
                formed++;
            }

            // Try and contract the window till the point where it ceases to be 'desirable'.
            while (l <= r && formed == required) {
                c = filteredS.get(l).getValue();

                // Save the smallest window until now.
                int end = filteredS.get(r).getKey();
                int start = filteredS.get(l).getKey();
                if (ans[0] == -1 || end - start + 1 < ans[0]) {
                    ans[0] = end - start + 1;
                    ans[1] = start;
                    ans[2] = end;
                }

                windowCounts.put(c, windowCounts.get(c) - 1);
                if (dictT.containsKey(c) && windowCounts.get(c) < dictT.get(c)) {
                    formed--;
                }
                l++;
            }
            r++;
        }
        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}
