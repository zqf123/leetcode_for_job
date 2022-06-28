package com.ustc.hot.four;

import java.util.HashMap;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/7 10:53
 */
//76.最小覆盖子串
public class MinWindow {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
    public static String minWindow(String s,String t){
       HashMap<Character,Integer> need = new HashMap<>();
       HashMap<Character,Integer> window = new HashMap<>();
       //need存放的不重复的字符出现的次数
        for (char c : t.toCharArray()) {
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int left = 0, right = 0;
        //valid表示是否满足了t中的字符，不算重复的
        int valid = 0;
        //记录最小覆盖子串的起始索引及长度
        int start = 0, len = Integer.MAX_VALUE;
        while (right < s.length()){
            char c = s.charAt(right);
            right++;
            //判断取出的字符是否在需要的Map中
            if (need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if (window.get(c).equals(need.get(c)))
                    valid++;
            }

            //判断是否需要收缩
            while( valid == need.size()){
                //更新最小覆盖子串
                if (right - left < len){
                    start = left;
                    len = right - left;
                }
                char c1 = s.charAt(left);
                //左移窗口
                left++;
                //进行窗口内数据的一系列更新
                //如果当前要移动的字符是包含在need中，我们需要进行讨论
                if (need.containsKey(c1)){
                    if (window.get(c1).equals(need.get(c1)))
                        valid--;
                    window.put(c1,window.getOrDefault(c1,0)-1);
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start,start+len);
    }
}
