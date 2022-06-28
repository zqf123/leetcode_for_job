package com.ustc.hot.nine;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/19 8:02
 */

public class TopKFrequent {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }
    public static int[] topKFrequent(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] ret = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->map.get(o2) - map.get(o1));
        pq.addAll(map.keySet());
        for (int i = 0; i < k; i++) {
            ret[i] = pq.remove();
        }
        return ret;
    }
}
