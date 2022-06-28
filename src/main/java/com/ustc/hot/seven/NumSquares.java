package com.ustc.hot.seven;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/15 10:20
 */
//279.完全平方数
public class NumSquares {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(numSquares(n));
    }
    public static int numSquares(int n){
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; i-j*j >= 0 ; j++) {
                dp[i] = Math.min(dp[i],dp[i-j*j] + 1);
            }
        }
        return dp[n];
    }
}
