package com.ustc.order.four;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/8 22:05
 */
// 39.组合总和
public class CombinationSum {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> combinationSum(int[]candidates,int target){
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates,target,res,0,new ArrayList<>());
        return res;
    }

    public static void backtrack(int[] candidates,int target,List<List<Integer>>res,int i,ArrayList<Integer>temp_list){
        if (target<0) return;
        if (target == 0){
            res.add(new ArrayList<>(temp_list));
            return;
        }
        for (int start=i;i<candidates.length;start++){
            temp_list.add(candidates[start]);
            backtrack(candidates,target-candidates[start],res,start,temp_list);
            temp_list.remove(temp_list.size()-1);
        }
    }
}
