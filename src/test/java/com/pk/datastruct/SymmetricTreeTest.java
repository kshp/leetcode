package com.pk.datastruct;

import com.pk.leetcode.trees.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SymmetricTreeTest {

    private TreeNode symmetricTreeRoot;
    private TreeNode nonSymmetricTreeRoot;

    @Before
    public void init() {
        symmetricTreeRoot = new TreeNode(1);
        symmetricTreeRoot.left = new TreeNode(2);
        symmetricTreeRoot.right = new TreeNode(2);
        symmetricTreeRoot.left.left = new TreeNode(3);
        symmetricTreeRoot.left.right = new TreeNode(4);
        symmetricTreeRoot.right.left = new TreeNode(4);
        symmetricTreeRoot.right.right = new TreeNode(3);

        nonSymmetricTreeRoot = new TreeNode(1);
        nonSymmetricTreeRoot.left = new TreeNode(2);
        nonSymmetricTreeRoot.right = new TreeNode(2);
        nonSymmetricTreeRoot.left.right = new TreeNode(3);
        nonSymmetricTreeRoot.right.right = new TreeNode(3);
    }

    @Test
    public void testPreOrderTraversal() {
        SymmetricTree instance = new SymmetricTree();
        assertTrue(instance.isSymmetricRecursive(symmetricTreeRoot));
        assertTrue(instance.isSymmetricRecursiveIterative(symmetricTreeRoot));

        assertTrue(!instance.isSymmetricRecursive(nonSymmetricTreeRoot));
        assertTrue(!instance.isSymmetricRecursiveIterative(nonSymmetricTreeRoot));
    }

}