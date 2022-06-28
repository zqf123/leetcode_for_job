package com.ustc.hot.eight;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/16 9:02
 */
//309.最佳买卖股票时机含冷却期
public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = new int[]{1,2,3,0,2};
        System.out.println(maxProfix(prices));
    }
    public static int maxProfix(int[] prices){
        if (prices.length == 0)
            return 0;
        int n = prices.length;
        //dp[i][0]持有股票，到i天的最大收益
        //dp[i][1]不持有股票并且不在冷却期，到i天的最大收益
        //dp[i][2]不持有股票并且在冷却期，到i天的最大收益
        int[][] dp = new int[n][3];
        dp[0][0] = -prices[0];
        for (int i = 1; i < n; i++) {
            //持有股票 前一天不持有股票（前一天处于冷却期）或前一天已持有
            dp[i][0] = Math.max(dp[i-1][2]-prices[i],dp[i-1][0]);
            //前一天不处于冷却期或前一天处于冷却期或这一天卖出
            dp[i][1] = Math.max(Math.max(dp[i-1][1],dp[i-1][2]),dp[i-1][0]+prices[i]);
            //处于冷却期，前一天卖出股票
            dp[i][2] = dp[i-1][1];
        }
        return Math.max(dp[n-1][1],dp[n-1][2]);
    }
}
