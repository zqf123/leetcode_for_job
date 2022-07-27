package com.ustc.order.eleven;

import com.ustc.utils.TreeNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/27 18:24
 */
//101. 对称二叉树
public class IsSymmetric {
    public static void main(String[] args) {

    }
    public static boolean isSymmetric(TreeNode root){
        return check(root,root);
    }
    public static boolean check(TreeNode p1,TreeNode p2){
        if (p1==null&&p2==null)
            return true;
        if (p1==null||p2==null)
            return false;
        return p1.val == p2.val &&check(p1.left,p2.right)&&check(p1.right,p2.left);
    }
}
