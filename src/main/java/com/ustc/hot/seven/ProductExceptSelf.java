package com.ustc.hot.seven;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/14 20:01
 */
//238.除自身以外的数组的乘积
public class ProductExceptSelf {
    public static void main(String[] args) {

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = k;
            k = k * nums[i];
        }
        k = 1;
        for (int i = nums.length - 1; i >= 0; i--){
            res[i] *= k;
            k = k*nums[i];
        }
        return res;
    }
}
