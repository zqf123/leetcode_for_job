package com.ustc.order.six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/11 21:17
 */
//56.合并区间
public class Merge {
    public static void main(String[] args) {

    }
    public static int[][] merge(int[][] intervals){
        if (intervals.length == 0)
            return new int[0][2];
        Arrays.sort(intervals,((o1, o2) -> o1[0]-o2[0]));
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (i == 0)
                res.add(intervals[i]);
            else {
                int left = intervals[i][0];
                int right = intervals[i][1];
                if (res.get(res.size()-1)[1] < left)
                    res.add(intervals[i]);
                else
                    res.get(res.size()-1)[1] = Math.max(right,res.get(res.size()-1)[1]);
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}
