package com.ustc.order.seven;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/16 11:09
 */
//64.最小路径和
public class MinPathSum {
    public static void main(String[] args) {

    }
    public static int minPathSum(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        if (m==0 || n==0) return 0;
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i-1][0];
        }
        for (int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j-1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] = Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
            }
        }
        return grid[m-1][n-1];
    }
}
