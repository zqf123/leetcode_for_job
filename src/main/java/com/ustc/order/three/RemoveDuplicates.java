package com.ustc.order.three;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/30 20:39
 */
// 26.删除有序数组中的重复项
public class RemoveDuplicates {
    public static void main(String[] args) {

    }
    public static int removeDuplicates(int[] nums){
        int n = nums.length;
        if (nums == null || nums.length == 1)
            return nums.length;
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}
