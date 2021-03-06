package com.ustc.order.seven;

import java.util.Arrays;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/11 22:07
 */
//60. ζεεΊε
public class GetPermutation {
    public static void main(String[] args) {

    }
    public static String getPermutation(int n,int k){
        int[] factorial = new int[n];
        factorial[0] = 1;
        for (int i=1;i<n;i++){
            factorial[i] = factorial[i-1]*i;
        }
        k--;
        StringBuffer ans = new StringBuffer();
        int[] valid = new int[n+1];
        Arrays.fill(valid,1);
        for (int i=1;i<=n;i++){
            int order = k/factorial[n-i] + 1;
            for (int j=1;j<=n;j++){
                order -= valid[i];
                if (order == 0){
                    ans.append(j);
                    valid[j] = 0;
                    break;
                }
            }
            k %= factorial[n-i];
        }
        return ans.toString();
    }
}
