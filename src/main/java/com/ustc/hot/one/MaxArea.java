package com.ustc.hot.one;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/5/31 11:28
 */
//11.盛最多水的容器
public class MaxArea {
    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height){
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r){
            int area = Math.min(height[l],height[r])*(r-l);
            ans = Math.max(area,ans);
            if (height[l] <= height[r]){
                l++;
            }else {
                r--;
            }
        }
        return ans;
    }
}
