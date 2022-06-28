package com.ustc.hot.seven;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/15 9:43
 */
//239.滑动窗口最大值
public class MaxSlidingWindow {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
    public static int[] maxSlidingWindow(int[] nums,int k){
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o2[0] - o1[0] : o2[1] - o1[1];
            }
        });
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            pq.offer(new int[]{nums[i],i});
        }
        int[] res = new int[n-k+1];
        res[0] = pq.peek()[0];
        for (int i = k; i < n; i++) {
            pq.offer(new int[]{nums[i],i});
            while (pq.peek()[1] <= i-k)
                pq.poll();
            res[i-k+1] = pq.peek()[0];
        }
        return res;
    }
}
