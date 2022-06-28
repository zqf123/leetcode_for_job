package com.ustc.hot.ten;

import java.util.Stack;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/20 18:23
 */

public class DailyTemperatures {
    public static void main(String[] args) {

    }
    public static int[] dailyTemperatures(int[] temperatures){
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty()&&temperatures[i] > temperatures[stack.peek()]){
                int temp = stack.pop();
                res[temp] = i-temp;
            }
            stack.push(i);
        }
        return res;
    }
}
