package com.pk.leetcode;

import com.pk.leetcode.utils.ListNode;

public class _2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode prev = head;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;

            prev.next = new ListNode((val1 + val2 + carry) % 10);
            prev = prev.next;

            carry = (val1 + val2 + carry) / 10;

            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
        }

        return head.next;
    }

}
