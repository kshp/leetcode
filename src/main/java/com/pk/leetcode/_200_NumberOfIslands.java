package com.pk.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class _200_NumberOfIslands {

    private int n;
    private int m;

    public int numIslands(char[][] grid) {

        int count = 0;
        n = grid.length;
        if (n == 0) return 0;
        m = grid[0].length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++)
                if (grid[i][j] == '1') {
                    dfsMarking(grid, i, j);
                    ++count;
                }
        }
        return count;
    }

    private void dfsMarking(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1')
            return;
        grid[i][j] = '0';
        dfsMarking(grid, i + 1, j);
        dfsMarking(grid, i - 1, j);
        dfsMarking(grid, i, j + 1);
        dfsMarking(grid, i, j - 1);
    }

    public int numIslandsBfs(char[][] grid){
        if (grid.length==0){
            return 0;
        }

        int []d = {0,1,0,-1,0};
        Queue<Integer> queue = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int i=0, j=0, count = 0;

        while(i<n){
            while(j<m){

                if (grid[i][j]=='1'){
                    count++;
                    grid[i][j] = '0';
                    queue.add(i*m+j);
                }

                while (!queue.isEmpty()){
                    int x = queue.poll();
                    int iTemp = x / m;
                    int jTemp = x % m;
                    for (int k=0; k<4; k++){
                        int p = iTemp + d[k];
                        int q = jTemp + d[k+1];
                        if (p>=0 && q>=0 && p<n && q<m && grid[p][q]=='1'){
                            grid[p][q]='0';
                            queue.add(p*m+q);
                        }
                    }
                }
                j++;
            }
            i++;
            j=0;
        }
        return count;
    }
}
