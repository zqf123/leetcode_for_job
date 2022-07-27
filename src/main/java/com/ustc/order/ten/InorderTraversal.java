package com.ustc.order.ten;

import com.ustc.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/27 15:11
 */
//94. 二叉树的中序遍历
public class InorderTraversal {
    public static void main(String[] args) {

    }
    public static List<Integer> inorderTravelsal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while (cur!=null || !stack.isEmpty()){
            if (cur!=null){
                stack.push(cur);
                cur = cur.left;
            }else {
                cur = stack.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }
        return res;
    }
}
