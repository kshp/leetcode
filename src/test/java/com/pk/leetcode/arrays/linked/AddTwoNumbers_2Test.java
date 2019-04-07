package com.pk.leetcode.arrays.linked;

import com.pk.leetcode.utils.ListNode;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class AddTwoNumbers_2Test {

    private ListNode n11;
    private ListNode n12;
    private ListNode r1;

    private ListNode n21;
    private ListNode n22;
    private ListNode r2;

    @Before
    public void init() {
        n11 = new ListNode(2);
        n11.next = new ListNode(4);
        n11.next.next = new ListNode(3);

        n12 = new ListNode(5);
        n12.next = new ListNode(6);
        n12.next.next = new ListNode(4);

        r1 = new ListNode(7);
        r1.next = new ListNode(0);
        r1.next.next = new ListNode(8);

        n21 = new ListNode(9);

        n22 = new ListNode(9);
        n22.next = new ListNode(9);

        r2 = new ListNode(8);
        r2.next = new ListNode(0);
        r2.next.next = new ListNode(1);
    }

    @Test
    public void addTwoNumbers() {
        AddTwoNumbers_2 instance = new AddTwoNumbers_2();
        ListNode resultNode1 = instance.addTwoNumbers(n11, n12);
        assertTrue(ListNode.equalNodes(r1,resultNode1 ));

        ListNode resultNode2 = instance.addTwoNumbers(n21, n22);
        assertTrue(ListNode.equalNodes(r2,resultNode2 ));
    }
}