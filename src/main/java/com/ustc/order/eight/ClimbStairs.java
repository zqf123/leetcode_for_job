package com.ustc.order.eight;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/17 12:59
 */
//70.爬楼梯
public class ClimbStairs {
    public static void main(String[] args) {

    }
    public static int climbStairs(int n){
        if (n==1 || n==2)
            return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i=3;i<=n;i++)
            dp[i] = dp[i-1] + dp[i-2];
        return dp[n];
    }
}
