package com.pk.leetcode.arrays.heap_bucketsort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Bucket sort
public class SortCharactersByFrequency_451 {
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        List<Character>[] bucket = new ArrayList[s.length() + 1];
        for (char key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null)
                bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(key);
        }

        StringBuilder sb = new StringBuilder();
        for (int pos = bucket.length - 1; pos >= 0; pos--)
            if (bucket[pos] != null)
                for (char c : bucket[pos])
                    for (int i = 0; i < map.get(c); i++)
                        sb.append(c);

        return sb.toString();
    }

    public static String frequencySort4ms (String s) {
        int[] cnt = new int[256];
        char[] chs = s.toCharArray();
        for (char ch : chs) {
            cnt[ch]++;
        }
        int i = 0;
        while (i < chs.length) {
            int k = 0, j = 0;
            while (j < cnt.length) {
                if (cnt[j] > cnt[k]) { // j一路往前，k保存freq最大的位置(char)，如果j找到更大的，update j
                    k = j;
                }
                j++;
            }
            while (cnt[k] > 0) { //k即是char，cnt[k]是这个char的freq
                chs[i++] = (char)k; // 把k置换到charArr当前指针的位置
                cnt[k]--;
            }
        }

        return String.valueOf(chs);
    }
}
