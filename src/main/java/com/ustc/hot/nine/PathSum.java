package com.ustc.hot.nine;

import com.ustc.utils.TreeNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/19 11:04
 */
//437.路径总和III
public class PathSum {
    public static void main(String[] args) {

    }
    public static int res = 0;
    public static int pathSum(TreeNode root,int sum){
        if (root == null)
            return 0;
        dfs(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return res;
    }
    public static void dfs(TreeNode root,int sum){
        if (root == null)
            return;
        sum -= root.val;
        if (sum == 0)
            res++;
        dfs(root.left,sum);
        dfs(root.right,sum);
    }
}
