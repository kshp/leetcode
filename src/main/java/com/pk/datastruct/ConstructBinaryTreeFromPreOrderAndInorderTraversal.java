package com.pk.datastruct;

import com.pk.leetcode.trees.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreOrderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (inorder.length == 0 || preorder.length == 0)
            return null;

        Map<Integer, Integer> lookup = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
            lookup.put(inorder[i], i);
        return buildTreeRecursive(0, inorder.length - 1, 0, preorder, lookup);
    }

    private TreeNode buildTreeRecursive(int inorderLeft, int inorderRight, int preOrderIndex, int[] preorder, Map<Integer, Integer> lookup) {
        if (inorderLeft > inorderRight || preOrderIndex > preorder.length - 1)
            return null;

        int rootIndex = lookup.get(preorder[preOrderIndex]);

        TreeNode node = new TreeNode(preorder[preOrderIndex]);
        node.left = buildTreeRecursive(inorderLeft, rootIndex - 1, preOrderIndex + 1, preorder, lookup);
        int preorderIndexOffsetBasedOnTheLeftSubtreeNumberOfElements = preOrderIndex + rootIndex - inorderLeft + 1;
        node.right = buildTreeRecursive(rootIndex + 1, inorderRight, preorderIndexOffsetBasedOnTheLeftSubtreeNumberOfElements, preorder, lookup);

        return node;
    }
}
