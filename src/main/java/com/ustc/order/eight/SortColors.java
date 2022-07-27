package com.ustc.order.eight;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/17 15:56
 */
//75.颜色分类
public class SortColors {
    public static void main(String[] args) {

    }
    public static void sortColors(int[] nums){
        int j = 0, temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            if (nums[i] == 1){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
