package com.ustc.order.seven;

import com.ustc.utils.ListNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/7/16 10:30
 */
//61.旋转链表
public class RotateRight {
    public static void main(String[] args) {

    }
    public ListNode rotateRight(ListNode head,int k){
        if (k==0 || head==null || head.next==null)
            return head;
        int n = 1;
        ListNode iter = head;
        while (iter.next != null){
            iter = iter.next;
            n++;
        }
        int add = n - k % n;
        if ( add == n)
            return head;
        iter.next = head;
        while (add-- > 0)
            iter = iter.next;
        ListNode ret = iter.next;
        iter.next = null;
        return ret;
    }
}
