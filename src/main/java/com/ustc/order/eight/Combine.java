package com.ustc.order.eight;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/17 20:36
 */
//77.组合
public class Combine {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> combine(int n,int k){
        backtrack(n,k,1,new ArrayList<>());
        return res;
    }
    public static void backtrack(int n,int k,int start,List<Integer>list){
        if (k == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= n-k+1; i++) {
            list.add(i);
            backtrack(n,k-1,i+1,list);
            list.remove(list.size()-1);
        }
    }
}
