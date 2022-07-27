package com.ustc.order.seven;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/16 16:05
 */

public class AddBinary {
    public static void main(String[] args) {

    }
    public static String addBinary(String a,String b){
        StringBuffer ans = new StringBuffer();
        int n = Math.max(a.length(),b.length());
        int carry = 0;
        for (int i = 0; i < n; i++) {
            carry += i < a.length() ? (a.charAt(a.length()-1-i)-'0') : 0;
            carry += i < b.length() ? (b.charAt(b.length()-1-i) - '0') : 0;
            ans.append(carry%2);
            carry /= 2;
        }
        if (carry > 0)
        ans.append('1');
        ans.reverse();
        return ans.toString();
    }
}
