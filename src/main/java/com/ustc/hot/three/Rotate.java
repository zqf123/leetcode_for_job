package com.ustc.hot.three;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/6 9:43
 */
//旋转图像
public class Rotate {
    public static void main(String[] args) {

    }
    public static void rotate(int[][] matrix){
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

    public static void reverse(int[] arr){
        int i = 0, j = arr.length - 1;
        while (j > i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
