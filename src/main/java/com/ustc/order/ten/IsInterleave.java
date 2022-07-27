package com.ustc.order.ten;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/27 16:22
 */
//97. 交错字符串
public class IsInterleave {
    public static void main(String[] args) {

    }
    public static boolean isInterleave(String s1,String s2,String s3){
        int n = s1.length(),m = s2.length(),t = s3.length();
        if (n+m != t)
            return false;
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                int p = i+j-1;
                if (i>0){
                    dp[i][j] = dp[i][j] || (dp[i-1][j]&&s1.charAt(i-1) == s3.charAt(p));
                }
                if (j>0){
                    dp[i][j] = dp[i][j] || (dp[i][j-1]&&s2.charAt(j-1) == s3.charAt(p));
                }
            }

        }
        return dp[n][m];
    }
}
