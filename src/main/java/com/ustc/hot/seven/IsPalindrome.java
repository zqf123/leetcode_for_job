package com.ustc.hot.seven;

import com.ustc.utils.ListNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/14 18:35
 */
//234.回文链表
public class IsPalindrome {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(ListNode head){
        ListNode fast = head, slow = head;
        ListNode pre = null;
        if (head == null || head.next == null)
            return true;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            ListNode temp = slow.next;
            slow.next = pre;
            pre = slow;
            slow = temp;
        }
        //链表长度为偶数
        if (fast != null)
            slow = slow.next;
        while (slow != null){
            if (pre.val != slow.val)
                return false;
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }
}
