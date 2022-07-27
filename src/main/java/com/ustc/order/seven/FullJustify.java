package com.ustc.order.seven;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/17 11:15
 */
//68.文本左右对齐
public class FullJustify {
    public static void main(String[] args) {

    }
    public static List<String> fullJustify(String[]words,int maxWidth){
       List<String>ans = new ArrayList<>();
       int right = 0, n = words.length;
       while (true){
           int left = right; // 当前行的第一个单词在words的位置
           int sumLen = 0; //统计这一行单词长度之和
           //循环确定当前行可以放多少单词，注意单词之前应至少有一个空格
           while (right < n && sumLen + words[right].length()+right-left <= maxWidth){
               sumLen += words[right++].length();
           }
           //当前行是最后一行：单词左对齐，且单词之间应只有一个空格，在行末填充剩余空格
           if (right == n){
               StringBuffer sb = join(words,left,n," ");
               sb.append(blank(maxWidth-sb.length()));
               ans.add(sb.toString());
               return ans;
           }
           int numWords = right-left;
           int numSpaces = maxWidth - sumLen;
           //当前行只有一个单词：该单词左对齐，在行末填充剩余空格
           if (numWords == 1){
               StringBuffer sb = new StringBuffer(words[left]);
               sb.append(blank(numSpaces));
               ans.add(sb.toString());
               continue;
           }

           //当前行不止一个单词
           int avgSpaces = numSpaces / (numWords - 1);
           int extraSpaces = numSpaces % (numWords - 1);
           StringBuffer sb = new StringBuffer();
           sb.append(join(words,left,left+extraSpaces+1,blank(avgSpaces+1))); //拼接额外加一个空格的单词
           sb.append(blank(avgSpaces));
           sb.append(join(words, left + extraSpaces + 1, right, blank(avgSpaces))); // 拼接其余单词
           ans.add(sb.toString());
       }
    }

    //blank返回长度为n的由空格组成的字符串
    public static String blank(int n){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }

    //join返回用sep拼接[left,right)范围内的words组成的字符串
    public static StringBuffer join(String[]words,int left,int right,String sep){
        StringBuffer sb = new StringBuffer(words[left]);
        for (int i = left+1;i<right;i++){
            sb.append(sep);
            sb.append(words[i]);
        }
        return sb;
    }
}
