package com.ustc.hot.five;

import com.ustc.utils.TreeNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/11 9:57
 */
//114.二叉树展开为链表
public class Flatten {
    public static void main(String[] args) {

    }
    public void flatten(TreeNode root){
        while (root != null){
            if (root.left == null)
                root = root.right;
            else {
                //找到左子树最右边的节点
                TreeNode pre = root.left;
                while (pre.right != null)
                    pre = pre.right;
                pre.right = root.right;
                root.right = root.left;
                root.left = null;
                root =root.right;
            }
        }
    }
}
