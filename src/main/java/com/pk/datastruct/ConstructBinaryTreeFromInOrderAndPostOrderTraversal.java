package com.pk.datastruct;

import com.pk.leetcode.trees.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInOrderAndPostOrderTraversal {

    public TreeNode buildTreeIterative(int[] inorder, int[] postorder) {
        if (postorder.length == 0) {
            return null;
        }

        // build a map of the indices of the values as they appear in the inorder array
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        // initialize the stack of tree nodes
        Deque<TreeNode> stack = new ArrayDeque<>();
        int value = postorder[postorder.length-1];
        TreeNode root = new TreeNode(value);
        stack.push(root);

        // for all remaining values...
        for (int i = postorder.length-2; i >=0; i --) {
            // create a node
            value = postorder[i];
            TreeNode node = new TreeNode(value);

            if (map.get(value) > map.get(stack.peek().val)) {
                // the new node is on the right of the last node,
                // so it must be its left child (that's the way preorder works)
                stack.peek().right = node;
            } else {
                // the new node is on the left of the last node,
                // so it must be the left child of either the last node
                // or one of the last node's ancestors.
                // pop the stack until we either run out of ancestors
                // or the node at the top of the stack is to the left of the new node
                TreeNode parent = null;
                while(!stack.isEmpty() && map.get(value) < map.get(stack.peek().val)) {
                    parent = stack.pop();
                }
                parent.left = node;
            }
            stack.push(node);
        }

        return root;
    }

    public TreeNode buildTreeRecursvice(int[] inorder, int[] postorder) {
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
