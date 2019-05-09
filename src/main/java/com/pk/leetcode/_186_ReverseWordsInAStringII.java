package com.pk.leetcode;

public class _186_ReverseWordsInAStringII {

    public void reverseWords(Character[] str) {
        if (str.length == 0)
            return;

        reverse(0, str.length - 1, str);

        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                reverse(p1, p2, str);
                p1 = i + 1;
                p2 = i + 1;
            } else {
                p2 = i;
            }
        }
        reverse(p1, p2, str);
    }

    private void reverse(int p1, int p2, Character[] str) {
        while (p1 < p2) {
            swap(p1, p2, str);
            p1++;
            p2--;
        }
    }

    private void swap(int p1, int p2, Character[] s) {
        char t = s[p1];
        s[p1] = s[p2];
        s[p2] = t;
    }
}
