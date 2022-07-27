package com.ustc.order.nine;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/26 11:42
 */

public class GrayCode {
    public static void main(String[] args) {

    }
    public static List<Integer>grayCode(int n){
        List<Integer> ret = new ArrayList<>();
        ret.add(0);
        for (int i = 1; i <= n; i++) {
            int m = ret.size();
            for (int j = m - 1; j >= 0; j--){
                ret.add(ret.get(j) | (1 << (i-1)));
            }
        }
        return ret;
    }
}
