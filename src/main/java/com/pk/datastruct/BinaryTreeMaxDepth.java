package com.pk.datastruct;

import com.pk.leetcode.utils.TreeNode;

public class BinaryTreeMaxDepth {

    public int maxDepth(TreeNode root) {
        return height(root, 1);
    }

    private int height (TreeNode root, int currHeight){
        if (root==null)
            return currHeight-1;
        int leftHeight = height(root.left, currHeight+1);
        int rightHeight = height(root.right, currHeight+1);
        return Math.max(leftHeight, rightHeight);
    }
}
