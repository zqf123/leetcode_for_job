package com.ustc.hot.nine;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/19 10:14
 */
//416.分割等和子集
public class CanParition {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1};
        System.out.println(canPartiton(nums));
    }
    public static boolean canPartiton(int[]nums){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        if (sum % 2 != 0)
            return false;
        int w = sum / 2;
        int n = nums.length;
        int[][]dp = new int[n+1][w+1];
        for (int i = 0; i < n+1; i++) {
            dp[i][0] = 0;
        }
        for (int j=0;j<w+1;j++){
            dp[0][j] = 0;
        }
        for (int i=1;i<n+1;i++){
            for (int j=1;j<w+1;j++){
                if (j-nums[i-1] < 0){
                    dp[i][j] = dp[i-1][j];
                    continue;
                }
                dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-nums[i-1]]+nums[i-1]);
                if (dp[i][j] == w)
                    return true;
            }
        }
        return false;
    }
}
