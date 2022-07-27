package com.ustc.order.ten;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/27 15:37
 */
//96. 不同的二叉搜索树
public class NumTrees {
    public static void main(String[] args) {

    }
    public static int numTrees(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
}
