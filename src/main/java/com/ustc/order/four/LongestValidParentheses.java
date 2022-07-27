package com.ustc.order.four;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/2 19:03
 */
//32.最长有效括号
public class LongestValidParentheses {
    public static void main(String[] args) {

    }
    public static int longsetValidParentheses(String s){
        int n = s.length();
        int[] dp = new int[n];
        int res = 0;
        for (int i = 1; i < n; i++) {
           if (s.charAt(i) == ')'){
               if (s.charAt(i-1) == '(')
                   dp[i] = (i>=2 ? dp[i-2] : 0) + 2;
               else if (i-dp[i-1]>0 && s.charAt(i-dp[i-1]-1)=='(')
                   dp[i] = dp[i-1] + ((i-dp[i-1] >= 2)? dp[i-dp[i-1]-2] : 0) + 2;
               res = Math.max(dp[i],res);
           }
        }
        return res;
    }
}
