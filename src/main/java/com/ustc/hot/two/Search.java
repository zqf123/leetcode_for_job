package com.ustc.hot.two;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/4 9:11
 */
//33.搜索旋转排序数组
public class Search {
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums,int target){
        int n = nums.length;
        int left = 0,right = n - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < nums[right]){
                if (nums[mid] < target && target < nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }else {
                if (nums[left] <= target && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }
        return -1;
    }
}
