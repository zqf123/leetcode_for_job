package com.ustc.hot.ten;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/19 17:17
 */
//560.和为K的子数组
public class SubarraySum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }

    //枚举
    public static int subarraySum(int[]nums,int k){
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end >= 0;end--){
                sum += nums[end];
                if (sum == k){
                    count++;
                }
            }
        }
        return count;
    }

    /*
        建立map表用于存储每个连续数组sum求和出现的次数，初始化为（0,1），表示和为0的连续子数组出现1次
        sum的值是在对nums数组的循环中不断累加当前元素的，res的值则需要查找map中是否已存在sum-k的元素，
     也就是在查找此前所有从0项开始累加的连续子项和中有没有sum-k;
        如果有的话，则说明从该项到当前项的连续子数组和必定为k，那么res则可以和这个sum的对应值，即这个sum对应的值，
      相加得到新的res
        对于当前sum如果已存在与map中则其对应值+1，不存在则添加新项，初始值为1
    * */
    public static int subarraySum2(int[]nums,int k){
        Map<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int sum = 0, res = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum-k))
                res += map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}
