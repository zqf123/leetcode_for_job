package com.ustc.order.five;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/11 11:30
 */
//跳跃游戏II
public class Jump {
    public static void main(String[] args) {

    }
    public static int jump(int[] nums){
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition,i+nums[i]);
            if (i == end){
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}
