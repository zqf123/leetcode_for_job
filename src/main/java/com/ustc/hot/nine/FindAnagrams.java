package com.ustc.hot.nine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/19 11:17
 */

public class FindAnagrams {
    public static void main(String[] args) {
        String s =  "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }
    public static List<Integer> findAnagrams(String s,String p){
        //存放p中字符出现的个数
        Map<Character,Integer>pmap = new HashMap<>();
        //存放s中字符出现的个数
        Map<Character,Integer>smap = new HashMap<>();
        for (char ch : p.toCharArray()) {
            pmap.put(ch,pmap.getOrDefault(ch,0)+1);
        }
        List<Integer> res = new ArrayList<>();
        int len = p.length();
        int count = 0;
        int left = 0,right = 0;
        while(right<s.length()){
            char ch = s.charAt(right);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
            if (pmap.containsKey(ch)&&smap.get(ch)<=pmap.get(ch))
                count++;
            if (count == len)
                res.add(left);
            if (right-left+1 >= len){
                char leftCh = s.charAt(left);
                if (pmap.containsKey(leftCh)&&smap.get(leftCh)<=pmap.get(leftCh))
                    count--;
                smap.put(leftCh,smap.get(leftCh)-1);
                left++;
            }
            right++;
        }
        return res;
    }
}
