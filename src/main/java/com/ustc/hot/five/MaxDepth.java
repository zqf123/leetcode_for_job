package com.ustc.hot.five;

import com.ustc.utils.TreeNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/10 10:29
 */
//104.二叉树的最大深度
public class MaxDepth {
    public static void main(String[] args) {
    }
    public static int maxDepth(TreeNode root){
        return root == null ? 0 : Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
