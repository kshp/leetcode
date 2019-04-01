package com.pk.datastruct;

import com.pk.leetcode.trees.TreeNode;

import java.util.HashMap;

public class ConstructBinaryTreeFromInOrderAndPostOrderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0)
            return null;

        HashMap<Integer, Integer> lookup = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            lookup.put(inorder[i], i);
        }
        return buildTreeRecursive(0, inorder.length - 1, postorder, 0, postorder.length - 1, lookup);
    }

    private TreeNode buildTreeRecursive(int inStart, int inEnd, int[] post, int postStart, int postEnd, HashMap<Integer, Integer> lookup) {
        if (inStart > inEnd || postStart > postEnd)
            return null;

        int rootIndex = lookup.get(post[postEnd]);
        TreeNode node = new TreeNode(post[postEnd]);
        node.left = buildTreeRecursive(inStart, rootIndex - 1, post, postStart, postStart + rootIndex - inStart - 1, lookup);
        node.right = buildTreeRecursive(rootIndex + 1, inEnd, post, postStart + rootIndex - inStart, postEnd - 1, lookup);
        return node;
    }

}
