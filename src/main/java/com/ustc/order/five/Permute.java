package com.ustc.order.five;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/11 12:59
 */
//46.全排列
public class Permute {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums){
        List<Integer> tmp_list = new ArrayList<>();
        backtrack(nums,tmp_list);
        return res;
    }
    public static void backtrack(int[]nums,List<Integer>tmp_list){
        if (tmp_list.size() == nums.length)
            res.add(new ArrayList<>(tmp_list));
        for (int i = 0; i < nums.length; i++) {
            if (tmp_list.contains(nums[i]))
                continue;
            tmp_list.add(nums[i]);
            backtrack(nums,tmp_list);
            tmp_list.remove(tmp_list.size()-1);
        }
    }
}
