package com.ustc.order.three;

import com.ustc.utils.ListNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/29 22:55
 */

public class ReverseKGroup {
    public static void main(String[] args) {

    }
    public static ListNode reverseKGroup(ListNode head,int k){
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            //剩余数量小于k的话，则不需要反转
            if(tail == null)
                return head;
            tail = tail.next;
        }
        //反转前k个元素
        ListNode newHead = reverse(head,tail);
        //下一轮开始的地方就是tail
        head.next = reverseKGroup(tail,k);
        return newHead;
    }

    //左闭右开
    public static ListNode reverse(ListNode head,ListNode tail){
        ListNode pre = null;
        ListNode next = null;
        while (head != tail){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
