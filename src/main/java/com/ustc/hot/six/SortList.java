package com.ustc.hot.six;

import com.ustc.utils.ListNode;

/**
 * TODO
 *
 * @author user
 * @version 1.0
 * @date 2022/6/11 20:22
 */

public class SortList {
    public static void main(String[] args) {

    }
    public static ListNode sortList(ListNode head){
        return sortList(head,null);
    }
    public static ListNode sortList(ListNode head,ListNode tail){
        if (head == null)
            return head;
        if (head.next == tail){
            head.next = null;
            return head;
        }
        ListNode fast = head, slow = head;
        while (fast != tail){
            fast = fast.next;
            slow = slow.next;
            if (fast != tail)
                fast = fast.next;
        }
        ListNode mid = slow;
        ListNode list1 = sortList(head,mid);
        ListNode list2 = sortList(mid,tail);
        return merge(list1,list2);
    }
    public static ListNode merge(ListNode head1,ListNode head2){
        ListNode dum = new ListNode(0);
        ListNode temp = dum, temp1 = head1,temp2 = head2;
        while (temp1 != null && temp2 != null){
            if (temp1.val >= temp2.val){
                temp.next = temp2;
                temp2 = temp2.next;
            }else {
                temp.next = temp1;
                temp1 = temp1.next;
            }
            temp = temp.next;
        }
        if (temp1 != null)
            temp.next = temp1;
        else if (temp2!=null)
            temp.next =temp2;
        return dum.next;
    }
}
