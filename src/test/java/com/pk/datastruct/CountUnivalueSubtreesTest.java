package com.pk.datastruct;

import com.pk.leetcode.utils.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountUnivalueSubtreesTest {

    private TreeNode root;

    @Before
    public void init() {
        root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(5);
        root.left.right = new TreeNode(5);
        root.left.left = new TreeNode(5);
    }

    @Test
    public void testPreOrderTraversal() {
        CountUnivalueSubtrees instance = new CountUnivalueSubtrees();
        assertEquals(4,instance.countUnivalSubtrees(root));
    }

}