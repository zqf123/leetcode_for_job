package com.ustc.order.nine;

import com.ustc.utils.ListNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/17 21:30
 */
//82.删除排序链表中的重复元素II
public class DeleteDuplicates {
    public static void main(String[] args) {

    }
    public static ListNode deleteDuplicates(ListNode head){
        if (head == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null){
            if (cur.next.val == cur.next.next.val){
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x)
                    cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
