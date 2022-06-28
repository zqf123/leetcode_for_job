package com.ustc.hot.two;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/6 9:20
 */
//42.接雨水
public class Trap {
    public static void main(String[] args) {
        int[] heigth = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(heigth));
    }

    //双指针法 时间复杂度O(n) 空间复杂度O(1)
    public static int trap(int[] height){
        int ans = 0;
        int left = 0,right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        while (left < right){
            leftMax = Math.max(leftMax,height[left]);
            rightMax = Math.max(rightMax,height[right]);
            if (height[left] < height[right]){
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
