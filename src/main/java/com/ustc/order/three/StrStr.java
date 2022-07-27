package com.ustc.order.three;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/30 20:51
 */

public class StrStr {
    public static void main(String[] args) {

    }

    //KMP算法
    public static int strStr(String haystack,String needle){
        if (needle.isEmpty()) return 0;

        //分别读取原串和匹配串的长度
        int n = haystack.length(),m = needle.length();
        //原串和匹配串前面都加空格，使其下标从1开始
        haystack = " " + haystack;
        needle = " " + needle;

        char[] s = haystack.toCharArray();
        char[] p = needle.toCharArray();

        //构建next数组，数组长度为匹配串的长度（next数组是和匹配串相关的）
        int[] next = new int[m+1];
        //构造过程i=2，j=0开始，i小于等于匹配串长度【构造i从2开始】
        for (int i=2,j=0;i<=m;i++){
            //匹配不成功的话，j = next(j)
            while (j>0 && p[i] != p[j+1])
                j = next[j];
            //匹配成功的话，先让j++
            if (p[i] == p[j+1])
                j++;
            //更新next[i]，结束本次循环，i++
            next[i] = j;
        }

        //匹配过程，i=1.j=0开始，i小于等于原串长度【匹配i从1开始】
        for (int i=1,j=0;i<=n;i++){
            //匹配不成功 j = next(j);
            while (j>0 && s[i] != p[j+1])
                j = next[j];
            //匹配成功的话，先让j++，结束本次循环后 i++
            if (s[i] == p[j+1])
                j++;
            //整一段匹配成功，直接返回下标
            if (j == m) return i - m;
        }
        return -1;

    }
}
