package com.ustc.order.one;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/27 23:25
 */
//9.回文数
public class IsPalindrome {
    public static void main(String[] args) {
        int x = 1211;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x){
        if(x<0)
            return false;
        int x2 = 0;
        int x1 = x;
        while (x1 != 0){
            x2 = x2*10 + x1%10;
            x1 = x1/10;
        }
        return  x2 == x;
    }
}
