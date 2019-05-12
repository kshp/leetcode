package com.pk.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class _542_01Matrix {
    public int[][] updateMatrixBFS(int[][] matrix) {
        if (matrix.length==0)
            return matrix;

        int[]directions = {-1,0,1,0,-1};
        Queue<Integer> q = new LinkedList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i=0; i<n; i++)
            for (int j=0; j<m; j++){
                if (matrix[i][j]==0)
                    q.add(i * m + j);
                else
                    matrix[i][j] = Integer.MAX_VALUE;
            }

        while(!q.isEmpty()){
            int point = q.poll();
            int i = point / m;
            int j = point % m;

            for (int k=0; k<4; k++){
                int nextRowIndex = i + directions[k];
                int nextColumnIndex = j + directions[k+1];
                int pointToAdd = nextRowIndex * m + nextColumnIndex;
                if (nextRowIndex >=0 && nextRowIndex < n && nextColumnIndex >=0 && nextColumnIndex<m &&  matrix[nextRowIndex][nextColumnIndex] >= matrix[i][j] + 1){
                    matrix[nextRowIndex][nextColumnIndex] = matrix[i][j] + 1;
                    q.add(pointToAdd);
                }
            }
        }

        return matrix;
    }
}
