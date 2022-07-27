package com.ustc.order.nine;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/17 21:09
 */
//81. 搜索旋转排序数组 II
public class Search {
    public static void main(String[] args) {

    }
    public static boolean search(int[] nums,int target){
        int left = 0, right = nums.length-1;
        while (left <= right){
            int mid = (left+right)/2;
            if (nums[mid] == target)
                return true;
            if (nums[mid] == nums[left] && nums[mid] == nums[right]){
                left++;
                right--;
            }else if (nums[mid] >= nums[left]){
                if (nums[mid] > target && target >= nums[left])
                    right = mid - 1;
                else left = mid + 1;
            }else if (nums[mid] < nums[left]){
                if (nums[mid] < target && target <= nums[right])
                    left = mid +1;
                else right = mid - 1;
            }
        }
        return false;
    }
}
