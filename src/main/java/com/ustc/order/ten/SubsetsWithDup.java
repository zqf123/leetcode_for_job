package com.ustc.order.ten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/26 11:48
 */

public class SubsetsWithDup {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> res = new ArrayList<>();
    public static ArrayList<Integer>tmp = new ArrayList<>();
    public static List<List<Integer>> subsetsWithDup(int[] nums){
        Arrays.sort(nums);
        backtrack(nums,0);
        return res;
    }
    public static void backtrack(int[] nums,int start){
        res.add(new ArrayList<>(tmp));
        for (int i = start; i < nums.length; i++) {
            if (i>start && nums[i] == nums[i-1])
                continue;
            tmp.add(nums[i]);
            backtrack(nums,i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}
