package com.ustc.order.one;

import java.util.HashMap;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/27 19:19
 */
//1.两数之和
public class TwoSum {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[]nums,int target){
        int[] res = new int[2];
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                res[0] = map.get(target-nums[i]);
                res[1] = map.get(nums[i]);
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
