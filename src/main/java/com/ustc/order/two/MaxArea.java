package com.ustc.order.two;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/28 21:32
 */
// 11.盛最多水的容器
public class MaxArea {
    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,3,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height){
        int right = height.length-1;
        int left = 0;
        int ans = 0;
        while(left < right){
            int area = Math.min(height[left],height[right])*(right-left);
            ans = Math.max(area,ans);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return ans;
    }
}
