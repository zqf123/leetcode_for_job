package com.ustc.hot.four;

import java.util.Stack;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/9 10:33
 */
//84.柱状图中最大矩形
public class LargestRectangleArea {
    public static void main(String[] args) {
        int[] heights = new int[]{2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
    public static int largestRectangleArea(int[] heights){
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty()&&heights[stack.peek()] >= heights[i])
                stack.pop();
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        stack.clear();
        for (int i=n-1;i>=0;i--){
            while (!stack.isEmpty()&&heights[stack.peek()] >= heights[i])
                stack.pop();
            right[i] = stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans,(right[i]-left[i]-1)*heights[i]);
        }
        return ans;
    }
}
