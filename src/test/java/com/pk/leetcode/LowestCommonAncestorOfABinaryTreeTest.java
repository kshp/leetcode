package com.pk.leetcode;

import com.pk.leetcode.LowestCommonAncestorOfABinaryTree;
import com.pk.leetcode.utils.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LowestCommonAncestorOfABinaryTreeTest {

    private TreeNode root;

    @Before
    public void init() {
        root = new TreeNode(3);
        root.right = new TreeNode(1);
        root.left = new TreeNode(5);
        root.right.right = new TreeNode(8);
        root.right.left = new TreeNode(0);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
    }


    @Test
    public void lowestCommonAncestor() {
        LowestCommonAncestorOfABinaryTree instance = new LowestCommonAncestorOfABinaryTree();
        assertEquals(root, instance.lowestCommonAncestor(root, new TreeNode(5), new TreeNode(1)));
    }
}