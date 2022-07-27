package com.ustc.order.nine;

import com.ustc.utils.ListNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/26 11:13
 */
//86.分割链表
public class Partition {
    public static void main(String[] args) {

    }
    public static ListNode partition(ListNode head,int x){
        ListNode dummyHead1 = new ListNode(0);
        ListNode dummyHead2 = new ListNode(0);
        ListNode node1 = dummyHead1;
        ListNode node2 = dummyHead2;
        while(head != null){
            if (head.val < x){
                node1.next = head;
                head = head.next;
                node1 = node1.next;
                node1.next = null;
            }else {
                node2.next = head;
                head = head.next;
                node2 = node2.next;
                node2.next = null;
            }
        }
        node1.next = dummyHead2.next;
        return dummyHead1.next;
    }
}
