package com.pk.leetcode.utils;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node left, Node right, Node next) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }

    public static Boolean equalTrees(Node n1, Node n2){
        if (n1 == n2)
            return true;

        if (n1 == null || n2 == null) {
            return false;
        }
        return n1.val == n2.val &&
                equalTrees(n1.left, n2.left) &&
                equalTrees(n1.right, n2.right) &&
                equalTrees(n1.next, n2.next);
    }
}
