package com.ustc.hot.six;

import com.ustc.utils.ListNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/12 10:01
 */
//160.相交链表
public class GetIntersectionNode {
    public static void main(String[] args) {

    }
    public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if (headA == null || headB == null)
            return null;
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != p2){
            p1 = p1 == null ? headB : p1.next;
            p2 = p2 == null ?headA : p2.next;
        }
        return p1;
    }
}
