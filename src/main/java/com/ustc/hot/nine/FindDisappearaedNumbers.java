package com.ustc.hot.nine;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/19 14:22
 */
//448.找到所有数组中消失的数字
public class FindDisappearaedNumbers {
    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums){
        int n = nums.length;
        for (int num : nums) {
            int x = (num-1)%n;
            nums[x] += n;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n)
                res.add(i+1);
        }
        return res;
    }
}
