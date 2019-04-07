package com.pk.datastruct;

import com.pk.leetcode.utils.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class BinaryTreeInOrderTraversalTest {

    private TreeNode root1;
    private Integer[] result1 = {1, 3, 2};

    private TreeNode root2;
    private Integer[] result2 = {2, 1, 3, 2};

    private TreeNode root3;
    private Integer[] result3 = {10, 9, 3, 15, 20, 7};

    private TreeNode root4;
    private Integer[] result4 = {10, 9, 12, 3, 15, 20, 7};

    @Before
    public void init() {
        root1 = new TreeNode(1);
        TreeNode right2 = new TreeNode(2);
        root1.right = right2;
        right2.left = new TreeNode(3);

        root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.right.left = new TreeNode(3);

        root3 = new TreeNode(3);
        root3.left = new TreeNode(9);
        root3.left.left = new TreeNode(10);
        root3.right = new TreeNode(20);
        root3.right.left = new TreeNode(15);
        root3.right.right = new TreeNode(7);

        root4 = new TreeNode(3);
        root4.left = new TreeNode(9);
        root4.left.left = new TreeNode(10);
        root4.left.right = new TreeNode(12);
        root4.right = new TreeNode(20);
        root4.right.left = new TreeNode(15);
        root4.right.right = new TreeNode(7);
    }

    @Test
    public void testPreOrderTraversal() {
        BinaryTreeInOrderTraversal instance = new BinaryTreeInOrderTraversal();
        List<Integer> integers1_1 = instance.inOrderTraversalRecursive(root1);
        List<Integer> integers1_2 = instance.inOrderTraversalIterative(root1);
        assertArrayEquals(result1, integers1_1.toArray());
        assertArrayEquals(result1, integers1_2.toArray());

        List<Integer> integers2_1 = instance.inOrderTraversalRecursive(root2);
        List<Integer> integers2_2 = instance.inOrderTraversalIterative(root2);
        assertArrayEquals(result2, integers2_1.toArray());
        assertArrayEquals(result2, integers2_2.toArray());

        List<Integer> integers3_1 = instance.inOrderTraversalRecursive(root3);
        List<Integer> integers3_2 = instance.inOrderTraversalIterative(root3);
        assertArrayEquals(result3, integers3_1.toArray());
        assertArrayEquals(result3, integers3_2.toArray());

        List<Integer> integers4_1 = instance.inOrderTraversalRecursive(root4);
        List<Integer> integers4_2 = instance.inOrderTraversalIterative(root4);
        assertArrayEquals(result4, integers4_1.toArray());
        assertArrayEquals(result4, integers4_2.toArray());
    }

}