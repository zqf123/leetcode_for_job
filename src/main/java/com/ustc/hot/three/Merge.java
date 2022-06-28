package com.ustc.hot.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/6 11:27
 */

public class Merge {
    public static void main(String[] args) {
        int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    public static int[][] merge(int[][] intervals){
        if (intervals.length == 0)
            return new int[0][2];
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (i == 0)
                res.add(intervals[i]);
            else {
                int left = intervals[i][0];
                int right = intervals[i][1];
                if (res.get(res.size()-1)[1] < left){
                    res.add(intervals[i]);
                }else {
                    res.get(res.size()-1)[1] = Math.max(right,res.get(res.size()-1)[1]);
                }
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}
