package com.ustc.hot.one;

import java.util.HashMap;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/5/30 10:10
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(twoSum(nums, target)[0] + " " + twoSum(nums,target)[1]);
    }

    //hash表
    public static int[] twoSum(int[]nums,int target){
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                res[0] = map.get(target - nums[i]);
                res[1] = i;
            }
            map.put(nums[i],i);
        }
        return res;
    }

    public static int[] twoSum2(int[] nums,int target){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return  new int[0];
    }
}
