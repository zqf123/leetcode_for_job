package com.ustc.order.seven;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/16 15:56
 */
//66.加一
public class PlusOne {
    public static void main(String[] args) {

    }
    public static int[] plusOne(int[] digits){
        int n = digits.length;
        for (int i=n-1;i>=0;i--){
            if (digits[i] != 9){
                digits[i]++;
                for (int j = i+1; j < n; j++) {
                    digits[j] = 0;
                }
                return digits;
            }
        }
        //digits中所有的元素均为9
        int[] ans = new int[n+1];
        ans[0] = 1;
        return ans;
    }
}
