package com.ustc.hot.seven;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/15 10:06
 */
//240.搜索二维矩阵||
public class SearchMatrix {
    public static void main(String[] args) {

    }
    public static boolean searchMatrix(int[][] matrix,int target){
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0, j = n - 1;
        while (i<m && j >= 0){
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] < target)
                i++;
            else if (matrix[i][j] > target)
                j--;
        }
        return false;
    }
}
