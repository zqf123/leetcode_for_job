package com.ustc.order.two;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/28 21:40
 */
//12.整数转罗马数字
public class IntToRoman {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(intToRoman(num));
    }

    public static int[] values = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
    public static String[] symbols = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public static String intToRoman(int num){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < values.length&&num>=0; i++) {
            while (values[i]<=num){
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }
}
