package com.pk.leetcode.string;

public class ValidAnagram_242 {
    public static boolean isAnagram(String s, String t) {
        if (s==null || t ==null || s.length() != t.length())
            return false;

        int [] sHash = new int[26];
        for (char c : s.toCharArray())
            sHash[c-'a']++;

        int [] tHash = new int[26];
        for (char c: t.toCharArray())
            tHash[c-'a']++;

        for (char c: s.toCharArray())
            if (sHash[c-'a']!=tHash[c-'a'])
                return false;

        return true;
    }
}
