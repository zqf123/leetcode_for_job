package com.ustc.order.six;

import java.util.Arrays;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/11 18:24
 */

public class TotalNQueens {
    public static void main(String[] args) {

    }
    public static int sum = 0;
    public static int totalNQueens(int n){
        //初始化棋盘
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i],'.');
        }
        backtrack(board,0);
        return sum;
    }
    public static void backtrack(char[][]board,int row){
        //终止条件
        if (row == board.length){
            sum++;
            return;
        }
        //得出列数
        int n = board[row].length;
        for (int col = 0; col < n; col++) {
            if (!isValid(board,row,col))
                continue;
            board[row][col] = 'Q';
            backtrack(board,row+1);
            board[row][col] = '.';
        }
    }

    public static boolean isValid(char[][]board,int row,int col){
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        for (int i=row-1,j=col-1;i>=0&&j>=0;j--,i--){
            if (board[i][j] == 'Q')
                return false;
        }
        for (int i=row-1,j=col+1;i>=0&&j<board[i].length;i--,j++){
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }
}
