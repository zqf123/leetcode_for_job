package com.ustc.utils;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/10 8:37
 */

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(){}
    public TreeNode(int val){this.val = val;}
    public TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
