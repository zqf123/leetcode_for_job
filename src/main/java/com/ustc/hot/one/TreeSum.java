package com.ustc.hot.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/5/31 14:08
 */
//15.三数之和
public class TreeSum {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        ArrayList<List<Integer>> ans = new ArrayList<>();
        //枚举a
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            int k = n - 1;
            int target = -nums[i];
            for (int j = i+1; j < n; j++) {
                if (j > i+1 && nums[j] == nums[j-1])
                    continue;
                while(j < k && nums[j] + nums[k] > target){
                    k--;
                }
                if (k == j)
                    break;
                if (nums[j] + nums[k] == target){
                    ArrayList<Integer> list = new ArrayList<>();
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
