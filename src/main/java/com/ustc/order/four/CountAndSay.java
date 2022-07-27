package com.ustc.order.four;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/8 21:50
 */
// 38.外观数列
public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n){
        String str = "1";
        for (int i = 2; i <= n; i++){
            StringBuilder sb = new StringBuilder();
            int start = 0;
            int pos = 0;
            while (pos < str.length()){
                while (pos < str.length() && str.charAt(pos) == str.charAt(start)){
                    pos++;
                }
                sb.append(Integer.toString(pos - start)).append(str.charAt(start));
                start = pos;
            }
            str = sb.toString();
        }
        return str;
    }
}
