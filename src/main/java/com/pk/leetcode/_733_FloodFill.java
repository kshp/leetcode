package com.pk.leetcode;

public class _733_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int [] d = {-1,0,1,0,-1};
        if (image[sr][sc]!=newColor)
            dfs(sr,sc, image[sr][sc],newColor,image, d);
        return image;
    }

    private void dfs(int i, int j, int oldColor, int newColor, int[][] image, int [] d){
        if (i<0 || j<0 || i==image.length || j==image[0].length || image[i][j]!=oldColor)
            return;
        image[i][j] = newColor;
        for (int k=0; k<4; k++)
            dfs(i+d[k], j+d[k+1], oldColor, newColor, image, d);
    }
}
