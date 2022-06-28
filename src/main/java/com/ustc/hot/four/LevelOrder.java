package com.ustc.hot.four;

import com.ustc.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/10 9:51
 */
//102.二叉树的层序遍历
public class LevelOrder {
    public static void main(String[] args) {

    }
    public static List<List<Integer>>levelOrder(TreeNode root){
        List<List<Integer>>res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root==null)
            return res;
        int count = 0;
        queue.add(root);
        while (!queue.isEmpty()){
            count = queue.size();
            List<Integer>list = new ArrayList<>();
            while (count>0){
                TreeNode cur = queue.poll();
                list.add(cur.val);
                count--;
                if (cur.left != null)
                    queue.add(cur.left);
                if (cur.right!=null)
                    queue.add(cur.right);
            }
            res.add(list);
        }
        return res;
    }
}
