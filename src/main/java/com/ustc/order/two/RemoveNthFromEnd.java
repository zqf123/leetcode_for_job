package com.ustc.order.two;

import com.ustc.utils.ListNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/29 21:47
 */
//19.删除链表的倒数第N个数
public class RemoveNthFromEnd {
    public static void main(String[] args) {

    }
    public static ListNode removeNthFromEnd(ListNode head,int n){
        if (head == null)
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
