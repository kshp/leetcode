package com.pk.leetcode.trees;

import org.junit.Test;

import static org.junit.Assert.*;

public class _752_OpenTheLockTest {

    private String [] deadends1 = {"0201","0101","0102","1212","2002"};
    private String target1 = "0202";

    @Test
    public void openLock() {
        _752_OpenTheLock instance = new _752_OpenTheLock();
        assertEquals(6, instance.openLock(deadends1, target1));
    }
}