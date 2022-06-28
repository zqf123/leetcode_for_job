package com.ustc.hot.eight;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/19 7:51
 */
//338.比特位计数
public class CountBits {
    public static void main(String[] args) {

    }
    public static int[] countBits(int num){
        int[] res = new int[num+1];
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)
                res[i] = res[i/2];
            else
                res[i] = res[i/2] + 1;
        }
        return res;
    }
}
