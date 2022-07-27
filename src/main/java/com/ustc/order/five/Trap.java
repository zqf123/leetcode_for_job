package com.ustc.order.five;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/8 22:53
 */

public class Trap {
    public static void main(String[] args) {

    }
    public static int trap(int[] height){
        int ans = 0;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        while(left < right){
            leftMax = Math.max(leftMax,height[left]);
            rightMax = Math.max(rightMax,height[right]);
            if (height[left]<height[right]){
                ans += leftMax - height[left];
                left++;
            }else {
                ans += rightMax - height[right];
                right--;
            }
        }
        return ans;
    }
}
