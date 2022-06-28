package com.ustc.hot.four;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/9 9:15
 */
//78.子集
public class Subsets {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(subsets(nums));
    }
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer>temp = new ArrayList<>();
    public static List<List<Integer>> subsets(int[] nums){
        dfs(nums,0);
        return res;
    }
    public static void dfs(int[] nums,int start){
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            dfs(nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
