package com.ustc.hot.eight;

import java.util.Arrays;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/16 10:12
 */
//322.零钱兑换
public class coinChange {
    public static void main(String[] args) {
        int[] coints = new int[]{1,2,5};
        int amount = 11;
        System.out.println(coinChange(coints, amount));
    }
    public static int coinChange(int[] coins,int amount){
        int max = amount+1;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i)
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
            }

        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
