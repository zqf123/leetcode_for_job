package com.ustc.order.ten;

import com.ustc.utils.TreeNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/27 17:18
 */
//98. 验证二叉搜索树
public class IsValidBST {
    public static void main(String[] args) {

    }
    public static boolean isValidBST(TreeNode root){
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static boolean isValid(TreeNode root,long low,long high){
        if (root == null)
            return true;
        if (root.val <= low || root.val >= high)
            return false;
        return isValid(root.left,low,root.val) && isValid(root.right,root.val,high);
    }
}

