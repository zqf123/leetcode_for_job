package com.ustc.order.four;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/7 23:21
 */
// 37.解数独
public class SolveSudoku {
    public static void main(String[] args) {

    }
    public static void solveSudoku(char[][] board){
        backtrack(board,0,0);
    }
    public static boolean backtrack(char[][] board,int i,int j){
        int m = 9, n = 9;
        if (i == m)
            return true;
        if (j == n)
            //穷举到最后一列 就换到下一行
            return backtrack(board,i+1,0);
        if (board[i][j] != '.')
            //如果预设有数字，不用穷举
            return backtrack(board,i,j+1);
        for (char ch = '1'; ch <= '9'; ch++) {
            //如果遇得到不合法的数字，就跳过
            if (!isValid(board,i,j,ch))
                continue;
            board[i][j] = ch;
            //如果找到一个可行的解，立刻结束
            if (backtrack(board,i,j+1))
                return true;
            board[i][j] = '.';
        }
        return false;
    }

    public static boolean isValid(char[][] board,int r,int c,int n){
        for (int i = 0; i < 9; i++) {
            //判断行是否存在
            if (board[r][i] == n) return false;
            //判断列是否存在
            if (board[i][c] == n) return false;
        }
        int startRow = (r / 3) * 3;
        int startCol = (c / 3) * 3;
        for (int i = startRow; i < startRow+3; i++) {
            for (int j = startCol; j < startCol+3; j++){
                if (board[i][j] == n)
                    return false;
            }
        }
        return true;
    }
}
