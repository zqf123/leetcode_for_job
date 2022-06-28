package com.ustc.order.one;

import java.util.HashSet;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/27 20:43
 */
//3.无重复字符的最长子串
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> window = new HashSet<>();
        int n = s.length();
        int right = -1;
        int res = 0;
        for (int i = 0; i < n; i++) {
           if (i != 0)
               window.remove(s.charAt(i-1));
           while(right+1 < n && !window.contains(s.charAt(right+1))){
               window.add(s.charAt(right+1));
               right++;
           }
           res = Math.max(res,right-i+1);
        }
        return res;
    }
}
