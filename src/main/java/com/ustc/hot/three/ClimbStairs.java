package com.ustc.hot.three;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/7 10:00
 */
//70.爬楼梯
public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
    public static int climbStairs(int n){
        if (n == 1 || n == 2)
            return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
