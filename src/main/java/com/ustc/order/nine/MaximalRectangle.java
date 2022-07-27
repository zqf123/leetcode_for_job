package com.ustc.order.nine;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/26 11:00
 */
//85.最大矩形
public class MaximalRectangle {
    public static void main(String[] args) {

    }
    public static int maximalRectangle(char[][]matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] left = new int[m][n];
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1')
                    left[i][j] = (j == 0 ? 0 : left[i][j-1]) + 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '0')
                    continue;
                int wide = left[i][j];
                int area = wide;
                for (int k = i-1;k >= 0;k--){
                    wide = Math.min(left[k][j],wide);
                    area = Math.max(area,wide*(i-k+1));
                }
                res = Math.max(res,area);
            }
        }
        return res;
    }
}
