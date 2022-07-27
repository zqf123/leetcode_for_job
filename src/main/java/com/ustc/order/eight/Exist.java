package com.ustc.order.eight;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/17 20:52
 */
//79.单词搜索
public class Exist {
    public static void main(String[] args) {

    }
    public static boolean exist(char[][] board,String word){
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board,words,i,j,0))
                    return true;
            }
        }
        return false;
    }

    public static boolean dfs(char[][]board,char[]word,int i,int j,int index){
        if (i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word[index])
            return false;
        if (index == word.length-1)
            return true;
        char tmp = board[i][j];
        board[i][j] = '.';
        boolean res = dfs(board,word,i+1,j,index+1) ||
                    dfs(board,word,i,j+1,index+1) ||
                    dfs(board,word,i-1,j,index+1) ||
                    dfs(board,word,i,j-1,index+1);
        board[i][j] = tmp;
        return res;
    }
}
