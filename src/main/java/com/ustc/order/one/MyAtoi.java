package com.ustc.order.one;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/27 22:57
 */
//8.字符串转换为整数
public class MyAtoi {
    public static void main(String[] args) {
        String s = "    -42";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String str){
        char[] chars = str.toCharArray();
        int n = chars.length;
        int idx = 0;
        while (idx < n && chars[idx] == ' '){
            //去掉前导空格
            idx++;
        }
        if (idx == n)
            return 0;
        boolean negative = false;
        if (chars[idx] == '-'){
            //遇到负号
            negative = true;
            idx++;
        }else if (chars[idx] == '+'){
            //遇到正号
            idx++;
        }else if (!Character.isDigit(chars[idx])){
            return 0;
        }

        int ans = 0;
        while (idx < n && Character.isDigit(chars[idx])){
            int digit = chars[idx] - '0';
            if (ans > (Integer.MAX_VALUE-digit)/10)
                // 本来应该是 ans * 10 + digit > Integer.MAX_VALUE
                // 但是 *10 和 + digit 都有可能越界，所有都移动到右边去就可以了。
                return negative ? Integer.MIN_VALUE:Integer.MAX_VALUE;
            ans = ans * 10 + digit;
            idx++;
        }
        return negative ? -ans : ans;
    }
}
