package com.pk.leetcode;

import com.pk.leetcode.PathSum;
import com.pk.leetcode.utils.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PathSumTest {

    private TreeNode rootTree1;
    private TreeNode rootTree2;

    @Before
    public void init() {
        rootTree1 = new TreeNode(5);
        rootTree1.left = new TreeNode(4);
        rootTree1.right = new TreeNode(8);
        rootTree1.left.left = new TreeNode(11);
        rootTree1.left.left.left = new TreeNode(7);
        rootTree1.left.left.right = new TreeNode(2);

        rootTree1.right.left = new TreeNode(13);
        rootTree1.right.right = new TreeNode(4);
        rootTree1.right.right.right = new TreeNode(1);

        rootTree2 = new TreeNode(-2);
        rootTree2.right = new TreeNode(-3);
    }

    @Test
    public void tesPathSum() {
        PathSum instance = new PathSum();
        assertTrue(instance.hasPathSum(rootTree1, 22));
        assertTrue(instance.hasPathSum(rootTree2, -5));
    }
}