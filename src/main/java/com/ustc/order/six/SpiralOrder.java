package com.ustc.order.six;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/11 20:50
 */
//54.螺旋矩阵
public class SpiralOrder {
    public static void main(String[] args) {

    }
    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = n-1,top = 0,bottom = m - 1;
        while (left <= right && top <= bottom){
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            for (int i = top+1; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            if (left<right&&top<bottom){
                for (int i=right-1;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                for (int i=bottom-1;i>top;i--){
                    res.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return res;
    }
}
