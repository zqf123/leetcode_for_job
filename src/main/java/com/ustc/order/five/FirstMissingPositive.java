package com.ustc.order.five;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/8 22:43
 */

public class FirstMissingPositive {
    public static void main(String[] args) {

    }
    public static int firstMissingPositive(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0)
                nums[i] = n+1;
        }
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n)
                nums[num-1] = -Math.abs(nums[num-1]);
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                return i+1;
        }
        return n+1;
    }
}
