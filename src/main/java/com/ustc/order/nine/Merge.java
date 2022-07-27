package com.ustc.order.nine;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/26 11:30
 */

public class Merge {
    public static void main(String[] args) {

    }
    public static void merge(int[]nums1,int m,int[]nums2,int n){
        int i = m-1,j = n-1, k = m+n-1;
        while (j >= 0){
            if (i < 0 || nums2[j] > nums1[i])
                nums1[k--] = nums2[j-1];
            else
                nums1[k--] = nums1[i--];
        }
    }
}
