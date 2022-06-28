package com.ustc.hot.ten;

import java.util.Arrays;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/20 17:30
 */
//621.任务调度器
public class LeastInterval {
    public static void main(String[] args) {

    }
    /*
    * 假设数组["A","A","A","B","B","C"] n=2,A的频率最高，记为count=3，所以两个A之间必须间隔2任务，
    * 才能满足题意，并且是最短时间（两个A的间隔大于2的总时间必然不是最短的），因此执行顺序为A->X->X->A->X->X->A,
    * 这里的X表示除了A以外其他字母，或者是待命，不用关心具体是什么，反正用来填充两个A的间隔的。
    * 上面执行顺序的规律是：有count-1个A，其中每个A需要搭配n个X，再加上最后一个A，所以总时间是（count-1）*（n+1）+1.
    *
    * 要注意可能会出现多个频率相同且都是最高的任务，比如 ["A","A","A","B","B","B","C","C"]，所以最后会剩下一个A和一个B，
    * 因此最后要加上频率最高的不同任务的个数 maxCount。
    *
    * 公式算出的值可能会比数组的长度小，如["A","A","B","B"]，n = 0，此时要取数组的长度
    * */

    public static int leastInterval(char[] tasks,int n){
        int[] words = new int[26];
        for (char task : tasks) {
            words[task-'A']++;
        }
        Arrays.sort(words);
        int maxLen = words[25],count = 1;
        for (int i = 25;i>=1;i--){
            if (words[i] == words[i-1])
                count++;
            else break;
        }
        int res = (maxLen - 1)*(n+1) + count;
        return Math.max(res,tasks.length);
    }
}
