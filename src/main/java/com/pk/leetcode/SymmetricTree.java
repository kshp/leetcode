package com.pk.leetcode;

import com.pk.leetcode.utils.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class SymmetricTree {

    public boolean isSymmetricRecursiveIterative(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        if (root == null)
            return true;
        deque.add(root.left);
        deque.add(root.right);

        while (!deque.isEmpty()) {
            TreeNode first = deque.pollFirst();
            TreeNode last = deque.pollLast();
            if (first == null || last == null)
                return first == last;
            if (first.val != last.val)
                return false;

            deque.addFirst(first.left);
            deque.addLast(last.right);
            deque.addFirst(first.right);
            deque.addLast(last.left);
        }

        return true;
    }

    public boolean isSymmetricRecursive(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;
        if (left.val != right.val)
            return false;
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
