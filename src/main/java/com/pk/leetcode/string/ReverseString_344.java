package com.pk.leetcode.string;

public class ReverseString_344 {
    public void reverseString(Character[] s) {
        if (s.length==0)
            return;

        int p1 = 0;
        int p2 = s.length-1;
        while (p1<p2){
            swap(p1, p2, s);
            p1++;
            p2--;
        }
    }

    private void swap (int p1, int p2, Character[]s){
        char t = s[p1];
        s[p1] = s[p2];
        s[p2] = t;
    }
}
