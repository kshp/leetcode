package com.pk.leetcode;

public class _344_ReverseString {
    public void reverseStringRecursively(Character[] s) {
        helper(0,s.length-1,s);
    }
    private void helper(int startIndex, int endIndex, Character[]s){
        if (startIndex>=endIndex)
            return;

        helper(startIndex+1, endIndex-1, s);

        char tmp = s[startIndex];
        s[startIndex] = s[endIndex];
        s[endIndex] = tmp;
    }


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
