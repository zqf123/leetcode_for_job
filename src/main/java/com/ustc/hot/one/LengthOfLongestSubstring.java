package com.ustc.hot.one;

import java.util.HashSet;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/5/30 14:06
 */
//3.无重复字符的最长子串
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    //滑动窗口
    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> occ = new HashSet<>();
        int n = s.length();
        int rk = -1, ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0){
                occ.remove(s.charAt(i-1));
            }
            while(rk+1 < n && !occ.contains(s.charAt(rk+1))){
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            ans = Math.max(ans,rk - i + 1);
        }
        return ans;
    }

}
