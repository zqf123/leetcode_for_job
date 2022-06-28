package com.ustc.hot.three;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/7 9:42
 */
//64.最小路径和
public class MinPathSum {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
    public static int minPathSum(int[][] grid){
        int width = grid[0].length, hight = grid.length;
        if (hight == 0 || width == 0) return 0;
        for (int i = 1; i < hight; i++) {
            grid[i][0] += grid[i-1][0];
        }
        for (int i = 1; i < width; i++) {
            grid[0][i] += grid[0][i-1];
        }
        for (int i = 1; i < hight; i++) {
            for (int j = 1; j < width; j++) {
                grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[hight-1][width-1];
    }
}
