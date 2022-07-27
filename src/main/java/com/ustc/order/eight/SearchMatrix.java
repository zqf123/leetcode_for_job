package com.ustc.order.eight;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/17 15:51
 */
//74.搜索二维矩阵
public class SearchMatrix {
    public static void main(String[] args) {

    }
    public static boolean searchMatrix(int[][]matrix,int target){
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == 0)
            return false;
        int i = 0;
        int j = n-1;
        while (i<=m-1&&j>=0){
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target){
                j--;
            }else if (matrix[i][j] < target)
                i++;
        }
        return false;
    }
}
