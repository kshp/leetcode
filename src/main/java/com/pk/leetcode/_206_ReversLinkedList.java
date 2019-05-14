package com.pk.leetcode;

import com.pk.leetcode.utils.ListNode;

public class _206_ReversLinkedList {

    public ListNode reverseListIterative(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }

        return newHead;
    }

    public ListNode reverseListRecursive(ListNode head) {
        return reverseListInt(head, null);
    }

    private ListNode reverseListInt(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseListInt(next, head);
    }
}
