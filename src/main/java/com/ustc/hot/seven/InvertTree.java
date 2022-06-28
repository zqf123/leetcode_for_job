package com.ustc.hot.seven;

import com.ustc.utils.TreeNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/14 18:32
 */
//226.翻转二叉树
public class InvertTree {
    public static void main(String[] args) {

    }
    public static TreeNode invertTree(TreeNode root){
        if (root == null)
            return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
