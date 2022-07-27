package com.ustc.order.six;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/11 17:55
 */
//51.N皇后
public class SolveNQueens {
    public static void main(String[] args) {

    }
    public static List<String>charToString(char[][]array){
        List<String>result = new LinkedList<>();
        for (char[] chars : array) {
            result.add(String.valueOf(chars));
        }
        return result;
    }
    public static List<List<String>> res = new LinkedList<>();
    public static List<List<String>> solveNQueens(int n){
        if (n<=0) return null;
        char[][]board = new char[n][n];
        for (char[] chars : board) {
            Arrays.fill(chars,'.');
        }
        backtrack(board,0);
        return res;
    }

    public static void backtrack(char[][]board,int row){
        if (row == board.length){
            res.add(charToString(board));
            return;
        }
        int n = board[row].length;
        for (int col = 0; col < n; col++) {
            if (!isValid(board,row,col)) continue;
            board[row][col] = 'Q';
            backtrack(board,row+1);
            board[row][col] = '.';
        }
    }
    public static boolean isValid(char[][]board,int row,int col){
        int rows = board.length;
        for (char[] chars : board) {
            if (chars[col] == 'Q') return false;
        }
        for (int i = row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if (board[i][j] == 'Q') return false;
        }
        for (int i=row-1,j=col+1;i>=0&&j<rows;i--,j++){
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }
}
