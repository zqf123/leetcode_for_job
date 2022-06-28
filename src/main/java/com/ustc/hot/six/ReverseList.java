package com.ustc.hot.six;

import com.ustc.utils.ListNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/13 16:17
 */

public class ReverseList {
    public static void main(String[] args) {

    }
    public static ListNode reverseList(ListNode head){
        if (head == null)
            return head;
        ListNode cur = head,pre = null;
        while (cur != null){
            ListNode curNext = cur.next;
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return pre;
    }
}
