package com.pk.leetcode;

import com.pk.leetcode.utils.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class _24_SwapNodesInPairsTest {

    private static final ListNode listNode;
    private static final ListNode swapedNode;
    static {
        listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);

      swapedNode = new ListNode(2);
      swapedNode.next = new ListNode(1);
      swapedNode.next.next = new ListNode(4);
      swapedNode.next.next.next = new ListNode(3);
    }

    @Test
    public void swapPairs() {
        _24_SwapNodesInPairs instance = new _24_SwapNodesInPairs();
        assertTrue(ListNode.equalNodes(swapedNode, instance.swapPairs(listNode)));
    }
}