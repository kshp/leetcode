package com.pk.datastruct;

import com.pk.leetcode.utils.Node;

public class PopulatingNextRightPointersInEachNode {

    public Node connect(Node root) {
        Node levelStart = root;
        while (levelStart != null) {

            Node curr = levelStart;
            while (curr != null) {

                if (curr.left != null)
                    curr.left.next = curr.right;

                if (curr.right != null && curr.next != null)
                    curr.right.next = curr.next.left;

                curr = curr.next;
            }
            levelStart = levelStart.left;
        }

        return root;
    }

}
