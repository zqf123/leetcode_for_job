package com.ustc.hot.six;

import java.util.Stack;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/12 9:37
 */
//155.最小栈
public class MinStack {
    public static void main(String[] args) {

    }
    static Stack<Integer> dataStack = new Stack<>();
    static Stack<Integer> sortedStack = new Stack<>();
    public MinStack(){}
    public static void push(int val){
        dataStack.push(val);
        if (sortedStack.empty() || val <= sortedStack.peek())
            sortedStack.push(val);
        System.out.println(sortedStack);
    }
    public static void pop(){
        if (dataStack.peek().equals(sortedStack.peek()))
            sortedStack.pop();
        dataStack.pop();
    }
    public static int top(){
        return dataStack.peek();
    }
    public static int getMin(){
        return sortedStack.peek();
    }
}
