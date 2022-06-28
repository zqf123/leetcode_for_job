package com.ustc.hot.nine;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/19 15:43
 */
//461.汉明距离
public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }
    public static int hammingDistance(int x,int y){
        int r = x^y;
        int sum = 0;
        while(r!=0){
            sum += r&1;
            r = r>>1;
        }
        return sum;
    }
}
