package com.ustc.order.four;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/7 22:45
 */
//35.搜索插入位置
public class SearchInsert {
    public static void main(String[] args) {

    }

    public static int searchInsert(int[] nums,int target){
        int left = 0, right = nums.length-1;
        int ans = nums.length;
        while (left<=right){
            int mid = (left+right)/2;
            if (target <= nums[mid]){
                ans = mid;
                right = mid - 1;
            }else
                left = mid + 1;
        }
        return ans;
    }
}
