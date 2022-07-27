package com.ustc.order.six;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/11 22:00
 */
//59. 螺旋矩阵 II
public class GenerateMatrix {
    public static void main(String[] args) {

    }
    public static int[][] generateMatrix(int n){
        int[][] matrix = new int[n][n];
        int l = 0, r = n-1, t = 0, b = n-1;
        int num = 1;
        while (num<=n*n){
            for (int i = l; i <= r; i++)
                matrix[t][i] = num++;
            t++;
            for (int i = t; i <= b; i++)
                matrix[i][r] = num++;
            r--;
            for (int i=r;i>=l;i--)
                matrix[b][i] = num++;
            b--;
            for (int i=b;i>=t;i--)
                matrix[i][l] = num++;
            l++;
        }
        return matrix;
    }
}
