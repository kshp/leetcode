package com.pk.datastruct;

import com.pk.leetcode.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreePreOrderTraversal {

    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrderTraverseRecursive(root, result);
        return result;
    }

    public List<Integer> preOrderTraverseIterative(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        stack.push(root);
        TreeNode node = null;
        while (!stack.isEmpty()) {
            node = stack.pop();
            result.add(node.val);
            if (node.right!=null)
                stack.push(node.right);
            if (node.left!=null)
                stack.push(node.left);
        }

        return result;
    }

    private void preOrderTraverseRecursive(TreeNode root, List<Integer> result) {
        if (root == null)
            return;
        result.add(root.val);
        preOrderTraverseRecursive(root.left, result);
        preOrderTraverseRecursive(root.right, result);
    }
}
