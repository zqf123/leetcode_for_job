package com.ustc.hot.five;

import com.ustc.utils.ListNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/11 16:52
 */

public class DetectCycle {
    public static void main(String[] args) {

    }
    public static ListNode detectCycle(ListNode head){
        ListNode fast = head,slow = head;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            //判断是否有环
            if (fast == slow){
                ListNode p = head;
                while (p != slow){
                    p = p.next;
                    slow = slow.next;
                }
                return p;
            }
        }
        return null;
    }
}
