package com.ustc.hot.ten;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/20 17:52
 */

public class CountSubstrings {
    public static void main(String[] args) {

    }
    public static int countSubstrings(String s){
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        for (int i=n-1;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if (j-i==1&&s.charAt(i) == s.charAt(j))
                    dp[i][j] = true;
                if (dp[i+1][j-1]&&s.charAt(i) == s.charAt(j))
                    dp[i][j] = true;
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j])
                    res++;
            }
        }
        return res;
    }
}
