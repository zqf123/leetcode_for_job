package com.ustc.hot.five;

import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/11 16:14
 */
//139.单词拆分
public class WordBreak {
    public static void main(String[] args) {

    }
    public static boolean wordBreak(String s, List<String> wordDict){
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j]&&wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                }
            }
        }
        return dp[n];
    }
}
