package com.ustc.hot.six;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/13 11:36
 */
//198，打家劫舍
public class Rob {
    public static void main(String[] args) {
        int[] nums = new int[]{5,2,10,4};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums){
        int n = nums.length;
        int res = 0;
        int[] dp = new int[n];
        if (n == 1)
            return nums[0];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
//        for (int i = 0; i < n; i++) {
//            res = Math.max(res,dp[i]);
//        }
        return dp[n-1];
    }
}
