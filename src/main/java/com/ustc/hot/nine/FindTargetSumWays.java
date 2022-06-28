package com.ustc.hot.nine;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/19 15:51
 */
//494.目标和
public class FindTargetSumWays {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,1,1};
        System.out.println(findTargetSumWays2(nums,3));
    }
    public static int count = 0;
    //回溯
    public static int findTargetSumWays(int[]nums,int target){
        backtrack(nums,target,0,0);
        return count;
    }
    public static void backtrack(int[] nums,int target,int index,int sum){
        if (index == nums.length)
            if (sum == target)
                count++;
        else{
            backtrack(nums,target,index+1,sum+nums[index]);
            backtrack(nums,target,index+1,sum-nums[index]);
            }
    }

    //动态规划
    public static int findTargetSumWays2(int[] nums,int target){
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int diff = sum - target;
        if (diff < 0 || diff % 2 != 0)
            return 0;
        int n = nums.length, neg = diff / 2;
        int[][] dp = new int[n+1][neg+1];
        dp[0][0] = 1;
        for (int i=1;i<=n;i++){
            for (int j = 0; j <= neg; j++) {
                dp[i][j] = dp[i-1][j];
                if (j >= nums[i-1])
                    dp[i][j] += dp[i-1][j-nums[i-1]];
            }
        }
        return dp[n][neg];
    }
}
