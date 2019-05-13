package com.pk.leetcode;

import com.pk.leetcode.utils.ListNode;

public class _24_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if ((head == null)||(head.next == null))
            return head;
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }
}
