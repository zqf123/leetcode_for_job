package com.ustc.hot.two;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/2 9:38
 */
//31.下一个排列
public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        nextPermutation(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
    public static void nextPermutation(int[] nums){
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }
        if (i >= 0){
            int j = nums.length - 1;
            while (j >= 0 && nums[i] >= nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void reverse(int[] nums,int start){
        int left = start,right = nums.length - 1;
        while( left < right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
}
