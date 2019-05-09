package com.pk.leetcode;

import com.pk.leetcode.BinaryTreeLevelOrderTraversal;
import com.pk.leetcode.utils.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class BinaryTreeLevelOrderTraversalTest {

    private TreeNode root1;
    private Integer[][] result1 = {{3}, {9, 20}, {15, 17}};

    private TreeNode root2;
    private Integer[][] result2 = {{3}, {9, 20}, {2, 15, 17}};

    @Before
    public void init() {
        root1 = new TreeNode(3);
        TreeNode right2 = new TreeNode(20);
        TreeNode left2 = new TreeNode(9);
        root1.right = right2;
        root1.left = left2;
        right2.left = new TreeNode(15);
        right2.right = new TreeNode(17);

        root2 = new TreeNode(3);
        root2.left = new TreeNode(9);
        root2.left.left = new TreeNode(2);
        root2.right = new TreeNode(20);
        root2.right.left = new TreeNode(15);
        root2.right.right = new TreeNode(17);
    }

    @Test
    public void testLevelOrderTraversal() {
        BinaryTreeLevelOrderTraversal instance = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> integers1_1 = instance.levelOrder(root1);
        List<List<Integer>> integers1_2 = instance.levelOrder(root2);

        List<List<Integer>> resultList1 = Arrays.stream(result1)
                .map(Arrays::asList)
                .collect(Collectors.toList());

        List<List<Integer>> resultList2 = Arrays.stream(result2)
                .map(Arrays::asList)
                .collect(Collectors.toList());

        assertTrue(resultList1.containsAll(integers1_1));
        assertTrue(resultList2.containsAll(integers1_2));
    }

}