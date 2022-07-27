package com.ustc.order.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/11 13:06
 */

public class PermuteUnique {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int[] visited = new int[nums.length];
        backtrack(res,nums,visited,new ArrayList<Integer>());
        return res;
    }

    public static void backtrack(List<List<Integer>>res,int[]nums,int[]visited,ArrayList<Integer>list){
        if (list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            //如果该数和前一个数一样，并且前一个数没有被访问，说明已经回溯过了
            if (visited[i] == 1 || (i>0&&visited[i-1]==0&&nums[i-1]==nums[i]))
                continue;
            visited[i] = 1;
            list.add(nums[i]);
            backtrack(res,nums,visited,list);
            list.remove(list.size()-1);
            visited[i] = 0;
        }
    }
}
