package com.ustc.order.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/11 16:29
 */
//49.字母异位词分组
public class GroupAnagrams {
    public static void main(String[] args) {

    }
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if (!map.containsKey(key))
                map.put(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
