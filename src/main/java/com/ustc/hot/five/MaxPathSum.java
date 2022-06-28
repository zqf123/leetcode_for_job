package com.ustc.hot.five;

import com.ustc.utils.TreeNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/11 15:33
 */
//124.二叉树的最大路径和
public class MaxPathSum {
    public static void main(String[] args) {

    }
    static int ret = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        getMax(root);
        return ret;
    }
    public int getMax(TreeNode r){
        if (r == null) return 0;
        int left = Math.max(0,getMax(r.left));
        int right = Math.max(0,getMax(r.right));
        ret = Math.max(left+right+r.val,ret);
        return Math.max(left,right) + r.val;
    }
}
