package com.ustc.order.four;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/7 22:38
 */

public class SearchRange {
    public static void main(String[] args) {

    }
    public static int[] searchRange(int[] nums,int target){
        return new int[]{left_bound(nums,target),right_bound(nums,target)};
    }
    public static int left_bound(int[] nums,int target){
        int left = 0,right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        if (left >= nums.length || nums[left] != target)
            return -1;
        return left;
    }
    public static int right_bound(int[] nums,int target){
        int left = 0,right = nums.length - 1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid] <= target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        if (right < 0 || nums[right] != target)
            return -1;
        return right;
    }
}
