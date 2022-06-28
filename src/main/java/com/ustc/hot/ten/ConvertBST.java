package com.ustc.hot.ten;

import com.ustc.utils.TreeNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/19 16:51
 */
//把二叉搜索树转换为累加树
public class ConvertBST {
    public static void main(String[] args) {

    }
    public static int sum = 0;
    public static TreeNode convertBST(TreeNode root){
        if (root != null){
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }
}
