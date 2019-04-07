package com.pk.datastruct;

import com.pk.leetcode.utils.TreeNode;

import java.util.*;

public class ConstructBinaryTreeFromPreOrderAndInorderTraversal {

    public TreeNode buildTreeIterative(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }

        // build a map of the indices of the values as they appear in the inorder array
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        // initialize the stack of tree nodes
        Deque<TreeNode> stack = new ArrayDeque<>();
        int value = preorder[0];
        TreeNode root = new TreeNode(value);
        stack.push(root);

        // for all remaining values...
        for (int i = 1; i < preorder.length; i ++) {
            // create a node
            value = preorder[i];
            TreeNode node = new TreeNode(value);

            if (map.get(value) < map.get(stack.peek().val)) {
                // the new node is on the left of the last node,
                // so it must be its left child (that's the way preorder works)
                stack.peek().left = node;
            } else {
                // the new node is on the right of the last node,
                // so it must be the right child of either the last node
                // or one of the last node's ancestors.
                // pop the stack until we either run out of ancestors
                // or the node at the top of the stack is to the right of the new node
                TreeNode parent = null;
                while(!stack.isEmpty() && map.get(value) > map.get(stack.peek().val)) {
                    parent = stack.pop();
                }
                parent.right = node;
            }
            stack.push(node);
        }

        return root;
    }

    public TreeNode buildTreeRecursive(int[] preorder, int[] inorder) {
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
