package com.ustc.hot.seven;

import com.ustc.utils.TreeNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/14 19:52
 */
//236.二叉树的最近公共祖先
public class LowestCommonAncestor {
    public static void main(String[] args) {

    }
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
       if (root == null || root == q || root == p)
           return root;
       TreeNode left = lowestCommonAncestor(root.left,p,q);
       TreeNode right = lowestCommonAncestor(root.right,p,q);
       if (left != null && right != null)
           return root;
       else if (left != null)
           return left;
       else if (right != null)
           return right;
       return null;
    }
}
