package com.ustc.hot.eight;

import java.util.Arrays;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/15 21:58
 */
//300.最长递增子序列
public class LengthOfLIS {
    public static void main(String[] args) {
        int[] nums = new int[]{10,9,2,5,4,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j])
                    dp[i] = Math.max(dp[j]+1,dp[i]);
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
