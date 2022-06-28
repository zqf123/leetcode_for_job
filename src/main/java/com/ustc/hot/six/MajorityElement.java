package com.ustc.hot.six;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/12 10:13
 */

public class MajorityElement {
    public static void main(String[] args) {

    }
    public static int majorityElement(int[] nums){
        int count = 0;
        int x = 0;
        for (int num : nums) {
            if (count == 0) x = num;
            if (x == num) count++;
            else
                count--;
        }
        return x;
    }
}
