package com.pk.datastruct;

import com.pk.leetcode.trees.TreeNode;

import java.util.*;

public class BinaryTreePostOrderTraversal {

    public List<Integer> postOrderTraversalIterative(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.push(p);
                result.addFirst(p.val);
                p = p.right;
            } else {
                TreeNode node = stack.pop();
                p = node.left;
            }
        }

        return result;
    }

    public List<Integer> postOrderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverseRecursively(result, root);
        return result;
    }

    private void traverseRecursively(List<Integer> result, TreeNode root) {
        if (root == null)
            return;
        if (root.left != null)
            traverseRecursively(result, root.left);
        if (root.right != null)
            traverseRecursively(result, root.right);
        result.add(root.val);
    }
}
