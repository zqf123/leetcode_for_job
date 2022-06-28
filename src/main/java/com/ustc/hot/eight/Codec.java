package com.ustc.hot.eight;

import com.ustc.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/15 21:46
 */
//297.二叉树的序列化与反序列化
public class Codec {
    public String serialize(TreeNode root){
        if (root == null)
            return "null,";
        String res = root.val + ",";
        res += serialize(root.left);
        res += serialize(root.right);
        return res;
    }
    public TreeNode deserialize(String data){
        String[] arr = data.split(",");
        Queue<String>queue = new LinkedList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            queue.offer(arr[i]);
        }
        return help(queue);
    }
    public TreeNode help(Queue<String>queue){
        String val = queue.poll();
        if (val.equals("null"))
            return null;
        TreeNode root = new TreeNode(Integer.valueOf(val));
        root.left = help(queue);
        root.right = help(queue);
        return root;
    }
}
