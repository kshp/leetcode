package com.pk.leetcode;

import com.pk.leetcode.utils.Node;

import java.util.LinkedList;

public class PopulatingNextRightPointersInEachNodeII {
    public Node connectLevelOrder(Node root) {
        LinkedList<Node> q = new LinkedList<>();
        LinkedList<Node> levelList;
        q.add(root);
        while (!q.isEmpty()) {
            levelList = new LinkedList<>();
            while (!q.isEmpty()) {
                Node curr = q.poll();
                if (!q.isEmpty())
                    curr.next = q.peek();
                levelList.add(curr);
            }
            while (!levelList.isEmpty()) {
                Node curr = levelList.poll();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }

        return root;
    }

    public Node connect(Node root) {
        Node result = root;
        while (root != null) {
            Node tempChild = new Node(0);
            Node currentChild = tempChild;
            while (root != null) {
                if (root.left != null) {
                    currentChild.next = root.left;
                    currentChild = currentChild.next;
                }
                if (root.right != null) {
                    currentChild.next = root.right;
                    currentChild = currentChild.next;
                }
                root = root.next;
            }
            root = tempChild.next;
        }

        return result;
    }
}
