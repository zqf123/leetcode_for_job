package com.ustc.hot.four;

import com.ustc.utils.TreeNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/10 9:21
 */
//98.验证二叉搜索树
public class IsvalidBS {
    public static void main(String[] args) {

    }
    public static boolean isValidBST(TreeNode root){
        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public static boolean isValid(TreeNode root,long low,long high){
        if (root == null)
            return true;
        if (root.val<=low || root.val>=high)
            return false;
        return isValid(root.left,low,root.val)&&isValid(root.right,root.val,high);
    }
}
