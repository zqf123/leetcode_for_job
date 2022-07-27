package com.ustc.order.four;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/2 20:13
 */
//33.搜索旋转排序数组
public class Searceh {
    public static void main(String[] args) {

    }
    public static int search(int[] nums,int target){
        int left = 0, right = nums.length-1;
        while (left <= right){
            int mid = (left+right)/2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < nums[right]){
                if (nums[mid]<target && target<= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            else {
                if (nums[mid]>target && target >= nums[left])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }
        return -1;
    }
}
