package com.ustc.order.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/29 20:54
 */
// 18.四数之和
public class FourSum {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,0,1000000000,1000000000,1000000000,1000000000};
        int target = 1000000000;
        System.out.println(fourSum(nums, target));
    }

    public static List<List<Integer>> fourSum(int[] nums,int target){
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length<4)
            return res;
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length - 3; i++) {
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            if (nums[i]+nums[i+1]+nums[i+2]+nums[i+3] > target)
                break;
            if (nums[i]+nums[length-3]+nums[length-2]+nums[length-1]<target)
                continue;
            for (int j = i+1; j < length - 2; j++) {
                if (j>i+1 && nums[j] == nums[j-1])
                    continue;
                if (nums[i]+nums[j]+nums[j+1]+nums[j+2] > target)
                    break;
                if (nums[i]+nums[j]+nums[length-2]+nums[length-1]<target)
                    continue;
                int left = j+1, right = length-1;
                while (left<right){
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if (sum == target){
                        List<Integer> temp =  new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        res.add(temp);
                        while (left<right&&nums[left]==nums[left+1])
                            left++;
                        left++;
                        while (left<right&&nums[right]==nums[right-1])
                            right--;
                        right--;
                    }else if (sum<target){
                        left++;
                    }else {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
