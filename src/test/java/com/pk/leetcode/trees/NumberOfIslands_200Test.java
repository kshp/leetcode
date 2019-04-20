package com.pk.leetcode.trees;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NumberOfIslands_200Test {

    private char[][] grid1 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}};

    private char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '1', '1'}};

    @Test
    public void testNumIslands() {
        NumberOfIslands_200 instance = new NumberOfIslands_200();
        assertEquals(1,instance.numIslands(grid1));
        assertEquals(2,instance.numIslands(grid2));
    }
}