package com.ustc.order.two;

import java.util.Stack;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/29 21:51
 */

public class Isvalid {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || c != stack.pop())
                return false;
        }
        return stack.isEmpty();
    }
}
