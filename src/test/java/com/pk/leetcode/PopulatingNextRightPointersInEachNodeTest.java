package com.pk.leetcode;

import com.pk.leetcode.utils.Node;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PopulatingNextRightPointersInEachNodeTest {

    //        1
    //     2 -> 3
    //   4->5  6->7

    private Node node1;
    private Node result1;

    @Before
    public void init() {
        node1 = new Node(1);
        node1.left = new Node(2);
        node1.right = new Node(3);
        node1.left.left = new Node(4);
        node1.left.right = new Node(5);
        node1.right.left = new Node(6);
        node1.right.right = new Node(7);

        result1 = new Node(1);
        result1.left = new Node(2);
        result1.right = new Node(3);
        result1.left.next = result1.right;
        result1.left.left = new Node(4);
        result1.left.right = new Node(5);
        result1.left.left.next = result1.left.right;
        result1.right.left = new Node(6);
        result1.left.right.next = result1.right.left;
        result1.right.right = new Node(7);
        result1.right.left.next = result1.right.right;
    }

    @Test
    public void test() {
        PopulatingNextRightPointersInEachNode instance = new PopulatingNextRightPointersInEachNode();
        assertTrue(Node.equalTrees(result1, instance.connect(node1)));
    }


}