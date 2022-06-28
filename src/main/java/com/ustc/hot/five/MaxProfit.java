package com.ustc.hot.five;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/11 10:16
 */
//121.买卖股票的最佳时机
public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices){
        if (prices.length <= 1)
            return 0;
        int min = prices[0],max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max,prices[i]-min);
            min = Math.min(min,prices[i]);
        }
        return max;
    }
}
