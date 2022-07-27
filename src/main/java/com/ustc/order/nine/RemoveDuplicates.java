package com.ustc.order.nine;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/17 21:02
 */
//80. 删除有序数组中的重复项 II
public class RemoveDuplicates {
    public static void main(String[] args) {

    }
    public static int removeDuplicates(int[] nums){
        int i = 0;
        for (int num : nums) {
            if (i<2 || nums[i-2] < num)
                nums[i++] = num;
        }
        return i;
    }
}
