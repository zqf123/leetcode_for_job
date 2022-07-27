package com.ustc.order.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/28 22:42
 */
//15.三数之和
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums){
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i>0 && nums[i] == nums[i-1])
                continue;
            int target = -nums[i];
            int k = n-1;
            for (int j = i+1; j < n; j++) {
                if (j>i+1 && nums[j] == nums[j-1])
                    continue;
                while (j<k && nums[j]+nums[k] > target)
                    k--;
                if (k == j)
                    break;
                if (nums[j] + nums[k] == target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
}
