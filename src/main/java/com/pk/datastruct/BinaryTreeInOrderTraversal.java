package com.pk.datastruct;

import com.pk.leetcode.trees.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInOrderTraversal {

    public List<Integer> inOrderTraversalRecursive(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        inOrderTraversalRecursive(root, result);
        return result;
    }

    public List<Integer> inOrderTraversalIterative(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        List<Integer> result = new LinkedList<>();

        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            result.add(node.val);
            node = node.right;
        }

        return result;
    }

    private void inOrderTraversalRecursive(TreeNode node, List<Integer> result) {
        if (node == null)
            return;

        if (node.left != null)
            inOrderTraversalRecursive(node.left, result);

        result.add(node.val);

        if (node.right != null)
            inOrderTraversalRecursive(node.right, result);

    }
}
