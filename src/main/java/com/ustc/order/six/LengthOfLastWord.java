package com.ustc.order.six;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/11 21:55
 */
//58.最后一个单词的长度
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s){
        int length = 0;
        for (int i=s.length()-1;i>=0;i--){
            if (s.charAt(i) != ' ')
                length++;
            else if (length != 0)
                return length;
        }
        return length;
    }
}
