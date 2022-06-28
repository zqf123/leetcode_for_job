package com.ustc.hot.two;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/4 9:26
 */
//34.在排序数组中查找元素的第一个和最后一个位置
public class SearchRange {
    public static void main(String[] args) {
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;
        System.out.println(searchRange(nums, target)[0]+" "+searchRange(nums,target)[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        return new int[] {left_bound(nums,target),right_bound(nums,target)};
    }

    public static int left_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            }else if (nums[mid] >= target){
                right = mid - 1;
            }
        }
        if (left >= nums.length || nums[left] != target)
            return -1;
        return left;
    }
    public static int right_bound(int[]nums,int target){
        int left = 0, right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid] <= target){
                left = mid + 1;
            }else if (nums[mid] > target){
                right = mid - 1;
            }
        }
        if (right < 0 || nums[right] != target)
            return -1;
        return right;
    }
}
