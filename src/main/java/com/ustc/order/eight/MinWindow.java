package com.ustc.order.eight;

import java.util.HashMap;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/17 20:24
 */
//76.最小覆盖子串
public class MinWindow {
    public static void main(String[] args) {

    }
    public static String minWindow(String s,String t){
        HashMap<Character,Integer>need = new HashMap<>();
        HashMap<Character,Integer>window = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int left = 0, right = 0;
        int valid = 0;
        int start = 0, len = Integer.MAX_VALUE;
        while (right < s.length()){
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if (window.get(c).equals(need.get(c)))
                    valid++;
            }
            while (valid == need.size()){
                if (right - left < len){
                    start = left;
                    len = right - left;
                }
                char c1 = s.charAt(left);
                left++;
                if (need.containsKey(c1)){
                    if (window.get(c1).equals(need.get(c1)))
                        valid--;
                    window.put(c1,window.getOrDefault(c1,0)-1);
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start,start+left);
    }
}
