package com.pk.leetcode;

import com.pk.leetcode.BinaryTreePreOrderTraversal;
import com.pk.leetcode.utils.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class BinaryTreePreOrderTraversalTest {

    private TreeNode root1;
    private Integer[] result1 = {1, 2, 3};

    private TreeNode root2;
    private Integer[] result2 = {3, 9, 10, 20, 15, 7};

    private TreeNode root3;
    private Integer[] result3 = {3, 9, 10, 12, 20, 15, 7};


    @Before
    public void init() {
        root1 = new TreeNode(1);
        TreeNode right2 = new TreeNode(2);
        root1.right = right2;
        right2.left = new TreeNode(3);

        root2 = new TreeNode(3);
        root2.left = new TreeNode(9);
        root2.left.left = new TreeNode(10);
        root2.right = new TreeNode(20);
        root2.right.left = new TreeNode(15);
        root2.right.right = new TreeNode(7);

        root3 = new TreeNode(3);
        root3.left = new TreeNode(9);
        root3.left.left = new TreeNode(10);
        root3.left.right = new TreeNode(12);
        root3.right = new TreeNode(20);
        root3.right.left = new TreeNode(15);
        root3.right.right = new TreeNode(7);
    }

    @Test
    public void testPreOrderTraversal() {
        BinaryTreePreOrderTraversal instance = new BinaryTreePreOrderTraversal();
        List<Integer> integers1_1 = instance.preOrderTraversal(root1);
        List<Integer> integers1_2 = instance.preOrderTraverseIterative(root1);
        assertArrayEquals(result1, integers1_1.toArray());
        assertArrayEquals(result1, integers1_2.toArray());

        List<Integer> integers2_1 = instance.preOrderTraversal(root2);
        List<Integer> integers2_2 = instance.preOrderTraverseIterative(root2);
        assertArrayEquals(result2, integers2_1.toArray());
        assertArrayEquals(result2, integers2_2.toArray());

        List<Integer> integers3_1 = instance.preOrderTraversal(root3);
        List<Integer> integers3_2 = instance.preOrderTraverseIterative(root3);
        assertArrayEquals(result3, integers3_1.toArray());
        assertArrayEquals(result3, integers3_2.toArray());
    }

}