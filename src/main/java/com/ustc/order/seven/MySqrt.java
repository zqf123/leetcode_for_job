package com.ustc.order.seven;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/17 12:52
 */
//69.x的平方根
public class MySqrt {
    public static void main(String[] args) {

    }
    //二分查找
    public static int mySqrt(int x){
        int l = 0, r = x, ans = -1;
        while (l <= r){
            int mid = l + (r-l)/2;
            if ((long)mid*mid <= x){
                ans = mid;
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
