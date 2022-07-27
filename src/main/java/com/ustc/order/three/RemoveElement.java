package com.ustc.order.three;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/30 20:46
 */
// 27.移除元素
public class RemoveElement {
    public static void main(String[] args) {

    }
    public static int removeElement(int[] nums, int val){
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
