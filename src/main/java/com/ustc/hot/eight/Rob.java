package com.ustc.hot.eight;

import com.ustc.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/16 10:26
 */

public class Rob {
    public static void main(String[] args) {

    }
    public static Map<TreeNode,Integer> map = new HashMap<>();
    public static int rob(TreeNode root){
        if (root == null) return 0;
        if (map.containsKey(root))
            return map.get(root);
        int do_it = root.val+(root.left == null ? 0 : rob(root.left.left)+rob(root.left.right)
                    +(root.right == null ? 0 : rob(root.right.right)+rob(root.right.left)));
        int no_it = rob(root.left) + rob(root.right);
        int res = Math.max(do_it,no_it);
        map.put(root,res);
        return res;
    }
}
