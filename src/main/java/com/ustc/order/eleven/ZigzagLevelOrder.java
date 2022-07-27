package com.ustc.order.eleven;

import com.ustc.utils.TreeNode;

import java.util.*;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/27 18:44
 */
//103. 二叉树的锯齿形层序遍历
public class ZigzagLevelOrder {
    public static void main(String[] args) {

    }
    public static List<List<Integer>>zigzagLevelOrder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<TreeNode>queue = new ArrayDeque<>();
        boolean isOrderLeft = true;
        queue.add(root);
        while (!queue.isEmpty()){
            Deque<Integer> tmp = new LinkedList<>();
            int size = queue.size();
            while (size!=0){
                TreeNode cur = queue.poll();
                size--;
                if (isOrderLeft)
                    tmp.offerLast(cur.val);
                else
                    tmp.offerFirst(cur.val);
                if (cur.left!=null)
                    queue.add(cur.left);
                if (cur.right!=null)
                    queue.add(cur.right);
            }
            ans.add(new ArrayList<>(tmp));
            isOrderLeft = !isOrderLeft;
        }
        return ans;
    }
}
