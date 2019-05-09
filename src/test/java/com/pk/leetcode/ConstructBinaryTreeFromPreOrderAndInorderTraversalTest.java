package com.pk.leetcode;

import com.pk.leetcode.ConstructBinaryTreeFromPreOrderAndInorderTraversal;
import com.pk.leetcode.utils.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class ConstructBinaryTreeFromPreOrderAndInorderTraversalTest {

    private TreeNode root1;
    private int[] preorder1 = {3, 9, 20, 15, 7};
    private int[] inorder1 = {9, 3, 15, 20, 7};

    private TreeNode root2;
    private int[] preorder2 = {3, 9, 10, 12, 20, 15, 7};
    private int[] inorder2 = {10, 9, 12, 3, 15, 20, 7};

    @Before
    public void init() {
        root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        root2 = new TreeNode(3);
        root2.left = new TreeNode(9);
        root2.left.left = new TreeNode(10);
        root2.left.right = new TreeNode(12);
        root2.right = new TreeNode(20);
        root2.right.left = new TreeNode(15);
        root2.right.right = new TreeNode(7);
    }

    @Test
    public void testPreOrderTraversal() {
        ConstructBinaryTreeFromPreOrderAndInorderTraversal instance = new ConstructBinaryTreeFromPreOrderAndInorderTraversal();
        assertTrue(TreeNode.equalTrees(root1, instance.buildTreeRecursive(preorder1, inorder1)));
        assertTrue(TreeNode.equalTrees(root1, instance.buildTreeIterative(preorder1, inorder1)));

        TreeNode result2 = instance.buildTreeRecursive(preorder2, inorder2);
        assertTrue(TreeNode.equalTrees(root2, result2));
    }


}