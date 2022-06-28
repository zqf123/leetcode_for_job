package com.ustc.hot.four;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/9 9:59
 */
//79.单词搜索
public class Exist {
    public static void main(String[] args) {

    }

    public static boolean exist(char[][] board,String word){
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board,words,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dfs(char[][]board,char[]word,int i,int j,int index){
        //边界判断
        if (i >= board.length || i<0 || j >= board[0].length || j < 0 || board[i][j] != word[index])
            return false;
        //每个word都访问结束，返回true
        if (index == word.length - 1)
            return true;
        //保存board[i][j]的值，方便恢复
        char tmp = board[i][j];
        //修改当前坐标的值
        board[i][j] = '.';
        //走递归，上下左右四个方向
        boolean res = dfs(board,word,i+1,j,index+1) || dfs(board,word,i-1,j,index+1) || dfs(board,word,i,j+1,index+1) || dfs(board,word,i,j-1,index+1);
        board[i][j] = tmp;
        return  res;
    }

}

