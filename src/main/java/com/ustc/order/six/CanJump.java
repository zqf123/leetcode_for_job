package com.ustc.order.six;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/11 21:14
 */
//55.跳跃游戏
public class CanJump {
    public static void main(String[] args) {

    }
    public static boolean canJump(int[]nums){
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; i++) {
            if (rightmost >= i){
                rightmost = Math.max(rightmost,nums[i]+i);
                if (rightmost >= n-1)
                    return true;
            }
        }
        return false;
    }
}
