package com.pk.leetcode.trees;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public static boolean equalTrees(TreeNode root1, TreeNode root2) {
        if (root1 == root2) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return root1.val == root2.val &&
                equalTrees(root1.left, root2.left) &&
                equalTrees(root1.right, root2.right);
    }
}
