package com.ustc.order.ten;

import com.ustc.utils.TreeNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/27 17:23
 */

public class RecoverTree {
    public static TreeNode t1,t2,pre;
    public static void main(String[] args) {

    }
    public static void recoverTree(TreeNode root){
        inorder(root);
        int temp = t1.val;
        t1.val = t2.val;
        t2.val = temp;
    }
    public static void inorder(TreeNode root){
        if (root == null) return;
        inorder(root.left);
        if (pre != null && pre.val > root.val){
            if (t1 == null) t1 = pre;
            t2 = root;
        }
        pre = root;
        inorder(root.right);
    }
}
