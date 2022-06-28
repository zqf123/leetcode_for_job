package com.ustc.hot.seven;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/14 18:18
 */
//221.最大正方形
public class MaximalSquare {
    public static void main(String[] args) {
        char[][] matrix = new char[][]{{'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','1'}};
        System.out.println(maximalSquare(matrix));
    }
    public static int maximalSquare(char[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m+1][n+1];
        int max = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i-1][j-1] == '1'){
                    dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1])) + 1;
                    max = Math.max(dp[i][j],max);
                }
            }
        }
        return max*max;
    }
}
