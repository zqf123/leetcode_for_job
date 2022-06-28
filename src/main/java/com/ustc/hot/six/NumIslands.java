package com.ustc.hot.six;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/13 16:04
 */
//200.岛屿数量
public class NumIslands {
    public static void main(String[] args) {

    }
    public static int numIslands(char[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int num = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1')
                    dfs(grid,i,j);
            }
        }
        return num;
    }
    public static void dfs(char[][] grid,int i,int j){
        if (i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
}
