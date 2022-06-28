package com.ustc.hot.ten;

import java.util.Arrays;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/20 16:59
 */
//581.最短无序连续子数组
public class FindUnsortedSubarray {
    public static void main(String[] args) {

    }
    public static int findUnsortedSubarray(int[] nums){
        int[] snums = nums.clone();
        Arrays.sort(snums);
        int start = snums.length,end = 0;
        for (int i = 0; i < snums.length; i++) {
            if (snums[i] != nums[i]){
                start = Math.min(start,i);
                end = Math.max(end,i);
            }
        }
        return end - start >= 0 ? end-start+1 : 0;
    }

}
