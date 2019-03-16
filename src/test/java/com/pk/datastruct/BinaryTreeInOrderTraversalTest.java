package com.pk.datastruct;

import com.pk.leetcode.trees.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeInOrderTraversalTest {

    private TreeNode root1;
    private Integer[] result1 = {1, 3, 2};

    private TreeNode root2;
    private Integer[] result2 = {2, 1, 3, 2};

    @Before
    public void init() {
        root1 = new TreeNode(1);
        TreeNode right2 = new TreeNode(2);
        root1.right = right2;
        right2.left = new TreeNode(3);

        root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.right.left= new TreeNode(3);
    }

    @Test
    public void testPreOrderTraversal() {
        BinaryTreeInOrderTraversal instance = new  BinaryTreeInOrderTraversal();
        List<Integer> integers1_1 = instance.inOrderTraversalRecursive(root1);
        List<Integer> integers1_2 = instance.inOrderTraversalIterative(root1);
        assertArrayEquals(result1, integers1_1.toArray());
        assertArrayEquals(result1, integers1_2.toArray());

        List<Integer> integers2_1 = instance.inOrderTraversalRecursive(root2);
        List<Integer> integers2_2 = instance.inOrderTraversalIterative(root2);
        assertArrayEquals(result2, integers2_1.toArray());
        assertArrayEquals(result2, integers2_2.toArray());
    }

}