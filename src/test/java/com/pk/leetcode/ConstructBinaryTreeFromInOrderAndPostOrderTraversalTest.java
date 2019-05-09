package com.pk.leetcode;

import com.pk.leetcode.ConstructBinaryTreeFromInOrderAndPostOrderTraversal;
import com.pk.leetcode.utils.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static com.pk.leetcode.utils.TreeNode.equalTrees;
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
        assertTrue(equalTrees(root, instance.buildTreeRecursvice(inroder, postorder)));
        assertTrue(equalTrees(root, instance.buildTreeIterative(inroder, postorder)));
    }


}