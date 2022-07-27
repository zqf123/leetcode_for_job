package com.ustc.order.three;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/29 22:10
 */
// 22.括号生成
public class GenerateParenthesis {
    public static void main(String[] args) {

    }
    public static List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        generate(res,"",0,0,n);
        return res;
    }
    public static void generate(List<String>res,String ans,int count1,int count2,int n){
        if (count1 > n || count2 > n)
            return;
        if (count1==n && count2==n)
            res.add(ans);
        if (count1 >= count2){
            String ans1 = new String(ans);
            generate(res,ans+")",count1,count2+1,n);
            generate(res,ans1+"(",count1+1,count2,n);

        }
    }
}
