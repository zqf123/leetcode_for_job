package com.ustc.order.four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/8 22:11
 */

public class CombinationSum2 {
    public static void main(String[] args) {
    }

    public static List<List<Integer>> combinationSum2(int[]candidates,int target){
        List<List<Integer>>res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,target,res,new ArrayList<>(),0);
        return res;
    }
    public static void backtrack(int[]candidates,int target,List<List<Integer>>res,List<Integer>temp_list,int index){
        if (target<0)
            return;
        if (target == 0)
            res.add(new ArrayList<>(temp_list));
        for (int start = index;start<candidates.length;start++){
            if (start>index && candidates[start] == candidates[start-1])
                continue;
            temp_list.add(candidates[start]);
            backtrack(candidates,target-candidates[start],res,temp_list,start+1);
            temp_list.remove(temp_list.size()-1);
        }
    }
}
