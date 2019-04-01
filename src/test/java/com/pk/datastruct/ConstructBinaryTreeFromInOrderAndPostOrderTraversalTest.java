package com.pk.datastruct;

import com.pk.leetcode.trees.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class ConstructBinaryTreeFromInOrderAndPostOrderTraversalTest {

    private TreeNode root;
    private int[] inroder = {9, 3, 15, 20, 7};
    private int[] postorder = {9, 15, 7, 20, 3};

    @Before
    public void init() {
        root = new TreeNode(3);
        root.right = new TreeNode(20);
        root.left = new TreeNode(9);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
    }

    @Test
    public void testPreOrderTraversal() {
        ConstructBinaryTreeFromInOrderAndPostOrderTraversal instance = new ConstructBinaryTreeFromInOrderAndPostOrderTraversal();
        assertTrue(equalTrees(root, instance.buildTree(inroder, postorder)));
    }

    private boolean equalTrees(TreeNode root1, TreeNode root2) {
        if (root1 == root2) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return root1.val == root2.val &&
                equalTrees(root1.left, root2.left) &&
                equalTrees(root1.right, root2.right);
    }
}