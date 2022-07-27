package com.ustc.order.ten;

import com.ustc.utils.ListNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/27 11:07
 */
//92. 反转链表 II
public class ReverseBetween {
    public static void main(String[] args) {

    }
    public static ListNode ReverseBetween(ListNode head,int left,int right){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i = 1; i < left; i++) {
            pre = pre.next;
        }
        head = pre.next;
        for (int i = left; i < right; i++) {
            ListNode next2 = head.next;
            head.next = next2.next;
            next2.next = pre.next;
            pre.next = next2;
        }
        return dummy.next;
    }
}
