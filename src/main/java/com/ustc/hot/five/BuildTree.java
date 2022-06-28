package com.ustc.hot.five;

import com.ustc.utils.TreeNode;

import java.util.HashMap;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/11 9:25
 */
//105.从前序与中序遍历序列构造二叉树
public class BuildTree {
    public static void main(String[] args) {

    }
    static HashMap<Integer,Integer> map;
    public static TreeNode buildTree(int[] preorder,int[] inorder){
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return dfs(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    public static TreeNode dfs(int[]pre,int[]in,int preorder_l,int preorder_r,int inorder_l,int inorder_r){
        if (preorder_l > preorder_r) return null;
        TreeNode root = new TreeNode(pre[preorder_l]);
        int pos = map.get(root.val);
        int size = pos - inorder_l;
        root.left = dfs(pre,in,preorder_l+1,preorder_r+size,inorder_l,pos-1);
        root.right = dfs(pre,in,preorder_l+size+1,preorder_r,pos+1,inorder_r);
        return root;
    }
}
