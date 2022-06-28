package com.ustc.hot.two;

import java.util.Deque;
import java.util.LinkedList;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/2 10:57
 */
//32.最长有效括号
public class LongestValidParentheses {
    public static void main(String[] args) {
        String s = ")()())";
        System.out.println(longestValidParentheses(s));
    }
    //动态规划
    public static int longestValidParentheses(String s){
        int maxans = 0;
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')'){
                if (s.charAt(i-1) == '('){
                    dp[i] = (i >= 2 ? dp[i-2] : 0) + 2;
                }else if (i-dp[i-1] > 0 && s.charAt(i-dp[i-1]-1) == '('){
                    dp[i] = dp[i-1] + ((i-dp[i-1]) >= 2 ? dp[i-dp[i-1]-2] : 0)+2;
                }
                maxans = Math.max(maxans,dp[i]);
            }
        }
        return maxans;
    }

    //栈
    public static int longestValidParentheses2(String s){
        int maxans = 0;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack.push(i);
            else {
                stack.poll();
                if (stack.isEmpty()){
                    stack.push(i);
                }else {
                    maxans = Math.max(maxans,i-stack.peek());
                }
            }
        }
        return maxans;
    }
}
