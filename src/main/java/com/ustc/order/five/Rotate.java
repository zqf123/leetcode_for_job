package com.ustc.order.five;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/11 16:24
 */
//48.旋转图像
public class Rotate {
    public static void main(String[] args) {

    }
    public static void rotate(int[][] matrix){
        //现对角线翻转，再左右翻转
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int[] row : matrix) {
            reverse(row);

        }
    }

    public static void reverse(int[]arr){
        int i = 0, j = arr.length-1;
        while (j>i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++;
        }
    }
}
