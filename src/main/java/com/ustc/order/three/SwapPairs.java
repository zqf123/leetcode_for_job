package com.ustc.order.three;

import com.ustc.utils.ListNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/29 22:29
 */
//24.两两交换链表中的节点
public class SwapPairs {
    public static void main(String[] args) {

    }
    public static ListNode swapPairs(ListNode head){
        if (head == null || head.next == null)
            return head;
        ListNode headNext = head.next;
        head.next = swapPairs(headNext.next);
        headNext.next = head;
        return headNext;
    }
}
