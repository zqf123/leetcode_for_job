package com.ustc.order.two;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/28 22:09
 */
// 14.最长公共前缀
public class LongestCommonPrefix {
    public static void main(String[] args) {

    }

    public static String longestCommonPrefix(String[] strs){
        if (strs.length == 0)
            return "";
        String ans = strs[0];
        for (int i=1;i<strs.length;i++){
            int j = 0;
            while (j<ans.length()&&j<strs[i].length()){
                if (ans.charAt(j) != strs[i].charAt(j))
                    break;
                j++;
            }
            ans = ans.substring(0,j);
        }
        return ans;
    }
}
