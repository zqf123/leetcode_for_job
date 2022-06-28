package com.ustc.hot.seven;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/14 16:25
 */
//数组中的第K个最大元素
public class FindKthLargest {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }
    public static int findKthLargest(int[] nums,int k){
        return quickSearch(nums,0,nums.length-1,k-1);
    }
    public static int quickSearch(int[] nums,int lo,int hi,int k){
        int j = partition(nums,lo,hi);
        if (j == k)
            return nums[j];
        return j>k?quickSearch(nums,lo,j-1,k) : quickSearch(nums,j+1,hi,k);
    }
    public static int partition(int[]nums,int lo,int hi){
        int v = nums[lo];
        int i = lo,j = hi + 1;
        while (true){
            while (++i <= hi && nums[i] > v);
            while (--j >= lo && nums[j] < v);
            if (i >= j)
                break;
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
        nums[lo] = nums[j];
        nums[j] = v;
        return j;
    }
}
