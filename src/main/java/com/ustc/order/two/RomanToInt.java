package com.ustc.order.two;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/28 22:01
 */
// 13.罗马数字转整数
public class RomanToInt {
    public static void main(String[] args) {

    }

    public static int romanToInt(String s){
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            if (preNum < num)
                sum -= preNum;
            else sum += preNum;
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    public static int getValue(char ch){
        switch (ch){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
        }
    }

}
