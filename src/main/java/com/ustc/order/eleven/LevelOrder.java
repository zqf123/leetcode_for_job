package com.ustc.order.eleven;

import com.ustc.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/27 18:26
 */
//102. 二叉树的层序遍历
public class LevelOrder {
    public static void main(String[] args) {

    }
    public List<List<Integer>>levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root == null)
            return res;
        queue.add(root);
        int count = 0;
        while(!queue.isEmpty()){
            count = queue.size();
            List<Integer>tmp = new ArrayList<>();
            while (count!=0){
                TreeNode cur = queue.poll();
                tmp.add(cur.val);
                count--;
                if (cur.left!=null)
                    queue.add(cur.left);
                if (cur.right!=null)
                    queue.add(cur.right);
            }
            res.add(tmp);
        }
        return res;
    }
}
