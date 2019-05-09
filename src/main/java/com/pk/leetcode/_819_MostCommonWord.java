package com.pk.leetcode;

import java.util.*;

public class _819_MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        if (paragraph == null || paragraph.length() == 0)
            return "";

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        Map<String, Integer> freqMap = new HashMap<>();
        String[] split = paragraph.toLowerCase().split("[\\p{Punct}\\s]+");

        int maxFreq = 0;
        String mostFreqWord = "";

        for (String word : split) {
            String normalizedWord = word.replaceAll("[^a-z]", "");
            if (!bannedSet.contains(normalizedWord))
                freqMap.compute(normalizedWord, (k, v) -> v == null ? 1 : v + 1);
            int currFreq = freqMap.getOrDefault(normalizedWord, 0);
            if (currFreq > maxFreq) {
                maxFreq = currFreq;
                mostFreqWord = normalizedWord;
            }
        }

        return mostFreqWord;
    }

    public static String mostCommonWordTrie(String paragraph, String[] banned) {
        Trie root = new Trie();
        Trie node;

        // insert banned words into Trie
        for (String s : banned) {
            node = root;

            for (char c : s.toCharArray()) {
                int idx = c - 'a';
                if (node.next[idx] == null) node.next[idx] = new Trie();
                node = node.next[idx];
            }

            node.ban = true; // set as banned
        }

        String res = "";
        int maxCount = 0;
        String par = paragraph.toLowerCase();
        char[] ch = par.toCharArray();
        int len = ch.length;

        // insert every char of paragraph one by one
        for (int i = 0, j = 0; i < len; i = ++j) { // i: start, j: end. i only increase with j. ++j: skip char that isn't letter
            node = root;

            // after while loop, ch[j] is not a letter (or end of ch)
            while (j < len && ch[j] >= 'a' && ch[j] <= 'z') {
                int idx = ch[j] - 'a';
                if (node.next[idx] == null) node.next[idx] = new Trie();
                node = node.next[idx];
                j++;
            }

            if (j > i && !node.ban) {
                if (++node.count > maxCount) { // ++node.count: increase count
                    res = par.substring(i, j);
                    maxCount = node.count;
                }
            }
        }

        return res;
    }


    static class Trie {
        private Trie[] next;
        private int count;
        private boolean ban;

        public Trie() {
            next = new Trie[26];
        }
    }

}
