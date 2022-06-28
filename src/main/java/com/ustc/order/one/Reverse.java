package com.ustc.order.one;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/27 22:42
 */
// 7.整数反转
public class Reverse {
    public static void main(String[] args) {

    }

    public static int reverse(int x){
        int n = 0;
        while (x!=0){
            if (n > Integer.MAX_VALUE / 10 || n < Integer.MIN_VALUE/10)
                return 0;
            n = n*10 + x%10;
            x = x/10;
        }
        return n;
    }
}
