package com.ustc.order.one;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/27 21:18
 */
//4. 寻找两个正序数组的中位数
public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[]nums1,int[]nums2){
        int m = nums1.length;
        int n = nums2.length;
        int left = (m+n+1)/2;
        int right = (m+n+2)/2;
        return (findKth(nums1,0,nums2,0,left)+findKth(nums1,0,nums2,0,right)) / 2.0;
    }
    public static int findKth(int[]nums1,int i,int[]nums2,int j,int k){
        if (i >= nums1.length) return nums2[j+k-1];
        if (j >= nums2.length) return nums1[i+k-1];
        if (k == 1) return Math.min(nums1[i],nums2[j]);
        int midVal1 = (i+k/2-1 < nums1.length) ? nums1[i+k/2-1] : Integer.MAX_VALUE;
        int midVal2 = (j+k/2-1 < nums2.length) ? nums2[j+k/2-1] : Integer.MAX_VALUE;
        if (midVal1 < midVal2)
            return findKth(nums1,i+k/2,nums2,j,k - k/2);
        else
            return findKth(nums1,i,nums2,j+k/2,k-k/2);
    }
}
