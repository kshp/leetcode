package com.pk.leetcode;

import com.pk.leetcode.SerializeAndDeserializeBinaryTree;
import com.pk.leetcode.utils.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SerializeAndDeserializeBinaryTreeTest {

    private TreeNode treeNode;

    @Before
    public void init(){
        treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
    }

    @Test
    public void serializeAdnDeserialize() {
        SerializeAndDeserializeBinaryTree instance = new SerializeAndDeserializeBinaryTree();
        String strTree = "1,2,3";
        TreeNode deserialize = instance.deserialize(strTree);
        assertTrue(TreeNode.equalTrees(treeNode, deserialize));
        assertEquals("1,2,3,null,null,null,null,", instance.serialize(deserialize));
    }
}