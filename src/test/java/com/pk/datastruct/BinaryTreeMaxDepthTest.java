package com.pk.datastruct;

import com.pk.leetcode.trees.TreeNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeMaxDepthTest {

    private TreeNode root1;
    private Integer expectedResult = 3;

    @Before
    public void init() {
        root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        TreeNode right2 = new TreeNode(20);
        root1.right = right2;
        right2.left = new TreeNode(15);
        right2.right = new TreeNode(7);
    }

    @Test
    public void testPreOrderTraversal() {
        BinaryTreeMaxDepth instance = new  BinaryTreeMaxDepth();
        Integer result = instance.maxDepth(root1);
        assertEquals(expectedResult, result);
    }

}