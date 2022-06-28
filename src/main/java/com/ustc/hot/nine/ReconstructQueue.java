package com.ustc.hot.nine;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/19 9:52
 */
//406.根据身高重建队列
public class ReconstructQueue {
    public static void main(String[] args) {

    }
    public static int[][] reconstructQueue(int[][] people){
        Arrays.sort(people,(o1,o2)->o1[0] == o2[1] ? o1[1]-o2[1] : o2[0] - o1[0]);
        List<int[]> res = new LinkedList<>();
        for (int[] person : people) {
            res.add(person[1],person);
        }
        return res.toArray(new int[people.length][2]);
    }
}
