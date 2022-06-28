package com.ustc.hot.five;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/11 15:54
 */
//128.最长连续序列
public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = new int[]{100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res = 0;
        for (Integer num : set) {
            if (!set.contains(num-1)){
                int current = 1;
                int currentNum = num;
                while (set.contains(currentNum+1)){
                    current++;
                    currentNum++;
                }
                res = Math.max(res,current);
            }
        }
        return res;
    }
}
