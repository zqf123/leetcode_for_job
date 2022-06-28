package com.ustc.hot.ten;

import com.ustc.utils.TreeNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/20 17:11
 */
//617.合并二叉树
public class MergeTrees {
    public static void main(String[] args) {

    }
    public static TreeNode mergeTrees(TreeNode root1,TreeNode root2){
        if (root1 == null)
            return root2;
        if (root2 == null)
            return root1;
        TreeNode merge = new TreeNode(root1.val+root2.val);
        merge.left = mergeTrees(root1.left,root2.left);
        merge.right = mergeTrees(root1.right,root2.right);
        return merge;
    }
}
