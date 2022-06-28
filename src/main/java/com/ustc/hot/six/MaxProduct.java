package com.ustc.hot.six;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/11 20:46
 */
//152.乘积最大子数组
public class MaxProduct {
    public static void main(String[] args) {

    }
    public static int maxProduct(int[]nums){
        int max = Integer.MIN_VALUE;
        int imax = 1,imin = 1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i]<0){
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(imax*nums[i],nums[i]);
            imin = Math.min(imin*nums[i],nums[i]);
            max = Math.max(imax,max);
        }
        return max;
    }
}
