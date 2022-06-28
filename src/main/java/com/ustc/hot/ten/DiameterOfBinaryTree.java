package com.ustc.hot.ten;

import com.ustc.utils.TreeNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/19 17:04
 */
//543.二叉树的直径
public class DiameterOfBinaryTree {
    public static void main(String[] args) {

    }
    public static int res = 0;
    public static int diameterOfBinaryTree(TreeNode root){
        if (root == null)
            return 0;
        dfs(root);
        return res;
    }
    public static int dfs(TreeNode root){
        if (root == null)
            return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int val = left+right;
        res = Math.max(res,val);
        return Math.max(left,right) + 1;
    }
}
