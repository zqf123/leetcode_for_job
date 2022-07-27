package com.ustc.order.ten;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/27 10:52
 */
//91.解码方法
public class NumDecodings {
    public static void main(String[] args) {

    }
    public static int numDecodings(String s){
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (s.charAt(i-1) != '0')
                dp[i] += dp[i-1];
            if (i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }
}
