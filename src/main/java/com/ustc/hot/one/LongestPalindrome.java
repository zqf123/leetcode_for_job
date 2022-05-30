package com.ustc.hot.one;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/5/30 15:57
 */

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s){
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = palindrome(s,i,i);
            String s2 = palindrome(s,i,i+1);
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }

    public static String palindrome(String s,int l,int r){
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}
