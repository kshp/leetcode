package com.pk.datastruct;

import com.pk.leetcode.trees.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class BinaryTreePreOrderTraversalTest {

    private TreeNode root1;
    private Integer[] result1 = {1, 2, 3};

    @Before
    public void init() {
        root1 = new TreeNode(1);
        TreeNode right2 = new TreeNode(2);
        root1.right = right2;
        right2.left = new TreeNode(3);
    }

    @Test
    public void testPreOrderTraversal() {
        BinaryTreePreOrderTraversal instance = new BinaryTreePreOrderTraversal();
        List<Integer> integers1 = instance.preOrderTraversal(root1);
        List<Integer> integers2 = instance.preOrderTraverseIterative(root1);
        assertArrayEquals(result1, integers1.toArray());
        assertArrayEquals(result1, integers2.toArray());
    }

}