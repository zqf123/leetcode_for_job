package com.ustc.order.one;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/27 22:17
 */
// 6.Z字形变换
public class Convert {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }

    public static String convert(String s,int numRows){
        if (numRows == 1) return s;
        List<StringBuffer> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuffer());
        }
        int curRow = 0;
        boolean goingDown = false;
        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow==0 || curRow == numRows-1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }
        StringBuffer res = new StringBuffer();
        for (StringBuffer row : rows) {
            res.append(row);
        }
        return res.toString();
    }
}
