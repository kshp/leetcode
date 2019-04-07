package com.pk.datastruct;

import com.pk.leetcode.utils.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        return hasPathSum(root, sum, 0);
    }

    private Boolean hasPathSum(TreeNode root, int sum, int currentSum) {
        if (root == null)
            return false;

        currentSum += root.val;

        if (currentSum == sum && root.left == null && root.right == null) {
            return true;
        }

        return hasPathSum(root.left, sum, currentSum) || hasPathSum(root.right, sum, currentSum);
    }

}
