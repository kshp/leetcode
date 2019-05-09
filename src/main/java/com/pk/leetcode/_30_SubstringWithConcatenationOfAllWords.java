package com.pk.leetcode;

import java.util.*;

public class _30_SubstringWithConcatenationOfAllWords {

    public static List<Integer> findSubstring(String s, String[] words) {

        if (s == null || s.length() == 0 || words == null || words.length == 0) // Corner cases.
            return new LinkedList<>();
        int wordLen = words[0].length(), n = s.length(), maxWindowSize = words.length * wordLen;
        List<Integer> result = new LinkedList<>(); // Result list.
        Map<String, Integer> wordDict = new HashMap<>(); // key: word in words; value: frequency of a word.
        for (String word : words) {
            wordDict.put(word, wordDict.getOrDefault(word, 0) + 1);
        }
        Map<String, Integer> windowDict; // key: word in the current window; value: frequency of a word

        for (int round = 0; round < wordLen; round++) { // wordLen rounds could cover all possible starting indices if we check wordLen characters by wordLen characters.
            windowDict = new HashMap<>();
            for (int i = round, j = round; j + wordLen <= n; j += wordLen) {
                String word = s.substring(j, j + wordLen);
                if (wordDict.containsKey(word)) {
                    windowDict.put(word, windowDict.getOrDefault(word, 0) + 1);
                }
                if ((j - i + 1) > maxWindowSize) { // Current window is over-sized.
                    word = s.substring(i, i + wordLen);
                    if (wordDict.containsKey(word)) {
                        windowDict.put(word, windowDict.get(word) - 1);
                    }
                    i += wordLen;
                }
                if (wordDict.equals(windowDict))
                    result.add(i);
            }
        }

        return result;
    }

}
