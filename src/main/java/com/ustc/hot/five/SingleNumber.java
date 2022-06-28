package com.ustc.hot.five;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/11 16:09
 */
//136.只出现一次的数字
public class SingleNumber {
    public static void main(String[] args) {

    }
    public static int singleNumber(int[] nums){
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a ^= nums[i];
        }
        return a;
    }
}
