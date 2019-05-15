package com.pk.leetcode;

import com.pk.leetcode.utils.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class _206_ReversLinkedListTest {

    private ListNode node;
    private ListNode result1;

    @Before
    public void init() {
        node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);

        result1 = new ListNode(4);
        result1.next = new ListNode(3);
        result1.next.next = new ListNode(2);
        result1.next.next.next = new ListNode(1);
    }

    @Test
    public void reverseListRecursive() {
        _206_ReversLinkedList instance = new _206_ReversLinkedList();
        ListNode listNode = instance.reverseListRecursive(node);
        assertTrue(ListNode.equalNodes(result1, listNode));
    }

    @Test
    public void reverseListRecursive2() {
        _206_ReversLinkedList instance = new _206_ReversLinkedList();
        ListNode listNode = instance.reverseListRecursive2(node);
        assertTrue(ListNode.equalNodes(result1, listNode));
    }

    @Test
    public void reverseListIterative() {
        _206_ReversLinkedList instance = new _206_ReversLinkedList();
        ListNode listNode = instance.reverseListIterative(node);
        assertTrue(ListNode.equalNodes(result1, listNode));
    }
}