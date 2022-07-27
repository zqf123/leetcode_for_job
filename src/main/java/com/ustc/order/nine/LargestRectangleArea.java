package com.ustc.order.nine;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/26 10:29
 */
//84.柱状图中最大的矩形
public class LargestRectangleArea {
    public static void main(String[] args) {

    }
    public static int largestRectangleArea(int[] heights){
        int[] tmp = new int[heights.length+2];
        for (int i = 1; i < tmp.length-1; i++) {
            tmp[i] = heights[i-1];
        }
        Deque<Integer>stack = new ArrayDeque<>();
        int area = 0;
        for (int i = 0; i < tmp.length; i++) {
            // 对栈中柱体来说，栈中的下一个柱体就是其「左边第一个小于自身的柱体」；
            // 若当前柱体 i 的高度小于栈顶柱体的高度，说明 i 是栈顶柱体的「右边第一个小于栈顶柱体的柱体」。
            // 因此以栈顶柱体为高的矩形的左右宽度边界就确定了，可以计算面积
            while (!stack.isEmpty() && tmp[i] < tmp[stack.peek()]){
                int h = tmp[stack.pop()];
                area = Math.max(area,(i-stack.peek()-1)*h);
            }
            stack.push(i);
        }
        return area;
    }
}
