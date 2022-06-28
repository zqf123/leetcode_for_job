package com.ustc.hot.nine;

import java.util.Stack;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/19 8:48
 */
//394.字符串解码
public class DecodeString {
    public static void main(String[] args) {

    }
    public static String decodeString(String s){
        //存数字
        Stack<Integer> stack1 = new Stack<>();
        //存字母
        Stack<StringBuffer>stack2 = new Stack<>();
        int multi = 0;
        StringBuffer ans = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) multi = multi*10 + c - '0';
            else if ((c >= 'a' && c <= 'z') || (c >= 'A'&&c <= 'Z'))
                ans.append(c);
            else if (c == '['){
                stack1.push(multi);
                stack2.push(ans);
                multi = 0;
                ans = new StringBuffer();
            }else {
                int tmp = stack1.pop();
                StringBuffer anstmp = stack2.pop();
                for (int i = 0; i < tmp; i++) {
                    anstmp.append(ans);
                }
                ans = anstmp;
            }
        }
        return ans.toString();
    }
}
