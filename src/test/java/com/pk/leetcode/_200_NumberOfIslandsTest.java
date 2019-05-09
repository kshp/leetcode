package com.pk.leetcode;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _200_NumberOfIslandsTest {

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
    
    private char[][] grid3 = {
            {'1','1','1','1','1','1'},
            {'1','0','0','0','0','1'},
            {'1','0','1','1','0','1'},
            {'1','0','0','0','0','1'},
            {'1','1','1','1','1','1'}};

    @Test
    public void testNumIslands() {
        _200_NumberOfIslands instance = new _200_NumberOfIslands();
        assertEquals(1,instance.numIslands(grid1));
        assertEquals(2,instance.numIslands(grid2));
    }

    @Test
    public void testNumIslands2() {
        _200_NumberOfIslands instance = new _200_NumberOfIslands();
        assertEquals(1,instance.numIslandsBfs(grid1));
        assertEquals(2,instance.numIslandsBfs(grid2));
        assertEquals(2,instance.numIslandsBfs(grid3));
    }
}