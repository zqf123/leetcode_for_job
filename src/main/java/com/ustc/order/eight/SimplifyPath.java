package com.ustc.order.eight;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/17 13:02
 */
//71.简化路径
public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/home";
        System.out.println(simplifyPath(path));
    }
    public static String simplifyPath(String path){
        String[] names = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String name : names) {
            if ("..".equals(name)){
                if (!stack.isEmpty())
                    stack.pollLast();
            }else if (name.length() > 0 && !".".equals(name)){
                stack.offerLast(name);
            }
        }
        StringBuffer ans = new StringBuffer();
        if (stack.isEmpty()){
            ans.append('/');
        }else {
            while (!stack.isEmpty()){
                ans.append('/');
                ans.append(stack.pollFirst());
            }
        }
        return ans.toString();
    }
}
