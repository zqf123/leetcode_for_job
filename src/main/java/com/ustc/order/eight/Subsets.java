package com.ustc.order.eight;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/17 20:46
 */
//78.子集
public class Subsets {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<Integer>temp = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums){
        backtrack(nums,0);
        return res;
    }
    public static void backtrack(int[] nums,int start){
        res.add(new ArrayList<>(temp));
        for (int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
