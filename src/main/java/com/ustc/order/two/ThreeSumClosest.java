package com.ustc.order.two;

import java.util.Arrays;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/28 22:56
 */
//16.最接近的三数之和
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,2,1,-4};
        System.out.println(threeSumClosest(nums, 1));
    }
    public static int threeSumClosest(int[]nums,int target){
        Arrays.sort(nums);
        int closesNum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length-2; i++) {
            int l = i+1,r = nums.length-1;
            while (l < r){
                int threeSum = nums[i] + nums[r] + nums[l];
                if (Math.abs(threeSum-target) < Math.abs(closesNum-target))
                    closesNum = threeSum;
                if (threeSum > target)
                    r--;
                else if (threeSum < target)
                    l++;
                else return target;
            }
        }
        return closesNum;
    }
}
