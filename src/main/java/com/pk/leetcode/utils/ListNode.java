package com.pk.leetcode.utils;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static boolean equalNodes(ListNode l1, ListNode l2) {
        if (l1 == l2) {
            return true;
        }
        if (l1 == null || l2 == null) {
            return false;
        }
        return l1.val == l2.val &&
                equalNodes(l1.next, l2.next);
    }
}
