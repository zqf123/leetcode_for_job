package com.ustc.hot.eight;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/15 10:49
 */
//287.寻找重复数
public class FindDuplicate {
    public static void main(String[] args) {

    }
    public static int findDuplicate(int[] nums){
        int fast = 0, slow = 0;
        while (true){
            fast = nums[nums[fast]];
            slow = nums[slow];
            if (slow == fast){
                fast = 0;
                while (nums[slow] != nums[fast]){
                    fast = nums[fast];
                    slow = nums[slow];
                }
                return nums[slow];
            }
        }
    }
}
