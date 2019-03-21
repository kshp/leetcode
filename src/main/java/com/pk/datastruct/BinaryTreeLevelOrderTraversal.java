package com.pk.datastruct;

import com.pk.leetcode.trees.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> result = new LinkedList<>();
        if (root != null)
            queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> currentResult = new LinkedList<>();
            int currQueueSize = queue.size();
            for (int i = 0; i < currQueueSize; i++) {
                TreeNode node = queue.poll();
                currentResult.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            result.add(currentResult);
        }

        return result;
    }

}
