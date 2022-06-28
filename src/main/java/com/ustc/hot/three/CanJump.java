package com.ustc.hot.three;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/6 11:17
 */
//55.跳跃游戏
public class CanJump {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    //贪心
    public static boolean canJump(int[] nums){
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; i++) {
            if (rightmost >= i){
                rightmost = Math.max(rightmost,nums[i]+i);
                if (rightmost >= n-1){
                    return true;
                }
            }
        }
        return false;
    }
}
