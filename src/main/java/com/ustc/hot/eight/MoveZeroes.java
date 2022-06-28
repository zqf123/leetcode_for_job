package com.ustc.hot.eight;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/15 10:31
 */
//283.移动零
public class MoveZeroes {
    public static void main(String[] args) {

    }
    public static void moveZeroes(int[] nums){
        int left = 0, right = 0;
        int n = nums.length - 1;
        while (right <= n){
            if (nums[right] != 0){
                swap(nums,left,right);
                left++;
            }
            right++;
        }
    }

    public static void swap(int[] nums,int left,int right){
        int temp;
        temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
