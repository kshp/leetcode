package com.pk.datastruct;

import com.pk.leetcode.utils.TreeNode;

import java.util.LinkedList;

public class SerializeAndDeserializeBinaryTree {
    public String serialize(TreeNode root) {
        if (root==null)
            return "";

        StringBuilder sb = new StringBuilder();
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if (curr==null){
                sb.append("null,");
                continue;
            }
            sb.append(curr.val).append(",");
            q.add(curr.left);
            q.add(curr.right);
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.equals(""))
            return null;

        String[]strTree = data.split(",");

        TreeNode root = new TreeNode(Integer.parseInt(strTree[0]));
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);

        for (int i =1; i<strTree.length; i++){
            TreeNode parent = q.poll();
            if (!strTree[i].equals("null")){
                TreeNode left = new TreeNode(Integer.parseInt(strTree[i]));
                parent.left = left;
                q.add(left);
            }
            if (!strTree[++i].equals("null")){
                TreeNode right = new TreeNode(Integer.parseInt(strTree[i]));
                parent.right = right;
                q.add(right);
            }
        }

        return root;
    }
}
